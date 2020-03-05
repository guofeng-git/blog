package test.qrCode;

import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.bizform.Constant;
import jieyi.accservice.utils.AESUtil;
import jieyi.accservice.utils.HttpClientUtil;
import jieyi.accservice.utils.PubMethodUtil;

import com.google.gson.Gson;

/**
 * 账户开户请求
 * 
 * @author Hongzhao.wu
 */

public class OpenAccTest extends TestBase {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();

		String phone = AESUtil.encrypt("00112233445566778899AABBCCDDEEFF", "15071437105");
		String holdname = AESUtil.encrypt("00112233445566778899AABBCCDDEEFF", "伍德祥");
		String holdno = AESUtil.encrypt("00112233445566778899AABBCCDDEEFF", "342822196703254525");

		// 账户开户
		Gson gson = new Gson();
		paramMap.put("mchntid", "000000080000001");
		paramMap.put("termid", "00001310");
		paramMap.put("syssesq", "005");
		paramMap.put("txndate", "20190711");
		paramMap.put("txntime", "165403");
		paramMap.put("phone", phone);
		paramMap.put("acctype", "00");
		paramMap.put("password", "");
		paramMap.put("pinchkamt", "10");
		paramMap.put("remindamt", "10");
		paramMap.put("isrealname", Constant.REAL_NAME_N.getCode());
		paramMap.put("holdname", "");
		paramMap.put("holdtype", "00");
		paramMap.put("holdno", "");
		paramMap.put("email", "");
		paramMap.put("telphone", "");
		paramMap.put("contactaddr", "");
		paramMap.put("postno", "");
		paramMap.put("address", "");
		paramMap.put("qq", "");
		paramMap.put("weixin", "");

		String json = gson.toJson(paramMap);
		Map<String, Object> param = new HashMap<String, Object>();
		String getSignCode = getSignCode(json);
		param.put("txninfo", json);
		param.put("signcode", getSignCode);

		boolean checkSign = PubMethodUtil.checkSign(json, getSignCode, moudules, pubKey);
		System.out.println(checkSign);
		if (!checkSign) {
			return;
		}
		String url = "http://127.0.0.1:28090/acc/openAccount";
//		String url = "http://172.17.20.15:28090/acc/openAccount";

		String resultJson = HttpClientUtil.httpPost(url, param);
		System.out.print("返回报文：" + resultJson);
	}

}
