package jieyi.accservice.biz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import jieyi.accservice.bizform.CommonData;
import jieyi.accservice.bizform.Constant;
import jieyi.accservice.exception.BusinessException;

import jieyi.accservice.form.TParamMacposinfo;
import jieyi.accservice.utils.NumberStringUtil;
import jieyi.tools.commuclient_8583.form.data8583.Datagram8583;
import net.sf.json.JSONObject;

/**
 * 
 * @ClassName: CardTxnBizUtil
 * @Description: 卡交易通用业务处理类
 * @author: lacet
 * @date: 2019年3月28日 下午12:50:15
 *
 */
public class CardTxnBizUtil {

    /**
     * 请求报文的通用校验
     * 
     * @param commonData
     */
    public static void checkCommon(CommonData commonData) {
        String mchnit = commonData.getMchntid();
        String instid = commonData.getInstid();
        String termid = commonData.getTermid();
        //校验商户号
        if (!StringUtils.isNotBlank(mchnit)) {
            throw new BusinessException(Constant.RSP_CODE_113.getCode(), Constant.RSP_CODE_113.getName());
        }
        if (!StringUtils.isNumeric(mchnit)) {
            throw new BusinessException(Constant.RSP_CODE_200.getCode(), Constant.RSP_CODE_200.getName());
        }
        /*
         * if(mchnit.length() != 15) { throw new
         * BusinessException(Constant.RSP_CODE_114.getCode(),Constant.RSP_CODE_114.getName()); }
         */
        if (!StringUtils.isNotBlank(instid)) {
            throw new BusinessException(Constant.RSP_CODE_201.getCode(), Constant.RSP_CODE_201.getName());
        }
        if (!StringUtils.isNumeric(instid)) {
            throw new BusinessException(Constant.RSP_CODE_202.getCode(), Constant.RSP_CODE_202.getName());
        }
        if (!StringUtils.isNotBlank(termid)) {
            throw new BusinessException(Constant.RSP_CODE_203.getCode(), Constant.RSP_CODE_203.getName());
        }
        if (!StringUtils.isNumeric(termid)) {
            throw new BusinessException(Constant.RSP_CODE_204.getCode(), Constant.RSP_CODE_204.getName());
        }

    }

    /**
     * 转换请求参数
     * 
     * @param commonData
     */
    public static void fromJson(String jsonStr, CommonData param, String txninfo, String signcode) {
        JSONObject obj = ((JSONObject) new JSONObject()).fromObject(jsonStr);
        param = (CommonData) JSONObject.toBean(obj, CommonData.class);
        txninfo = param.getTxninfo();
        signcode = param.getSigncode();
        obj = ((JSONObject) new JSONObject()).fromObject(txninfo);
        param = (CommonData) JSONObject.toBean(obj, CommonData.class);
        param.setResponsecode(Constant.RSP_CODE_00.getCode());
        param.setResponsedesc(Constant.RSP_CODE_00.getName());
    }

    /**
     * 余额查询请求的个性化校验
     * 
     * @param commonData
     */
    public static void checkForBalanceQuery(CommonData commonData) {

    }

    /**
     * 密码修改的个性化校验
     * 
     * @param commonData
     */
    public static void checkForModifyCardPwd(CommonData commonData) {

    }

    /**
     * 消费的个性化校验
     * 
     * @param commonData
     */
    public static void checkForCardConsume(CommonData commonData) {

    }

    /**
     * 消费撤消的个性化校验
     * 
     * @param commonData
     */
    public static void checkForCancelCorrect(CommonData commonData) {

    }

    /**
     * 退货的个性化校验
     * 
     * @param commonData
     */
    public static void checkForCardReturn(CommonData commonData) {

    }

    /**
     * 圈存请求的个性化校验
     * 
     * @param commonData
     */
    public static void checkForTrapRequest(CommonData commonData) {

    }

    /**
     * 圈存确认的个性化校验
     * 
     * @param commonData
     */
    public static void checkForTrapResponse(CommonData commonData) {

    }

    /**
     * 账户开户的个性化校验
     * 
     * @param commonData
     */
    public static void checkForAccountOpen(CommonData commonData) {

    }

    /**
     * 账户退资的个性化校验
     * 
     * @param commonData
     */
    public static void checkForAccRefund(CommonData commonData) {

    }

    /**
     * 账户注销的个性化校验
     * 
     * @param commonData
     */
    public static void checkForAccCancel(CommonData commonData) {

    }

    /**
     * 卡片充值的个性化校验
     * 
     * @param commonData
     */
    public static void checkForCardRecharge(CommonData commonData) {

    }

    /**
     * 卡片开卡的个性化校验
     * 
     * @param commonData
     */
    public static void checkForCardNewCard(CommonData commonData) {

    }

    /**
     * 订单发起的个性化校验
     * 
     * @param commonData
     */
    public static void checkForOrderStart(CommonData commonData) {

    }

    /**
     * 订单查询的个性化校验
     * 
     * @param commonData
     */
    public static void checkForOrderQuery(CommonData commonData) {

    }

    /**
     * 订单支付通知的个性化校验
     * 
     * @param commonData
     */
    public static void checkForOrderPay(CommonData commonData) {

    }
    /**
     * 卡片密钥置换的个性化校验
     * 
     * @param commonData
     */
    public static void checkForCardPwdRechange(CommonData commonData) {

    }

