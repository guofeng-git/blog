package test.qrCode;

import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.utils.HttpClientUtil;
import jieyi.accservice.utils.PubMethodUtil;
import jieyi.tools.util.DateUtil;
import jieyi.tools.util.StringUtil;

import com.google.gson.Gson;

/**
 * 二维码消费
 * 
 * @author Hongzhao.wu
 */

public class PayForQrCodeTest extends TestBase {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		String currentTime = DateUtil.getSystemDateTime("yyyyMMddHHmmss");
		String txndate = currentTime.substring(0, 8);
		String txntime = currentTime.substring(8, 14);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 余额查询
		Gson gson = new Gson();
		paramMap.put("mchntid", "000000010000002");
		paramMap.put("termid", "00001310");
		paramMap.put("syssesq", StringUtil.getRandomStringAccordingSystemtimeForNumberFlag(20, 0));
		paramMap.put("txndate", txndate);
		paramMap.put("txntime", txntime);
		String qrcode = "AQDxBL8T7omtM+FtpTtnBztE5cX1Oo/I4nPE+ylpzEqxNkoHsevAttxQ84mlDge7Q/bXk7+e22FTeO/Szp5fGlN29msgMDIwMTkxMTI2MDAwMDAwNTE3NQAEvxPuia0z4W2lO2cHO0TlxfU6j8jic8T7KWnMSrE2Sgex68C23FDziaUOB7tD9teTv57bYVN479LOnl8aU3b2a14T6wkXcCAgIAEHEBBYZGYnRIdXB1gD6Q+Hf+41sRKnasPYtnkcun/0WjVhjSU4DRa7+XbgNXqwDbKxFpVdHUZpjnKxtn80933p3+haMrUkXEzWapFkXhPosT/kCjhNyxz/Ry//4+0bSVFyDoVOb2/vmlHJh3RvbQT13nFIsBMRrM4/XQciNUhlZKy9TbcL15vZdnIGgcvdhrQ=";
		paramMap.put("qrcode", qrcode);
		paramMap.put("txnamt", "100");
		paramMap.put("ordid", "");
		paramMap.put("attach", "");
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
		String url = "http://127.0.0.1:28090/acc/payForQrCode";
//		String url = "http://172.17.20.15:28090/acc/payForQrCode";


		String resultJson = HttpClientUtil.httpPost(url, param);
		System.out.print("返回报文：" + resultJson);

	}
}
