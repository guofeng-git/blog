package jieyi.accservice.restcontroller;

import jieyi.accservice.bizform.CommonData;
import jieyi.accservice.bizform.CommonDataResp;
import jieyi.accservice.bizform.Constant;
import jieyi.accservice.dao.SequenceMapper;
import jieyi.accservice.dao.TInfoAccountCardMapper;
import jieyi.accservice.dao.TInfoAccountMapper;
import jieyi.accservice.exception.BusinessException;
import jieyi.accservice.service.PropertyInfoService;

import jieyi.tools.commuclient_8583.form.data8583.MsgSendInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * 
 * @author Hongzhao.wu
 * @createDate 2019-10-11 09:32:45 基本公共服务类
 */
public class BaseController {

	private static Logger logger = LoggerFactory.getLogger(BaseController.class);


	@Autowired
	protected SequenceMapper sequenceMapper;
	@Autowired
	protected PropertyInfoService propertyInfo;
	@Autowired
	protected TInfoAccountMapper tInfoAccountMapper;
	@Autowired
	protected TInfoAccountCardMapper tInfoAccountCardMapper;


	protected static Gson gson = new Gson();

	/**
	 * 获取发送8583报文配置信息
	 * 
	 * @Title: genMsgSendInfo
	 * @Description:
	 * @param senTxn
	 * @param recvTxn
	 * @return
	 */
	public MsgSendInfo genMsgSendInfo(String senTxn, String recvTxn) {
		MsgSendInfo msgSendInfo = new MsgSendInfo();
		msgSendInfo.setNodeip(propertyInfo.getServerip());
		msgSendInfo.setNodeport(propertyInfo.getServerport());
		msgSendInfo.setSendtxn(senTxn);
		msgSendInfo.setRevtxn(recvTxn);
		msgSendInfo.setXmlpath(propertyInfo.getDatagramxmlpath());
		return msgSendInfo;
	}

	/**
	 * 验证日志
	 * 
	 * @Title: commonLog
	 * @Description:
	 * @param param
	 */
	public void commonLog(CommonData param) {
		logger.info("----------交易代码：" + param.getTxncode());
		logger.info("---------交易流水号：" + param.getSyssesq());
		logger.info("----------交易卡号：" + param.getCardno());
		logger.info("-------------------请求部分参数结束----------------");
	}

	/**
	 * 异常日志
	 * 
	 * @Title: commonLogEx
	 * @Description:
	 * @param e
	 * @param param
	 */
	public void commonLogEx(Exception e, CommonData param) {
		if (e instanceof BusinessException) {
			logger.error("ErrorCode: " + ((BusinessException) e).getErrorCode() + " | ErrorDesc:"
					+ ((BusinessException) e).getErrorMsg());
			param.setResponsecode(((BusinessException) e).getErrorCode());
			param.setResponsedesc(((BusinessException) e).getErrorMsg());
		} else {
			logger.error("Error:", e);
			param.setResponsecode(Constant.RSP_CODE_96.getCode());
			param.setResponsedesc(Constant.RSP_CODE_96.getName());
		}
		logger.info(e.getMessage());
	}

	/**
	 * 异常日志
	 * 
	 * @Title: commonLogEx
	 * @Description:
	 * @param e
	 * @param param
	 */
	public void commonLogEx(Exception e, CommonDataResp param) {
		if (e instanceof BusinessException) {
			logger.error("ErrorCode: " + ((BusinessException) e).getErrorCode() + " | ErrorDesc:"
					+ ((BusinessException) e).getErrorMsg());
			param.setResponsecode(((BusinessException) e).getErrorCode());
			param.setResponsedesc(((BusinessException) e).getErrorMsg());
		} else {
			logger.error("Error:", e);
			param.setResponsecode(Constant.RSP_CODE_96.getCode());
			param.setResponsedesc(Constant.RSP_CODE_96.getName());
		}
		logger.info(e.getMessage());
	}

	/**
	 * 异常日志
	 * 
	 * @Title: commonLogEx
	 * @Description:
	 * @param e
	 * @param param
	 */
	public CommonDataResp commonLogEx(Exception e) {
		CommonDataResp resp = new CommonDataResp();
		if (e instanceof BusinessException) {
			logger.error("ErrorCode: " + ((BusinessException) e).getErrorCode() + " | ErrorDesc:"
					+ ((BusinessException) e).getErrorMsg());
			resp.setResponsecode(((BusinessException) e).getErrorCode());
			resp.setResponsedesc(((BusinessException) e).getErrorMsg());
			resp.setTxninfo(JSON.toJSONString(resp));
		} else {
			logger.error("Error:", e);
			resp.setResponsecode(Constant.RSP_CODE_96.getCode());
			resp.setResponsedesc(Constant.RSP_CODE_96.getName());
			resp.setTxninfo(JSON.toJSONString(resp));
		}
		return resp;
	}
}
