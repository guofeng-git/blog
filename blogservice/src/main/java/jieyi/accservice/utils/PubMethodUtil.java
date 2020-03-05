package jieyi.accservice.utils;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.bizform.CommonData;
import jieyi.accservice.bizform.CommonDataResp;
import jieyi.accservice.bizform.Constant;
import jieyi.accservice.dao.TblBseMchntKeyMapper;
import jieyi.accservice.exception.BusinessException;
import jieyi.accservice.form.TblBseMchntKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.druid.util.StringUtils;
import com.google.gson.Gson;

/**
 * 
 * @ClassName: PubMethodUtil
 * @Description: 公共方法类
 * @author: guofeng
 * @date: 2019年5月22日 下午12:45:05
 *
 */
@Component
public class PubMethodUtil {

	@Autowired
	private static TblBseMchntKeyMapper tblBseMchntKeyMapper;

	public static String autograph(String sendData, String sysPubkey, String sysPriKey) throws Exception {
		// TODO 签名
		RSAPrivateKey privateKey;
		String signDataHex = null;
		try {
			// 1.加载私钥
			privateKey = loadPrivateKey(sysPubkey, sysPriKey, 16);
			// 2.计算签名
			Signature signature = Signature.getInstance("SHA1WithRSA");
			signature.initSign(privateKey);
			signature.update(NumberStringUtil.hexStringToBytes(sendData));
			byte[] signData = signature.sign();
			signDataHex = bytesToHexString(signData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return signDataHex;
	}

	public static String autographForJTB(String sendData, String sysPubkey, String sysPriKey) throws Exception {
		// TODO 签名
		RSAPrivateKey privateKey;
		String signDataHex = null;
		try {
			// 1.加载私钥
			privateKey = loadPrivateKey(sysPubkey, sysPriKey, 16);
			// 2.计算签名
			Signature signature = Signature.getInstance("SHA1WithRSA");
			signature.initSign(privateKey);
			signature.update(sendData.getBytes("utf-8"));
			byte[] signData = signature.sign();
			signDataHex = bytesToHexString(signData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return signDataHex;
	}

	public static boolean checkSign(String sendData, String signcode, String mchntPubkey, String mchntPubInd)
			throws Exception {
		System.out.println("sendData=" + sendData);
		// TODO 验签
		// 1.加载公钥
		RSAPublicKey publicKey = null;
		boolean verify = false;
		try {
			publicKey = loadPublicKey(mchntPubkey, mchntPubInd, 16);
			Signature signature = Signature.getInstance("SHA1WithRSA");
			signature.initVerify(publicKey);
			signature.update(NumberStringUtil.hexStringToBytes(sendData));
			verify = signature.verify(toByteArray(signcode));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return verify;
	}

	public static boolean PublicCheck(String sendData, String signcode, TblBseMchntKey tbmk) throws Exception {
		System.out.println("sendData=" + sendData);
		// 公共验签方法
		// 1.加载公钥
		RSAPublicKey publicKey = null;
		boolean verify = false;
		String mchntPubkey = tbmk.getMchntPubkey();
		String mchntPubInd = tbmk.getMchntPubind();
		try {
			publicKey = loadPublicKey(mchntPubkey, mchntPubInd, 16);
			Signature signature = Signature.getInstance("SHA1WithRSA");
			signature.initVerify(publicKey);
			signature.update(NumberStringUtil.hexStringToBytes(sendData));
			verify = signature.verify(toByteArray(signcode));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return verify;
	}

	/**
	 * 重载验签
	 * 
	 * @author Hongzhao.wu
	 * @createDate 2019-10-12 09:47:36
	 * @param sendData
	 * @param signcode
	 * @param pubKey
	 * @return
	 * @throws Exception
	 */
	public static boolean PublicCheck(String sendData, String signcode, String pubKey) throws Exception {
		// 公共验签方法
		// 1.加载公钥
		RSAPublicKey publicKey = null;
		boolean verify = false;
		String mchntPubkey = pubKey;
		try {
			publicKey = loadPublicKey(mchntPubkey, "10001", 16);
			Signature signature = Signature.getInstance("SHA1WithRSA");
			signature.initVerify(publicKey);
			signature.update(NumberStringUtil.hexStringToBytes(sendData));
			verify = signature.verify(toByteArray(signcode));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return verify;
	}

	/**
	 * 装载私钥
	 * 
	 * @param modulus
	 * @param exponent
	 * @param radix
	 *            10 或则 16进制
	 * @return
	 * @throws Exception
	 */
	public static RSAPrivateKey loadPrivateKey(String modulus, String exponent, int radix) throws Exception {
		BigInteger mod = new BigInteger(modulus, radix);
		BigInteger exp = new BigInteger(exponent, radix);
		RSAPrivateKeySpec priKeySpec = new RSAPrivateKeySpec(mod, exp);
		KeyFactory keyFac = KeyFactory.getInstance("RSA");
		return (RSAPrivateKey) keyFac.generatePrivate(priKeySpec);
	}

	/**
	 * 装载公钥
	 * 
	 * @param modulus
	 * @param exponent
	 * @param radix
	 *            10 或则 16进制
	 * @return
	 * @throws Exception
	 */
	public static RSAPublicKey loadPublicKey(String modulus, String exponent, int radix) throws Exception {
		BigInteger mod = new BigInteger(modulus, radix);
		BigInteger exp = new BigInteger(exponent, radix);
		RSAPublicKeySpec pubKeySpec = new RSAPublicKeySpec(mod, exp);
		KeyFactory keyFac = KeyFactory.getInstance("RSA");
		return (RSAPublicKey) keyFac.generatePublic(pubKeySpec);
	}

	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder("");
		if (src == null || src.length <= 0) {
			return "";
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString().toUpperCase();
	}

	public static byte[] toByteArray(String hexString) {
		if (StringUtils.isEmpty(hexString))
			return null;
		hexString = hexString.toLowerCase();
		final byte[] byteArray = new byte[hexString.length() >> 1];
		int index = 0;
		for (int i = 0; i < hexString.length(); i++) {
			if (index > hexString.length() - 1)
				return byteArray;
			byte highDit = (byte) (Character.digit(hexString.charAt(index), 16) & 0xFF);
			byte lowDit = (byte) (Character.digit(hexString.charAt(index + 1), 16) & 0xFF);
			byteArray[i] = (byte) (highDit << 4 | lowDit);
			index += 2;
		}
		return byteArray;
	}

	/**
	 * 签名方法
	 * 
	 * @Title: commomSignName
	 * @Description:
	 * @param param
	 * @return
	 */
	public static String commomSignName(Map<String, Object> response, TblBseMchntKey tbmk) {
		Gson gson = new Gson();
		String txninfo = gson.toJson(response);
		String signDataHex = "";
		// TODO 公共的方法取出系统方公钥和私钥
		String sysPubKey = tbmk.getSysPubkey();
		String sysPivKey = tbmk.getSysPrikey();
		try {
			signDataHex = autograph(txninfo, sysPubKey, sysPivKey);
		} catch (Exception e) {
			// commonLogEx(e, param);
			response.put("responsecode", Constant.RSP_CODE_97.getCode());
			response.put("responsedesc", Constant.RSP_CODE_97.getName());

		}
		CommonData param2 = new CommonData();
		// param2.setTxninfo(txninfo);
		param2.setSigncode(signDataHex);
		return gson.toJson(param2);
	}

	/**
	 * 签名方法2
	 * 
	 * @Title: commomSignName
	 * @Description:
	 * @param param
	 * @return
	 */
	public static String commomSignName3(CommonDataResp respData, TblBseMchntKey tbmk) {
		Gson gson = new Gson();
		String txninfo = gson.toJson(respData);
		String signDataHex = "";
		// TODO 公共的方法取出系统方公钥和私钥
		String sysPubKey = tbmk.getSysPubkey();
		String sysPivKey = tbmk.getSysPrikey();
		try {
			signDataHex = autograph(txninfo, sysPubKey, sysPivKey);
		} catch (Exception e) {
			throw new BusinessException(Constant.RSP_CODE_97.getCode(), Constant.RSP_CODE_97.getName());
		}
		return signDataHex;
	}

	/**
	 * 签名方法2
	 * 
	 * @Title: commomSignName
	 * @Description:
	 * @param param
	 * @return
	 */
	public static CommonData commomSignName2(CommonDataResp respData, TblBseMchntKey tbmk) {
		Gson gson = new Gson();
		String txninfo = gson.toJson(respData);
		String signDataHex = "";
		// TODO 公共的方法取出系统方公钥和私钥
		String sysPubKey = tbmk.getSysPubkey();
		String sysPivKey = tbmk.getSysPrikey();
		try {
			signDataHex = autograph(txninfo, sysPubKey, sysPivKey);
		} catch (Exception e) {
			// commonLogEx(e, param);
			respData.setResponsecode(Constant.RSP_CODE_97.getCode());
			respData.setResponsedesc(Constant.RSP_CODE_97.getName());

		}
		CommonData param2 = new CommonData();
		// param2.setTxninfo(txninfo);
		param2.setSigncode(signDataHex);
		return param2;
	}

	// 本地生成签名数据做测试时使用
	public static void main(String[] args) {
		Gson gson = new Gson();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("mchntid", "000000010000002");
		paramMap.put("termid", "00001310");
		paramMap.put("password", "404DC3AC59706852");
		paramMap.put("syssesq", "112");
		paramMap.put("txndate", "20191125");
		paramMap.put("txntime", "102205");
		paramMap.put("cardorg", "003");
		paramMap.put("cardno", "3104990200020000670");
		paramMap.put("oprresult", "00");
		paramMap.put("carddate", "20191125");
		paramMap.put("cardtime", "102228");
		paramMap.put("random", "41AB2D78");
		paramMap.put("txnamt", "500");
		paramMap.put("afteramt", "00001700");
		paramMap.put("txnseq", "2");
		paramMap.put("TAC", "00000000");
		paramMap.put("orgsyssesq", "001411");
		paramMap.put("refno", "000000005132");
		paramMap.put("orgbatchno", "0");
		paramMap.put("orgtermseq", "000001411");
		paramMap.put("orgtransdate", "20191125");
		paramMap.put("orgauthmode", "1");
		paramMap.put("orgauthinstid", "23000001");
		paramMap.put("phone", "57b2x/0j5kJObpP5UCfdyQ==");
		paramMap.put("attach", "");

		String json = gson.toJson(paramMap);
		// String json =
		// "{\"holdname\":\"aBv8Nece7aINpQ0EVR1nDg==\",\"holdno\":\"Pi2Eobzl0S1KGmtNDv1xH1wTO6Y8wdpwn0VZVCEeNZw=\",\"holdtype\":\"00\",\"mchntid\":\"000000010000002\",\"termid\":\"00001310\"}";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("txninfo", json);
		System.out.println("json=" + json);
		// json = gson.toJson(param);
		String sendData = gson.toJson(param);
		// String json =
		// "batchno=000000&cardinfo={\"cardsaledate\":\"20190417\",\"issueinst\":\"02273610\",\"carddeposit\":\"2000\",\"cardvaldate\":\"20180930\",\"cardbal\":\"00097919\",\"cardtype\":\"0201\",\"salemode\":\"00\",\"cardcnt\":\"004\",\"cardno\":\"3104990200020000084\",\"cardproduct\":\"0003\"}&data={\"random\":\"7D5B258D\",\"mac1\":\"86B63382\"}&instid=23000001&instseq=jtb20190702000011040&mchntid=000000010000002&netid=100000010000002&oprid=1000000000000008&termid=77777778&termseq=000006734&timestamp=20190702153714&transtype=02&txnamt=100&txncode=1162";
		String moudules = "D7DD644D9460387200D39BE3EE68E832D7B47B08A87BC49904A71CC37FF98D02357B6E051319B739641733366E8B40978E550FDC8E5C1AE95A0A05D5E49CB9CEA2F91CC3A77290E20157CAD972F80826176984FEAAA7ABBD4A0CE830751155F4BBEA647DCBE6FEBC2878883D3BF3D4923B0DCE2B100381135BAFA286B00E4481";
		String privKey = "B33B38800DB582C86D9545B790097CDA522DA18643D6581B3138CBF22B3CF9EE9E977877302FC6E919090655A89D68A92DDDC4C8BD4F0E6D387C5FF203DA798EE96B6D8D6BCCE2E616D19A9CD110D58CB4430EB4FD3CE5C697F50025E5427336546ED232A4DF104267155549D87DEF99DF5865E13406AC19889E7E0F3C81B351";
		String pubKey = "10001";
		try {
			String signdata = autograph(json, moudules, privKey);
			// String signdata = autographForJTB(json,moudules,privKey);
			// param.put("signcode",
			// "8B2DC8A84AD5672350A4903CD52C1B58148C92D1A0EB51F1E639F44E2160AAF219431C58936CAE98DF10AC5B5E3F4C63B639B14AD79637C74E9E59BCAEB3426F2ED90E2B533EA834BFB5F3751515A4CCF47200A86E47DC966CC9C30AF46D88598A08D7A7449E488320DA614FA19AA688C648489847F9944A1A01662ADB3617EA");
			System.out.println("---签名数据：" + signdata);
			boolean returndata = checkSign(json, signdata, moudules, pubKey);

			System.out.println(returndata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
