package jieyi.accservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyInfoService {

	@Value("${communicate.serverip}")
	private String serverip;
	@Value("${communicate.serverport}")
	private String serverport;
	@Value("${communicate.datagramxmlpath}")
	private String datagramxmlpath;
	@Value("${bizparam.tsk}")
	private String tsk;
	/** 客户信息加密key */
	@Value("${des.key}")
	private String key;
	/** 外部接口数据加密key */
	@Value("${des.otherkey}")
	private String otherkey;
	@Value("${customcommincicate.serverip}")
	private String serveripForCust;
	@Value("${customcommincicate.serverport}")
	private String serverportForCust;
	@Value("${customcommincicate.servername}")
	private String servername;
	@Value("${zjbomcommincicate.serverip}")
	private String serveripForZjb;
	@Value("${zjbomcommincicate.serverport}")
	private String serverportForZjb;
	@Value("${zjbomcommincicate.servername}")
	private String servernameForZjb;
	@Value("${jtbomcommincicate.serverip}")
	private String serveripForJtb;
	@Value("${jtbomcommincicate.serverport}")
	private String serverportForJtb;
	@Value("${jtbomcommincicate.servername}")
	private String servernameForJtb;
	@Value("${pbocomcommincicate.serverip}")
	private String serveripForPboc;
	@Value("${pbocomcommincicate.serverport}")
	private String serverportForPboc;
	@Value("${pbocomcommincicate.servername}")
	private String servernameForPboc;
	//为调用交通部联机交易所用（圈存）
	@Value("${jtbEcashSave.serverip}")
	private String serveripEach;
	@Value("${jtbEcashSave.serverport}")
	private String serverportEach;
	@Value("${jtbEcashSave.servername}")
	private String servernameEach;
	@Value("${jtbEcashSaveConfirm.serverip}")
	private String serveripForConfirm;
	@Value("${jtbEcashSaveConfirm.serverport}")
	private String serverportConfirm;
	@Value("${jtbEcashSaveConfirm.servername}")
	private String servernameConfirm;
	
	@Value("${qrcode.balance}")
	private String qrcodeBalance;

//	@Value("${platformPubKey.modulus}")
//	private String modulus;
//	
//	@Value("${platformPubKey.exponent}")
//	private String exponent;
//	
	/**
	 * 客管系统公私钥模
	 */
	@Value("${custSys.modulus}")
	private String custSys_modulus;
	
	/**
	 * 客管系统公私钥模
	 */
	@Value("${custSys.exponent}")
	private String custSys_exponent;
	
	/**
	 * 客管机构号
	 */
	@Value("${custSys.reqinstid}")
	private String custSys_reqinstid;
	
	@Value("${images.url}")
	private String imgurl;
	
	public String getCustSys_reqinstid() {
		return custSys_reqinstid;
	}

	public void setCustSys_reqinstid(String custSys_reqinstid) {
		this.custSys_reqinstid = custSys_reqinstid;
	}

	public String getCustSys_modulus() {
		return custSys_modulus;
	}

	public void setCustSys_modulus(String custSys_modulus) {
		this.custSys_modulus = custSys_modulus;
	}

	public String getCustSys_exponent() {
		return custSys_exponent;
	}

	public void setCustSys_exponent(String custSys_exponent) {
		this.custSys_exponent = custSys_exponent;
	}

//	public String getModulus() {
//		return modulus;
//	}
//
//	public void setModulus(String modulus) {
//		this.modulus = modulus;
//	}
//
//	public String getExponent() {
//		return exponent;
//	}
//
//	public void setExponent(String exponent) {
//		this.exponent = exponent;
//	}

	public String getQrcodeBalance() {
		return qrcodeBalance;
	}

	public void setQrcodeBalance(String qrcodeBalance) {
		this.qrcodeBalance = qrcodeBalance;
	}

	public String getServerip() {
		return serverip;
	}

	public void setServerip(String serverip) {
		this.serverip = serverip;
	}

	public String getServerport() {
		return serverport;
	}

	public void setServerport(String serverport) {
		this.serverport = serverport;
	}

	public String getDatagramxmlpath() {
		return datagramxmlpath;
	}

	public void setDatagramxmlpath(String datagramxmlpath) {
		this.datagramxmlpath = datagramxmlpath;
	}

	public String getTsk() {
		return tsk;
	}

	public void setTsk(String tsk) {
		this.tsk = tsk;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getOtherkey() {
		return otherkey;
	}

	public void setOtherkey(String otherkey) {
		this.otherkey = otherkey;
	}

	public String getServeripForCust() {
		return serveripForCust;
	}

	public void setServeripForCust(String serveripForCust) {
		this.serveripForCust = serveripForCust;
	}

	public String getServerportForCust() {
		return serverportForCust;
	}

	public void setServerportForCust(String serverportForCust) {
		this.serverportForCust = serverportForCust;
	}

	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public String getServeripForZjb() {
		return serveripForZjb;
	}

	public void setServeripForZjb(String serveripForZjb) {
		this.serveripForZjb = serveripForZjb;
	}

	public String getServerportForZjb() {
		return serverportForZjb;
	}

	public void setServerportForZjb(String serverportForZjb) {
		this.serverportForZjb = serverportForZjb;
	}

	public String getServernameForZjb() {
		return servernameForZjb;
	}

	public void setServernameForZjb(String servernameForZjb) {
		this.servernameForZjb = servernameForZjb;
	}

	public String getServeripForJtb() {
		return serveripForJtb;
	}

	public void setServeripForJtb(String serveripForJtb) {
		this.serveripForJtb = serveripForJtb;
	}

	public String getServerportForJtb() {
		return serverportForJtb;
	}

	public void setServerportForJtb(String serverportForJtb) {
		this.serverportForJtb = serverportForJtb;
	}

	public String getServernameForJtb() {
		return servernameForJtb;
	}

	public void setServernameForJtb(String servernameForJtb) {
		this.servernameForJtb = servernameForJtb;
	}

	public String getServeripForPboc() {
		return serveripForPboc;
	}

	public void setServeripForPboc(String serveripForPboc) {
		this.serveripForPboc = serveripForPboc;
	}

	public String getServerportForPboc() {
		return serverportForPboc;
	}

	public void setServerportForPboc(String serverportForPboc) {
		this.serverportForPboc = serverportForPboc;
	}

	public String getServernameForPboc() {
		return servernameForPboc;
	}

	public void setServernameForPboc(String servernameForPboc) {
		this.servernameForPboc = servernameForPboc;
	}

	public String getServeripEach() {
		return serveripEach;
	}

	public void setServeripEach(String serveripEach) {
		this.serveripEach = serveripEach;
	}

	public String getServerportEach() {
		return serverportEach;
	}

	public void setServerportEach(String serverportEach) {
		this.serverportEach = serverportEach;
	}

	public String getServernameEach() {
		return servernameEach;
	}

	public void setServernameEach(String servernameEach) {
		this.servernameEach = servernameEach;
	}

	public String getServeripForConfirm() {
		return serveripForConfirm;
	}

	public void setServeripForConfirm(String serveripForConfirm) {
		this.serveripForConfirm = serveripForConfirm;
	}

	public String getServerportConfirm() {
		return serverportConfirm;
	}

	public void setServerportConfirm(String serverportConfirm) {
		this.serverportConfirm = serverportConfirm;
	}

	public String getServernameConfirm() {
		return servernameConfirm;
	}

	public void setServernameConfirm(String servernameConfirm) {
		this.servernameConfirm = servernameConfirm;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}



}
