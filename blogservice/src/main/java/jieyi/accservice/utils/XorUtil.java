package jieyi.accservice.utils;
/**
 * 
 * @ClassName:     XorUtil
 * @Description:   异或计算工具类 支持按位异或和按字符串异或
 * @author:        lacet
 * @date:          2019年3月28日 下午12:45:34
 *
 */
public class XorUtil {
	
	public static byte[] BitXor(byte[] Data1, byte[] Data2, int Len) {
		int i;
		byte Dest[] = new byte[Len];

		for (i = 0; i < Len; i++){
			Dest[i] = (byte) (Data1[i] ^ Data2[i]);
		}

		return Dest;
	}
	
	public static String StringXor(String data1, String data2, int len) {
		byte[] Data1 = NumberStringUtil.hexStringToBytes(data1);
		byte[] Data2 = NumberStringUtil.hexStringToBytes(data2);
		
		int i;
		int Len = len / 2;
		byte Dest[] = new byte[Len];

		for (i = 0; i < Len; i++){
			Dest[i] = (byte) (Data1[i] ^ Data2[i]);
		}

		return NumberStringUtil.bytesToHexString(Dest);
	}
}
