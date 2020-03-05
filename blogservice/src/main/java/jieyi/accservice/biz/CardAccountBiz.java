package jieyi.accservice.biz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import jieyi.accservice.bizform.CommonData;
import jieyi.accservice.bizform.Constant;
import jieyi.accservice.bizform.Field58;
import jieyi.accservice.bizform.Field58_7;
import jieyi.accservice.bizform.Field62;
import jieyi.accservice.dao.TLogOnlinePaymentMapper;
import jieyi.accservice.form.TInfoCustomer;
import jieyi.accservice.form.TLogOnlinePayment;
import jieyi.accservice.form.TParamMacposinfo;
import jieyi.accservice.utils.CommonPackage;
import jieyi.accservice.utils.DateFormatUtil;
import jieyi.accservice.utils.NumberStringUtil;
import jieyi.accservice.utils.PinUtil;
import jieyi.tools.algorithmic.DesUtil;
import jieyi.tools.commuclient_8583.form.data8583.Datagram8583;
import jieyi.tools.commuclient_8583.form.data8583.MsgSendInfo;
import jieyi.tools.commuclient_8583.sendmsg.JieYiCommunication8583;
import jieyi.tools.util.StringUtil;

/**
 * 资金交易类业务处理
 * 
 * @author Echo
 *
 */
@Service
public class CardAccountBiz {

    private static Logger logger = Logger.getLogger(CardAccountBiz.class);

    protected static Gson gson = new Gson();

    private final static int FIELD48_USE_11 = 11;

   

    
   

