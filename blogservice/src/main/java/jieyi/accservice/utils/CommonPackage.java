package jieyi.accservice.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;



import jieyi.accservice.bizform.CommonData;
import jieyi.accservice.bizform.Constant;
import jieyi.accservice.dao.TPrepositionLogMapper;
import jieyi.accservice.exception.BusinessException;
import jieyi.accservice.service.SequenceService;
import jieyi.tools.commuclient_8583.form.data8583.Datagram8583;
import net.sf.cglib.beans.BeanMap;

/**
 * 
 * @ClassName: CommonPackage
 * @Description: 数据包通用工具类
 * @author: lacet
 * @date: 2019年3月28日 下午12:47:51
 *
 */
@Service
public class CommonPackage {

    private static Logger logger = Logger.getLogger(CommonPackage.class);

    protected static SequenceService sequenceService;

    protected static TPrepositionLogMapper tPrepositionLogMapper;

    @Autowired
    public CommonPackage(SequenceService sequenceService, 
            TPrepositionLogMapper tPrepositionLogMapper) {
        this.sequenceService = sequenceService;      
        this.tPrepositionLogMapper = tPrepositionLogMapper;
    }

    protected static Gson gson = new Gson();

    public final static String APDU_SPLIT = ",";

    public final static String APDU_SUCCESS_9000 = "9000";
    public final static String APDU_SUCCESS_61 = "61";

    /**
     * 获取流水号
     * 
     * @param param
     * @return
     */
    public static String getSsnPlt() {
        String sysSeq = NumberStringUtil.addLeftZero(sequenceService.findNextValue("plt_ssn"), 12);
        String sValue = DateFormatUtil.getCurrentTime() + sysSeq;
        return sValue;
    }

    public static String getAcqIns() {
        String sysSeq = NumberStringUtil.addLeftZero(sequenceService.findNextValue("acq_ins"), 12);
        String sValue = DateFormatUtil.getCurrentTime() + sysSeq;
        return sValue;
    }

    /**
     * 校验卡号
     * 
     * @param commonData
     * @throws Exception
     */
    public static void CheckCardNo(CommonData commonData) throws Exception {

        Map<String, String> map = new HashMap<String, String>();
        map.put("outerCardNo", commonData.getCardno());
        map.put("issInsCode", commonData.getInstid());
       //TODO 到卡系统查询卡信息
    }

   

    /**
     * 入库日志表
     * 
     * @param param
     * @return
     */
    public static void insertLog(CommonData param, String txncode) throws Exception {
        Map<String, Object> map = beanToMap(param);
        if (param.getReqseq() == null) {
            map.put("reqseq", "0");
        }
        map.put("txncode", txncode);
        map.put("createTime", DateFormatUtil.getCurrentTime14());
        try {
            tPrepositionLogMapper.insertSelective(map);
        } catch (Exception e) {
            throw new BusinessException(Constant.TRAN_CODE_10002.getCode(), "log" + Constant.TRAN_CODE_10002.getName());
        }

    }

    /**
     * 更新日志表
     * 
     * @param param
     * @return
     */
    public static void updateLog(CommonData param, String txncode) {
        try {
            Map<String, Object> map = beanToMap(param);
            map.put("txncode", txncode);
            map.put("updateTime", DateFormatUtil.getCurrentTime14());
            tPrepositionLogMapper.updateByPrimaryKeySelective(map);
        } catch (Exception e) {
            throw new BusinessException(Constant.TRAN_CODE_10002.getCode(), "log" + Constant.TRAN_CODE_10002.getName());
        }

    }

