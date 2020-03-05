package jieyi.accservice.form;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
/**
 * 综合前置接入交易流水表
 * @author lacet
 *对应数据库表为 T_PREPOSITION_LOG
 */
@Alias("TPrepositionLog")
public class TPrepositionLog implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String txncode;

    private String syssesq;

    private String reqseq;
    
    private String cardno;

    private String instid;

    private String mchntid;

    private String termid;

    private String password;

    private String txndate;

    private String txntime;

    private String reqsettdate;

    private String carddate;

    private String cardtime;

    private String orgtxndate;

    private String city;

    private Integer cardfee;

    private String random;

    private String txnseq;

    private Integer befbal;

    private Integer txnamt;

    private String txntermid;

    private String mac2;

    private String attach;

    private String certifid;

    private Integer carddeposit;

    private String reqorderid;

    private Integer balance;

    private String refno;

    private String orgsyssesq;

    private String oprresult;

    private Integer afteramt;

    private String tac;

    private String lstapdunum;

    private String lstapdulist;

    private String ordid;

    private String orgordid;

    private String payordid;

    private String voucherno;

    private String apdunum;

    private String apdulist;

    private Integer befamt;

    private String settdate;

    private String ifpin;

    private Integer pinchkamt;

    private Integer remindamt;

    private String ifrealname;

    private String holdname;

    private String holdtype;

    private String holdno;

    private String phone;

    private String changeflag;

    private String newpassword;

    private String possysDate;

    private Integer cardbal;

    private Integer txnAmt;

    private String reqdate;

    private String reqtime;

    private String upstation;

    private String uptime;

    private String downstation;

    private String cardfaceno;

    private String payStatus;

    private String customerNo;

    private String privdata;

    private String lastSuccTime;

    private String posver;

    private String wlver;

    private String blver;

    private String cardver;

    private String pjver;

    private Long txnnum;

    private String posrtd;

    private String posltd;
    
    private String responsecode;

    private String responsedesc;

    private String createTime;

    private String updateTime;

    private String rsvd1;

    private String rsvd2;

    private String rsvd3;

    private String rsvd4;

    private String downtime;

    private String psamId;

    public String getTxncode() {
        return txncode;
    }

    public void setTxncode(String txncode) {
        this.txncode = txncode == null ? null : txncode.trim();
    }

    public String getSyssesq() {
        return syssesq;
    }

    public void setSyssesq(String syssesq) {
        this.syssesq = syssesq == null ? null : syssesq.trim();
    }

    public String getReqseq() {
        return reqseq;
    }

    public void setReqseq(String reqseq) {
        this.reqseq = reqseq == null ? null : reqseq.trim();
    }
    
    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getInstid() {
        return instid;
    }

    public void setInstid(String instid) {
        this.instid = instid == null ? null : instid.trim();
    }

    public String getMchntid() {
        return mchntid;
    }

    public void setMchntid(String mchntid) {
        this.mchntid = mchntid == null ? null : mchntid.trim();
    }

    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid == null ? null : termid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTxndate() {
        return txndate;
    }

    public void setTxndate(String txndate) {
        this.txndate = txndate == null ? null : txndate.trim();
    }

    public String getTxntime() {
        return txntime;
    }

    public void setTxntime(String txntime) {
        this.txntime = txntime == null ? null : txntime.trim();
    }

    public String getReqsettdate() {
        return reqsettdate;
    }

    public void setReqsettdate(String reqsettdate) {
        this.reqsettdate = reqsettdate == null ? null : reqsettdate.trim();
    }

    public String getCarddate() {
        return carddate;
    }

    public void setCarddate(String carddate) {
        this.carddate = carddate == null ? null : carddate.trim();
    }

    public String getCardtime() {
        return cardtime;
    }

    public void setCardtime(String cardtime) {
        this.cardtime = cardtime == null ? null : cardtime.trim();
    }

    public String getOrgtxndate() {
        return orgtxndate;
    }

    public void setOrgtxndate(String orgtxndate) {
        this.orgtxndate = orgtxndate == null ? null : orgtxndate.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getCardfee() {
        return cardfee;
    }

    public void setCardfee(Integer cardfee) {
        this.cardfee = cardfee;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random == null ? null : random.trim();
    }

    public String getTxnseq() {
        return txnseq;
    }

    public void setTxnseq(String txnseq) {
        this.txnseq = txnseq == null ? null : txnseq.trim();
    }

    public Integer getBefbal() {
        return befbal;
    }

    public void setBefbal(Integer befbal) {
        this.befbal = befbal;
    }

    public Integer getTxnamt() {
        return txnamt;
    }

    public void setTxnamt(Integer txnamt) {
        this.txnamt = txnamt;
    }

    public String getTxntermid() {
        return txntermid;
    }

    public void setTxntermid(String txntermid) {
        this.txntermid = txntermid == null ? null : txntermid.trim();
    }

    public String getMac2() {
        return mac2;
    }

    public void setMac2(String mac2) {
        this.mac2 = mac2 == null ? null : mac2.trim();
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    public String getCertifid() {
        return certifid;
    }

    public void setCertifid(String certifid) {
        this.certifid = certifid == null ? null : certifid.trim();
    }

    public Integer getCarddeposit() {
        return carddeposit;
    }

    public void setCarddeposit(Integer carddeposit) {
        this.carddeposit = carddeposit;
    }

    public String getReqorderid() {
        return reqorderid;
    }

    public void setReqorderid(String reqorderid) {
        this.reqorderid = reqorderid == null ? null : reqorderid.trim();
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno == null ? null : refno.trim();
    }

    public String getOrgsyssesq() {
        return orgsyssesq;
    }

    public void setOrgsyssesq(String orgsyssesq) {
        this.orgsyssesq = orgsyssesq == null ? null : orgsyssesq.trim();
    }

    public String getOprresult() {
        return oprresult;
    }

    public void setOprresult(String oprresult) {
        this.oprresult = oprresult == null ? null : oprresult.trim();
    }

    public Integer getAfteramt() {
        return afteramt;
    }

    public void setAfteramt(Integer afteramt) {
        this.afteramt = afteramt;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac == null ? null : tac.trim();
    }

    public String getLstapdunum() {
        return lstapdunum;
    }

    public void setLstapdunum(String lstapdunum) {
        this.lstapdunum = lstapdunum == null ? null : lstapdunum.trim();
    }

    public String getLstapdulist() {
        return lstapdulist;
    }

    public void setLstapdulist(String lstapdulist) {
        this.lstapdulist = lstapdulist == null ? null : lstapdulist.trim();
    }

    public String getOrdid() {
        return ordid;
    }

    public void setOrdid(String ordid) {
        this.ordid = ordid == null ? null : ordid.trim();
    }

    public String getOrgordid() {
        return orgordid;
    }

    public void setOrgordid(String orgordid) {
        this.orgordid = orgordid == null ? null : orgordid.trim();
    }

    public String getPayordid() {
        return payordid;
    }

    public void setPayordid(String payordid) {
        this.payordid = payordid == null ? null : payordid.trim();
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno == null ? null : voucherno.trim();
    }

    public String getApdunum() {
        return apdunum;
    }

    public void setApdunum(String apdunum) {
        this.apdunum = apdunum == null ? null : apdunum.trim();
    }

    public String getApdulist() {
        return apdulist;
    }

    public void setApdulist(String apdulist) {
        this.apdulist = apdulist == null ? null : apdulist.trim();
    }

    public Integer getBefamt() {
        return befamt;
    }

    public void setBefamt(Integer befamt) {
        this.befamt = befamt;
    }

    public String getSettdate() {
        return settdate;
    }

    public void setSettdate(String settdate) {
        this.settdate = settdate == null ? null : settdate.trim();
    }

    public String getIfpin() {
        return ifpin;
    }

    public void setIfpin(String ifpin) {
        this.ifpin = ifpin == null ? null : ifpin.trim();
    }

    public Integer getPinchkamt() {
        return pinchkamt;
    }

    public void setPinchkamt(Integer pinchkamt) {
        this.pinchkamt = pinchkamt;
    }

    public Integer getRemindamt() {
        return remindamt;
    }

    public void setRemindamt(Integer remindamt) {
        this.remindamt = remindamt;
    }

    public String getIfrealname() {
        return ifrealname;
    }

    public void setIfrealname(String ifrealname) {
        this.ifrealname = ifrealname == null ? null : ifrealname.trim();
    }

    public String getHoldname() {
        return holdname;
    }

    public void setHoldname(String holdname) {
        this.holdname = holdname == null ? null : holdname.trim();
    }

    public String getHoldtype() {
        return holdtype;
    }

    public void setHoldtype(String holdtype) {
        this.holdtype = holdtype == null ? null : holdtype.trim();
    }

    public String getHoldno() {
        return holdno;
    }

    public void setHoldno(String holdno) {
        this.holdno = holdno == null ? null : holdno.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getChangeflag() {
        return changeflag;
    }

    public void setChangeflag(String changeflag) {
        this.changeflag = changeflag == null ? null : changeflag.trim();
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword == null ? null : newpassword.trim();
    }

    public String getPossysDate() {
        return possysDate;
    }

    public void setPossysDate(String possysDate) {
        this.possysDate = possysDate == null ? null : possysDate.trim();
    }

    public Integer getCardbal() {
        return cardbal;
    }

    public void setCardbal(Integer cardbal) {
        this.cardbal = cardbal;
    }

    public Integer getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(Integer txnAmt) {
        this.txnAmt = txnAmt;
    }

    public String getReqdate() {
        return reqdate;
    }

    public void setReqdate(String reqdate) {
        this.reqdate = reqdate == null ? null : reqdate.trim();
    }

    public String getReqtime() {
        return reqtime;
    }

    public void setReqtime(String reqtime) {
        this.reqtime = reqtime == null ? null : reqtime.trim();
    }

    public String getUpstation() {
        return upstation;
    }

    public void setUpstation(String upstation) {
        this.upstation = upstation == null ? null : upstation.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getDownstation() {
        return downstation;
    }

    public void setDownstation(String downstation) {
        this.downstation = downstation == null ? null : downstation.trim();
    }

    public String getCardfaceno() {
        return cardfaceno;
    }

    public void setCardfaceno(String cardfaceno) {
        this.cardfaceno = cardfaceno == null ? null : cardfaceno.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getPrivdata() {
        return privdata;
    }

    public void setPrivdata(String privdata) {
        this.privdata = privdata == null ? null : privdata.trim();
    }

    public String getLastSuccTime() {
        return lastSuccTime;
    }

    public void setLastSuccTime(String lastSuccTime) {
        this.lastSuccTime = lastSuccTime == null ? null : lastSuccTime.trim();
    }

    public String getPosver() {
        return posver;
    }

    public void setPosver(String posver) {
        this.posver = posver == null ? null : posver.trim();
    }

    public String getWlver() {
        return wlver;
    }

    public void setWlver(String wlver) {
        this.wlver = wlver == null ? null : wlver.trim();
    }

    public String getBlver() {
        return blver;
    }

    public void setBlver(String blver) {
        this.blver = blver == null ? null : blver.trim();
    }

    public String getCardver() {
        return cardver;
    }

    public void setCardver(String cardver) {
        this.cardver = cardver == null ? null : cardver.trim();
    }

    public String getPjver() {
        return pjver;
    }

    public void setPjver(String pjver) {
        this.pjver = pjver == null ? null : pjver.trim();
    }

    public Long getTxnnum() {
        return txnnum;
    }

    public void setTxnnum(Long txnnum) {
        this.txnnum = txnnum;
    }

    public String getPosrtd() {
        return posrtd;
    }

    public void setPosrtd(String posrtd) {
        this.posrtd = posrtd == null ? null : posrtd.trim();
    }

    public String getPosltd() {
        return posltd;
    }

    public void setPosltd(String posltd) {
        this.posltd = posltd == null ? null : posltd.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getRsvd1() {
        return rsvd1;
    }

    public void setRsvd1(String rsvd1) {
        this.rsvd1 = rsvd1 == null ? null : rsvd1.trim();
    }

    public String getRsvd2() {
        return rsvd2;
    }

    public void setRsvd2(String rsvd2) {
        this.rsvd2 = rsvd2 == null ? null : rsvd2.trim();
    }

    public String getRsvd3() {
        return rsvd3;
    }

    public void setRsvd3(String rsvd3) {
        this.rsvd3 = rsvd3 == null ? null : rsvd3.trim();
    }

    public String getRsvd4() {
        return rsvd4;
    }

    public void setRsvd4(String rsvd4) {
        this.rsvd4 = rsvd4 == null ? null : rsvd4.trim();
    }

    public String getDowntime() {
        return downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime == null ? null : downtime.trim();
    }

    public String getPsamId() {
        return psamId;
    }

    public void setPsamId(String psamId) {
        this.psamId = psamId == null ? null : psamId.trim();
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
}