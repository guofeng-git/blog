package jieyi.accservice.utils;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class RSAAssistUtil {
	public static String[] getKeyStringPair(int keyLen) throws Exception{
		KeyPair keyPair = RsaUtil.generateKey(keyLen);
		RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
		RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
		
		String modules = rsaPublicKey.getModulus().toString(16).toUpperCase();
		String privateExponent = rsaPrivateKey.getPrivateExponent().toString(16).toUpperCase();
		String[] sRet = new String[2];
		sRet[0] = modules;
		sRet[1] = privateExponent;
		
		return sRet;
	}
	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String args[]) throws Exception{
		String [] keypair = RSAAssistUtil.getKeyStringPair(1024);
		for(String str : keypair){
			System.out.println(str);
		}
	}
}
