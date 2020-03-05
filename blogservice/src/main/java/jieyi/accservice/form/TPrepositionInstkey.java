package jieyi.accservice.form;

import org.apache.ibatis.type.Alias;

/**
 * TSM接入方通讯密钥维护表实体类
 * @author lacet
 *对应数据库表 T_PREPOSITION_INSTKEY
 */
@Alias("TPrepositionInstkey")
public class TPrepositionInstkey  {
	
	private String mchntNo;
	
	private String termNo;
	
    private String platPrivindex;

    private String platModulus;

    private String instModulus;

    private String instIndex;

    private String status;

    private String createdBy;

    private String createdTime;

    private String lastModifiedBy;

    private String lastModifiedTime;

    private String auditBy;

    private String auditTime;

    private String checkStatus;

    private String rsvd1;

    private String rsvd2;

    public String getPlatPrivindex() {
        return platPrivindex;
    }

    public void setPlatPrivindex(String platPrivindex) {
        this.platPrivindex = platPrivindex == null ? null : platPrivindex.trim();
    }

    public String getPlatModulus() {
        return platModulus;
    }

    public void setPlatModulus(String platModulus) {
        this.platModulus = platModulus == null ? null : platModulus.trim();
    }

    public String getInstModulus() {
        return instModulus;
    }

    public void setInstModulus(String instModulus) {
        this.instModulus = instModulus == null ? null : instModulus.trim();
    }

    public String getInstIndex() {
        return instIndex;
    }

    public void setInstIndex(String instIndex) {
        this.instIndex = instIndex == null ? null : instIndex.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime == null ? null : lastModifiedTime.trim();
    }

    public String getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy == null ? null : auditBy.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
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

	public String getMchntNo() {
		return mchntNo;
	}

	public void setMchntNo(String mchntNo) {
		this.mchntNo = mchntNo;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
    
}