    /**
     * 卡片发卡
     * 
     * @param commonData
     */
    public static void checkForCardForSend(CommonData commonData) {

    }

    /**
     * 门锁延期
     * 
     * @param commonData
     */
    public static void checkForDoorLockDelay(CommonData commonData) {

    }

    /**
     * 卡验证
     * 
     * @param commonData
     */
    public static void checkForCardValidate(CommonData commonData) {

    }

    /**
     * 消费(接入)
     * 
     * @param commonData
     */
    public static void checkForConsumeIn(CommonData commonData) {

    }

    /**
     * 终端心跳上传
     * 
     * @param commonData
     */
    public static void checkForTermUpload(CommonData commonData) {

    }

    /**
     * 消费(转成)
     * 
     * @param commonData
     */
    public static void checkForConsumeOut(CommonData commonData) {

    }

    /**
     * 交易查询
     * 
     * @param commonData
     */
    public static void checkForTransactionQuery(CommonData commonData) {

    }

    /**
     * 内外部应答码转换
     * 
     * @param field39
     * @return
     */
    public static String transRespCode(String field39) {
        if ("00".equals(field39)) {
            return Constant.RSP_CODE_00.getCode();
        } else if ("22".equals(field39)) {
            return Constant.RSP_CODE_06.getCode();
        } else if ("FC".equals(field39)) {
            return Constant.RSP_CODE_10.getCode();
        } else if ("03".equals(field39)) {
            return Constant.RSP_CODE_21.getCode();
        } else if ("55".equals(field39)) {
            return Constant.RSP_CODE_55.getCode();
        } else if ("75".equals(field39)) {
            return Constant.RSP_CODE_83.getCode();
        } else if ("CF".equals(field39)) {
            return Constant.RSP_CODE_42.getCode();
        } else if ("96".equals(field39)) {
            return Constant.RSP_CODE_96.getCode();
        } else if ("FA".equals(field39)) {
            return Constant.RSP_CODE_62.getCode();
        } else if ("51".equals(field39)) {
            return Constant.RSP_CODE_25.getCode();
        } else if ("CF".equals(field39)) {
            return Constant.RSP_CODE_42.getCode();
        } else {
            return Constant.RSP_CODE_01.getCode();
        }
    }

    /**
     * 公共报文域设置值
     * 
     * @param macpos
     * @param send_dg8583
     */
    public static void generateField(TParamMacposinfo macpos, CommonData commonData, Datagram8583 send_dg8583) {
        send_dg8583.setField2(commonData.getCardno());
        send_dg8583.setField11(NumberStringUtil.addLeftZero(macpos.getPosseq() + "", 6));//posSequence
        send_dg8583.setField32(commonData.getInstid());
        //send_dg8583.setField32("11355850");
        send_dg8583.setField41(macpos.getPosid());//posid
        send_dg8583.setField42(commonData.getMchntid());
    }

    /**
     * 验证手机号
     * 
     * @param mobile
     * @return
     */
    public static boolean checkMobile(String mobile) {
        if (mobile == null || "".equals(mobile)) {
            return false;
        } else if (!mobile.matches("^1[3|4|5|7|8][0-9]\\d{4,8}$")) {
            return false;
        }
        return true;
    }

    /**
     * 在yyyyMMdd日期上加span月数
     * 
     * @param dateStr
     * @param span
     * @return
     * @throws Exception
     */
    public static String dateAddMonths(String dateStr, int span) throws Exception {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        Date date = f.parse(dateStr);
        c.setTime(date);
        c.add(Calendar.MONTH, span);
        return f.format(c.getTime());
    }

    /**
     * 校验身份证信息
     * 
     * @param commonData
     */
    public static void checkCardHolder(CommonData commonData) {
        /*
         * if(!StringUtils.isNotBlank(commonData.getId_type())) { throw new
         * BusinessException(Constant.RSP_CODE_122.getCode(),Constant.RSP_CODE_122.getName()); }
         * if(commonData.getId_type().length() != 2) { throw new
         * BusinessException(Constant.RSP_CODE_123.getCode(),Constant.RSP_CODE_123.getName()); }
         * if(!StringUtils.isNotBlank(commonData.getId_no())) { throw new
         * BusinessException(Constant.RSP_CODE_130.getCode(), Constant.RSP_CODE_130.getName()); }
         * if(commonData.getId_no().length() > 20 ) { throw new BusinessException(Constant.RSP_CODE_131.getCode(),
         * Constant.RSP_CODE_131.getName()); } if(!StringUtils.isNotBlank(commonData.getCell_phone_no())) { throw new
         * BusinessException(Constant.RSP_CODE_128.getCode(), Constant.RSP_CODE_128.getName()); }
         * if(commonData.getName() == null || commonData.getName().length() > 50 ) { throw new
         * BusinessException(Constant.RSP_CODE_127.getCode(), Constant.RSP_CODE_127.getName()); }
         */
    }

    public static void main(String[] args) {
        System.out.println(CardTxnBizUtil.checkMobile(null));
        System.out.println(CardTxnBizUtil.checkMobile("ddddddddddd122"));
        System.out.println(CardTxnBizUtil.checkMobile("15580904219"));
        System.out.println(CardTxnBizUtil.checkMobile(""));
        System.out.println(CardTxnBizUtil.checkMobile("155****4202"));
        System.out.println(CardTxnBizUtil.checkMobile("15675806459"));
    }
}
