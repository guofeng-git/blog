package jieyi.accservice.form;

import org.apache.ibatis.type.Alias;

@Alias("TInfoAccount")
public class TInfoAccount {
    private String accountNo; //账户号

    private String accountName; //账户名称

    private String isRealname; //是否记名

    private String customerNo; //持卡人信息编号

    private String openDate; //开户日期

    private String closeDate; //销户日期

    private String validDate; //账户有效期

    private String currCode; //货币代码

    private String status; //账户状态 1正常 3冻结 6销售退单 9 销户

    private String acctype; //账户类别

    private String openChannel; //开户渠道

    private String storeNo; //开户门店号

    private String netabbr; //开户门店名称

    private String mchntNo; //开户商户号

    private String mchntAbbr; //开户商户名称

    private String acqInstCode; //受理结构号

    private String ifOnetimeUse; //是否开通网上支付

    private Integer manageAmt; //管理金额

    private Long balance; //账户余额

    private Long availableBalance; //账户可用余额

    private Long withdrawBalance; //计提金额

    private Long frozenAmount; //冻结金额

    private Long preauthorizedAmount; //预授权金额

    private Long lastDayBal; //上日余额

    private Long lastMonthBal; //上月余额

    private Long daySumConsAmt; //日累计消费金额

    private Long daySumConsCnt; //日累计消费次数

    private Long daySumOutAmt; //日累计转出金额

    private Long daySumOutCnt; //日累计转出次数

    private Long daySumInAmt; //日累计转入金额

    private Long daySumInCnt; //日累计转入次数

    private Long daySumCashAmt; //日累计提现金额

    private Long daySumCashCnt; //日累计提现次数

    private Long daySumChgAmt; //日累计充值金额

    private Long daySumChgCnt; //日累计充值次数

    private Long monSumConsAmt; //月累计消费金额

    private Long monSumConsCnt; //月累计消费次数

    private Long monSumOutAmt; //月累计转出金额

    private Long monSumOutCnt; //月累计转出次数

    private Long monSumInAmt; //月累计转入金额

    private Long monSumInCnt; //月累计转入次数

    private Long monSumCashAmt; //月累计提现金额

    private Long monSumCashCnt; //月累计提现次数

    private Long monSumChgAmt; //月累计充值金额

    private Long monSumChgCnt; //月累计充值次数

    private String issInsCode; //发卡机构代码

    private String encryptedMsg; //账户余额密文

    private Long sumConsAmt; //账户累计消费金额

    private Long sumConsCnt; //账户累计消费次数

    private Long sumChgAmt; //账户累计充值金额

    private Long sumChgCnt; //账户累计充值次数

    private Long sumOutAmt; //账户累计转出金额

    private Long sumOutCnt; //账户累计转出次数

    private Long sumInAmt; //账户累计转入金额

    private Long sumInCnt; //账户累计转出次数

    private Long sumCashAmt; //账户累计计提金额

    private Long sumCashCnt; //账户累计计提次数

    private Long pinChkAmt; //pin校验金额

    private Long remAmt; //余额提醒值

    private Long maxConsAmt; //最大消费金额上限

    private Long maxSvAmt; //最大充值金额上限

    private Long maxOutAmt; //最大转出金额上限

    private Long maxInAmt; //最大转入金额上限

    private Long maxCashAmt; //最大体现金额上限

    private Long dayMaxConsAmt; //日最大消费金额上限

    private Long dayMaxSvAmt; //日最大充值金额上限

    private Long dayMaxOutAmt; //日最大转出金额上限

    private Long dayMaxInAmt; //日最大转人金额上限

    private Long dayMaxCashAmt; //日最大体现金额上限

    private Long monMaxConsAmt; //月最大消费金额上限

    private Long monMaxSvAmt; //月最大充值金额上限

    private Long monMaxOutAmt; //月最大转出金额上限

    private Long monMaxInAmt; //月最大转入金额上限

    private Long monMaxCashAmt; //月最大提现金额上限

    private Long dayMaxConsCnt; //日最大消费次数限

    private Long dayMaxSvCnt; //日最大充值次数上限

    private Long dayMaxOutCnt; //日最大转出次数上限

    private Long dayMaxInCnt; //日最大转入次数上限

    private Long dayMaxCashCnt; //日最大提现次数上限

    private Long monMaxConsCnt; //月最大消费次数上限

    private Long monMaxSvCnt; //月最大充值次数上限

