package jieyi.accservice.bizform;

import org.apache.log4j.Logger;

import jieyi.tools.util.DateUtil;
import jieyi.tools.util.StringUtil;

/**
 * 8583 58域
 * 58 PBOC电子钱包标准的交易信息    IC(PBOC) Data Reserved
 * @author victor
 *
 */

public class Field58 {
	protected static Logger logger = Logger.getLogger(Field58.class);
	
	private String icdr_0 ; 
	private String icdr_1 ; 
	private String icdr_2 ; 
	private String icdr_3 ; 
	private String icdr_4 ; 
	private String icdr_5 ; 
	private String icdr_6 ; 
	private String icdr_7 ; 
	private String icdr_8 ;
	private String icdr_9 ;
	private String icdr_10 ;
	
	private Field58_7 icdr_7_Object;
	private Field58_2 icdr_2_Object;
	private Field58_3 icdr_3_Object;
	private Field58_9 icdr_9_Object;
	
	
	public Field58_2 getIcdr_2_Object() {
		return icdr_2_Object;
	}
	public void setIcdr_2_Object(Field58_2 icdr_2_Object) {
		this.icdr_2_Object = icdr_2_Object;
	}
	public String getIcdr_0() {
		return icdr_0;
	}
	public void setIcdr_0(String icdr_0) {
		this.icdr_0 = icdr_0;
	}
	public String getIcdr_1() {
		return icdr_1;
	}
	public void setIcdr_1(String icdr_1) {
		this.icdr_1 = icdr_1;
	}
	public String getIcdr_2() {
		return icdr_2;
	}
	public void setIcdr_2(String icdr_2) {
		this.icdr_2 = icdr_2;
	}
	public String getIcdr_3() {
		return icdr_3;
	}
	public void setIcdr_3(String icdr_3) {
		this.icdr_3 = icdr_3;
	}
	public String getIcdr_4() {
		return icdr_4;
	}
	public void setIcdr_4(String icdr_4) {
		this.icdr_4 = icdr_4;
	}
	public String getIcdr_5() {
		return icdr_5;
	}
	public void setIcdr_5(String icdr_5) {
		this.icdr_5 = icdr_5;
	}
	public String getIcdr_6() {
		return icdr_6;
	}
	public void setIcdr_6(String icdr_6) {
		this.icdr_6 = icdr_6;
	}
	public String getIcdr_7() {
		return icdr_7;
	}
	public void setIcdr_7(String icdr_7) {
		this.icdr_7 = icdr_7;
	}
	public String getIcdr_8() {
		return icdr_8;
	}
	public void setIcdr_8(String icdr_8) {
		this.icdr_8 = icdr_8;
	}
	public String getIcdr_9() {
		return icdr_9;
	}
	public void setIcdr_9(String icdr_9) {
		this.icdr_9 = icdr_9;
	}
	public String getIcdr_10() {
		return icdr_10;
	}
	public void setIcdr_10(String icdr_10) {
		this.icdr_10 = icdr_10;
	}
	public Field58_7 getIcdr_7_Object() {
		return icdr_7_Object;
	}
	public void setIcdr_7_Object(Field58_7 icdr_7Object) {
		icdr_7_Object = icdr_7Object;
	}
	
	public Field58_3 getIcdr_3_Object() {
		return icdr_3_Object;
	}
	public void setIcdr_3_Object(Field58_3 icdr_3_Object) {
		this.icdr_3_Object = icdr_3_Object;
	}
	
