package jieyi.accservice.utils;

import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class SignatureUtil {
	private final static String SIGNATURE_ALGORITHM = "SHA1WithRSA";

	public static byte[] signature(byte[] plainText, RSAPrivateKey privateKey, String signAlgor) throws Exception {
		if (signAlgor == null || signAlgor.equals("")) {
			signAlgor = SIGNATURE_ALGORITHM;
		}
		Signature signature = Signature.getInstance(signAlgor);
		signature.initSign(privateKey);
		signature.update(plainText);
		byte[] signData = signature.sign();
		return signData;
	}

	public static boolean signVerified(byte[] plainText, byte[] signData, RSAPublicKey publicKey, String signAlgor) throws Exception {
		if (signAlgor == null || signAlgor.equals("")) {
			signAlgor = SIGNATURE_ALGORITHM;
		}
		Signature signature = Signature.getInstance(signAlgor);
		signature.initVerify(publicKey);
		signature.update(plainText);
		boolean verify = signature.verify(signData);
		return verify;
	}

	public static void main(String[] arg) {
		String modulus = "8B6D8CAE9C9494FC1AE3C90E5869111447FA19F66F62D904787C973862D08B0056CA891ECA0CA7CF5D38407BA7AF8FC9A83624CDC46B9A47B0FEBAD0FC730D80C7C1CA1088731D758C6D26A3A2DF7BD7634EEA107B6D752609A16C9C671758A853135214425C58B0DD25779DFB070B08817F0828C72BEF11A5D7F998D0F81D49";
		String exponent = "4782B76DF3372DB6A3E00285CE088D4EF69FAAE33F3BD68CB9734568111E5EBC9CC7224EDD58625533BD9F2D0CD3398F372C15F24774DCDB3A475BEFC61B08682A941F8B170B82944FB3CEBBD12E37190853271B88018F55A30E788CA2EF944BB0DDB3BA7D08426D0825A040AF3D082DDCA238EAC5445D372891AE6AF11D7FB5";
		// modulus =
		// "A48D3AA7253648A7B056188D8289F1DF50208451FAB4E713EBA6A13D98C8F8F55BF7C2C73380F1293D541FA7856CFE7E6B4065370087E93E42BED4072DB34CA621B01D901D86A6DE6006B3F58DC6C758D6923AE6795D7920B2C0A7727CEE037AE7F3C1301A7045ED2195ECCF031B75EC696EE1BC9F14DEC88656873B0FBC9437";
		// exponent =
		// "112B4331696A8E8E2091FB21D8BAF7E7AAFE998FCC2ECFE57E32F6A3ECAB1B7ECE47BDA4F734BEF4E497406E4437A91E1BA6AE68DCBF5190D37A01B976053D3BF54320F1776180B2DA350C4AD27E27185C2ED5453FBBD3406DCEAC9F5A898B0021567903797696F8405AB6241BDC03B5CF534E244D5C91C1CC436A3916BF79A1";

		RSAPublicKey publicKey;
		RSAPrivateKey privateKey;
		try {
			publicKey = RsaUtil.loadPublicKey(modulus, "10001", 16);
			privateKey = RsaUtil.loadPrivateKey(modulus, exponent, 16);
			System.out.println(publicKey.toString());
			System.out.println(privateKey.toString());

			String data = "{\"txncode\":\"charge\",\"cardno\":\"2253123456781234\"}";
			data = "{\"instid\":\"10000001\",\"imei\":\"865411025586127\",\"voucherno\":\"420984198704153330\",\"pagerecnum\":\"10\",\"city\":\"2253\",\"seid\":\"0114911019999099\",\"pageseq\":\"0\",\"mchntid\":\"100000010000001\",\"acctype\":\"00\",\"paypasswd\":\"0d9651a85466c6320cf25afc79eba8d7930f9e2986beff055fbea23a14d6bbf189daac77e7f751bc49d144130b2add6eaa35c5311ced561d4719c185e782ae911476eadacfafeae15b18e266de9589a4c62f2bea9f7984ff4999cd6b9bf274d13664e37b5bb8e2cc24faaca360d83e903cf7e7da410219e32b92d0661c259e97\",\"cardno\":\"2253000150000194\",\"begindate\":\"20150119\",\"enddate\":\"20150109\",\"txncode\":\"AccTxnQry\",\"syssesq\":\"1234567890\"}";
			data = "1111111111";
			byte[] signData = signature(data.getBytes("gbk"), privateKey, "");
			System.out.println("签名数据=[" + NumberStringUtil.bytesToHexString(signData) + "]");
			boolean signVerify = signVerified(data.getBytes("gbk"), signData, publicKey, "");
			System.out.println("验签结果=[" + signVerify + "]");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
