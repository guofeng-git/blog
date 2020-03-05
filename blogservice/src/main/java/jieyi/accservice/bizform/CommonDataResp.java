package jieyi.accservice.bizform;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import jieyi.accservice.form.TLogOnlinePayment;

/**
 * 报文返回对象(公用)
 * 
 */
public class CommonDataResp implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    /** 交易代码 **/
    private String txncode;
    /** 卡号 **/
    private String cardno;
    /** 外部流水号 **/
    private String syssesq;
    /** 机构号 **/
    private String instid;
    private String issInstid;
    /** 商户号 **/
    private String mchntid;
    /** 终端号 **/
    private String termid;
    /** 卡密码 **/
    private String password;
    /** 文件类型 **/
    private String filetype;
    /** 请求日期 **/
    private String txndate;
    private String reqdate;
    /** 请求时间 **/
    private String txntime;
    private String reqtime;
    /** 请求方结算日期 **/
    private String reqsettdate;
    /** 写卡日期 **/
    private String carddate;
    /** 写卡时间 **/
    private String cardtime;
    /** 原交易日期 **/
    private String orgtxndate;
    /** 城市代码 **/
    private String city;
    /** 城市代码 **/
    private String authcode;
    /** 注销手续费 **/
    private String cardfee;
    /** 卡片圈存随机数 **/
    private String random;
    /** 卡片圈存交易序号 **/
    private String txnseq;
    /** 钱包余额 **/
    private String befbal;
    /** 圈存金额 **/
    private String txnamt;
    private String txmamt;
    /** 圈存终端号 **/
    private String txntermid;
    /** 充值交易MAC1 **/
    private String MAC1;
    /** 充值交易MAC2 **/
    private String MAC2;
    /** 充值结果 **/
    private String chargeresult;
    /** 附加信息 **/
    private String attach;
    /** 记名信息标识 **/
    private String certifId;
    /** 卡片押金 **/
    private String cardDeposit;
    /** 上次心跳时间 **/
    private String lastSuccTime;
    /** 应用序列号 **/
    private String srcCardNo;
    /** 换卡申请单号 **/
    private String reqOrderId;
   
    /** 检索参考号 **/
    private String refno;
    /** 原请求方流水号 **/
    private String orgsyssesq;
    /** 写卡结果 **/
    private String oprresult;
    /** 交易后金额 **/
    private String afteramt;
    /** TAC **/
    private String TAC;
    /** 卡面号 **/
    private String cardfaceno;
    /** 请求包号 **/
    private String reqseq;
    /** apdu数量 **/
    private String lstapdunum;
    /** Apdu信息 **/
    private String lstapdulist;
    /** 充值方式 **/
    private String chargetype;
    /** 订单号 **/
    private String ordid;
    /** 原订单号 **/
    private String orgordid;
    /** 支付单号 **/
    private String payordid;
    /** 凭证号 **/
    private String voucherno;
    /** 客户号 **/
    private String customerno;
    /** 手机串号 **/
    private String imei;
    /** SE序列号 **/
    private String seid;
    /** 手机型号 **/
    private String mobiletype;
    /** 手机操作系统版本 **/
    private String systemver;
    /** 一卡通定义 **/
    private String cosver;
    /** 0：不参与对账，1：参与对账 **/
    private String balflag;
    /** apdu数量 **/
    private String apdunum;
    /** apdu集合 **/
    private String apdulist;
    /** 交易前金额 **/
    private String befamt;
    /** 卡计数器 **/
    private String cardcnt;
    /** 中心结算日期 **/
    private String settdate;
    /** 业务流水号 **/
    private String refnum;

    private String saleFlag;

    private String saleDate;

    private String cardValdate;

    private String cardmtype;

    private String cardstype;

    private String cardOprType;

    private String cardNoHex;

    private String cardFile0015;

    private String payType;

    private String orderSsnPk;

    private String fld62Out;

    private String IcCashFldsOut;

    private String Fld60Out;

    private String PriAcctNo;

    private String posseq;

    private String cardFile0005;

    private String mchnt_balance;
    private String cardnum;
    private String beg_no;
    private String end_no;
    private String cardresult;

    /** 密码标识 **/
    private String ifpin;
    /** 免密金额 **/
    private String pinchkamt;
    /** 余额提醒值 **/
    private String remindamt;
    /** 实名标识 **/
    private String ifrealname;
    /** 姓名 **/
    private String holdname;
    /** 证件类型 **/
    private String holdtype;
    /** 证件号 **/
    private String holdno;
    /** 手机号 **/
    private String phone;
    /** 电子邮箱 **/
    private String email;
    /** 联系电话 **/
    private String telphone;
    /** 联系地址 **/
    private String contactaddr;
    /** 邮编 **/
    private String postno;
    /** 地址 **/
    private String address;
    /** QQ */
    private String qq;
    /** 微信 **/
    private String weixin;
    /**** 修改标识 **/
    private String changeflag;
    /**** 新密码 **/
    private String newpassword;

    /**** 原检索参考号 **/
    private String orgrefno;

    private String data;
    private String gendate;

    /** 卡内余额 **/
    private String cardbal;
    /** 订单类型 **/
    private String ordertype;
    /** 业务类型 **/
    private String transtype;
    /** 支付机构 **/
    private String payinst;
    /** 支付商户 **/
    private String paymchnt;
    /** 卡渠道 **/
    private String cardchnl;
    /** ats **/
    private String ats;
    /** 支付渠道 **/
    private String paypantype;
    /** 预支付凭证 **/
    private String prepayid;
    /** 订单类型 **/
    private String ordtype;
    /** 订单状态 **/
    private String ordstate;
    /** 订单日期开始 **/
    private String orddatetimestart;
    /** 订单日期结束 **/
    private String orddatetimeend;
    /** 页号 **/
    private String pageseq;
    /** 每页记录数 **/
    private String pagerecnum;
    /** 订单列表 **/
    private Object ordlist;
    /** 总页数 **/
    private String pagetotal;
    /** 总记录数 **/
    private String rectotal;
    /** 支付结果 **/
    private String paystatus;
    /** 企业编号 **/
    private String companyid;
    /** 门锁编号 **/
    private String lockid;
    /** 持卡人类型 **/
    private String usertype;
    /** 持卡人职工标识 **/
    private String userflag;
    /** 持卡人姓名 **/
    private String username;
    /** 持卡人证件类型 **/
    private String idtype;
    /** 持卡人证件号 **/
    private String idno;
    /** 终止开锁日期 **/
    private String validate;
    /** 交易特有数据 **/
    private String privdata;
    /** POS机当前系统日期 **/
    private String possysDate;
    /** 终端程序版本 **/
    private String posver;
    /** 白名单版本 **/
    private String wlver;
    /** 黑名单版本 **/
    private String blver;
    /** 号段白名单版本 **/
    private String cardver;
    /** 票价版本 **/
    private String pjver;
    /** 终端未上传记录数 **/
    private String txnnum;
    /** 车载机经度 **/
    private String posltd;
    /** 车载机纬度 **/
    private String posrtd;
    /** 参数下载标识 **/
    private String downflag;
    /** 终端支持卡组织 **/
    private String cardorg;
    /** 上车站点 **/
    private String upstation;
    /** 上车时间 **/
    private String uptime;
    /** 下车站点 **/
    private String downstation;
    /** 下车时间 **/
    private String downtime;
    /** PSAM卡号 **/
    private String psamid;

    /** 交易应答码 **/
    private String responsecode="0000";
    /** 交易应答描述 **/
    private String responsedesc="成功";

    private String txninfo;
    private String signcode;
    
    /** 商户通讯秘钥下载 **/
    private String mchntpubkey; //商户公钥
    
    private String mchntpubindex; //商户公钥指数
    
    private String mchntkeyver; //商户秘钥版本
    
    private String attch; //附加信息
    
    private String isrealname; //实名标识 Y-实名 N-非实名
    private String acctype;  //账户类型
    private String custInfo; //调用客管系统返回的信息
    
    /** 客管系统返回字段 **/
    private String result;
    private String resultdesc;
    private String custno;
    private String cusstype;    
    private String sign;
    private String extinfo;
    private String respcode;
    /**查询各个卡系统返回字段 **/
    private String innerCardNo; //卡系统返回卡号(不包含Pboc卡系统)
    private String status;		//卡系统返回卡状态
    private String cardType;	//卡系统返回卡类型
    private String accbalance;	//卡系统返回账户余额
    private String crdbalance;	//卡系统返回卡余额
    private String isRealname;	//卡系统返回是否实名标识
    private String customerNo;	//卡系统返回客户号
    private String hldpptype;	//卡系统返回证件类型
    private String hldname;		//卡系统返回姓名
    private String hldppno;		//卡系统返回证件号
    private String hldtel;		//卡系统返回手机号
    private String cardNo;		//Pboc返回卡号
    private String accType;     //账户类型
    private String crdstate;    //住建部卡状态
    /**交易查询字段 **/
    private String txnmchntcd;  //交易商户号
    private String txnnetcd;	//交易门店号
    private String txntermcd;		//交易终端号
    private String txndateStart; 	//起始交易日期
    private String txndateEnd;		//結束交易日期
    
    /**交通部卡系统圈存字段 **/
    private String instseq;
    private String netid;
    private String oprid;
    private String termseq;
    private String batchno;
    private String timestamp;
    private String cardinfo;
    private String mac1;
    private String mac2;
    /**62卡系统查询字段 **/
    private String card_state; //卡片状态    E 成品卡   A 已销售已激活  N 已销售未激活   T 已换卡  G 作废卡  K 口头（临时）挂失  L 正式挂失   X 过期卡
    private String cust_surname;
    private String cust_name;
    private String cert_id;
    
    private String modules;  //交通部终端模
    private String signkey;  //私钥
    /**交通部卡系统查询字段 **/
    private String expenseSaleAmt;
    private String productCode;
    private String issInsCode;
    private String saleMode;
    //原交易信息
    private String orgbatchno; //原始交易批次号
    private String orgtermseq; //原始交易终端流水号
    private String orgtransdate;//原始交易日期
    private String orgauthmode; //原交易授权方式
    private String orgauthinstid;//原交易授权代码
    
    
    private String refundResult;  //退款结果
    /** 主账户二维码 **/
    private String qrcode;
    private Map<String, Object> accountInfo;
    private List<Object> accInfo;
    private List<Object> acclist;
    private List<Map<String, String>> balance;
    private String consureBalance;//消费余额
    private String accountBalance;//账户余额
    private String chargeBalance; //充值金额
    private List<TLogOnlinePayment>  txnlist;
