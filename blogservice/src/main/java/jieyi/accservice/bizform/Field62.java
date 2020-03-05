package jieyi.accservice.bizform;

import org.apache.log4j.Logger;

import jieyi.accservice.utils.AESUtil;
import jieyi.tools.util.DateUtil;
import jieyi.tools.util.StringUtil;


/**
 * 8583 62域 
 * 
 * @author wei.feng
 * @since 2014-12-08
 */
public class Field62 {

	protected static Logger logger = Logger.getLogger(Field62.class);

	private String element0;
	private String element1;
	private String element2;
	private String element3;
	private String element4;
	private String element5;
	private String element6;
	private String element7;
	private String element8;
	private String element9;
	private String element10;
	private String element11;
	private String element12;
	private String element13;
	private String element14;
	private String element15;
	private String element16;
	private String element17;
	private String element18;

	private Field62_2 icdr_2_Object;

	public Field62_2 getIcdr_2_Object() {
		return icdr_2_Object;
	}

	public void setIcdr_2_Object(Field62_2 icdr_2_Object) {
		this.icdr_2_Object = icdr_2_Object;
	}

	public String getElement0() {
		return element0;
	}

	public void setElement0(String element0) {
		this.element0 = element0;
	}

	public String getElement1() {
		return element1;
	}

	public void setElement1(String element1) {
		this.element1 = element1;
	}

	public String getElement2() {
		return element2;
	}

	public void setElement2(String element2) {
		this.element2 = element2;
	}

	public String getElement3() {
		return element3;
	}

	public void setElement3(String element3) {
		this.element3 = element3;
	}

	public String getElement4() {
		return element4;
	}

	public void setElement4(String element4) {
		this.element4 = element4;
	}

	public String getElement5() {
		return element5;
	}

	public void setElement5(String element5) {
		this.element5 = element5;
	}

	public String getElement6() {
		return element6;
	}

	public void setElement6(String element6) {
		this.element6 = element6;
	}

	public String getElement7() {
		return element7;
	}

	public void setElement7(String element7) {
		this.element7 = element7;
	}

	public String getElement8() {
		return element8;
	}

	public void setElement8(String element8) {
		this.element8 = element8;
	}

	public String getElement9() {
		return element9;
	}

	public void setElement9(String element9) {
		this.element9 = element9;
	}

	public String getElement10() {
		return element10;
	}

	public void setElement10(String element10) {
		this.element10 = element10;
	}

	public String getElement11() {
		return element11;
	}

	public void setElement11(String element11) {
		this.element11 = element11;
	}

	public String getElement12() {
		return element12;
	}

	public void setElement12(String element12) {
		this.element12 = element12;
	}

	public String getElement13() {
		return element13;
	}

	public void setElement13(String element13) {
		this.element13 = element13;
	}

	public String getElement14() {
		return element14;
	}

	public void setElement14(String element14) {
		this.element14 = element14;
	}

	public String getElement15() {
		return element15;
	}

	public void setElement15(String element15) {
		this.element15 = element15;
	}

	public String getElement16() {
		return element16;
	}

	public void setElement16(String element16) {
		this.element16 = element16;
	}

	public String getElement17() {
		return element17;
	}

	public void setElement17(String element17) {
		this.element17 = element17;
	}

	public String getElement18() {
		return element18;
	}

	public void setElement18(String element18) {
		this.element18 = element18;
	}

	/**
	 * 用法三：余额查询
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse3(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement0(), 2));// 账户类型
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 2));// 密码类型

		return sb.toString();
	}

	/**
	 * 用法四：账户充值
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse4(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 2));// 账户类型
		return sb.toString();
	}

	/**
	 * 用法十：转入账户标识
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse10(Field62 field62Object) {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 2));// 转出账户类型
		sb.append(StringUtil.addLeftZero(filed62.getElement2(), 2));// 转入账户类型
		sb.append(StringUtil.addLeftZero(filed62.getElement3(), 16));// 转入卡卡号

		return sb.toString();
	}

	/**
	 * 用法12：账户卡挂失
	 * 
	 * @param field62Object
	 * @return
	 */
	public static String generalField62StrForUse12(Field62 field62Object, String key) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;