	public Field58_9 getIcdr_9_Object() {
		return icdr_9_Object;
	}
	public void setIcdr_9_Object(Field58_9 icdr_9_Object) {
		this.icdr_9_Object = icdr_9_Object;
	}
	/**
	 * 用法一：电子钱包的圈存请求
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse1(Field58 field58Object) throws Exception{
		StringBuffer sb = new StringBuffer();
		//58域的处理
		Field58 filed58 = field58Object;
		sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 16));//发卡方标识
		sb.append(StringUtil.addRightZero(filed58.getIcdr_2(), 20));//卡片应用序列号
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_3(), 8));//伪随机数
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_4(),"GBK", 2));//密钥索引号
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_5(),"GBK", 2));//密钥版本号
		String icdr6 = StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_6())), 4);
		logger.debug("钱包充值的卡计数器是："+icdr6);
		sb.append(icdr6.substring(icdr6.length()-4));//钱包交易序号
		sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_7_Object().getF58_7_1())), 8));//电子钱包的当前余额
		sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_7_Object().getF58_7_2())), 8));//当前交易的金额
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_3(), 2));//交易类型标识，TTI
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_4(), 12));//终端机编号
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_8(), 8));//MAC1
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_9(), 2));//算法标识
		return sb.toString();
	}
	
	/**
	 * 用法三：电子钱包圈存确认上送
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse3(Field58 field58Object) throws Exception{
		try{
			StringBuffer sb = new StringBuffer();
			//58域的处理
			Field58 filed58 = field58Object;
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 16));//发卡方标识
			sb.append(StringUtil.addRightZero(filed58.getIcdr_2(), 20));//卡片应用序列号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_3(), 8));//伪随机数
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_4(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_5(),"GBK", 2));//密钥版本号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_6())), 4));//钱包交易序号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_7_Object().getF58_7_1())), 8));//当前交易的金额
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_2(), 2));//交易类型标识，TTI
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_3(), 12));//终端机编号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_4(), 8));//交易日期
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_5(), 6));//交易时间
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_8(), 8));//TAC
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_9())), 8));//交易后金额
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_10(), 2));//算法标识
			return sb.toString();
		}catch(Exception e){
			return "";
		}
		
	}
	/**
	 * 用法四：电子钱包联机消费请求
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse4(Field58 field58Object) throws Exception{
		try{
			StringBuffer sb = new StringBuffer();
			//58域的处理
			Field58 filed58 = field58Object;
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 16));//发卡方标识
			sb.append(StringUtil.addRightZero(filed58.getIcdr_2(), 20));//卡片应用序列号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_3(), 8));//伪随机数
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_4(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_5(),"GBK", 2));//密钥版本号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_6())), 8));//终端交易计数器
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_7())), 4));//钱包联机交易序号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_8())), 8));//当前交易的金额
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_9_Object().getF58_9_1())), 8));//交易金额
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_9_Object().getF58_9_2(), 2));//交易类型标识，TTI
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_9_Object().getF58_9_3(), 12));//终端机编号			
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_10(), 2));//算法标识
			return sb.toString();
		}catch(Exception e){
			return "";
		}
		
	}
	/**
	 * 用法六：电子钱包消费上送
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse6(Field58 field58Object) throws Exception{
		try{
			StringBuffer sb = new StringBuffer();
			//58域的处理
			Field58 filed58 = field58Object;
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 16));//发卡方标识 
			sb.append(StringUtil.addRightZero(filed58.getIcdr_2(), 20));//卡片应用序列号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_3(), 8));//伪随机数
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_4(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_5(),"GBK", 2));//密钥版本号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_6())), 4));//钱包交易序号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_7_Object().getF58_7_1())), 8));//交易金额
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_2(), 2));//交易类型标识
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_3(), 12));//终端机编号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_4(), 8));//终端交易计数器
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_5(), 8));//交易日期
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7_Object().getF58_7_6(), 6));//交易时间
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_8(), 8));//TAC
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_9())), 8));//交易前金额
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_10(), 2));//算法标识
			return sb.toString();
		}catch(Exception e){
			return "";
		}
		
	}
	
	/**
	 * 用法七：APDU指令请求
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse7(Field58 field58Object) throws Exception{
		StringBuffer sb = new StringBuffer();
		//58域的处理
		Field58 filed58 = field58Object;
		try {
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 2));//发卡方标识
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2(),"GBK", 16));//发卡方标识
			sb.append(StringUtil.addRightZero(filed58.getIcdr_3(), 20));//卡片应用序列号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_4(),"GBK", 16));//伪随机数
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_5(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_6(),"GBK", 2));//密钥版本号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7(), 2));//算法标识
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_8(), 16));//Ats
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_9(), 4));//指令长度
		} catch (Exception e) {
			logger.error(e.getMessage());logger.error(e.toString(),e);
		}
		return sb.toString();
	}
	/**
	 * 用法八：APDU指令应答
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse8(Field58 field58Object) throws Exception{
		StringBuffer sb = new StringBuffer();
		//58域的处理
		Field58 filed58 = field58Object;
		try {
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志			
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 16));//发卡方标识
			sb.append(StringUtil.addRightZero(filed58.getIcdr_2(), 20));//卡片应用序列号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_3(),"GBK", 8));//伪随机数
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_4(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_5(),"GBK", 2));//密钥版本号
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_6(), 2));//算法标识
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7(), 4));//指令长度
		} catch (Exception e) {
			logger.error(e.getMessage());logger.error(e.toString(),e);
		}
		return sb.toString();
	}
	/**
	 * 用法九：M1卡操作请求
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse9(Field58 field58Object) throws Exception{
		StringBuffer sb = new StringBuffer();
		//58域的处理
		Field58 filed58 = field58Object;
		logger.debug("filed58.getIcdr_0:"+filed58.getIcdr_0());
		logger.debug("filed58.getIcdr_1:"+filed58.getIcdr_1());
		logger.debug("filed58.getIcdr_2:"+filed58.getIcdr_2());
		logger.debug("filed58.getIcdr_3:"+filed58.getIcdr_3());
		logger.debug("filed58.getIcdr_4:"+filed58.getIcdr_4());
		logger.debug("filed58.getIcdr_5:"+filed58.getIcdr_5());
		logger.debug("filed58.getIcdr_6:"+filed58.getIcdr_6());
		logger.debug("filed58.getIcdr_7:"+filed58.getIcdr_7());
		logger.debug("filed58.getIcdr_8:"+filed58.getIcdr_8());
		logger.debug("filed58.getIcdr_9:"+filed58.getIcdr_9());
		logger.debug("filed58.getIcdr_10:"+filed58.getIcdr_10());
		
		sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 2));//卡操作类型
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2(),"GBK", 16));//发卡方标识
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_3(), 16));//卡发行流水号
		sb.append(StringUtil.addRightZero(filed58.getIcdr_4(), 8));//卡csn
		sb.append(StringUtil.addRightZero(filed58.getIcdr_5(), 8));//卡认证码
		sb.append(StringUtil.addRightZero(filed58.getIcdr_6(), 12));//终端号
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_7(), 8));//终端流水号
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_8(), 4));//钱包交易序号
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_9(), 8));//交易金额
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_10(), 8));//钱包余额
		return sb.toString();
	}
	
	/**
	 * 用法十一：电子钱包/电子现金余额
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse11(Field58 field58Object) throws Exception{
		StringBuffer sb = new StringBuffer();
		//58域的处理
		Field58 filed58 = field58Object;
		sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
		sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_1())), 12));//交易前余额
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2_Object().getF58_2_1(),"GBK",8));//卡号
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2_Object().getF58_2_2(),"GBK", 8));//认证数据
		sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2_Object().getF58_2_3(),"GBK", 8));//卡认证码
		return sb.toString();
	}
	
	/**
	 * 用法十二：M1电子钱包消费上送
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse12(Field58 field58Object) {
		
		try{
			StringBuffer sb = new StringBuffer();
			//58域的处理
			Field58 filed58 = field58Object;
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2(),"GBK", 2));//密钥版本号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_3_Object().getF58_3_1())), 2));//交易类型标识
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_3_Object().getF58_3_2(), 8));//卡认证码
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_3_Object().getF58_3_3())), 8));//交易前卡内原额
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_3_Object().getF58_3_4())), 8));//交易金额 
			sb.append(DateUtil.getSystemDateTime("HHmmss"));//交易时间
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_3_Object().getF58_3_6())), 4));//钱包交易序号
			sb.append(DateUtil.getSystemDateTime("yyyyMMdd"));//交易日期 
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_5(), 12));// 终端机编号
			sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_6())), 8));//终端交易计数器
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_7(), 8));//TAC
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_8(), 8));//CSN
			sb.append(StringUtil.addLeftZero(filed58.getIcdr_9(), 2));//算法标识
			return sb.toString();
		}catch(Exception e){
			return "";
		}
	}

	/**
	 * 用法十三：卡片认证码上送
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse13(Field58 field58Object) {
		try{
			StringBuffer sb = new StringBuffer();
			//58域的处理
			Field58 filed58 = field58Object;
			sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 4));//用法标志
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_1(),"GBK", 2));//密钥索引号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2_Object().getF58_2_1(),"GBK",8));//卡号
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2_Object().getF58_2_2(),"GBK", 8));//认证数据
			sb.append(StringUtil.addRightSpaceForBytes(filed58.getIcdr_2_Object().getF58_2_3(),"GBK", 8));//卡认证码
			return sb.toString();
		}catch(Exception e){
			return "";
		}
	}
	
	/**
	 * 用法十四：外部接口转账
	 * @throws Exception 
	 * **/
	public static String generalField58StrForUse14(Field58 field58Object) throws Exception{
		StringBuffer sb = new StringBuffer();
		//58域的处理
		Field58 filed58 = field58Object;
		sb.append(StringUtil.addLeftZero(StringUtil.bytesToHexString(filed58.getIcdr_0().getBytes("GBK")), 42));//用法标志
		sb.append(StringUtil.addLeftZero(Integer.toHexString(Integer.parseInt(filed58.getIcdr_1())), 6));//交易前余额
		sb.append(StringUtil.addRightZero(filed58.getIcdr_2(), 20));//转入卡号
		sb.append(StringUtil.addLeftZero(filed58.getIcdr_3(), 3));//CVV2
		return sb.toString();
	}
	
}
