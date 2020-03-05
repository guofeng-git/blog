package jieyi.accservice.utils;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;


/**
 * 获取客管签名和验签
 * 
 * @author yijiesoft
 *
 */
public class GetCustSign {
	private final static String signAlgor = "SHA1WithRSA";

	public static void main(String[] args) throws Exception {
//		String modulus = "8B6D8CAE9C9494FC1AE3C90E5869111447FA19F66F62D904787C973862D08B0056CA891ECA0CA7CF5D38407BA7AF8FC9A83624CDC46B9A47B0FEBAD0FC730D80C7C1CA1088731D758C6D26A3A2DF7BD7634EEA107B6D752609A16C9C671758A853135214425C58B0DD25779DFB070B08817F0828C72BEF11A5D7F998D0F81D49";
//		String exponent = "4782B76DF3372DB6A3E00285CE088D4EF69FAAE33F3BD68CB9734568111E5EBC9CC7224EDD58625533BD9F2D0CD3398F372C15F24774DCDB3A475BEFC61B08682A941F8B170B82944FB3CEBBD12E37190853271B88018F55A30E788CA2EF944BB0DDB3BA7D08426D0825A040AF3D082DDCA238EAC5445D372891AE6AF11D7FB5";
//		String modulus ="D7DD644D9460387200D39BE3EE68E832D7B47B08A87BC49904A71CC37FF98D02357B6E051319B739641733366E8B40978E550FDC8E5C1AE95A0A05D5E49CB9CEA2F91CC3A77290E20157CAD972F80826176984FEAAA7ABBD4A0CE830751155F4BBEA647DCBE6FEBC2878883D3BF3D4923B0DCE2B100381135BAFA286B00E4481";    //客管系统秘钥
//        String exponent = "B33B38800DB582C86D9545B790097CDA522DA18643D6581B3138CBF22B3CF9EE9E977877302FC6E919090655A89D68A92DDDC4C8BD4F0E6D387C5FF203DA798EE96B6D8D6BCCE2E616D19A9CD110D58CB4430EB4FD3CE5C697F50025E5427336546ED232A4DF104267155549D87DEF99DF5865E13406AC19889E7E0F3C81B351";
		String modulus ="00e8eebc392535f86e5ab5754087bb19a8ea0255ddb293003a7f9ef1b4c3f88e82a3c733d0039c8dd3fdacba587017bf68507b22f6113564c6c7041c3363b631754c803fa2b919a74daeb1627f77400e8609105f4cf8227b9b5f5f9e468a010553bb7b9a56ca66f01ac8d96efab2746835933c2b95d9fd88aad03cc9f6e382f1f5";    //客管系统秘钥
		String exponent = "2fccf6315ff28065dd1589d751435313b7d9fcd6ff136da3939701910ffa4cfc80319bef5f1e5c7899813dc872505d4641e5d319de142ff71ed638174faa0ee1d82f18b210676f3337f6c585679afc1f93da784280907512648de3735c46de2512724d2e9908eb6e4d831f6745522ceaa4c1e2149a25475a53d57b4f143b2b61";
		
		// modulus =
		// "A48D3AA7253648A7B056188D8289F1DF50208451FAB4E713EBA6A13D98C8F8F55BF7C2C73380F1293D541FA7856CFE7E6B4065370087E93E42BED4072DB34CA621B01D901D86A6DE6006B3F58DC6C758D6923AE6795D7920B2C0A7727CEE037AE7F3C1301A7045ED2195ECCF031B75EC696EE1BC9F14DEC88656873B0FBC9437";
		// exponent =
		// "112B4331696A8E8E2091FB21D8BAF7E7AAFE998FCC2ECFE57E32F6A3ECAB1B7ECE47BDA4F734BEF4E497406E4437A91E1BA6AE68DCBF5190D37A01B976053D3BF54320F1776180B2DA350C4AD27E27185C2ED5453FBBD3406DCEAC9F5A898B0021567903797696F8405AB6241BDC03B5CF534E244D5C91C1CC436A3916BF79A1";

		String data ="{\\\"attach\\\":\\\"\\\",\\\"customerno\\\":\\\"0201906120000003306\\\",\\\"mchntid\\\":\\\"000000010000002\\\",\\\"phone\\\":\\\"TpQJySBjB554sWcosEgrgw==\\\",\\\"syssesq\\\":\\\"20190613201033884827\\\",\\\"termid\\\":\\\"00001310\\\",\\\"txndate\\\":\\\"20190613\\\",\\\"txntime\\\":\\\"201033\\\"}";
//		String reqtime = "201354";
//		String reqdate = "20190611";
//		String reqinstssn = "20190611201354067";
//		String reqinstid = "00000000";
//		String signCode = "reqinstid=" + reqinstid + "&reqinstssn=" + reqinstssn + "&reqdate="
//				+ reqdate + "&reqtime=" + reqtime + "&data=" + data;
		String signCode ="batchno=000000&cardinfo={\"cardsaledate\":\"20190417\",\"issueinst\":\"02273610\",\"carddeposit\":\"2000\",\"cardvaldate\":\"20180930\",\"cardbal\":\"00097919\",\"cardtype\":\"0201\",\"salemode\":\"00\",\"cardcnt\":\"004\",\"cardno\":\"3104990200020000084\",\"cardproduct\":\"0003\"}&data={\"random\":\"7D5B258D\",\"mac1\":\"86B63382\"}&instid=23000001&instseq=jtb20190702000011040&mchntid=000000010000002&netid=100000010000002&oprid=1000000000000008&termid=77777778&termseq=000006734&timestamp=20190702153714&transtype=02&txnamt=100&txncode=1162";
		String getSign = getSign(signCode, modulus, exponent);
		verifySign(signCode, getSign, modulus);
	}

	/**
	 * 
	 * @param signCode
	 *            需签名原数据
	 * @param getSign
	 *            签名数据
	 * @param modulus
	 *            获取的公钥系数
	 * @return true表示通过
	 */
	public static boolean verifySign(String signCode, String getSign, String modulus) {
		boolean signVerifyResult = false;
		try {
			RSAPublicKey publicKey = RsaUtil.loadPublicKey(modulus, "10001", 16);
			byte[] plainText = NumberStringUtil.hexStringToBytes(signCode);
			byte[] signData = NumberStringUtil.hexStringToBytes(getSign);
			signVerifyResult = SignatureUtil.signVerified(plainText, signData, publicKey, signAlgor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		System.out.println("验签结果：" + signVerifyResult);
		return signVerifyResult;
	}

	/**
	 * 签名
	 * 
	 * @param signCode
	 *            签名原数据
	 * @param modulus
	 *            系数
	 * @param exponent
	 *            指数
	 * @return
	 */
	public static String getSign(String signCode, String modulus, String exponent) {
		String sign = null;
		try {
			RSAPrivateKey privateKey = RsaUtil.loadPrivateKey(modulus, exponent, 16);
			byte[] plainText = NumberStringUtil.hexStringToBytes(signCode);
			byte[] signData = SignatureUtil.signature(plainText, privateKey, signAlgor);
			sign = NumberStringUtil.bytesToHexString(signData);

		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		System.out.println("签名：" + sign);
		return sign;
	}
}