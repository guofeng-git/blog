package jieyi.accservice.form;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
/**
 * 柜面终端管理表实体类
 * 综合前置系统使用INTERNET类型的终端进行内部传输密钥管理
 * @author lacet
 *对应数据库表 T_PARAM_MACPOSINFO
 */
@Alias("TParamMacposinfo")
public class TParamMacposinfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private String posid;

    private String macid;

    private String unitid;

    private String netid;

    private Short postmkstatus;

    private String postmk;

    private String checkvalue;

    private Short printertype;

    private String printername;

    private Short cardreadertype;

    private String cardreaderdllname;

    private String cardreadporttype;

    private Short lastcheckstatus;

    private String lastchecktime;

    private String lastcheckuserid;

    private String lastcheckbatch;

    private Integer posseq;

    private Short printcountperbiz;

    private Short passwdkeypadcom;

    private Integer readeropencom;

    private String instcd;

    private String mackey;

    private String pinkey;

    private String pinkeyCheckvalue;
    
    private String posbiztype;

    private Integer batchno;

    private String macEnc; //用tmkEnc，对mac解密值
    
    
    public String getMacEnc() {
		return macEnc;
	}

	public void setMacEnc(String macEnc) {
		this.macEnc = macEnc;
	}

	public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid == null ? null : posid.trim();
    }

    public String getMacid() {
        return macid;
    }

    public void setMacid(String macid) {
        this.macid = macid == null ? null : macid.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }

    public String getNetid() {
        return netid;
    }

    public void setNetid(String netid) {
        this.netid = netid == null ? null : netid.trim();
    }

    public Short getPostmkstatus() {
        return postmkstatus;
    }

    public void setPostmkstatus(Short postmkstatus) {
        this.postmkstatus = postmkstatus;
    }

    public String getPostmk() {
        return postmk;
    }

    public void setPostmk(String postmk) {
        this.postmk = postmk == null ? null : postmk.trim();
    }

    public String getCheckvalue() {
        return checkvalue;
    }

    public void setCheckvalue(String checkvalue) {
        this.checkvalue = checkvalue == null ? null : checkvalue.trim();
    }

    public Short getPrintertype() {
        return printertype;
    }

    public void setPrintertype(Short printertype) {
        this.printertype = printertype;
    }

    public String getPrintername() {
        return printername;
    }

    public void setPrintername(String printername) {
        this.printername = printername == null ? null : printername.trim();
    }

    public Short getCardreadertype() {
        return cardreadertype;
    }

    public void setCardreadertype(Short cardreadertype) {
        this.cardreadertype = cardreadertype;
    }

    public String getCardreaderdllname() {
        return cardreaderdllname;
    }

    public void setCardreaderdllname(String cardreaderdllname) {
        this.cardreaderdllname = cardreaderdllname == null ? null : cardreaderdllname.trim();
    }

    public String getCardreadporttype() {
        return cardreadporttype;
    }

    public void setCardreadporttype(String cardreadporttype) {
        this.cardreadporttype = cardreadporttype == null ? null : cardreadporttype.trim();
    }

    public Short getLastcheckstatus() {
        return lastcheckstatus;
    }

    public void setLastcheckstatus(Short lastcheckstatus) {
        this.lastcheckstatus = lastcheckstatus;
    }

    public String getLastchecktime() {
        return lastchecktime;
    }

    public void setLastchecktime(String lastchecktime) {
        this.lastchecktime = lastchecktime == null ? null : lastchecktime.trim();
    }

    public String getLastcheckuserid() {
        return lastcheckuserid;
    }

    public void setLastcheckuserid(String lastcheckuserid) {
        this.lastcheckuserid = lastcheckuserid == null ? null : lastcheckuserid.trim();
    }

  

    public String getLastcheckbatch() {
		return lastcheckbatch;
	}

	public void setLastcheckbatch(String lastcheckbatch) {
		this.lastcheckbatch = lastcheckbatch;
	}

	public Integer getPosseq() {
        return posseq;
    }

    public void setPosseq(Integer posseq) {
        this.posseq = posseq;
    }

    public Short getPrintcountperbiz() {
        return printcountperbiz;
    }

    public void setPrintcountperbiz(Short printcountperbiz) {
        this.printcountperbiz = printcountperbiz;
    }

    public Short getPasswdkeypadcom() {
        return passwdkeypadcom;
    }

    public void setPasswdkeypadcom(Short passwdkeypadcom) {
        this.passwdkeypadcom = passwdkeypadcom;
    }

    public Integer getReaderopencom() {
        return readeropencom;
    }

    public void setReaderopencom(Integer readeropencom) {
        this.readeropencom = readeropencom;
    }

    public String getInstcd() {
        return instcd;
    }

    public void setInstcd(String instcd) {
        this.instcd = instcd == null ? null : instcd.trim();
    }

    public String getMackey() {
        return mackey;
    }

    public void setMackey(String mackey) {
        this.mackey = mackey == null ? null : mackey.trim();
    }

    public String getPinkey() {
        return pinkey;
    }

    public void setPinkey(String pinkey) {
        this.pinkey = pinkey == null ? null : pinkey.trim();
    }

    public String getPosbiztype() {
        return posbiztype;
    }

    public void setPosbiztype(String posbiztype) {
        this.posbiztype = posbiztype == null ? null : posbiztype.trim();
    }

    public Integer getBatchno() {
        return batchno;
    }

    public void setBatchno(Integer batchno) {
        this.batchno = batchno;
    }

	public String getPinkeyCheckvalue() {
		return pinkeyCheckvalue;
	}

	public void setPinkeyCheckvalue(String pinkeyCheckvalue) {
		this.pinkeyCheckvalue = pinkeyCheckvalue;
	}
    
}