    /**
     * 将对象装换为map
     * 
     * @param bean
     * @return
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key + "", beanMap.get(key));
            }
        }
        return map;
    }

    //处理APDU指令并赋值子键
    public static void packApduStr(List<String> apduList, CommonData commonData) {
        if (apduList == null || apduList.size() == 0) {
            return;
        }
        StringBuffer apduSb = new StringBuffer();
        for (int i = 0; i < apduList.size(); i++) {
            apduSb.append(apduList.get(i));
            if (apduList.size() != (i + 1)) {
                apduSb.append(APDU_SPLIT);
            }
        }
        commonData.setApdunum(apduList.size() + "");
        commonData.setApdulist(apduSb.toString());
    }

    //拼装48域
    public static void pack48Field(Datagram8583 send_dg8583, CommonData commonData, int method) throws Exception {
        StringBuffer field48Sb = new StringBuffer();
        List<String> field48List = new ArrayList<String>();
        switch (method) {
            case 11 :
                //  					9.3.23.7　用法十一：用于上送卡操作结果
                //  					N4(LLLVAR)，3个字节的长度值＋2字节的数据+2字节授权模式。
                //  					压缩时用右靠BCD码表示的2个字节的长度值＋用左靠BCD表示的1个字节的操作结果+1字节的授权模式。
                //  					操作结果：00：卡片操作成功  01：卡片操作失败   02：灰交易(写卡结果未知)
                //  					授权模式：00 联机授权   01：本地授权
                field48List.add(NumberStringUtil.addLeftZero("0", 2));
                field48List.add("00");

                break;
            default :
                //48域拼装方法不存在
                throw new Exception(Constant.TRAN_CODE_10008.getName());
        }
        for (int i = 0; i < field48List.size(); i++) {
            field48Sb.append(field48List.get(i));
            logger.info("[048." + (i + 1) + "]:[" + NumberStringUtil.addLeftZero(field48List.get(i).length() + "", 3) + "]:[" + field48List.get(i)
                    + "]");
        }

        //commonData.setAddnPrivateDataOut(field48Sb.toString()) ;
        send_dg8583.setField48(field48Sb.toString());
    }

    //拼装62域
    public static void pack62Field(CommonData commonData, Datagram8583 send_dg8583, int method) throws Exception {
        List<String> field62List = new ArrayList<String>();
        StringBuffer field62Sb = new StringBuffer();
        switch (method) {
            case 36 :
                //			62.1	发卡方代码	ans 8	M	备注	右补空格
                //			62.2	行业代码	ans 4	M		右补空格
                //			62.3	启用标志	ans 2	M		
                //			62.4	卡片押金	ans 8	M		单位分
                //			62.5	卡主类型	ans 2	M		
                //			62.6	卡子类型	ans 2	M		
                //			62.7	应用版本	ans 2	M		
                //			62.8	应用序列号（卡号）	ans 20	M		右补空格
                //			62.9	应用启动日期	ans 8	M		
                //			62.10	卡有效期	ans 8	M		
                //			62.11	应用序列号（旧卡）	ans20	C+		换卡售卡必填，普通售卡填写全空格。
                //			62.12	换卡申请单号	ans20	C+		换卡售卡必须填写。普通售卡填写空格
                //			62.13	记名信息标识	ans 1	M		Y/N
                //			62.14	客户姓名	ans30	C+		C+代表记名信息标识为‘Y’时必须录入.C代表记名信息标识为‘Y’时存在，若无用空格填写。
                //			62.15	证件类型	ans2	C+		
                //			62.15	证件号码	ans20	C+		
                //			62.17	联系电话	ans15	C		
                //			62.18	Email地址	ans40	C		
                //			62.19	邮件地址	ans60	C		
                //			62.20	邮编	ans6	C		
                //			62.21	手机号	ans15	C		
                //			62.22	QQ	Ans40	C		
                //			62.23	微信	Ans40	C		
                //			62.24	联系地址	Ans100	C		
                //			62.25	销售人员编号	Ans16	C		有则上送，否则填写全空格

                field62List.add(NumberStringUtil.addRightChar(commonData.getIssInstid() == null ? "" : commonData.getIssInstid(), 8, ' ', "GBK"));//吉林写死GBK
                field62List.add(NumberStringUtil.addRightChar("", 4, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getSaleFlag() == null ? "" : commonData.getSaleFlag(), 2, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getCardDeposit() == null ? "" : commonData.getCardDeposit(), 8, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getCardmtype() == null ? "" : commonData.getCardmtype(), 2, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getCardstype() == null ? "" : commonData.getCardstype(), 2, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getCardver() == null ? "" : commonData.getCardver(), 2, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getPriAcctNo() == null ? "" : commonData.getPriAcctNo(), 20, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getSaleDate() == null ? "" : commonData.getSaleDate(), 8, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getCardValdate() == null ? "" : commonData.getCardValdate(), 8, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getSrcCardNo() == null ? "" : commonData.getSrcCardNo(), 20, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getReqOrderId() == null ? "" : commonData.getReqOrderId(), 20, ' ', "GBK"));
                if (null != commonData.getCertifId() && !"".equals(commonData.getCertifId())) {
                    field62List.add(NumberStringUtil.addRightChar("Y", 1, ' ', "GBK"));
                } else {
                    field62List.add(NumberStringUtil.addRightChar("N", 1, ' ', "GBK"));
                }
                field62List.add(NumberStringUtil.addRightChar(commonData.getHoldname() == null ? "" : commonData.getHoldname(), 30, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getHoldtype() == null ? "" : commonData.getHoldtype(), 2, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getHoldno() == null ? "" : commonData.getHoldno(), 20, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getTelphone() == null ? "" : commonData.getTelphone(), 15, ' ', "GBK"));

                field62List.add(NumberStringUtil.addRightChar("", 106, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getTelphone() == null ? "" : commonData.getTelphone(), 15, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar("", 196, ' ', "GBK"));

                break;
            case 52 :
                //  				62.1	支付方式	Ans2	00：现金 01：银联卡 01：微信 02支付宝
                //  				62.2	第三方订单号	Ans50	不足右补空格
                //  				62.3	原有效期	Ans8	
                field62List.add(NumberStringUtil.addLeftChar(commonData.getPayType() == null ? "" : commonData.getPayType(), 2, '0', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getPayordid() == null ? "" : commonData.getPayordid(), 50, ' ', "GBK"));
                field62List.add(NumberStringUtil.addRightChar(commonData.getCardValdate(), 8, ' ', "GBK"));

                break;
            default :
                //62域拼装方法不存在
                throw new Exception(Constant.TRAN_CODE_10008.getName());
        }

        for (int i = 0; i < field62List.size(); i++) {
            field62Sb.append(field62List.get(i));
            logger.info("[062." + (i + 1) + "]:[" + NumberStringUtil.addLeftZero(field62List.get(i).length() + "", 3) + "]:[" + field62List.get(i)
                    + "]");
        }

        try {
            send_dg8583.setField62(NumberStringUtil.bytesToHexString(field62Sb.toString().getBytes("GBK")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 

    /**
     * 比较两个卡号后8位
     * 
     * @param cardNo1
     * @param cardNo2
     * @return
     * @throws Exception
     */
    public static void compareCardNo(String cardNo1, String cardNo2) throws Exception {
        int len1 = cardNo1.length();
        int len2 = cardNo2.length();
        if (len1 >= 8 && len2 >= 8) {
            if (!(cardNo1.substring(len1 - 8, len1)).equals(cardNo2.substring(len2 - 8, len2))) {
                throw new Exception(Constant.TRAN_CODE_10010.getCode());
            }
        }
    }

    public static String convertAsciiToString(String hex) {

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        //49204c6f7665204a617661 split into two characters 49, 20, 4c...  
        for (int i = 0; i < hex.length() - 1; i += 2) {

            //grab the hex in pairs  
            String output = hex.substring(i, (i + 2));
            //convert hex to decimal  
            int decimal = Integer.parseInt(output, 16);
            //convert the decimal to character  
            sb.append((char) decimal);

            temp.append(decimal);
        }
        return sb.toString();
    }
}
