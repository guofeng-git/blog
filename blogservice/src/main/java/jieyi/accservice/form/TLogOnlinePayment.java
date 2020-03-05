package jieyi.accservice.form;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
/**
 * 联机交易日志实体类
 * @author lacet
 * 数据库表 T_LOG_ONLINE_PAYMENT
 */
@Alias("TLogOnlinePayment")
public class TLogOnlinePayment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer settdate;
	
	private String censeq;
	
    private Integer centdate;

    private Integer centtime;

    private String txncode;

    private String inntype;

    private String productNo;

    private String transCate;

    private String bussCate;

    private String chnlTransUkey;

    private String chnlTransRkey;

    private String refTransKey;

    private String txndesc;

    private String txnChannel;

    private String authKey;

    private String acqinst;

    private String issueinst;

    private String trnsinst;

    private String trnsinstseq;

    private String transdt;

    private String trnsdate;

    private String trnstime;

    private String refKey;

    private String txndate;

    private String txntime;

    private String txnmchntcd;

    private String txnmchntname;

    private String txnnetcd;

    private String txnnetname;

    private String txnoprid;

    private String termid;

    private String termbatchno;

    private String termseq;

    private String settmchntcd;

    private String settmchntname;

    private String settmcc;

    private Long reqamt;

    private Long beforeAmt;

    private Long txnamt;

    private Long afterAmt;

    private String feeInFlag;

    private Long feeAmt;

    private String pFeeNo;

    private String pFeeType;

    private String pFeeName;

    private Long pFeeAmt;

    private String accountNo;

    private String acctype;

    private String customerNo;

    private String cardno;

    private String olflag;

    private String cardBin;

    private String cardType;

    private String cardMediaId;

    private String revsalFlag;

    private String revsalTxnSeqNo;

    private String cancelFlag;

    private String cancelTxnSeqNo;

    private String mainCardNo;

    private String orgCenseq;

    private String orgTrnsinstseq;

    private String orgTransdt;

    private String orgTrnsdate;

    private String orgTxndate;

    private Integer orgSettdate;

    private String orgTermbatchno;

    private String orgTermseq;

    private String orgTermid;

    private String orgRefKey;

    private String returnFlag;

    private Long returnCount;

    private Long returnAmt;

    private String inAccountNo;

    private String inCardNo;

    private String inType;

    private Integer errcode;

    private String errorDesc;

    private String name;

    private String mobilePhone;

    private String idType;

    private String idNo;

    private String crdStatus;

    private String fundStatus;

    private String servicecode;

    private String mchntidOut;

    private String termidOut;

    private Long rsvamt1;

    private Long rsvamt2;

    private Long rsvamt3;

    private String authoprid;

    private Short testflag;

    private String inputtime;

    private String modfytime;

    private String orderNo;

    private String payType;

    private String branchno;

    private String beforeValidDate;
    
    private String afterValidDate;
    
    private String payDate;
    
    private String chgcrdtype;
    
    private String ifreturn;
    public Integer getCentdate() {
        return centdate;
    }

    public void setCentdate(Integer centdate) {
        this.centdate = centdate;
    }

    public Integer getCenttime() {
        return centtime;
    }

    public void setCenttime(Integer centtime) {
        this.centtime = centtime;
    }

    public String getTxncode() {
        return txncode;
    }

    public void setTxncode(String txncode) {
        this.txncode = txncode == null ? null : txncode.trim();
    }

    public String getInntype() {
        return inntype;
    }

    public void setInntype(String inntype) {
        this.inntype = inntype == null ? null : inntype.trim();
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getTransCate() {
        return transCate;
    }

    public void setTransCate(String transCate) {
        this.transCate = transCate == null ? null : transCate.trim();
    }

    public String getBussCate() {
        return bussCate;
    }

    public void setBussCate(String bussCate) {
        this.bussCate = bussCate == null ? null : bussCate.trim();
    }

    public String getChnlTransUkey() {
        return chnlTransUkey;
    }

    public void setChnlTransUkey(String chnlTransUkey) {
        this.chnlTransUkey = chnlTransUkey == null ? null : chnlTransUkey.trim();
    }

    public String getChnlTransRkey() {
        return chnlTransRkey;
    }

    public void setChnlTransRkey(String chnlTransRkey) {
        this.chnlTransRkey = chnlTransRkey == null ? null : chnlTransRkey.trim();
    }

    public String getRefTransKey() {
        return refTransKey;
    }

    public void setRefTransKey(String refTransKey) {
        this.refTransKey = refTransKey == null ? null : refTransKey.trim();
    }

    public String getTxndesc() {
        return txndesc;
    }

    public void setTxndesc(String txndesc) {
        this.txndesc = txndesc == null ? null : txndesc.trim();
    }

    public String getTxnChannel() {
        return txnChannel;
    }

    public void setTxnChannel(String txnChannel) {
        this.txnChannel = txnChannel == null ? null : txnChannel.trim();
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey == null ? null : authKey.trim();
    }

    public String getAcqinst() {
        return acqinst;
    }

    public void setAcqinst(String acqinst) {
        this.acqinst = acqinst == null ? null : acqinst.trim();
    }

    public String getIssueinst() {
        return issueinst;
    }

    public void setIssueinst(String issueinst) {
        this.issueinst = issueinst == null ? null : issueinst.trim();
    }

    public String getTrnsinst() {
        return trnsinst;
    }

    public void setTrnsinst(String trnsinst) {
        this.trnsinst = trnsinst == null ? null : trnsinst.trim();
    }

    public String getTrnsinstseq() {
        return trnsinstseq;
    }

    public void setTrnsinstseq(String trnsinstseq) {
        this.trnsinstseq = trnsinstseq == null ? null : trnsinstseq.trim();
    }

    public String getTransdt() {
        return transdt;
    }

    public void setTransdt(String transdt) {
        this.transdt = transdt == null ? null : transdt.trim();
    }

    public String getTrnsdate() {
        return trnsdate;
    }

    public void setTrnsdate(String trnsdate) {
        this.trnsdate = trnsdate == null ? null : trnsdate.trim();
    }

    public String getTrnstime() {
        return trnstime;
    }

    public void setTrnstime(String trnstime) {
        this.trnstime = trnstime == null ? null : trnstime.trim();
    }

    public String getRefKey() {
        return refKey;
    }

    public void setRefKey(String refKey) {
        this.refKey = refKey == null ? null : refKey.trim();
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

    public String getTxnmchntcd() {
        return txnmchntcd;
    }

    public void setTxnmchntcd(String txnmchntcd) {
        this.txnmchntcd = txnmchntcd == null ? null : txnmchntcd.trim();
    }

    public String getTxnmchntname() {
        return txnmchntname;
    }

    public void setTxnmchntname(String txnmchntname) {
        this.txnmchntname = txnmchntname == null ? null : txnmchntname.trim();
    }

    public String getTxnnetcd() {
        return txnnetcd;
    }

    public void setTxnnetcd(String txnnetcd) {
        this.txnnetcd = txnnetcd == null ? null : txnnetcd.trim();
    }

    public String getTxnnetname() {
        return txnnetname;
    }

    public void setTxnnetname(String txnnetname) {
        this.txnnetname = txnnetname == null ? null : txnnetname.trim();
    }

    public String getTxnoprid() {
        return txnoprid;
    }

    public void setTxnoprid(String txnoprid) {
        this.txnoprid = txnoprid == null ? null : txnoprid.trim();
    }

    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid == null ? null : termid.trim();
    }

    public String getTermbatchno() {
        return termbatchno;
    }

    public void setTermbatchno(String termbatchno) {
        this.termbatchno = termbatchno == null ? null : termbatchno.trim();
    }

    public String getTermseq() {
        return termseq;
    }

    public void setTermseq(String termseq) {
        this.termseq = termseq == null ? null : termseq.trim();
    }

    public String getSettmchntcd() {
        return settmchntcd;
    }

    public void setSettmchntcd(String settmchntcd) {
        this.settmchntcd = settmchntcd == null ? null : settmchntcd.trim();
    }

    public String getSettmchntname() {
        return settmchntname;
    }

    public void setSettmchntname(String settmchntname) {
        this.settmchntname = settmchntname == null ? null : settmchntname.trim();
    }

    public String getSettmcc() {
        return settmcc;
    }

    public void setSettmcc(String settmcc) {
        this.settmcc = settmcc == null ? null : settmcc.trim();
    }

    public Long getReqamt() {
        return reqamt;
    }

    public void setReqamt(Long reqamt) {
        this.reqamt = reqamt;
    }

    public Long getBeforeAmt() {
        return beforeAmt;
    }

    public void setBeforeAmt(Long beforeAmt) {
        this.beforeAmt = beforeAmt;
    }

    public Long getTxnamt() {
        return txnamt;
    }

    public void setTxnamt(Long txnamt) {
        this.txnamt = txnamt;
    }

    public Long getAfterAmt() {
        return afterAmt;
    }

    public void setAfterAmt(Long afterAmt) {
        this.afterAmt = afterAmt;
    }

    public String getFeeInFlag() {
        return feeInFlag;
    }

    public void setFeeInFlag(String feeInFlag) {
        this.feeInFlag = feeInFlag == null ? null : feeInFlag.trim();
    }

    public Long getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Long feeAmt) {
        this.feeAmt = feeAmt;
    }

    public String getpFeeNo() {
        return pFeeNo;
    }

    public void setpFeeNo(String pFeeNo) {
        this.pFeeNo = pFeeNo == null ? null : pFeeNo.trim();
    }

    public String getpFeeType() {
        return pFeeType;
    }

    public void setpFeeType(String pFeeType) {
        this.pFeeType = pFeeType == null ? null : pFeeType.trim();
    }

    public String getpFeeName() {
        return pFeeName;
    }

    public void setpFeeName(String pFeeName) {
        this.pFeeName = pFeeName == null ? null : pFeeName.trim();
    }

    public Long getpFeeAmt() {
        return pFeeAmt;
    }

    public void setpFeeAmt(Long pFeeAmt) {
        this.pFeeAmt = pFeeAmt;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype == null ? null : acctype.trim();
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getOlflag() {
        return olflag;
    }

    public void setOlflag(String olflag) {
        this.olflag = olflag == null ? null : olflag.trim();
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin == null ? null : cardBin.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardMediaId() {
        return cardMediaId;
    }

    public void setCardMediaId(String cardMediaId) {
        this.cardMediaId = cardMediaId == null ? null : cardMediaId.trim();
    }

    public String getRevsalFlag() {
        return revsalFlag;
    }

    public void setRevsalFlag(String revsalFlag) {
        this.revsalFlag = revsalFlag == null ? null : revsalFlag.trim();
    }

    public String getRevsalTxnSeqNo() {
        return revsalTxnSeqNo;
    }

    public void setRevsalTxnSeqNo(String revsalTxnSeqNo) {
        this.revsalTxnSeqNo = revsalTxnSeqNo == null ? null : revsalTxnSeqNo.trim();
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag == null ? null : cancelFlag.trim();
    }

    public String getCancelTxnSeqNo() {
        return cancelTxnSeqNo;
    }

    public void setCancelTxnSeqNo(String cancelTxnSeqNo) {
        this.cancelTxnSeqNo = cancelTxnSeqNo == null ? null : cancelTxnSeqNo.trim();
    }

    public String getMainCardNo() {
        return mainCardNo;
    }

    public void setMainCardNo(String mainCardNo) {
        this.mainCardNo = mainCardNo == null ? null : mainCardNo.trim();
    }

    public String getOrgCenseq() {
        return orgCenseq;
    }

    public void setOrgCenseq(String orgCenseq) {
        this.orgCenseq = orgCenseq == null ? null : orgCenseq.trim();
    }

    public String getOrgTrnsinstseq() {
        return orgTrnsinstseq;
    }

    public void setOrgTrnsinstseq(String orgTrnsinstseq) {
        this.orgTrnsinstseq = orgTrnsinstseq == null ? null : orgTrnsinstseq.trim();
    }

    public String getOrgTransdt() {
        return orgTransdt;
    }

    public void setOrgTransdt(String orgTransdt) {
        this.orgTransdt = orgTransdt == null ? null : orgTransdt.trim();
    }

    public String getOrgTrnsdate() {
        return orgTrnsdate;
    }

    public void setOrgTrnsdate(String orgTrnsdate) {
        this.orgTrnsdate = orgTrnsdate == null ? null : orgTrnsdate.trim();
    }

    public String getOrgTxndate() {
        return orgTxndate;
    }

    public void setOrgTxndate(String orgTxndate) {
        this.orgTxndate = orgTxndate == null ? null : orgTxndate.trim();
    }

    public Integer getOrgSettdate() {
        return orgSettdate;
    }

    public void setOrgSettdate(Integer orgSettdate) {
        this.orgSettdate = orgSettdate;
    }

    public String getOrgTermbatchno() {
        return orgTermbatchno;
    }

    public void setOrgTermbatchno(String orgTermbatchno) {
        this.orgTermbatchno = orgTermbatchno == null ? null : orgTermbatchno.trim();
    }

    public String getOrgTermseq() {
        return orgTermseq;
    }

    public void setOrgTermseq(String orgTermseq) {
        this.orgTermseq = orgTermseq == null ? null : orgTermseq.trim();
    }

    public String getOrgTermid() {
        return orgTermid;
    }

    public void setOrgTermid(String orgTermid) {
        this.orgTermid = orgTermid == null ? null : orgTermid.trim();
    }

    public String getOrgRefKey() {
        return orgRefKey;
    }

    public void setOrgRefKey(String orgRefKey) {
        this.orgRefKey = orgRefKey == null ? null : orgRefKey.trim();
    }

    public String getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(String returnFlag) {
        this.returnFlag = returnFlag == null ? null : returnFlag.trim();
    }

    public Long getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(Long returnCount) {
        this.returnCount = returnCount;
    }

    public Long getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(Long returnAmt) {
        this.returnAmt = returnAmt;
    }

    public String getInAccountNo() {
        return inAccountNo;
    }

    public void setInAccountNo(String inAccountNo) {
        this.inAccountNo = inAccountNo == null ? null : inAccountNo.trim();
    }

    public String getInCardNo() {
        return inCardNo;
    }

    public void setInCardNo(String inCardNo) {
        this.inCardNo = inCardNo == null ? null : inCardNo.trim();
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType == null ? null : inType.trim();
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc == null ? null : errorDesc.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getCrdStatus() {
        return crdStatus;
    }

    public void setCrdStatus(String crdStatus) {
        this.crdStatus = crdStatus == null ? null : crdStatus.trim();
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus == null ? null : fundStatus.trim();
    }

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode == null ? null : servicecode.trim();
    }

    public String getMchntidOut() {
        return mchntidOut;
    }

    public void setMchntidOut(String mchntidOut) {
        this.mchntidOut = mchntidOut == null ? null : mchntidOut.trim();
    }

    public String getTermidOut() {
        return termidOut;
    }

    public void setTermidOut(String termidOut) {
        this.termidOut = termidOut == null ? null : termidOut.trim();
    }

    public Long getRsvamt1() {
        return rsvamt1;
    }

    public void setRsvamt1(Long rsvamt1) {
        this.rsvamt1 = rsvamt1;
    }

    public Long getRsvamt2() {
        return rsvamt2;
    }

    public void setRsvamt2(Long rsvamt2) {
        this.rsvamt2 = rsvamt2;
    }

    public Long getRsvamt3() {
        return rsvamt3;
    }

    public void setRsvamt3(Long rsvamt3) {
        this.rsvamt3 = rsvamt3;
    }

    public String getAuthoprid() {
        return authoprid;
    }

    public void setAuthoprid(String authoprid) {
        this.authoprid = authoprid == null ? null : authoprid.trim();
    }

    public Short getTestflag() {
        return testflag;
    }

    public void setTestflag(Short testflag) {
        this.testflag = testflag;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime == null ? null : inputtime.trim();
    }

    public String getModfytime() {
        return modfytime;
    }

    public void setModfytime(String modfytime) {
        this.modfytime = modfytime == null ? null : modfytime.trim();
    }

    public String getBranchno() {
        return branchno;
    }

    public void setBranchno(String branchno) {
        this.branchno = branchno == null ? null : branchno.trim();
    }

	public Integer getSettdate() {
		return settdate;
	}

	public void setSettdate(Integer settdate) {
		this.settdate = settdate;
	}

	public String getCenseq() {
		return censeq;
	}

	public void setCenseq(String censeq) {
		this.censeq = censeq;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getBeforeValidDate() {
		return beforeValidDate;
	}

	public void setBeforeValidDate(String beforeValidDate) {
		this.beforeValidDate = beforeValidDate;
	}

	public String getAfterValidDate() {
		return afterValidDate;
	}

	public void setAfterValidDate(String afterValidDate) {
		this.afterValidDate = afterValidDate;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getChgcrdtype() {
		return chgcrdtype;
	}

	public void setChgcrdtype(String chgcrdtype) {
		this.chgcrdtype = chgcrdtype;
	}

	public String getIfreturn() {
		return ifreturn;
	}

	public void setIfreturn(String ifreturn) {
		this.ifreturn = ifreturn;
	}
	
}