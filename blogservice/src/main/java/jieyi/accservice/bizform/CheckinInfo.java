package jieyi.accservice.bizform;

/**
 * 签到信息
 * 用来保存内部通讯密钥的工具类，包含8583报文的终端号、商户号等信息
 * */
public class CheckinInfo {
    private String communicationKey;
    private String batchno;
    private String posid;
    private String unitid;
    private String printername;
    private String printcountperbiz;
    private String operatorcardid;
    private String printertype;
    private String netcd;
    private String netname;
    private String mchntname;
    private String passwdkeypadcom;// NUMBER(2) 密码键盘端口
    
	public String getNetcd() {
		return netcd;
	}
	public void setNetcd(String netcd) {
		this.netcd = netcd;
	}
	public String getNetname() {
		return netname;
	}
	public void setNetname(String netname) {
		this.netname = netname;
	}
	public String getMchntname() {
		return mchntname;
	}
	public void setMchntname(String mchntname) {
		this.mchntname = mchntname;
	}
	public String getCommunicationKey() {
		return communicationKey;
	}
	public void setCommunicationKey(String communicationKey) {
		this.communicationKey = communicationKey;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getPosid() {
		return posid;
	}
	public void setPosid(String posid) {
		this.posid = posid;
	}
	public String getUnitid() {
		return unitid;
	}
	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}
	public String getPrintername() {
		return printername;
	}
	public void setPrintername(String printername) {
		this.printername = printername;
	}
	public String getPrintcountperbiz() {
		return printcountperbiz;
	}
	public void setPrintcountperbiz(String printcountperbiz) {
		this.printcountperbiz = printcountperbiz;
	}
	public String getOperatorcardid() {
		return operatorcardid;
	}
	public void setOperatorcardid(String operatorcardid) {
		this.operatorcardid = operatorcardid;
	}
	public String getPrintertype() {
		return printertype;
	}
	public void setPrintertype(String printertype) {
		this.printertype = printertype;
	}
	public String getPasswdkeypadcom() {
		return passwdkeypadcom;
	}
	public void setPasswdkeypadcom(String passwdkeypadcom) {
		this.passwdkeypadcom = passwdkeypadcom;
	}
	
}
