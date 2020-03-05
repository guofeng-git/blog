package test;

import java.util.HashMap;
import java.util.Map;

import jieyi.accservice.utils.HttpClientUtil;
import jieyi.accservice.utils.PubMethodUtil;
import jieyi.tools.util.DateUtil;
import jieyi.tools.util.StringUtil;

import com.google.gson.Gson;

/**
 * 获取账户类型
 * 
 * @author Feng.guo
 */

public class AccQueryTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Gson gson = new Gson();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", "000002");
		paramMap.put("idno", "23019213812391231");
		paramMap.put("name", "杨亚辉");
		paramMap.put("sex", "男");
		paramMap.put("phone", "17721345566");
		paramMap.put("password", "888888");
		paramMap.put("idtype", "01");

		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", gson.toJson(paramMap));
		String url = "http://127.0.0.1:28090/acc/register";
		String resultJson = HttpClientUtil.httpPost(url, map);
		System.out.print("返回报文：" + resultJson);

	}
}
