package jieyi.accservice.utils;

import jieyi.accservice.form.TParamMacposinfo;
import jieyi.tools.algorithmic.DesUtil;
import jieyi.tools.commuclient_8583.util.MacCalculator;

public class PinUtil {

	/**
	 * 
	 * @param cardNo
	 * @param password
	 * @param flag  true 带校验位的pinblock（存库）   false 不带校验位的pinblock（传输）
	 * @return
	 */
	public static String getPinBlock(String cardNo, String password,boolean flag){
		//4 - 14
		if(cardNo == null || cardNo.length() < 13){
			return null;
		}
		if(password == null || password.length() < 4 || password.length() > 14){
			return null;
		}
		String xor1 = "";
		if(flag ==true){
			xor1 = cardNo.substring(cardNo.length()-12, cardNo.length());
		}else{
			xor1 = cardNo.substring(cardNo.length()-1-12, cardNo.length()-1);
		}
		
		xor1 = NumberStringUtil.addLeftZero(xor1, 16);
		System.out.println("xor1="+xor1);
		String xor2 = NumberStringUtil.addLeftZero(password.length()+"", 2) + 
				NumberStringUtil.addRightChar(password, 14, "F");
		String xorResult = XorUtil.StringXor(xor1, xor2, 16);
		
		System.out.println("xor2="+xor2);
		return xorResult.toUpperCase();
	}
	/**
	 * 使用客户号转PIN，讲手机号加密的用户密码转为客户号加密的密文
	 * @param sourcePin  手机号加密的密码密文
	 * @param phone     补位后的手机号 如手机好位13140114977  则传入的位0000131401149771
	 * @param customerNo 客户号，客管系统返回的客户号
	 * @param pinkey    pinkey pinkey密文
	 * @param tmk    macpos表中存的终端主密钥
	 * @param tsk    终端系统密钥，一般存在配置文件中
	 * @return
	 */
	public static String  changePin(String sourcePin,String phone,String customerNo,String pinkey,String tmk,String tsk) {
		String targetPin ="";
		MacCalculator macCal = new MacCalculator();
		//解出pinkey明文
		String tmkEnc = macCal.StrDe3DES(tsk, tmk);
		String pinKeyEnc = macCal.StrDe3DES(tmkEnc, pinkey);
		//开始转PIN
		String pinData = DesUtil.desDecrypt(DesUtil.DESALG_3DES, pinKeyEnc, sourcePin);
		String phoneData = NumberStringUtil.addLeftZero(phone.substring(phone.length()-1-12,phone.length()-1), 16);
		String targetPinData =XorUtil.StringXor(pinData, phoneData, 16);
        String newCardNo = NumberStringUtil.addLeftZero(customerNo.substring(customerNo.length()-1-12, customerNo.length()-1), 16);
		targetPinData = XorUtil.StringXor(targetPinData, newCardNo, 16);
		targetPin = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinKeyEnc, targetPinData);
		return targetPin;
		
	}
	public static void main(String[] arg) throws Exception{
//		String cardNo = "0000189012356781";
//		String password = "123456";
//		String pinBlock = PinUtil.getPinBlock(cardNo, password,false);
//		System.out.println("pinBlock:"+pinBlock);
//		String XorData = cardNo.substring(cardNo.length()-12-1,cardNo.length()-1);
//		XorData = NumberStringUtil.addLeftZero(XorData, 16);
//		String xorResult = XorUtil.StringXor(pinBlock, XorData, 16);
//		System.out.println("xorResult:"+xorResult);
		MacCalculator macCal = new MacCalculator();
		// TODO Auto-generated method stub
		String tsk="6F186550AF0E78265154F726387E756C";
		//String tmk="7BF3FA2FCE6F7995C80E07A51AEFD447";
		//String tmk = "6D7B8148EBC93DF7D026B943F549F0F7"; //自己tmk
		String tmk = "7BF3FA2FCE6F7995C80E07A51AEFD447"; //zhengyi zhongduan 
		String pinkey="F21D64C83E344397D448294B0944C70C";  //郑奕终端
		//String pinkey= "7B41AD481406BC4B32D16435469F6B52";
		
		String tmkEnc = macCal.StrDe3DES(tsk, tmk);
		System.out.println("tmkEnc:"+tmkEnc);
		String pinKeyEnc = macCal.StrDe3DES(tmkEnc, pinkey);
		System.out.println("pinKeyEnc:"+pinKeyEnc);
		String pinData = PinUtil.getPinBlock("0000155565280311", "888888", false);
		String target = DesUtil.desEncrypt(DesUtil.DESALG_3DES, pinKeyEnc, pinData);
		System.out.println(target);
	}
}