    /**
     * 余额查询
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void balanceQuery(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();

        send_dg8583.setField3("310000");
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        send_dg8583.setField49("156");

        String pinblock = PinUtil.getPinBlock(commonData.getCardno(), commonData.getPassword(),false);
        String field52 = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, pinblock);
        send_dg8583.setField52(field52);
        send_dg8583.setField53("2600000000000000");
        String field60 = "01" + macpos.getBatchno() + "000";
        send_dg8583.setField60(field60);
        send_dg8583.setField63("000");
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
        if ("00".equals(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()))) {
            String balance = recv_dg8583.getField54().substring(10, 22);
            commonData.setBalance(balance);
            logger.info("commonData.setBalance:" + balance);
            //commonData.setSettdate(recv_dg8583.getField15());
        }

    }

    /**
     * 密码操作
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo1
     * @param msgSendInfo2
     * @param pinkeyEnc
     * @throws Exception
     */
    public static void operateCardPwd(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo1, MsgSendInfo msgSendInfo2,
            String pinkeyEnc) throws Exception {
        if ("0".equals(commonData.getChangeflag())) {
            modifyCardPwd(commonData, macpos, msgSendInfo1, pinkeyEnc);
        } else {
            resetCardPwd(commonData, macpos, msgSendInfo2, pinkeyEnc);
        }
    }
    /**
     * 密码修改
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void modifyCardPwd(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();
        String newPwd = commonData.getNewpassword();
        String oldPwd = commonData.getPassword();
        String oldPwdBlock = PinUtil.getPinBlock(commonData.getCardno(), oldPwd,false);
        String newPwdBlock = PinUtil.getPinBlock(commonData.getCardno(), newPwd,false);
        oldPwd = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, oldPwdBlock);
        newPwd = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, newPwdBlock);

        send_dg8583.setField3("500000");
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        send_dg8583.setField52(oldPwd);
        String field60 = "00" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000";
        send_dg8583.setField60(field60);

        //62域作为记名信息
        Field62 field62 = new Field62();
        field62.setElement1(Constant.FIELD_ELEMENT_Y.getCode());
        field62.setElement2(newPwd);
        field62.setElement3("");
        field62.setElement4("");
        field62.setElement5("");
        field62.setElement6("");
        String field62Str = Field62.generalField62StrForUse30(field62);
        send_dg8583.setField62(field62Str);
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
    }

    /**
     * 密码重置
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void resetCardPwd(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();
        String newPwd = "";
        if (null != commonData.getNewpassword()) {
            newPwd = commonData.getNewpassword();
            String newPwdBlock = PinUtil.getPinBlock(commonData.getCardno(), newPwd,false);
            newPwd = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, newPwdBlock);
        }
        send_dg8583.setField3("510000");
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        //send_dg8583.setField52(oldPwd);
        send_dg8583.setField53("2600000000000000");
        String field60 = "00" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000";
        send_dg8583.setField60(field60);

        //TODO 根据客户信息去客管系统查询客户信息
        TInfoCustomer tInfoCustomer = new TInfoCustomer();

        //62域作为记名信息
        Field62 field62 = new Field62();
        field62.setElement1("Y");
        field62.setElement2(newPwd);
        field62.setElement3(tInfoCustomer.getHldpptype());
        field62.setElement4(tInfoCustomer.getHldppno());
        field62.setElement5(tInfoCustomer.getHldname());
        String field62Str = Field62.generalField62StrForUse30(field62);
        send_dg8583.setField62(field62Str);
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
    }

    /**
     * 消费
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public  void CardConsume(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();

        send_dg8583.setField3("001105");
        send_dg8583.setField4(NumberStringUtil.addLeftZero(commonData.getTxnamt(), 12));
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        send_dg8583.setField49("156");
        String pinblock = PinUtil.getPinBlock(commonData.getCardno(), commonData.getPassword(),false);
        String field52 = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, pinblock);
        send_dg8583.setField52(field52);
        send_dg8583.setField53("2600000000000000");
        send_dg8583.setField60("22" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000");

        //62域存入账户类型
        Field62 field62 = new Field62();
        field62.setElement1("01");
        String field62Str = Field62.generalField62StrForUse4(field62);
        send_dg8583.setField62(field62Str);
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文服务
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
        String balance = "";
        if ("00".equals(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()))) {
            balance = recv_dg8583.getField54().substring(10, 22);
        }
        balance = StringUtil.addLeftZero(balance, 12);
        commonData.setBalance(balance);
        commonData.setSettdate(recv_dg8583.getField15());
        logger.info("commonData.setBalance:" + balance);
    }

    /**
     * 消费撤销
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public  void consumeCancel(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo,TLogOnlinePaymentMapper tLogOnlinePaymentMapper) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();

        send_dg8583.setField3("200000");
        send_dg8583.setField4(NumberStringUtil.addLeftZero(commonData.getTxnamt(), 12));
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        send_dg8583.setField37(commonData.getOrgrefno());
        send_dg8583.setField49("156");
        send_dg8583.setField53("2600000000000000");

        //58域用法十一
        Field58 field58 = new Field58();
        field58.setIcdr_0("CU");
        field58.setIcdr_1(NumberStringUtil.addLeftZero(commonData.getTxnamt(), 12));
        String field58s = Field58.generalField58StrForUse11(field58);
        send_dg8583.setField58(field58s);
        send_dg8583.setField60("23" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000");

        //根据交易类型，检索号找出原交易批次号
        String inntype = "1105";
        String refkey = commonData.getOrgrefno();
        String tableName = "t_log_online_payment";
        String tremBatchNo = getTermBatchNo(inntype, refkey, tableName,tLogOnlinePaymentMapper);

        send_dg8583.setField61(StringUtil.addLeftZero(tremBatchNo, 6) + StringUtil.addLeftZero(commonData.getOrgsyssesq() + "", 6));
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文服务
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);
        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
        commonData.setSettdate(recv_dg8583.getField15());
        /*
         * if ("00".equals(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()))) { String balance =
         * recv_dg8583.getField54().substring(10, 22); commonData.setBalance(balance);
         * logger.info("commonData.setBalance:" + balance); }
         */
    }

    /**
     * 退货
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public  void cardReturn(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo,TLogOnlinePaymentMapper tLogOnlinePaymentMapper) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();

        send_dg8583.setField3("200000");
        send_dg8583.setField4(NumberStringUtil.addLeftZero(commonData.getTxnamt(), 12));
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        send_dg8583.setField37(commonData.getRefno());
        send_dg8583.setField49("156");
        //58域用法十一
        Field58 field58 = new Field58();
        field58.setIcdr_0("CU");
        field58.setIcdr_1(NumberStringUtil.addLeftZero(commonData.getTxnamt(), 12));
        String field58s = Field58.generalField58StrForUse11(field58);
        send_dg8583.setField58(field58s);
        send_dg8583.setField60("25" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000");

        //根据交易类型，检索号找出原交易批次号
        String inntype = "1105";
        String refkey = commonData.getRefno();
        String tableName = "t_log_online_payment";
        if (null != commonData.getOrgtxndate() && !DateFormatUtil.getCurrentTime().equals(commonData.getOrgtxndate())) {
            tableName = "payment" + commonData.getOrgtxndate();
        }
        String oldTime = "";
        if (null != commonData.getOrgtxndate()) {
            oldTime = commonData.getOrgtxndate().substring(4, 8);
        }
        String tremBatchNo = getTermBatchNo(inntype, refkey, tableName,tLogOnlinePaymentMapper);
        send_dg8583.setField61(StringUtil.addLeftZero(tremBatchNo, 6) + StringUtil.addLeftZero(commonData.getOrgsyssesq() + "", 6) + oldTime);
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文服务
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);
        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
    }

    /**
     * 账户圈存请求
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void trapRequest(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        commonData.setRefno("");
        commonData.setSettdate("");
        Datagram8583 send_dg8583 = new Datagram8583();
        commonData.setMAC2("");

        send_dg8583.setField3("600000");
        send_dg8583.setField4(commonData.getTxnamt());
        send_dg8583.setField22("050");
        send_dg8583.setField25("91");
        send_dg8583.setField49("156");
        //TODO 解密前端上送的密码
        String pinblock = PinUtil.getPinBlock(commonData.getCardno(), commonData.getPassword(),false);
        String field52 = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, pinblock);
        send_dg8583.setField52(field52);
        send_dg8583.setField53("2600000000000000");
        String city = commonData.getCity();
        String random = commonData.getRandom();
        String txnseq = commonData.getTxnseq();
        String befbal = commonData.getBefbal();
        String txnamt = commonData.getTxnamt();
        String txntermid = commonData.getTxntermid();
        String mac1 = commonData.getMAC1();
        String cardMark = commonData.getCardno();
        Field58 field58 = new Field58();
        field58.setIcdr_0("RQ");
        field58.setIcdr_1(city + "0000" + "FFFFFFFF");
        field58.setIcdr_2(cardMark);
        field58.setIcdr_3(random);
        field58.setIcdr_4("01");
        field58.setIcdr_5("01");
        field58.setIcdr_6(txnseq);
        Field58_7 field58_7 = new Field58_7();
        field58_7.setF58_7_1(befbal);
        field58_7.setF58_7_2(txnamt);
        field58_7.setF58_7_3("02");
        field58_7.setF58_7_4("02");
        field58.setIcdr_7_Object(field58_7);
        field58.setIcdr_8(mac1);
        field58.setIcdr_9("01");
        String field58s = Field58.generalField58StrForUse1(field58);
        //String field58s = "525183200000ffffffff8320889511000001ffff45e71f9f010100020000012c0000006412000000000016faea450c01";

        send_dg8583.setField58(field58s);
        String field60 = "40" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6);
        send_dg8583.setField60(field60);
        send_dg8583.setField63("000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        String field58Str = recv_dg8583.getField58();

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
        commonData.setSettdate(recv_dg8583.getField15());

    }

    /**
     * 账户圈存确认
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void trapResponse(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();
        commonData.setRefno("");

        send_dg8583.setField3("600000");
        send_dg8583.setField4(commonData.getTxnamt());
        send_dg8583.setField22("050");
        send_dg8583.setField25("91");
        CommonPackage.pack48Field(send_dg8583, commonData, FIELD48_USE_11);//第48域 用法十一，卡操作结果
        send_dg8583.setField49("156");
        String carddate = commonData.getCarddate();
        String cardtime = commonData.getCardtime();
        String city = commonData.getCity();
        String tac = commonData.getTAC();
        String random = commonData.getRandom();
        String txnseq = commonData.getTxnseq();
        String txnamt = commonData.getTxnamt();
        String afteramt = commonData.getAfteramt();
        String txntermid = commonData.getTxntermid();
        String cardMark = commonData.getCardno() + "FFFF";
        Field58 field58 = new Field58();
        field58.setIcdr_0("SV");
        field58.setIcdr_1(city + "FF0000000000");
        field58.setIcdr_2(cardMark);
        field58.setIcdr_3(random);
        field58.setIcdr_4("01");
        field58.setIcdr_5("01");
        field58.setIcdr_6(txnseq);
        Field58_7 field58_7 = new Field58_7();
        field58_7.setF58_7_1(txnamt);
        field58_7.setF58_7_2("02");
        field58_7.setF58_7_3(txntermid);
        field58_7.setF58_7_4(carddate);
        field58_7.setF58_7_5(cardtime);
        field58.setIcdr_7_Object(field58_7);
        field58.setIcdr_8(tac);
        field58.setIcdr_9(afteramt);
        field58.setIcdr_10("01");
        String field58s = Field58.generalField58StrForUse3(field58);
        send_dg8583.setField58(field58s);

        String field60 = "40" + macpos.getBatchno();
        send_dg8583.setField60(field60);

        /*
         * //根据交易类型，检索号找出原交易批次号 String inntype = "1162"; String refkey = commonData.getRefno(); String tableName =
         * "t_log_online_payment"; String tremBatchNo = getTermBatchNo(inntype, refkey, tableName);
         */
        String tremBatchNo = commonData.getRefno();
        String orgsyssesq = StringUtil.addLeftZero(commonData.getOrgsyssesq(), 6);
        String batchNo = StringUtil.addLeftZero(tremBatchNo + "", 6);
        send_dg8583.setField61(batchNo + orgsyssesq);
        send_dg8583.setField63("000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setSettdate(recv_dg8583.getField15());
        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        if ("00".equals(recv_dg8583.getField39())) {
            commonData.setRefno(recv_dg8583.getField37());
        }

    }
    /**
     * 账户开户
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void accountOpen(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();

        send_dg8583.setField3("000000");
        send_dg8583.setField4("0");
        send_dg8583.setField22("050");
        String field60 = "00" + macpos.getBatchno() + "000";
        send_dg8583.setField60(field60);

        Field62 field62 = new Field62();
        field62.setElement1(commonData.getIfpin());//PIN标识
        field62.setElement2(commonData.getPassword());//交易PIN密文
        field62.setElement3(commonData.getPinchkamt());//PIN校验额度
        field62.setElement4("0");//余额提醒值
        field62.setElement5("01");//账户类型

        //判断实名标识
        TInfoCustomer customerInfo = null;
        if ("Y".equals(commonData.getIfrealname())) {
            customerInfo = new TInfoCustomer();
            customerInfo.setHldname(commonData.getHoldname());//客户姓名
            customerInfo.setHldpptype(commonData.getHoldtype());//证件类型
            customerInfo.setHldppno(commonData.getHoldno());//证件号码
            customerInfo.setHomePhone(commonData.getTelphone());//联系电话
            customerInfo.setEmailAddress(commonData.getEmail());//邮箱地址
            customerInfo.setUnitAddress(commonData.getAddress());//邮寄地址
            customerInfo.setContactZipcode(commonData.getPostno());//邮编
            customerInfo.setHldtel(commonData.getPhone());//手机号
            customerInfo.setQq(commonData.getQq());//qq
            customerInfo.setMmesno(commonData.getWeixin());//微信
            customerInfo.setContactAddress(commonData.getContactaddr());//联系地址
        }
        //TODO 考虑62域上送方式
        String field62s = "00";
        send_dg8583.setField62(field62s);
        send_dg8583.setField63("000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        if ("00".equals(recv_dg8583.getField39())) {
            commonData.setRefno(recv_dg8583.getField37());
            commonData.setSettdate(recv_dg8583.getField15());
        }

    }

    /**
     * 账户退资
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void accountRefund(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo, String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();
        commonData.setRefno("");
        commonData.setSettdate("");
        commonData.setTxnamt("");

        send_dg8583.setField3("001105");
        send_dg8583.setField4(NumberStringUtil.addLeftZero(commonData.getTxnamt(), 12));
        send_dg8583.setField22("050");
        send_dg8583.setField25("00");
        send_dg8583.setField49("156");
        String pinblock = PinUtil.getPinBlock(commonData.getCardno(), commonData.getPassword(),false);
        String field52 = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, pinblock);
        send_dg8583.setField52(field52);
        send_dg8583.setField53("2600000000000000");
        send_dg8583.setField60("22" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000");

        //62域存入账户类型
        Field62 field62 = new Field62();
        field62.setElement1("01");
        String field62Str = Field62.generalField62StrForUse4(field62);
        send_dg8583.setField62(field62Str);
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文服务
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);

        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());
        commonData.setSettdate(recv_dg8583.getField15());
        String txnamt = "";
        if ("00".equals(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()))) {
            txnamt = recv_dg8583.getField54().substring(10, 22);
        }
        txnamt = StringUtil.addLeftZero(txnamt, 12);
        commonData.setTxnamt(txnamt);
    }

    /**
     * 账户注销
     * 
     * @param commonData
     * @param macpos
     * @param msgSendInfo
     * @throws Exception
     */
    public static void accountCancel(CommonData commonData, TParamMacposinfo macpos, MsgSendInfo msgSendInfo1, MsgSendInfo msgSendInfo2,
            String pinkeyEnc) throws Exception {
        Datagram8583 send_dg8583 = new Datagram8583();

        send_dg8583.setField3("000000");
        send_dg8583.setField22("050");
        if (null != commonData.getPassword()) {
            String pinblock = PinUtil.getPinBlock(commonData.getCardno(), commonData.getPassword(),false);
            String field52 = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, pinblock);
            send_dg8583.setField52(field52);
        }
        send_dg8583.setField53("2600000000000000");
        send_dg8583.setField60("00" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000");

        //62域用法四十一
        Field62 field62 = new Field62();
        field62.setElement1("01");//账户类型
        field62.setElement2(commonData.getHoldname());//姓名
        field62.setElement3(commonData.getHoldtype());//证件类型
        field62.setElement4(commonData.getHoldno());//证件号码
        String field62str = Field62.generalField62StrForUse41(field62);
        send_dg8583.setField62(field62str);
        send_dg8583.setField63("0000000000000000");
        //公共域赋值
        CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

        //发送8583报文服务
        JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(msgSendInfo1.getXmlpath());
        String recv_dg8583_str = jieYiCommunication8583.sendMsg(gson.toJson(send_dg8583), gson.toJson(msgSendInfo1));

        logger.info("recv_dg8583_str:" + recv_dg8583_str);

        Datagram8583 recv_dg8583 = gson.fromJson(recv_dg8583_str, Datagram8583.class);
        commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()));
        commonData.setResponsedesc(recv_dg8583.getField40());
        commonData.setRefno(recv_dg8583.getField37());

        //注销申请成功直接发送注销完成
        if ("00".equals(CardTxnBizUtil.transRespCode(recv_dg8583.getField39()))) {
            Datagram8583 send_dg8583s = new Datagram8583();
            send_dg8583s.setField3("000000");
            send_dg8583s.setField22("050");
            if (null != commonData.getPassword()) {
                String pinblock = PinUtil.getPinBlock(commonData.getCardno(), commonData.getPassword(),false);
                String field52 = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinkeyEnc, pinblock);
                send_dg8583s.setField52(field52);
            }
            send_dg8583s.setField53("2600000000000000");
            send_dg8583s.setField60("00" + StringUtil.addLeftZero(macpos.getBatchno() + "", 6) + "000");
            send_dg8583s.setField62(field62str);
            send_dg8583s.setField63("0000000000000000");
            //公共域赋值
            CardTxnBizUtil.generateField(macpos, commonData, send_dg8583);

            //发送8583报文服务
            JieYiCommunication8583 jieYiCommunication8583s = new JieYiCommunication8583(msgSendInfo2.getXmlpath());
            String recv_dg8583_strs = jieYiCommunication8583s.sendMsg(gson.toJson(send_dg8583s), gson.toJson(msgSendInfo2));

            logger.info("recv_dg8583_strs:" + recv_dg8583_strs);

            Datagram8583 recv_dg8583s = gson.fromJson(recv_dg8583_strs, Datagram8583.class);
            commonData.setResponsecode(CardTxnBizUtil.transRespCode(recv_dg8583s.getField39()));
            commonData.setResponsedesc(recv_dg8583s.getField40());
            commonData.setRefno(recv_dg8583s.getField37());
            commonData.setSettdate(recv_dg8583.getField15());
            commonData.setBalance(StringUtil.addLeftZero(recv_dg8583s.getField4(), 12));
            //commonData.setCardfee("");//注销手续费
        }

    }

    /**
     * 获取原交易批次号
     * 
     * @param inntype
     * @param refkey
     * @param tableName
     * @return
     * @throws Exception
     */
    public String getTermBatchNo(String inntype, String refkey, String tableName,TLogOnlinePaymentMapper tLogOnlinePaymentMapper) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("inntype", inntype);
        map.put("refkey", refkey);
        map.put("tableName", tableName);
        String termBatchNo = "";
        List<TLogOnlinePayment> list = tLogOnlinePaymentMapper.selectByRefKey(map);
        if (list.size() == 0) {
            throw new Exception(Constant.TRAN_CODE_10003.getName());
        } else {
            termBatchNo = list.get(0).getTermbatchno();
        }
        return termBatchNo;
    }
}
