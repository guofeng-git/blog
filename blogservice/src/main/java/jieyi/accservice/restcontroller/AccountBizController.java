package jieyi.accservice.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.Gson;

import jieyi.accservice.bizform.CommonData;
import jieyi.accservice.bizform.CommonDataResp;
import jieyi.accservice.dao.TParamMacposinfoMapper;
import jieyi.accservice.exception.BusinessException;
import jieyi.accservice.service.BlogService;

/**
 * 联机账户类接口
 * 
 * @author lacet
 *
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/acc")
public class AccountBizController extends BaseController {

	@Autowired
	protected TParamMacposinfoMapper tParamMacposinfoMapper;

	@Autowired
	protected BlogService blogService;

	private static Logger logger = LoggerFactory.getLogger(AccountBizController.class);
	protected static Gson gson = new Gson();

	/**
	 * 用户注册
	 * 
	 * @param param
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, produces = "text/html;charset=UTF-8", value = "/register")
	public String register(@RequestBody String jsonStr) {
		logger.info("register jsonStr: {}", jsonStr);
		Map<String, Object> map = new HashMap<String, Object>();
		CommonDataResp resp = new CommonDataResp();
		String returnJsonStr = "";
		try {
//			// 转换请求参数
			JSONObject jsonObj = JSONObject.parseObject(jsonStr, JSONObject.class);
			CommonData req = JSON.toJavaObject(jsonObj, CommonData.class);
			resp = blogService.register(req);
			map.put("data", resp.getData());
//			map.put("txninfo", resp.getTxninfo());
//			map.put("signcode", resp.getSigncode());
//			returnJsonStr = JSON.toJSONString(map, SerializerFeature.PrettyFormat);
//			logger.debug("返回的json串:" + returnJsonStr);
		} catch (BusinessException e) {
			resp = commonLogEx(e);
		} catch (Exception e1) {
			resp = commonLogEx(e1);
		}
		//map.put("txninfo", resp.getData());
		map.put("result", "0000");
		map.put("resultdesc", "成功");
		returnJsonStr = JSON.toJSONString(map, SerializerFeature.PrettyFormat);
		logger.info("register返回的json串:" + returnJsonStr);
		return returnJsonStr;
	}

	/**
	 * 
	 * 
	 * @param param
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, produces = "text/html;charset=UTF-8", value = "/uploadImage")
	public String uploadImage(@RequestBody String jsonStr) {
		logger.info("register jsonStr: {}", jsonStr);
		Map<String, Object> map = new HashMap<String, Object>();
		CommonDataResp resp = new CommonDataResp();
		String returnJsonStr = "";
		try {
//			// 转换请求参数
			JSONObject jsonObj = JSONObject.parseObject(jsonStr, JSONObject.class);
			CommonData req = JSON.toJavaObject(jsonObj, CommonData.class);
			resp = blogService.uploadImage(req);
			map.put("data", resp.getData());
//			map.put("txninfo", resp.getTxninfo());
//			map.put("signcode", resp.getSigncode());
//			returnJsonStr = JSON.toJSONString(map, SerializerFeature.PrettyFormat);
//			logger.debug("返回的json串:" + returnJsonStr);
		} catch (BusinessException e) {
			resp = commonLogEx(e);
		} catch (Exception e1) {
			resp = commonLogEx(e1);
		}
		//map.put("txninfo", resp.getData());
		
		returnJsonStr = JSON.toJSONString(map, SerializerFeature.PrettyFormat);
		logger.info("register返回的json串:" + returnJsonStr);
		return returnJsonStr;
	}


}
