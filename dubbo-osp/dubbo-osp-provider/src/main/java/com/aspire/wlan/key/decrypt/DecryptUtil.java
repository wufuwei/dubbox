package com.aspire.wlan.key.decrypt;

import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.aspire.wlan.key.util.CodesUtil;

public class DecryptUtil {
	private static final String ALGORITHM_DES = "DESede";
	public static final String CHART_SET = "utf8";
	/** 指定加密算法为RSA */
	public static String ALGORITHM_RSA = "RSA";
	/**
	 * 解密得到字符串。
	 * @param source
	 * @param HexKey
	 * @return
	 * @throws Exception
	 */
	public static String decrypt3DES(String source,  String HexKey) throws Exception{
		byte[] bytes=CodesUtil.hex2Bytes(source);
		return new String(decrypt3DES(bytes,loadKey3DES(HexKey)),CHART_SET);
	}



	/**
	 * 将Hex的key序列号成SecretKey
	 * 
	 * @param HexKey
	 * @return
	 * @throws IOException
	 */
	private static SecretKey loadKey3DES(String HexKey)
			throws IOException {
		byte[] bytes = CodesUtil.hex2Bytes(HexKey);
		SecretKey key = loadKey(bytes);
		return key;
	}
	/**
	 * 将对称秘钥byte[]转换为SecretKey;
	 * @param bytes
	 * @return
	 */
	private static SecretKey loadKey(byte[] bytes){
		SecretKey key = new SecretKeySpec(bytes, ALGORITHM_DES);
		return key;
	}
	
	/**
	 * 解密
	 * 
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	private static byte[] decrypt3DES(byte[] source, SecretKey key)
			throws Exception {
		Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}

	
	
	/**
	 * 对加密后的子串使用RSA的私钥进行解密。
	 * @param source 
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static String privateDecrypt2Base64(String source, String privateKey)
			throws Exception {
		byte[] bytesSource = CodesUtil.base642Bytes(source);

		byte[] bytesPrivateKey = CodesUtil.base642Bytes(privateKey);

		PrivateKey PrivateKeyObject = byte2PrivateKey(bytesPrivateKey);

		byte[] decryptBytes = privateDecrypt(bytesSource, PrivateKeyObject);
		return new String(decryptBytes, CHART_SET);

	}
	
	/**
	 * 将私钥byte[]转为PrivateKey对象。
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	private static PrivateKey byte2PrivateKey(byte[] privateKey) throws Exception{
		PKCS8EncodedKeySpec keySpec=new PKCS8EncodedKeySpec(privateKey);
		KeyFactory keyFactory=KeyFactory.getInstance(ALGORITHM_RSA);
		return keyFactory.generatePrivate(keySpec);
	}
	
	/**
	 * 解密方法 source： 源数据
	 */
	private static byte[] privateDecrypt(byte[] source,PrivateKey privateKey) throws Exception {
		Cipher cipher=Cipher.getInstance(ALGORITHM_RSA);
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return cipher.doFinal(source);
	}
}
