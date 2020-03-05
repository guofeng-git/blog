package jieyi.accservice.utils;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;

public class RsaUtil {
	private static String RSA_KEY_TYPE = "RSA";

	/**
	 * 产生公私密钥对
	 * 
	 * @param initLen
	 *            密钥长度，范围：512～2048
	 * @return
	 * @throws Exception
	 */
	public static KeyPair generateKey(int initLen) throws Exception {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance(RSA_KEY_TYPE);
		keyGen.initialize(initLen);
		KeyPair keyPair = keyGen.generateKeyPair();
		return keyPair;
	}

	/**
	 * 装载公钥
	 * 
	 * @param modulus
	 * @param exponent
	 * @param radix
	 *            10 或则 16进制
	 * @return
	 * @throws Exception
	 */
	public static RSAPublicKey loadPublicKey(String modulus, String exponent, int radix) throws Exception {
		BigInteger mod = new BigInteger(modulus, radix);
		BigInteger exp = new BigInteger(exponent, radix);
		RSAPublicKeySpec pubKeySpec = new RSAPublicKeySpec(mod, exp);
		KeyFactory keyFac = KeyFactory.getInstance(RSA_KEY_TYPE);
		return (RSAPublicKey) keyFac.generatePublic(pubKeySpec);
	}

	/**
	 * 装载私钥
	 * 
	 * @param modulus
	 * @param exponent
	 * @param radix
	 *            10 或则 16进制
	 * @return
	 * @throws Exception
	 */
	public static RSAPrivateKey loadPrivateKey(String modulus, String exponent, int radix) throws Exception {
		BigInteger mod = new BigInteger(modulus, radix);
		BigInteger exp = new BigInteger(exponent, radix);
		RSAPrivateKeySpec priKeySpec = new RSAPrivateKeySpec(mod, exp);
		KeyFactory keyFac = KeyFactory.getInstance(RSA_KEY_TYPE);
		return (RSAPrivateKey) keyFac.generatePrivate(priKeySpec);
	}

	/**
	 * 公钥加密
	 */
	public static byte[] publicKeyEncrypt(String algor, String mode, String padding, RSAPublicKey rsaPublicKey,
			byte[] plainText) throws Exception {
		if (algor == null || algor.equals("")) {
			algor = "RSA";
		}
		if (mode == null || mode.equals("")) {
			mode = "ECB";
		}
		if (padding == null || padding.equals("")) {
			padding = "PKCS1Padding";
		}
		String cipherAlgor = algor + "/" + mode + "/" + padding;
		Cipher cipher = Cipher.getInstance(cipherAlgor);
		cipher.init(Cipher.ENCRYPT_MODE, rsaPublicKey);
		byte[] cipherText = cipher.doFinal(plainText);
		return cipherText;
	}

	/**
	 * 私钥解密
	 */
	public static byte[] privateKeyDecrypt(String algor, String mode, String padding, RSAPrivateKey rsaPrivateKey,
			byte[] cipherText) throws Exception {
		if (algor == null || algor.equals("")) {
			algor = "RSA";
		}
		if (mode == null || mode.equals("")) {
			mode = "ECB";
		}
		if (padding == null || padding.equals("")) {
			padding = "PKCS1Padding";
		}
		String cipherAlgor = algor + "/" + mode + "/" + padding;
		Cipher cipher = Cipher.getInstance(cipherAlgor);
		cipher.init(Cipher.DECRYPT_MODE, rsaPrivateKey);
		byte[] plainText = cipher.doFinal(cipherText);
		return plainText;
	}

	/**
	 * 私钥加密
	 */
	public static byte[] privateKeyEncrypt(String algor, String mode, String padding, RSAPrivateKey rsaPrivateKey,
			byte[] cipherText) throws Exception {
		if (algor == null || algor.equals("")) {
			algor = "RSA";
		}
		if (mode == null || mode.equals("")) {
			mode = "ECB";
		}
		if (padding == null || padding.equals("")) {
			padding = "PKCS1Padding";// PKCS1Padding
		}
		String cipherAlgor = algor + "/" + mode + "/" + padding;
		Cipher cipher = Cipher.getInstance(cipherAlgor);
		cipher.init(Cipher.ENCRYPT_MODE, rsaPrivateKey);
		byte[] plainText = cipher.doFinal(cipherText);
		return plainText;
	}
}
