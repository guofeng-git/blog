package jieyi.accservice.bizform;

public class QrCodeParam {

	private String version;// 二维码版本
	private String qrCodeDataLength;// 二维码数据长度
	// private String platformPubKey;// 平台公钥
	private String customerNo;// 客户号
	private String cardAccType;// 卡账户类型
	// private String payAccUserPubKey;// 支付账户用户公钥
	private String authExpirationTime;// 支付账户系统授权过期时间(秒)
	private String qrCodeValidTime;// 二维码有效时间
	// private String instidFieldLength;// 发卡机构自定义域长度(32)
	// private String hftField;// 合肥通自定义域
	// private String hftAuthSign;// 合肥通授权签名
	private String qrCodeGenTime;// 二维码生成时间
	private String payAccUserPriKeySign;// 支付账户用户私钥签名

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getQrCodeDataLength() {
		return qrCodeDataLength;
	}

	public void setQrCodeDataLength(String qrCodeDataLength) {
		this.qrCodeDataLength = qrCodeDataLength;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCardAccType() {
		return cardAccType;
	}

	public void setCardAccType(String cardAccType) {
		this.cardAccType = cardAccType;
	}

	public String getAuthExpirationTime() {
		return authExpirationTime;
	}

	public void setAuthExpirationTime(String authExpirationTime) {
		this.authExpirationTime = authExpirationTime;
	}

	public String getQrCodeValidTime() {
		return qrCodeValidTime;
	}

	public void setQrCodeValidTime(String qrCodeValidTime) {
		this.qrCodeValidTime = qrCodeValidTime;
	}

	public String getQrCodeGenTime() {
		return qrCodeGenTime;
	}

	public void setQrCodeGenTime(String qrCodeGenTime) {
		this.qrCodeGenTime = qrCodeGenTime;
	}

	public String getPayAccUserPriKeySign() {
		return payAccUserPriKeySign;
	}

	public void setPayAccUserPriKeySign(String payAccUserPriKeySign) {
		this.payAccUserPriKeySign = payAccUserPriKeySign;
	}

	@Override
	public String toString() {
		return "QrCodeParam [version=" + version + ", qrCodeDataLength=" + qrCodeDataLength + ", customerNo="
				+ customerNo + ", cardAccType=" + cardAccType + ", authExpirationTime=" + authExpirationTime
				+ ", qrCodeValidTime=" + qrCodeValidTime + ", qrCodeGenTime=" + qrCodeGenTime
				+ ", payAccUserPriKeySign=" + payAccUserPriKeySign + "]";
	}

}