//    private Integer accountbalance; //余额查询
    private String syspubkey;
    private String syspubidx;
    private String syspubver;
    private String checkvalue;
    private String tmk;
    private String pinkey;
	/**
	 * 客管注册方式  0011：手机号 0023：姓名+证件号 0032：姓名+证件号+手机号 0041：银行卡号+姓名+证件号+手机号
	 */
    private String certfactortype;

	public String getCust_surname() {
		return cust_surname;
	}
	public void setCust_surname(String cust_surname) {
		this.cust_surname = cust_surname;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCert_id() {
		return cert_id;
	}
	public void setCert_id(String cert_id) {
		this.cert_id = cert_id;
	}
	public String getTxncode() {
        return txncode;
    }
    public void setTxncode(String txncode) {
        this.txncode = txncode;
    }
    public String getCardno() {
        return cardno;
    }
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSyssesq() {
        return syssesq;
    }
    public void setSyssesq(String syssesq) {
        this.syssesq = syssesq;
    }
    public String getResponsecode() {
        return responsecode;
    }
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }
    public String getResponsedesc() {
        return responsedesc;
    }
    public void setResponsedesc(String responsedesc) {
        this.responsedesc = responsedesc;
    }
    public String getInstid() {
        return instid;
    }
    public void setInstid(String instid) {
        this.instid = instid;
    }
    public String getMchntid() {
        return mchntid;
    }
    public void setMchntid(String mchntid) {
        this.mchntid = mchntid;
    }
    public String getTermid() {
        return termid;
    }
    public void setTermid(String termid) {
        this.termid = termid;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRefno() {
        return refno;
    }
    public void setRefno(String refno) {
        this.refno = refno;
    }
    public String getTxndate() {
        return txndate;
    }
    public void setTxndate(String txndate) {
        this.txndate = txndate;
    }
    public String getTxntime() {
        return txntime;
    }
    public void setTxntime(String txntime) {
        this.txntime = txntime;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRandom() {
        return random;
    }
    public void setRandom(String random) {
        this.random = random;
    }
    public String getTxnseq() {
        return txnseq;
    }
    public void setTxnseq(String txnseq) {
        this.txnseq = txnseq;
    }
    public String getBefbal() {
        return befbal;
    }
    public void setBefbal(String befbal) {
        this.befbal = befbal;
    }
    public String getTxnamt() {
        return txnamt;
    }
    public void setTxnamt(String txnamt) {
        this.txnamt = txnamt;
    }
    public String getTxntermid() {
        return txntermid;
    }
    public void setTxntermid(String txntermid) {
        this.txntermid = txntermid;
    }
    public String getMAC1() {
        return MAC1;
    }
    public void setMAC1(String mAC1) {
        MAC1 = mAC1;
    }
    public String getMAC2() {
        return MAC2;
    }
    public void setMAC2(String mAC2) {
        MAC2 = mAC2;
    }

    public String getOprresult() {
        return oprresult;
    }
    public void setOprresult(String oprresult) {
        this.oprresult = oprresult;
    }
    public String getAfteramt() {
        return afteramt;
    }
    public void setAfteramt(String afteramt) {
        this.afteramt = afteramt;
    }
    public String getTAC() {
        return TAC;
    }
    public void setTAC(String tAC) {
        TAC = tAC;
    }
    public String getCarddate() {
        return carddate;
    }
    public void setCarddate(String carddate) {
        this.carddate = carddate;
    }
    public String getCardtime() {
        return cardtime;
    }
    public void setCardtime(String cardtime) {
        this.cardtime = cardtime;
    }
    public String getCardfaceno() {
        return cardfaceno;
    }
    public void setCardfaceno(String cardfaceno) {
        this.cardfaceno = cardfaceno;
    }
    public String getReqseq() {
        return reqseq;
    }
    public void setReqseq(String reqseq) {
        this.reqseq = reqseq;
    }
    public String getLstapdunum() {
        return lstapdunum;
    }
    public void setLstapdunum(String lstapdunum) {
        this.lstapdunum = lstapdunum;
    }
    public String getLstapdulist() {
        return lstapdulist;
    }
    public void setLstapdulist(String lstapdulist) {
        this.lstapdulist = lstapdulist;
    }
    public String getChargetype() {
        return chargetype;
    }
    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }
    public String getOrdid() {
        return ordid;
    }
    public void setOrdid(String ordid) {
        this.ordid = ordid;
    }
    public String getPayordid() {
        return payordid;
    }
    public void setPayordid(String payordid) {
        this.payordid = payordid;
    }
    public String getVoucherno() {
        return voucherno;
    }
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }
    public String getCustomerno() {
        return customerno;
    }
    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }
    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }
    public String getSeid() {
        return seid;
    }
    public void setSeid(String seid) {
        this.seid = seid;
    }
    public String getMobiletype() {
        return mobiletype;
    }
    public void setMobiletype(String mobiletype) {
        this.mobiletype = mobiletype;
    }
    public String getSystemver() {
        return systemver;
    }
    public void setSystemver(String systemver) {
        this.systemver = systemver;
    }
    public String getCosver() {
        return cosver;
    }
    public void setCosver(String cosver) {
        this.cosver = cosver;
    }
    public String getBalflag() {
        return balflag;
    }
    public void setBalflag(String balflag) {
        this.balflag = balflag;
    }

    public String getBefamt() {
        return befamt;
    }
    public void setBefamt(String befamt) {
        this.befamt = befamt;
    }
    public String getCardcnt() {
        return cardcnt;
    }
    public void setCardcnt(String cardcnt) {
        this.cardcnt = cardcnt;
    }
    public String getSaleFlag() {
        return saleFlag;
    }
    public void setSaleFlag(String saleFlag) {
        this.saleFlag = saleFlag;
    }
    public String getCardver() {
        return cardver;
    }
    public void setCardver(String cardver) {
        this.cardver = cardver;
    }
    public String getSaleDate() {
        return saleDate;
    }
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
    public String getCardValdate() {
        return cardValdate;
    }
    public void setCardValdate(String cardValdate) {
        this.cardValdate = cardValdate;
    }
    public String getCardmtype() {
        return cardmtype;
    }
    public void setCardmtype(String cardmtype) {
        this.cardmtype = cardmtype;
    }
    public String getCardstype() {
        return cardstype;
    }
    public void setCardstype(String cardstype) {
        this.cardstype = cardstype;
    }
    public String getCardOprType() {
        return cardOprType;
    }
    public void setCardOprType(String cardOprType) {
        this.cardOprType = cardOprType;
    }
    public String getCardNoHex() {
        return cardNoHex;
    }
    public void setCardNoHex(String cardNoHex) {
        this.cardNoHex = cardNoHex;
    }
    public String getCardFile0015() {
        return cardFile0015;
    }
    public void setCardFile0015(String cardFile0015) {
        this.cardFile0015 = cardFile0015;
    }
    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    public String getOrderSsnPk() {
        return orderSsnPk;
    }
    public void setOrderSsnPk(String orderSsnPk) {
        this.orderSsnPk = orderSsnPk;
    }
    public String getFld62Out() {
        return fld62Out;
    }
    public void setFld62Out(String fld62Out) {
        this.fld62Out = fld62Out;
    }
    public String getIcCashFldsOut() {
        return IcCashFldsOut;
    }
    public void setIcCashFldsOut(String icCashFldsOut) {
        IcCashFldsOut = icCashFldsOut;
    }
    public String getFld60Out() {
        return Fld60Out;
    }
    public void setFld60Out(String fld60Out) {
        Fld60Out = fld60Out;
    }
    public String getPriAcctNo() {
        return PriAcctNo;
    }
    public void setPriAcctNo(String priAcctNo) {
        PriAcctNo = priAcctNo;
    }
    public String getPosseq() {
        return posseq;
    }
    public void setPosseq(String posseq) {
        this.posseq = posseq;
    }
    public String getSettdate() {
        return settdate;
    }
    public void setSettdate(String settdate) {
        this.settdate = settdate;
    }
    public String getRefnum() {
        return refnum;
    }
    public void setRefnum(String refnum) {
        this.refnum = refnum;
    }
    public String getCardFile0005() {
        return cardFile0005;
    }
    public void setCardFile0005(String cardFile0005) {
        this.cardFile0005 = cardFile0005;
    }
    public String getIssInstid() {
        return issInstid;
    }
    public void setIssInstid(String issInstid) {
        this.issInstid = issInstid;
    }
    public String getIfpin() {
        return ifpin;
    }
    public void setIfpin(String ifpin) {
        this.ifpin = ifpin;
    }
    public String getPinchkamt() {
        return pinchkamt;
    }
    public void setPinchkamt(String pinchkamt) {
        this.pinchkamt = pinchkamt;
    }
    public String getRemindamt() {
        return remindamt;
    }
    public void setRemindamt(String remindamt) {
        this.remindamt = remindamt;
    }
    public String getIfrealname() {
        return ifrealname;
    }
    public void setIfrealname(String ifrealname) {
        this.ifrealname = ifrealname;
    }
    public String getHoldname() {
        return holdname;
    }
    public void setHoldname(String holdname) {
        this.holdname = holdname;
    }
    public String getHoldtype() {
        return holdtype;
    }
    public void setHoldtype(String holdtype) {
        this.holdtype = holdtype;
    }
    public String getHoldno() {
        return holdno;
    }
    public void setHoldno(String holdno) {
        this.holdno = holdno;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelphone() {
        return telphone;
    }
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
    public String getContactaddr() {
        return contactaddr;
    }
    public void setContactaddr(String contactaddr) {
        this.contactaddr = contactaddr;
    }
    public String getPostno() {
        return postno;
    }
    public void setPostno(String postno) {
        this.postno = postno;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }
    public String getWeixin() {
        return weixin;
    }
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }
    public String getTxninfo() {
        return txninfo;
    }
    public void setTxninfo(String txninfo) {
        this.txninfo = txninfo;
    }
    public String getSigncode() {
        return signcode;
    }
    public void setSigncode(String signcode) {
        this.signcode = signcode;
    }

    public String getGendate() {
        return gendate;
    }
    public void setGendate(String gendate) {
        this.gendate = gendate;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCardbal() {
        return cardbal;
    }
    public void setCardbal(String cardbal) {
        this.cardbal = cardbal;
    }
    public String getOrdertype() {
        return ordertype;
    }
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }
    public String getTranstype() {
        return transtype;
    }
    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }
    public String getPayinst() {
        return payinst;
    }
    public void setPayinst(String payinst) {
        this.payinst = payinst;
    }
    public String getPaymchnt() {
        return paymchnt;
    }
    public void setPaymchnt(String paymchnt) {
        this.paymchnt = paymchnt;
    }
    public String getCardchnl() {
        return cardchnl;
    }
    public void setCardchnl(String cardchnl) {
        this.cardchnl = cardchnl;
    }
    public String getPaypantype() {
        return paypantype;
    }
    public void setPaypantype(String paypantype) {
        this.paypantype = paypantype;
    }
    public String getPrepayid() {
        return prepayid;
    }
    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }
    public String getOrdtype() {
        return ordtype;
    }
    public void setOrdtype(String ordtype) {
        this.ordtype = ordtype;
    }
    public String getOrdstate() {
        return ordstate;
    }
    public void setOrdstate(String ordstate) {
        this.ordstate = ordstate;
    }
    public String getOrddatetimestart() {
        return orddatetimestart;
    }
    public void setOrddatetimestart(String orddatetimestart) {
        this.orddatetimestart = orddatetimestart;
    }
    public String getOrddatetimeend() {
        return orddatetimeend;
    }
    public void setOrddatetimeend(String orddatetimeend) {
        this.orddatetimeend = orddatetimeend;
    }
    public String getPageseq() {
        return pageseq;
    }
    public void setPageseq(String pageseq) {
        this.pageseq = pageseq;
    }
    public String getPagerecnum() {
        return pagerecnum;
    }
    public void setPagerecnum(String pagerecnum) {
        this.pagerecnum = pagerecnum;
    }
    public Object getOrdlist() {
        return ordlist;
    }
    public void setOrdlist(Object ordlist) {
        this.ordlist = ordlist;
    }
    public String getAts() {
        return ats;
    }
    public void setAts(String ats) {
        this.ats = ats;
    }
    public String getPagetotal() {
        return pagetotal;
    }
    public void setPagetotal(String pagetotal) {
        this.pagetotal = pagetotal;
    }
    public String getRectotal() {
        return rectotal;
    }
    public void setRectotal(String rectotal) {
        this.rectotal = rectotal;
    }
    public String getPaystatus() {
        return paystatus;
    }
    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public String getChangeflag() {
        return changeflag;
    }
    public void setChangeflag(String changeflag) {
        this.changeflag = changeflag;
    }

    public String getOrgordid() {
        return orgordid;
    }
    public void setOrgordid(String orgordid) {
        this.orgordid = orgordid;
    }
    public String getOrgrefno() {
        return orgrefno;
    }
    public void setOrgrefno(String orgrefno) {
        this.orgrefno = orgrefno;
    }

    public String getNewpassword() {
        return newpassword;
    }
    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }
    public String getOrgtxndate() {
        return orgtxndate;
    }
    public void setOrgtxndate(String orgtxndate) {
        this.orgtxndate = orgtxndate;
    }
    public String getCardfee() {
        return cardfee;
    }
    public void setCardfee(String cardfee) {
        this.cardfee = cardfee;
    }
    public String getCertifId() {
        return certifId;
    }
    public void setCertifId(String certifId) {
        this.certifId = certifId;
    }
    public String getCardDeposit() {
        return cardDeposit;
    }
    public void setCardDeposit(String cardDeposit) {
        this.cardDeposit = cardDeposit;
    }
    public String getSrcCardNo() {
        return srcCardNo;
    }
    public void setSrcCardNo(String srcCardNo) {
        this.srcCardNo = srcCardNo;
    }
    public String getReqOrderId() {
        return reqOrderId;
    }
    public void setReqOrderId(String reqOrderId) {
        this.reqOrderId = reqOrderId;
    }
    public String getCompanyid() {
        return companyid;
    }
    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }
    public String getLockid() {
        return lockid;
    }
    public void setLockid(String lockid) {
        this.lockid = lockid;
    }
    public String getUsertype() {
        return usertype;
    }
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    public String getUserflag() {
        return userflag;
    }
    public void setUserflag(String userflag) {
        this.userflag = userflag;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    public String getIdno() {
        return idno;
    }
    public void setIdno(String idno) {
        this.idno = idno;
    }
    public String getValidate() {
        return validate;
    }
    public void setValidate(String validate) {
        this.validate = validate;
    }
    public String getPrivdata() {
        return privdata;
    }
    public void setPrivdata(String privdata) {
        this.privdata = privdata;
    }
    public String getPossysDate() {
        return possysDate;
    }
    public void setPossysDate(String possysDate) {
        this.possysDate = possysDate;
    }
    public String getPosver() {
        return posver;
    }
    public void setPosver(String posver) {
        this.posver = posver;
    }
    public String getWlver() {
        return wlver;
    }
    public void setWlver(String wlver) {
        this.wlver = wlver;
    }
    public String getBlver() {
        return blver;
    }
    public void setBlver(String blver) {
        this.blver = blver;
    }
    public String getPjver() {
        return pjver;
    }
    public void setPjver(String pjver) {
        this.pjver = pjver;
    }
    public String getTxnnum() {
        return txnnum;
    }
    public void setTxnnum(String txnnum) {
        this.txnnum = txnnum;
    }
    public String getPosltd() {
        return posltd;
    }
    public void setPosltd(String posltd) {
        this.posltd = posltd;
    }
    public String getPosrtd() {
        return posrtd;
    }
    public void setPosrtd(String posrtd) {
        this.posrtd = posrtd;
    }
    public String getDownflag() {
        return downflag;
    }
    public void setDownflag(String downflag) {
        this.downflag = downflag;
    }
    public String getCardorg() {
        return cardorg;
    }
    public void setCardorg(String cardorg) {
        this.cardorg = cardorg;
    }
    public String getUpstation() {
        return upstation;
    }
    public void setUpstation(String upstation) {
        this.upstation = upstation;
    }
    public String getUptime() {
        return uptime;
    }
    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
    public String getDownstation() {
        return downstation;
    }
    public void setDownstation(String downstation) {
        this.downstation = downstation;
    }
    public String getDowntime() {
        return downtime;
    }
    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }
    public String getPsamid() {
        return psamid;
    }
    public void setPsamid(String psamid) {
        this.psamid = psamid;
    }
    public String getReqdate() {
        return reqdate;
    }
    public void setReqdate(String reqdate) {
        this.reqdate = reqdate;
    }
    public String getReqtime() {
        return reqtime;
    }
    public void setReqtime(String reqtime) {
        this.reqtime = reqtime;
    }
    public String getReqsettdate() {
        return reqsettdate;
    }
    public void setReqsettdate(String reqsettdate) {
        this.reqsettdate = reqsettdate;
    }
    public String getLastSuccTime() {
        return lastSuccTime;
    }
    public void setLastSuccTime(String lastSuccTime) {
        this.lastSuccTime = lastSuccTime;
    }
    public String getAuthcode() {
        return authcode;
    }
    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }
    public String getFiletype() {
        return filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public String getChargeresult() {
        return chargeresult;
    }
    public void setChargeresult(String chargeresult) {
        this.chargeresult = chargeresult;
    }
    public String getTxmamt() {
        return txmamt;
    }
    public void setTxmamt(String txmamt) {
        this.txmamt = txmamt;
    }
    
    public String getApdunum() {
        return apdunum;
    }
    public void setApdunum(String apdunum) {
        this.apdunum = apdunum;
    }
    public String getApdulist() {
        return apdulist;
    }
    public void setApdulist(String apdulist) {
        this.apdulist = apdulist;
    }
    public String getOrgsyssesq() {
        return orgsyssesq;
    }
    public void setOrgsyssesq(String orgsyssesq) {
        this.orgsyssesq = orgsyssesq;
    }
    public String getMchnt_balance() {
        return mchnt_balance;
    }
    public void setMchnt_balance(String mchnt_balance) {
        this.mchnt_balance = mchnt_balance;
    }
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getBeg_no() {
		return beg_no;
	}
	public void setBeg_no(String beg_no) {
		this.beg_no = beg_no;
	}
	public String getEnd_no() {
		return end_no;
	}
	public void setEnd_no(String end_no) {
		this.end_no = end_no;
	}
	public String getCardresult() {
		return cardresult;
	}
	public void setCardresult(String cardresult) {
		this.cardresult = cardresult;
	}
	
	public String getMchntpubkey() {
		return mchntpubkey;
	}
	public void setMchntpubkey(String mchntpubkey) {
		this.mchntpubkey = mchntpubkey;
	}
	public String getMchntpubindex() {
		return mchntpubindex;
	}
	public void setMchntpubindex(String mchntpubindex) {
		this.mchntpubindex = mchntpubindex;
	}
	public String getMchntkeyver() {
		return mchntkeyver;
	}
	public void setMchntkeyver(String mchntkeyver) {
		this.mchntkeyver = mchntkeyver;
	}
	public String getAttch() {
		return attch;
	}
	public void setAttch(String attch) {
		this.attch = attch;
	}
	public String getIsrealname() {
		return isrealname;
	}
	public void setIsrealname(String isrealname) {
		this.isrealname = isrealname;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	
	public String getCustInfo() {
		return custInfo;
	}
	public void setCustInfo(String custInfo) {
		this.custInfo = custInfo;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultdesc() {
		return resultdesc;
	}
	public void setResultdesc(String resultdesc) {
		this.resultdesc = resultdesc;
	}
	public String getCustno() {
		return custno;
	}
	public void setCustno(String custno) {
		this.custno = custno;
	}
	public String getCusstype() {
		return cusstype;
	}
	public void setCusstype(String cusstype) {
		this.cusstype = cusstype;
	}
	public String getInnerCardNo() {
		return innerCardNo;
	}
	public void setInnerCardNo(String innerCardNo) {
		this.innerCardNo = innerCardNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(String accbalance) {
		this.accbalance = accbalance;
	}
	public String getCrdbalance() {
		return crdbalance;
	}
	public void setCrdbalance(String crdbalance) {
		this.crdbalance = crdbalance;
	}
	public String getIsRealname() {
		return isRealname;
	}
	public void setIsRealname(String isRealname) {
		this.isRealname = isRealname;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getHldpptype() {
		return hldpptype;
	}
	public void setHldpptype(String hldpptype) {
		this.hldpptype = hldpptype;
	}
	public String getHldname() {
		return hldname;
	}
	public void setHldname(String hldname) {
		this.hldname = hldname;
	}
	public String getHldppno() {
		return hldppno;
	}
	public void setHldppno(String hldppno) {
		this.hldppno = hldppno;
	}
	public String getHldtel() {
		return hldtel;
	}
	public void setHldtel(String hldtel) {
		this.hldtel = hldtel;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getTxnmchntcd() {
		return txnmchntcd;
	}
	public void setTxnmchntcd(String txnmchntcd) {
		this.txnmchntcd = txnmchntcd;
	}
	public String getTxnnetcd() {
		return txnnetcd;
	}
	public void setTxnnetcd(String txnnetcd) {
		this.txnnetcd = txnnetcd;
	}
	public String getTxntermcd() {
		return txntermcd;
	}
	public void setTxntermcd(String txntermcd) {
		this.txntermcd = txntermcd;
	}
	public String getTxndateStart() {
		return txndateStart;
	}
	public void setTxndateStart(String txndateStart) {
		this.txndateStart = txndateStart;
	}
	public String getTxndateEnd() {
		return txndateEnd;
	}
	public void setTxndateEnd(String txndateEnd) {
		this.txndateEnd = txndateEnd;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getExtinfo() {
		return extinfo;
	}
	public void setExtinfo(String extinfo) {
		this.extinfo = extinfo;
	}
	public String getRespcode() {
		return respcode;
	}
	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getInstseq() {
		return instseq;
	}
	public void setInstseq(String instseq) {
		this.instseq = instseq;
	}
	public String getNetid() {
		return netid;
	}
	public void setNetid(String netid) {
		this.netid = netid;
	}
	public String getOprid() {
		return oprid;
	}
	public void setOprid(String oprid) {
		this.oprid = oprid;
	}
	public String getTermseq() {
		return termseq;
	}
	public void setTermseq(String termseq) {
		this.termseq = termseq;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getCardinfo() {
		return cardinfo;
	}
	public void setCardinfo(String cardinfo) {
		this.cardinfo = cardinfo;
	}
	public String getMac2() {
		return mac2;
	}
	public void setMac2(String mac2) {
		this.mac2 = mac2;
	}
	public String getMac1() {
		return mac1;
	}
	public void setMac1(String mac1) {
		this.mac1 = mac1;
	}
	public String getRefundResult() {
		return refundResult;
	}
	public void setRefundResult(String refundResult) {
		this.refundResult = refundResult;
	}
	public String getCrdstate() {
		return crdstate;
	}
	public void setCrdstate(String crdstate) {
		this.crdstate = crdstate;
	}
	public String getCard_state() {
		return card_state;
	}
	public void setCard_state(String card_state) {
		this.card_state = card_state;
	}
	public String getModules() {
		return modules;
	}
	public void setModules(String modules) {
		this.modules = modules;
	}
	public String getSignkey() {
		return signkey;
	}
	public void setSignkey(String signkey) {
		this.signkey = signkey;
	}
	public String getQrcode() {
		return qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getCertfactortype() {
		return certfactortype;
	}
	public void setCertfactortype(String certfactortype) {
		this.certfactortype = certfactortype;
	}
	public String getExpenseSaleAmt() {
		return expenseSaleAmt;
	}
	public void setExpenseSaleAmt(String expenseSaleAmt) {
		this.expenseSaleAmt = expenseSaleAmt;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getIssInsCode() {
		return issInsCode;
	}
	public void setIssInsCode(String issInsCode) {
		this.issInsCode = issInsCode;
	}
	public String getSaleMode() {
		return saleMode;
	}
	public void setSaleMode(String saleMode) {
		this.saleMode = saleMode;
	}
	public String getOrgbatchno() {
		return orgbatchno;
	}
	public void setOrgbatchno(String orgbatchno) {
		this.orgbatchno = orgbatchno;
	}
	public String getOrgtermseq() {
		return orgtermseq;
	}
	public void setOrgtermseq(String orgtermseq) {
		this.orgtermseq = orgtermseq;
	}
	public String getOrgtransdate() {
		return orgtransdate;
	}
	public void setOrgtransdate(String orgtransdate) {
		this.orgtransdate = orgtransdate;
	}
	public String getOrgauthmode() {
		return orgauthmode;
	}
	public void setOrgauthmode(String orgauthmode) {
		this.orgauthmode = orgauthmode;
	}
	public String getOrgauthinstid() {
		return orgauthinstid;
	}
	public void setOrgauthinstid(String orgauthinstid) {
		this.orgauthinstid = orgauthinstid;
	}
	
	
	public Map<String, Object> getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(Map<String, Object> accountInfo) {
		this.accountInfo = accountInfo;
	}

	public List<Object> getAccInfo() {
		return accInfo;
	}
	public void setAccInfo(List<Object> accInfo) {
		this.accInfo = accInfo;
	}
	public List<Object> getAcclist() {
		return acclist;
	}
	public void setAcclist(List<Object> acclist) {
		this.acclist = acclist;
	}
	public List<Map<String, String>> getBalance() {
		return balance;
	}
	public void setBalance(List<Map<String, String>> balance) {
		this.balance = balance;
	}
	public String getConsureBalance() {
		return consureBalance;
	}
	public void setConsureBalance(String consureBalance) {
		this.consureBalance = consureBalance;
	}
	public String getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getChargeBalance() {
		return chargeBalance;
	}
	public void setChargeBalance(String chargeBalance) {
		this.chargeBalance = chargeBalance;
	}
	public List<TLogOnlinePayment> getTxnlist() {
		return txnlist;
	}
	public void setTxnlist(List<TLogOnlinePayment> txnlist) {
		this.txnlist = txnlist;
	}
//	public Integer getAccountbalance() {
//		return accountbalance;
//	}
//	public void setAccountbalance(Integer accountbalance) {
//		this.accountbalance = accountbalance;
//	}
	public String getSyspubkey() {
		return syspubkey;
	}
	public void setSyspubkey(String syspubkey) {
		this.syspubkey = syspubkey;
	}
	public String getSyspubidx() {
		return syspubidx;
	}
	public void setSyspubidx(String syspubidx) {
		this.syspubidx = syspubidx;
	}
	public String getSyspubver() {
		return syspubver;
	}
	public void setSyspubver(String syspubver) {
		this.syspubver = syspubver;
	}
	public String getCheckvalue() {
		return checkvalue;
	}
	public void setCheckvalue(String checkvalue) {
		this.checkvalue = checkvalue;
	}
	public String getTmk() {
		return tmk;
	}
	public void setTmk(String tmk) {
		this.tmk = tmk;
	}
	public String getPinkey() {
		return pinkey;
	}
	public void setPinkey(String pinkey) {
		this.pinkey = pinkey;
	}
	
}