    private Long monMaxOutCnt; //月最大转出次数上限

    private Long monMaxInCnt; //月最大转入次数上限

    private Long monMaxCashCnt; //月最大提现次数上限

    private String lastTxnDate; //最后交易日期

    private String lastTxnTime; //最后交易时间

    private String inputdate; //创建日期

    private String lastUpdateTime; //最后修改日期

    private Long assureAmt; //脱机最大限额

    private Long overAmt; //脱机金额

    private Long otherAmt; //其他金额

    private Long lastTxnAmt; //最后交易金额

    private String closePermit;

    private String closeCashPermit;
    
    private String initPassword; //初始交易密码
    
    private String txnPassword;  //交易密码
    
    private String ifPwdModify; //初始密码修改标识
    
    private String pwdErrNums; //密码错误次数

    private String pwdErrLockTime; //密码错定时间
    
    private String modulus;//支付账户用户公钥
    
    private String exponent;//支付账户用户私钥
    
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public String getOpenChannel() {
        return openChannel;
    }

    public void setOpenChannel(String openChannel) {
        this.openChannel = openChannel;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public String getNetabbr() {
        return netabbr;
    }

    public void setNetabbr(String netabbr) {
        this.netabbr = netabbr;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getMchntAbbr() {
        return mchntAbbr;
    }

    public void setMchntAbbr(String mchntAbbr) {
        this.mchntAbbr = mchntAbbr;
    }

    public String getAcqInstCode() {
        return acqInstCode;
    }

    public void setAcqInstCode(String acqInstCode) {
        this.acqInstCode = acqInstCode;
    }

    public String getIfOnetimeUse() {
        return ifOnetimeUse;
    }

    public void setIfOnetimeUse(String ifOnetimeUse) {
        this.ifOnetimeUse = ifOnetimeUse;
    }

    public Integer getManageAmt() {
        return manageAmt;
    }

    public void setManageAmt(Integer manageAmt) {
        this.manageAmt = manageAmt;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Long availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Long getWithdrawBalance() {
        return withdrawBalance;
    }

    public void setWithdrawBalance(Long withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }

    public Long getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(Long frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Long getPreauthorizedAmount() {
        return preauthorizedAmount;
    }

    public void setPreauthorizedAmount(Long preauthorizedAmount) {
        this.preauthorizedAmount = preauthorizedAmount;
    }

    public Long getLastDayBal() {
        return lastDayBal;
    }

    public void setLastDayBal(Long lastDayBal) {
        this.lastDayBal = lastDayBal;
    }

    public Long getLastMonthBal() {
        return lastMonthBal;
    }

    public void setLastMonthBal(Long lastMonthBal) {
        this.lastMonthBal = lastMonthBal;
    }

    public Long getDaySumConsAmt() {
        return daySumConsAmt;
    }

    public void setDaySumConsAmt(Long daySumConsAmt) {
        this.daySumConsAmt = daySumConsAmt;
    }

    public Long getDaySumConsCnt() {
        return daySumConsCnt;
    }

    public void setDaySumConsCnt(Long daySumConsCnt) {
        this.daySumConsCnt = daySumConsCnt;
    }

    public Long getDaySumOutAmt() {
        return daySumOutAmt;
    }

    public void setDaySumOutAmt(Long daySumOutAmt) {
        this.daySumOutAmt = daySumOutAmt;
    }

    public Long getDaySumOutCnt() {
        return daySumOutCnt;
    }

    public void setDaySumOutCnt(Long daySumOutCnt) {
        this.daySumOutCnt = daySumOutCnt;
    }

    public Long getDaySumInAmt() {
        return daySumInAmt;
    }

    public void setDaySumInAmt(Long daySumInAmt) {
        this.daySumInAmt = daySumInAmt;
    }

    public Long getDaySumInCnt() {
        return daySumInCnt;
    }

    public void setDaySumInCnt(Long daySumInCnt) {
        this.daySumInCnt = daySumInCnt;
    }

    public Long getDaySumCashAmt() {
        return daySumCashAmt;
    }

    public void setDaySumCashAmt(Long daySumCashAmt) {
        this.daySumCashAmt = daySumCashAmt;
    }

    public Long getDaySumCashCnt() {
        return daySumCashCnt;
    }

    public void setDaySumCashCnt(Long daySumCashCnt) {
        this.daySumCashCnt = daySumCashCnt;
    }

    public Long getDaySumChgAmt() {
        return daySumChgAmt;
    }

    public void setDaySumChgAmt(Long daySumChgAmt) {
        this.daySumChgAmt = daySumChgAmt;
    }

    public Long getDaySumChgCnt() {
        return daySumChgCnt;
    }

    public void setDaySumChgCnt(Long daySumChgCnt) {
        this.daySumChgCnt = daySumChgCnt;
    }

    public Long getMonSumConsAmt() {
        return monSumConsAmt;
    }

    public void setMonSumConsAmt(Long monSumConsAmt) {
        this.monSumConsAmt = monSumConsAmt;
    }

    public Long getMonSumConsCnt() {
        return monSumConsCnt;
    }

    public void setMonSumConsCnt(Long monSumConsCnt) {
        this.monSumConsCnt = monSumConsCnt;
    }

    public Long getMonSumOutAmt() {
        return monSumOutAmt;
    }

    public void setMonSumOutAmt(Long monSumOutAmt) {
        this.monSumOutAmt = monSumOutAmt;
    }

    public Long getMonSumOutCnt() {
        return monSumOutCnt;
    }

    public void setMonSumOutCnt(Long monSumOutCnt) {
        this.monSumOutCnt = monSumOutCnt;
    }

    public Long getMonSumInAmt() {
        return monSumInAmt;
    }

    public void setMonSumInAmt(Long monSumInAmt) {
        this.monSumInAmt = monSumInAmt;
    }

    public Long getMonSumInCnt() {
        return monSumInCnt;
    }

    public void setMonSumInCnt(Long monSumInCnt) {
        this.monSumInCnt = monSumInCnt;
    }

    public Long getMonSumCashAmt() {
        return monSumCashAmt;
    }

    public void setMonSumCashAmt(Long monSumCashAmt) {
        this.monSumCashAmt = monSumCashAmt;
    }

    public Long getMonSumCashCnt() {
        return monSumCashCnt;
    }

    public void setMonSumCashCnt(Long monSumCashCnt) {
        this.monSumCashCnt = monSumCashCnt;
    }

    public Long getMonSumChgAmt() {
        return monSumChgAmt;
    }

    public void setMonSumChgAmt(Long monSumChgAmt) {
        this.monSumChgAmt = monSumChgAmt;
    }

    public Long getMonSumChgCnt() {
        return monSumChgCnt;
    }

    public void setMonSumChgCnt(Long monSumChgCnt) {
        this.monSumChgCnt = monSumChgCnt;
    }

    public String getIssInsCode() {
        return issInsCode;
    }

    public void setIssInsCode(String issInsCode) {
        this.issInsCode = issInsCode;
    }

    public String getEncryptedMsg() {
        return encryptedMsg;
    }

    public void setEncryptedMsg(String encryptedMsg) {
        this.encryptedMsg = encryptedMsg;
    }

    public Long getSumConsAmt() {
        return sumConsAmt;
    }

    public void setSumConsAmt(Long sumConsAmt) {
        this.sumConsAmt = sumConsAmt;
    }

    public Long getSumConsCnt() {
        return sumConsCnt;
    }

    public void setSumConsCnt(Long sumConsCnt) {
        this.sumConsCnt = sumConsCnt;
    }

    public Long getSumChgAmt() {
        return sumChgAmt;
    }

    public void setSumChgAmt(Long sumChgAmt) {
        this.sumChgAmt = sumChgAmt;
    }

    public Long getSumChgCnt() {
        return sumChgCnt;
    }

    public void setSumChgCnt(Long sumChgCnt) {
        this.sumChgCnt = sumChgCnt;
    }

    public Long getSumOutAmt() {
        return sumOutAmt;
    }

    public void setSumOutAmt(Long sumOutAmt) {
        this.sumOutAmt = sumOutAmt;
    }

    public Long getSumOutCnt() {
        return sumOutCnt;
    }

    public void setSumOutCnt(Long sumOutCnt) {
        this.sumOutCnt = sumOutCnt;
    }

    public Long getSumInAmt() {
        return sumInAmt;
    }

    public void setSumInAmt(Long sumInAmt) {
        this.sumInAmt = sumInAmt;
    }

    public Long getSumInCnt() {
        return sumInCnt;
    }

    public void setSumInCnt(Long sumInCnt) {
        this.sumInCnt = sumInCnt;
    }

    public Long getSumCashAmt() {
        return sumCashAmt;
    }

    public void setSumCashAmt(Long sumCashAmt) {
        this.sumCashAmt = sumCashAmt;
    }

    public Long getSumCashCnt() {
        return sumCashCnt;
    }

    public void setSumCashCnt(Long sumCashCnt) {
        this.sumCashCnt = sumCashCnt;
    }

    public Long getPinChkAmt() {
        return pinChkAmt;
    }

    public void setPinChkAmt(Long pinChkAmt) {
        this.pinChkAmt = pinChkAmt;
    }

    public Long getRemAmt() {
        return remAmt;
    }

    public void setRemAmt(Long remAmt) {
        this.remAmt = remAmt;
    }

    public Long getMaxConsAmt() {
        return maxConsAmt;
    }

    public void setMaxConsAmt(Long maxConsAmt) {
        this.maxConsAmt = maxConsAmt;
    }

    public Long getMaxSvAmt() {
        return maxSvAmt;
    }

    public void setMaxSvAmt(Long maxSvAmt) {
        this.maxSvAmt = maxSvAmt;
    }

    public Long getMaxOutAmt() {
        return maxOutAmt;
    }

    public void setMaxOutAmt(Long maxOutAmt) {
        this.maxOutAmt = maxOutAmt;
    }

    public Long getMaxInAmt() {
        return maxInAmt;
    }

    public void setMaxInAmt(Long maxInAmt) {
        this.maxInAmt = maxInAmt;
    }

    public Long getMaxCashAmt() {
        return maxCashAmt;
    }

    public void setMaxCashAmt(Long maxCashAmt) {
        this.maxCashAmt = maxCashAmt;
    }

    public Long getDayMaxConsAmt() {
        return dayMaxConsAmt;
    }

    public void setDayMaxConsAmt(Long dayMaxConsAmt) {
        this.dayMaxConsAmt = dayMaxConsAmt;
    }

    public Long getDayMaxSvAmt() {
        return dayMaxSvAmt;
    }

    public void setDayMaxSvAmt(Long dayMaxSvAmt) {
        this.dayMaxSvAmt = dayMaxSvAmt;
    }

    public Long getDayMaxOutAmt() {
        return dayMaxOutAmt;
    }

    public void setDayMaxOutAmt(Long dayMaxOutAmt) {
        this.dayMaxOutAmt = dayMaxOutAmt;
    }

    public Long getDayMaxInAmt() {
        return dayMaxInAmt;
    }

    public void setDayMaxInAmt(Long dayMaxInAmt) {
        this.dayMaxInAmt = dayMaxInAmt;
    }

    public Long getDayMaxCashAmt() {
        return dayMaxCashAmt;
    }

    public void setDayMaxCashAmt(Long dayMaxCashAmt) {
        this.dayMaxCashAmt = dayMaxCashAmt;
    }

    public Long getMonMaxConsAmt() {
        return monMaxConsAmt;
    }

    public void setMonMaxConsAmt(Long monMaxConsAmt) {
        this.monMaxConsAmt = monMaxConsAmt;
    }

    public Long getMonMaxSvAmt() {
        return monMaxSvAmt;
    }

    public void setMonMaxSvAmt(Long monMaxSvAmt) {
        this.monMaxSvAmt = monMaxSvAmt;
    }

    public Long getMonMaxOutAmt() {
        return monMaxOutAmt;
    }

    public void setMonMaxOutAmt(Long monMaxOutAmt) {
        this.monMaxOutAmt = monMaxOutAmt;
    }

    public Long getMonMaxInAmt() {
        return monMaxInAmt;
    }

    public void setMonMaxInAmt(Long monMaxInAmt) {
        this.monMaxInAmt = monMaxInAmt;
    }

    public Long getMonMaxCashAmt() {
        return monMaxCashAmt;
    }

    public void setMonMaxCashAmt(Long monMaxCashAmt) {
        this.monMaxCashAmt = monMaxCashAmt;
    }

    public Long getDayMaxConsCnt() {
        return dayMaxConsCnt;
    }

    public void setDayMaxConsCnt(Long dayMaxConsCnt) {
        this.dayMaxConsCnt = dayMaxConsCnt;
    }

    public Long getDayMaxSvCnt() {
        return dayMaxSvCnt;
    }

    public void setDayMaxSvCnt(Long dayMaxSvCnt) {
        this.dayMaxSvCnt = dayMaxSvCnt;
    }

    public Long getDayMaxOutCnt() {
        return dayMaxOutCnt;
    }

    public void setDayMaxOutCnt(Long dayMaxOutCnt) {
        this.dayMaxOutCnt = dayMaxOutCnt;
    }

    public Long getDayMaxInCnt() {
        return dayMaxInCnt;
    }

    public void setDayMaxInCnt(Long dayMaxInCnt) {
        this.dayMaxInCnt = dayMaxInCnt;
    }

    public Long getDayMaxCashCnt() {
        return dayMaxCashCnt;
    }

    public void setDayMaxCashCnt(Long dayMaxCashCnt) {
        this.dayMaxCashCnt = dayMaxCashCnt;
    }

    public Long getMonMaxConsCnt() {
        return monMaxConsCnt;
    }

    public void setMonMaxConsCnt(Long monMaxConsCnt) {
        this.monMaxConsCnt = monMaxConsCnt;
    }

    public Long getMonMaxSvCnt() {
        return monMaxSvCnt;
    }

    public void setMonMaxSvCnt(Long monMaxSvCnt) {
        this.monMaxSvCnt = monMaxSvCnt;
    }

    public Long getMonMaxOutCnt() {
        return monMaxOutCnt;
    }

    public void setMonMaxOutCnt(Long monMaxOutCnt) {
        this.monMaxOutCnt = monMaxOutCnt;
    }

    public Long getMonMaxInCnt() {
        return monMaxInCnt;
    }

    public void setMonMaxInCnt(Long monMaxInCnt) {
        this.monMaxInCnt = monMaxInCnt;
    }

    public Long getMonMaxCashCnt() {
        return monMaxCashCnt;
    }

    public void setMonMaxCashCnt(Long monMaxCashCnt) {
        this.monMaxCashCnt = monMaxCashCnt;
    }

    public String getLastTxnDate() {
        return lastTxnDate;
    }

    public void setLastTxnDate(String lastTxnDate) {
        this.lastTxnDate = lastTxnDate;
    }

    public String getLastTxnTime() {
        return lastTxnTime;
    }

    public void setLastTxnTime(String lastTxnTime) {
        this.lastTxnTime = lastTxnTime;
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getAssureAmt() {
        return assureAmt;
    }

    public void setAssureAmt(Long assureAmt) {
        this.assureAmt = assureAmt;
    }

    public Long getOverAmt() {
        return overAmt;
    }

    public void setOverAmt(Long overAmt) {
        this.overAmt = overAmt;
    }

    public Long getOtherAmt() {
        return otherAmt;
    }

    public void setOtherAmt(Long otherAmt) {
        this.otherAmt = otherAmt;
    }

    public Long getLastTxnAmt() {
        return lastTxnAmt;
    }

    public void setLastTxnAmt(Long lastTxnAmt) {
        this.lastTxnAmt = lastTxnAmt;
    }

    public String getClosePermit() {
        return closePermit;
    }

    public void setClosePermit(String closePermit) {
        this.closePermit = closePermit;
    }

    public String getCloseCashPermit() {
        return closeCashPermit;
    }

    public void setCloseCashPermit(String closeCashPermit) {
        this.closeCashPermit = closeCashPermit;
    }

	public String getInitPassword() {
		return initPassword;
	}

	public void setInitPassword(String initPassword) {
		this.initPassword = initPassword;
	}

	public String getTxnPassword() {
		return txnPassword;
	}

	public void setTxnPassword(String txnPassword) {
		this.txnPassword = txnPassword;
	}

	public String getIfPwdModify() {
		return ifPwdModify;
	}

	public void setIfPwdModify(String ifPwdModify) {
		this.ifPwdModify = ifPwdModify;
	}

	public String getPwdErrNums() {
		return pwdErrNums;
	}

	public void setPwdErrNums(String pwdErrNums) {
		this.pwdErrNums = pwdErrNums;
	}

	public String getPwdErrLockTime() {
		return pwdErrLockTime;
	}

	public void setPwdErrLockTime(String pwdErrLockTime) {
		this.pwdErrLockTime = pwdErrLockTime;
	}

	public String getModulus() {
		return modulus;
	}

	public void setModulus(String modulus) {
		this.modulus = modulus;
	}

	public String getExponent() {
		return exponent;
	}

	public void setExponent(String exponent) {
		this.exponent = exponent;
	}

}