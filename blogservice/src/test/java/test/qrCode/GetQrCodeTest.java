package test.qrCode;

import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.utils.AESUtil;
import jieyi.accservice.utils.HttpClientUtil;
import jieyi.accservice.utils.PubMethodUtil;
import jieyi.tools.util.DateUtil;
import jieyi.tools.util.StringUtil;

import com.google.gson.Gson;

/**
 * @author Hongzhao.wu
 */

public class GetQrCodeTest extends TestBase {

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
		String phone = AESUtil.encrypt("00112233445566778899AABBCCDDEEFF", "18971672625");
		System.out.println(phone);
		paramMap.put("phone", phone);
		paramMap.put("acctype", "00");
		paramMap.put("attach", "");
		String json = gson.toJson(paramMap);

		Map<String, Object> param = new HashMap<String, Object>();
		String getSignCode = getSignCode(json);
		param.put("txninfo", json);
		param.put("signcode", getSignCode);
//		 String data = gson.toJson(param);
//		 System.out.println(data);
//		boolean checkSign = PubMethodUtil.checkSign(json, getSignCode, moudules, pubKey);
//		System.out.println(checkSign);
//		if (!checkSign) {
//			return;
//		}
//		 String url = "http://172.17.20.15:28090/acc/getQrCode";
		String url = "http://127.0.0.1:28090/acc/getQrCode";
		String resultJson = HttpClientUtil.httpPost(url, param);
		System.out.print("返回报文：" + resultJson);
		
//		   String prik = "229FC9127C0AA2170B8BAEAD8E4308F2F680E7C683C45C5F18F852FD59B0FB97";
//
//		    String pubk = "04498E7BB9C0E756BA9322493EF9EC6D7DD7CC930E21895AE3CE00430E0D756E3942E863860008372E0E07F34059224EACA38F774D05155A2B7B58F9120A966458";
//
//		    System.out.println("国密私钥："+prik.length());
//		    System.out.println("国密公钥："+pubk.length());
//		    
//		    String modulus = "8B6D8CAE9C9494FC1AE3C90E5869111447FA19F66F62D904787C973862D08B0056CA891ECA0CA7CF5D38407BA7AF8FC9A83624CDC46B9A47B0FEBAD0FC730D80C7C1CA1088731D758C6D26A3A2DF7BD7634EEA107B6D752609A16C9C671758A853135214425C58B0DD25779DFB070B08817F0828C72BEF11A5D7F998D0F81D49";
//		    String exponent="4782B76DF3372DB6A3E00285CE088D4EF69FAAE33F3BD68CB9734568111E5EBC9CC7224EDD58625533BD9F2D0CD3398F372C15F24774DCDB3A475BEFC61B08682A941F8B170B82944FB3CEBBD12E37190853271B88018F55A30E788CA2EF944BB0DDB3BA7D08426D0825A040AF3D082DDCA238EAC5445D372891AE6AF11D7FB5";
//
//		    System.out.println(modulus.length());
//		    System.out.println(exponent.length());
//		System.out.println("E90F877FEE35B112A76AC3D8B6791CBA7FF45A35618D25380D16BBF976E0357AB00DB2B116955D1D46698E72B1B67F34F77DE9DFE85A32B5245C4CD66A91645E".length());
	}
}
