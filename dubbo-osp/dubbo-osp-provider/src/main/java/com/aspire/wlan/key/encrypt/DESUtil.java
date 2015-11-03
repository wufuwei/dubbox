package com.aspire.wlan.key.encrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DESUtil {
	private static final String ALGORITHM_DES = "DESede";
	public static final String CHART_SET = "utf8";

	/**
	 * 加密
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] encrypt3DES(String source, SecretKey key)
			throws Exception {
		return encrypt3DES(source.getBytes(CHART_SET), key);
	}


	

	/**
	 * 产生对称秘钥。
	 * @return
	 * @throws Exception
	 */
	public static byte[] gen3DesKey() throws Exception {
		KeyGenerator keygen = KeyGenerator.getInstance(ALGORITHM_DES);
		SecretKey key = keygen.generateKey();
		byte[] keys = key.getEncoded();
		return keys;

	}




	/**
	 * 加密
	 * 
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] encrypt3DES(byte[] source, SecretKey key)
			throws Exception {
		Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}

	/**
	 * 解密
	 * 
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] decrypt3DES(byte[] source, SecretKey key)
			throws Exception {
		Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}

	/**
	 * 将对称秘钥byte[]转换为SecretKey;
	 * @param bytes
	 * @return
	 */
	public static SecretKey loadKey(byte[] bytes){
		SecretKey key = new SecretKeySpec(bytes, ALGORITHM_DES);
		return key;
	}

}