		// 证件姓名、证件号解密
		String hldname = filed62.getElement1();
		String hldppno = filed62.getElement3();

		if (hldname != null && !hldname.equals("")) {
			hldname = AESUtil.decrypt(AESUtil.AES_KEY, hldname);
		}
		if (hldppno != null && !hldppno.equals("")) {
			hldppno = AESUtil.decrypt(AESUtil.AES_KEY, hldppno);
		}
		sb.append(StringUtil.addRightSpaceForBytes(hldname, "GBK", 30));// 姓名
		sb.append(StringUtil.addLeftZero(filed62.getElement2(), 2));// 证件类型
		sb.append(StringUtil.addRightSpaceForBytes(hldppno, "GBK", 20));// 证件号码
		return sb.toString();
	}

	/**
	 * 用法13：账户卡解挂
	 * 
	 * @param field62Object
	 * @return
	 */
	public static String generalField62StrForUse13(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement1() == null ? "" : filed62.getElement1(), "GBK",
				30));// 姓名
		sb.append(StringUtil.addLeftZero(filed62.getElement2(), 2));// 证件类型
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement3() == null ? "" : filed62.getElement3(), "GBK",
				20));// 证件号码

		return sb.toString();
	}

	/**
	 * 用法四十一：账户注销
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse41(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 2));// 账户类型
		sb.append(StringUtil.addLeftZero(filed62.getElement2(), 2));// 证件类型
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement3() == null ? "" : filed62.getElement3(), "GBK",
				20));// 证件号码
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement4() == null ? "" : filed62.getElement4(), "GBK",
				30));// 姓名
		return sb.toString();
	}

	/**
	 * 用法三十：新密码
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse30(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;

		sb.append(StringUtil.addRightSpace(filed62.getElement1(), 1));// PIN标识
		sb.append(StringUtil.addRightSpace(filed62.getElement2(), 16));// 新PIN密文
		sb.append(StringUtil.addRightSpace(filed62.getElement3(), 1));// 实名信息标识
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement4() == null ? "" : filed62.getElement4(), "GBK",
				30));// 客户姓名
		sb.append(
				StringUtil.addRightSpaceForBytes(filed62.getElement5() == null ? "" : filed62.getElement5(), "GBK", 2));// 证件类型
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement6() == null ? "" : filed62.getElement6(), "GBK",
				20));// 证件号码
		return sb.toString();
	}

	/**
	 * 用法三十四：开户信息
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse34(Field62 field62Object) throws Exception {
		// 62域作为记名信息
		StringBuffer sb = new StringBuffer();
		Field62 filed62 = field62Object;
		sb.append(filed62.getElement1());// PIN标识
		sb.append(StringUtil.addLeftZero(filed62.getElement2(), 16));// 交易PIN密文
		sb.append(filed62.getElement3());// 实名信息标识
		sb.append(StringUtil.addLeftZero(filed62.getElement4(), 1));// 客户类型
		sb.append(StringUtil.addLeftZero(filed62.getElement5(), 2));// 证件类型
		sb.append(StringUtil.addRightSpace(filed62.getElement6(), 20));// 证件号码
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement7(), "GBK", 30));// 客户姓名
		sb.append(StringUtil.addRightSpace(filed62.getElement8(), 15));// 联系电话
		sb.append(StringUtil.addRightSpace(filed62.getElement9(), 40));// Email
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement10(), "GBK", 60));// 地址
		sb.append(StringUtil.addRightSpace(filed62.getElement11(), 30));// 员工号
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement12(), "GBK", 60));// 公司名称
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement13(), "GBK", 30));// 岗位名称
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement14(), "GBK", 60));// 所属部门
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement15(), "GBK", 30));// 尊称

		return sb.toString();
	}

	/**
	 * 用法三十九：月票充值
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse39(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 2));// 启用类型,04：公交次票,05：公交年票
		sb.append(StringUtil.addLeftZero(DateUtil.getSystemDateTime("yyyyMMdd"), 8));// 充次日期 N8 M YYYYMMDD
		sb.append(StringUtil.addLeftZero(DateUtil.getSystemDateTime("HHmmss"), 6));// 充次时间 N6 M HHMMSS
		sb.append(StringUtil.addLeftZero(filed62.getElement4(), 8));// 开始日期 N8 M 专用钱包生效日期。格式：YYYYMMDD
		sb.append(StringUtil.addLeftZero(filed62.getElement5(), 8));// 开始日期 N8 M 专用钱包生效日期。格式：YYYYMMDD
		sb.append(StringUtil.addLeftZero(filed62.getElement6() == null ? "" : filed62.getElement6(), 6));// 次数
		sb.append(StringUtil.addLeftZero(filed62.getElement7(), 8));// 发卡方代码 ans 8 M 备注 城市代码+0000
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement8(), "GBK", 4));// 行业代码 ans 4 M 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement9(), 2));// 启用标志 ans 2 M
		sb.append(StringUtil.addLeftZero(filed62.getElement10(), 8));// 卡片押金 ans 8 M 单位分
		sb.append(StringUtil.addLeftZero(filed62.getElement11(), 2));// 卡主类型 ans 2 M
		sb.append(StringUtil.addLeftZero(filed62.getElement12(), 2));// 卡子类型 ans 2 M
		sb.append(StringUtil.addLeftZero(filed62.getElement13(), 2));// 应用版本 ans 2 M
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement14(), "GBK", 20));// 应用序列号（卡号） ans 20 M 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement15(), 8));// 应用启动日期 ans 8 M
		sb.append(StringUtil.addLeftZero(filed62.getElement16(), 8));// 卡有效期 ans 8 M
		sb.append(StringUtil.addLeftZero(filed62.getElement17(), 2));// 卡应用类型 ans2 M 01：PBOC 1.0;03：M1
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement18(), "GBK", 32));// 应用序列号（卡号） ans 20 M 右补空格
		return sb.toString();
	}

	/**
	 * 用法四十：卡年检
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse40(Field62 field62Object) throws Exception {

		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 8));// 发卡方代码 ans 8 M 备注 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement2(), "GBK", 4));// 行业代码 ans 4 M 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement3(), 2));// 启用标志 ans 2 M
		sb.append(StringUtil.addLeftZero(filed62.getElement4(), 8));// 卡片押金 ans 8 M 单位分
		sb.append(StringUtil.addLeftZero(filed62.getElement5(), 2));// 卡主类型 ans 2 M
		sb.append(StringUtil.addLeftZero(filed62.getElement6(), 2));// 卡子类型 ans 2 M
		sb.append(StringUtil.addLeftZero(filed62.getElement7(), 2));// 应用版本 ans 2 M
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement8(), "GBK", 20));// 应用序列号（卡号） ans 20 M 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement9(), 8));// 应用启动日期 ans 8 M
		sb.append(StringUtil.addLeftZero(filed62.getElement10(), 8));// 卡新有效期 ans 8 M
		sb.append(StringUtil.addLeftZero(filed62.getElement11(), 8));// 卡原有效期 ans8 M
		sb.append(StringUtil.addLeftZero(filed62.getElement12(), 2));// 证件类型 ans2 M
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement13(), "GBK", 20));// 证件号码 ans20 M
		sb.append(StringUtil.addLeftZero(filed62.getElement14(), 1));// 是否有保险费 Ans1 M Y：是，N：否
		sb.append(StringUtil.addLeftZero("", 8));// 保险费 Ans8 C 单位分
		sb.append(StringUtil.addLeftZero("", 8));// 保险开始时间 n8 C 格式YYYYMMDD
		sb.append(StringUtil.addLeftZero("", 8));// 保险结束时间 n8 C 格式YYYYMMDD
		return sb.toString();
	}

	/**
	 * 客户信息修改
	 */
	public static String generalField62StrForUse38(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;

		sb.append(filed62.getElement1());// 持卡人信息标识
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement2(), "GBK", 30));// 客户姓名 ans30 M 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement3(), 2));// 证件类型 ans 2 M 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement4(), 20));// 证件号码 ans 8 M 右补空格
		sb.append(filed62.getElement5());// Y’-存在(仅在1次开户时有效)
		sb.append(StringUtil.addRightSpace(filed62.getElement6(), 15));// 联系电话 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement7(), 40));// Email ans 2 C 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement8(), "GBK", 60));// 地址 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement9(), 6));// 邮编 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement10(), 30));// 员工号 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement11(), "GBK", 60));// 公司名称 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement12(), "GBK", 30));// 岗位名称 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement13(), "GBK", 60));// 所属部门 ans 2 C 右补空格

		return sb.toString();
	}

	/**
	 * 用法十一：卡延期
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse11(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 field62 = field62Object;
		sb.append(field62.getElement1());// 新有效期
		sb.append(field62.getIcdr_2_Object().getF62_2_0());// 记名标识 'Y'
		sb.append(StringUtil.addRightSpaceForBytes(field62.getIcdr_2_Object().getF62_2_1(), "GBK", 30));// 客户姓名 ans30 M
																										// 右补空格
		sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_2(), 2));// 证件类型 ans 2 M 右补空格
		sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_3(), 20));// 证件号码 ans 8 M 右补空格
		// sb.append(field62.getIcdr_2_Object().getF62_2_4());//Y’-存在(仅在1次开户时有效)
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_5(),
		// 15));//联系电话 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_6(),
		// 40));//Email ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpaceForBytes(field62.getIcdr_2_Object().getF62_2_7(),"GBK",
		// 60));//地址 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_8(),
		// 6));//邮编 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_9(),
		// 30));//员工号 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpaceForBytes(field62.getIcdr_2_Object().getF62_2_10(),
		// "GBK", 60));//公司名称 ans 2 C 右补空格
		return sb.toString();
	}

	/**
	 * 用法十一：卡展期
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse12(Field62 field62Object) throws Exception {
		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 field62 = field62Object;
		// sb.append(field62.getElement1());//新有效期
		sb.append(field62.getIcdr_2_Object().getF62_2_0());// 记名标识 'Y'
		sb.append(StringUtil.addRightSpaceForBytes(field62.getIcdr_2_Object().getF62_2_1(), "GBK", 30));// 客户姓名 ans30 M
																										// 右补空格
		sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_2(), 2));// 证件类型 ans 2 M 右补空格
		sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_3(), 20));// 证件号码 ans 8 M 右补空格
		sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_4(), 15));// 联系电话 ans 2 C 右补空格
		// sb.append(field62.getIcdr_2_Object().getF62_2_4());//Y’-存在(仅在1次开户时有效)
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_6(),
		// 40));//Email ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpaceForBytes(field62.getIcdr_2_Object().getF62_2_7(),"GBK",
		// 60));//地址 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_8(),
		// 6));//邮编 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpace(field62.getIcdr_2_Object().getF62_2_9(),
		// 30));//员工号 ans 2 C 右补空格
		// sb.append(StringUtil.addRightSpaceForBytes(field62.getIcdr_2_Object().getF62_2_10(),
		// "GBK", 60));//公司名称 ans 2 C 右补空格
		return sb.toString();
	}

	/**
	 * 用法四十二：卡基本信息 售卡使用，非接口文档中的四十二用法
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse42(Field62 field62Object) throws Exception {

		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement1(), "GBK", 20));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_0(), 1));
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getIcdr_2_Object().getF62_2_1(), "GBK", 30));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_2(), 2));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_3(), 20));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_4(), 15));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_5(), 40));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_6(), 60));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_7(), 6));
		sb.append(StringUtil.addLeftZero(filed62.getIcdr_2_Object().getF62_2_8(), 15));
		sb.append(StringUtil.addLeftZero(filed62.getIcdr_2_Object().getF62_2_9(), 40));
		sb.append(StringUtil.addLeftZero(filed62.getIcdr_2_Object().getF62_2_10(), 40));
		sb.append(StringUtil.addRightSpace(filed62.getIcdr_2_Object().getF62_2_11(), 100));
		return sb.toString();
	}

	/**
	 * 用法四十二：月票预约信息，福州项目文档中的四十二用法
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUse43(Field62 field62Object) throws Exception {

		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addRightSpace(filed62.getElement1(), 12));// 产品号 N12 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement2(), "GBK", 30));// 客户姓名 ans30 M 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement3(), 2));// 证件类型 ans 2 M 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement4(), 20));// 证件号码 ans 8 M 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement5(), 15));// 联系电话 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement6(), 40));// Email地址 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement7(), 60));// 邮件地址 ans 2 C 右补空格
		sb.append(StringUtil.addRightSpace(filed62.getElement8(), 6));// 邮编（卡号） ans 20 C 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement9(), 15));// 手机号 ans 8 C 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement10(), 40));// QQ ans 8 C 右补空格
		sb.append(StringUtil.addLeftZero(filed62.getElement11(), 40));// 微信 ans2 C 右补空格
		sb.append(StringUtil.addRightSpaceForBytes(filed62.getElement12(), "GBK", 100));// 联系地址 ans2 C 右补空格
		return sb.toString();
	}

	/**
	 * 卡片相关信息域使用说明: 申请类交易请求
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUseCardMngReq(Field62 field62Object) {

		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 2));// 卡应用类型
		sb.append(StringUtil.addRightSpace(filed62.getElement2() == null ? "" : filed62.getElement2(), 30));// 卡面号
		sb.append(StringUtil.addRightSpace(filed62.getElement3() == null ? "" : filed62.getElement3(), 2));// 主卡类型
		sb.append(StringUtil.addRightSpace(filed62.getElement4() == null ? "" : filed62.getElement4(), 2));// 子卡类型
		sb.append(StringUtil.addRightSpace(filed62.getElement5() == null ? "" : filed62.getElement5(), 8));// 售卡日期
		sb.append(StringUtil.addRightSpace(filed62.getElement6() == null ? "" : filed62.getElement6(), 8));// 卡有效期
		sb.append(StringUtil.addLeftZero(filed62.getElement7() == null ? "" : filed62.getElement7(), 6));// 卡计数器
		sb.append(StringUtil.addLeftZero(filed62.getElement8() == null ? "" : filed62.getElement8(), 10));// 卡余额
		sb.append(StringUtil.addLeftZero(filed62.getElement9() == null ? "" : filed62.getElement9(), 8));// 押金
		sb.append(StringUtil.addLeftZero(filed62.getElement10() == null ? "" : filed62.getElement10(), 1));// 芯片损坏类别
		sb.append(StringUtil.addLeftZero(filed62.getElement11() == null ? "" : filed62.getElement11(), 1));// 卡面损坏类型
		sb.append(StringUtil.addLeftZero(filed62.getElement12() == null ? "" : filed62.getElement12(), 2));// 证件类型
		sb.append(StringUtil.addRightSpace(filed62.getElement13() == null ? "" : filed62.getElement13(), 20));// 证件号码
		sb.append(StringUtil.addRightSpace(filed62.getElement14() == null ? "" : filed62.getElement14(), 30));// 姓名
		sb.append(StringUtil.addRightSpace(filed62.getElement15() == null ? "" : filed62.getElement15(), 30));// 手机号

		return sb.toString();
	}

	/**
	 * 卡片相关信息域使用说明: 申请类交易结果获取
	 * 
	 * @throws Exception
	 **/
	public static String generalField62StrForUseCardMngGetResult(Field62 field62Object) {

		StringBuffer sb = new StringBuffer();
		// 62域的处理
		Field62 filed62 = field62Object;
		sb.append(StringUtil.addLeftZero(filed62.getElement1(), 20));// 申请单号
		sb.append(StringUtil.addLeftZero(filed62.getElement2(), 4));// 原申请交易类型
		sb.append(StringUtil.addLeftZero(filed62.getElement3(), 1));// 获取结果的结果类型
		return sb.toString();
	}

}
