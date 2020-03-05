package test;

import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.utils.HttpClientUtil;
import jieyi.accservice.utils.PubMethodUtil;
import jieyi.tools.util.DateUtil;
import jieyi.tools.util.StringUtil;

import com.google.gson.Gson;

/**
 * 账户注销申请
 * 
 * @author Feng.guo
 */

public class CloseAccApayTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Gson gson = new Gson();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("mchntid", "000000010000002");
		paramMap.put("termid", "00001310");
		paramMap.put("syssesq", "002");
		paramMap.put("txndate", "20190618");
		paramMap.put("txntime", "154401");
		paramMap.put("phone", "TpQJySBjB554sWcosEgrgw==");
		paramMap.put("acctype", "00");
		String json = gson.toJson(paramMap);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("txninfo", json);
		String moudules = "D7DD644D9460387200D39BE3EE68E832D7B47B08A87BC49904A71CC37FF98D02357B6E051319B739641733366E8B40978E550FDC8E5C1AE95A0A05D5E49CB9CEA2F91CC3A77290E20157CAD972F80826176984FEAAA7ABBD4A0CE830751155F4BBEA647DCBE6FEBC2878883D3BF3D4923B0DCE2B100381135BAFA286B00E4481";
		String privKey = "B33B38800DB582C86D9545B790097CDA522DA18643D6581B3138CBF22B3CF9EE9E977877302FC6E919090655A89D68A92DDDC4C8BD4F0E6D387C5FF203DA798EE96B6D8D6BCCE2E616D19A9CD110D58CB4430EB4FD3CE5C697F50025E5427336546ED232A4DF104267155549D87DEF99DF5865E13406AC19889E7E0F3C81B351";
		String pubKey = "10001";
		String signcode = PubMethodUtil.autograph(json, moudules, privKey);
		param.put("signcode", signcode);
		System.out.println("---签名数据：" + signcode);
		boolean returndata = PubMethodUtil.checkSign(json, signcode, moudules, pubKey);

		System.out.println("验签结果" + returndata);

		String url = "http://127.0.0.1:28090/acc/closeAccAplay";
		String resultJson = HttpClientUtil.httpPost(url, param);
		System.out.print("返回报文：" + resultJson);

	}
}
