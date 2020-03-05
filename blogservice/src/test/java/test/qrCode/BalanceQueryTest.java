package test.qrCode;

import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.utils.AESUtil;
import jieyi.accservice.utils.HttpClientUtil;
import jieyi.accservice.utils.PubMethodUtil;
import jieyi.tools.util.StringUtil;

import com.google.gson.Gson;

/**
 * @author Hongzhao.wu
 */

public class BalanceQueryTest extends TestBase {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 余额查询
		Gson gson = new Gson();
		paramMap.put("mchntid", "000000010000002");
		paramMap.put("termid", "00001310");
		paramMap.put("syssesq", StringUtil.getRandomStringAccordingSystemtimeForNumberFlag(20, 0));
		paramMap.put("txndate", "20190618");
		paramMap.put("txntime", "19300501");
		String phone = AESUtil.encrypt("00112233445566778899AABBCCDDEEFF", "18655952993");
		System.out.println(phone);
		paramMap.put("phone", phone);
		paramMap.put("acctype", "01");
		paramMap.put("password", "36849EF30E431D36");// PinUtil
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
		String url = "http://127.0.0.1:28090/acc/balanceQuery";
		String resultJson = HttpClientUtil.httpPost(url, param);
		System.out.print("返回报文：" + resultJson);
	}

}
