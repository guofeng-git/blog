package jieyi.accservice.form;

import org.apache.ibatis.type.Alias;

@Alias("TblBseMchntKey")
public class TblBseMchntKey {
    private String mchntNo; //商户号

    private String sysPubkey; //系统方公钥

    private String sysPubind; //系统方公钥指数

    private String sysPrikey; //系统方私钥

    private String sysKeyver; //系统方秘钥版本
    
    private String mchntPubkey; //商户方公钥
    
    private String mchntPubind; //商户方公钥指数
    
    private String mchntKeyver; //商户方秘钥版本

    private String status; //状态 0-正常 1-停用

    private String checkStatus; //审核状态 0-初始 1-已修改 2-已审核 3-已变更

    private String createdBy; //创建人

    private String createdTime; //创建时间

    private String modifiedBy; //修改人

    private String modifiedTime; //修改时间

    private String auditBy; //审核人

    private String auditTime; //审核时间

    private String rsvd1; //保留字段

    private String rsvd2; //保留字段

	public String getMchntNo() {
		return mchntNo;
	}

	public void setMchntNo(String mchntNo) {
		this.mchntNo = mchntNo;
	}

	public String getSysPubkey() {
		return sysPubkey;
	}

	public void setSysPubkey(String sysPubkey) {
		this.sysPubkey = sysPubkey;
	}

	public String getSysPubind() {
		return sysPubind;
	}

	public void setSysPubind(String sysPubind) {
		this.sysPubind = sysPubind;
	}

	public String getSysPrikey() {
		return sysPrikey;
	}

	public void setSysPrikey(String sysPrikey) {
		this.sysPrikey = sysPrikey;
	}

	public String getSysKeyver() {
		return sysKeyver;
	}

	public void setSysKeyver(String sysKeyver) {
		this.sysKeyver = sysKeyver;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getAuditBy() {
		return auditBy;
	}

	public void setAuditBy(String auditBy) {
		this.auditBy = auditBy;
	}

	public String getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	public String getRsvd1() {
		return rsvd1;
	}

	public void setRsvd1(String rsvd1) {
		this.rsvd1 = rsvd1;
	}

	public String getRsvd2() {
		return rsvd2;
	}

	public void setRsvd2(String rsvd2) {
		this.rsvd2 = rsvd2;
	}

	public String getMchntPubkey() {
		return mchntPubkey;
	}

	public void setMchntPubkey(String mchntPubkey) {
		this.mchntPubkey = mchntPubkey;
	}

	public String getMchntPubind() {
		return mchntPubind;
	}

	public void setMchntPubind(String mchntPubind) {
		this.mchntPubind = mchntPubind;
	}

	public String getMchntKeyver() {
		return mchntKeyver;
	}

	public void setMchntKeyver(String mchntKeyver) {
		this.mchntKeyver = mchntKeyver;
	}

    

}