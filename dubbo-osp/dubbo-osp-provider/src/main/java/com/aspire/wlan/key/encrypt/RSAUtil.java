package com.aspire.wlan.key.encrypt;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

public class RSAUtil {
	
	/** 字符集编码 */
	public static final String CHART_SET = "utf8";
	/** 指定加密算法为RSA */
	public static String ALGORITHM_RSA = "RSA";
	/** 指定key的大小 */
	public static int KEYSIZE = 1024;


	/**
	 * 生成密钥对
	 */
	public static KeyPair getKeyPair() throws Exception {
		/** RSA算法要求有一个可信任的随机数源 */
		SecureRandom sr = new SecureRandom();
		/** 为RSA算法创建一个KeyPairGenerator对象 */
		KeyPairGenerator kpg = KeyPairGenerator.getInstance(ALGORITHM_RSA);
		/** 利用上面的随机数据源初始化这个KeyPairGenerator对象 */
		kpg.initialize(KEYSIZE, sr);
		/** 生成密匙对 */
		KeyPair keyPair = kpg.generateKeyPair();
		return keyPair;
	}

	
	/**
	 * 生成公钥；
	 * @param keyPair
	 * @return
	 */
	public static byte[] getPublicKey(KeyPair keyPair){
		 PublicKey publicKey = keyPair.getPublic();
		 return publicKey.getEncoded();
	}
	
	/**
	 * 生成私钥；
	 * @param keyPair
	 * @return
	 */
	public static byte[] getPrivateKey(KeyPair keyPair){
		 PrivateKey privateKey = keyPair.getPrivate();
		 return privateKey.getEncoded();
	}
	
	/**
	 * 加密方法 source： 源数据
	 */
	public static byte[] publicEncrypt(byte[] source,PublicKey publicKey) throws Exception {
		Cipher cipher=Cipher.getInstance(ALGORITHM_RSA);
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return cipher.doFinal(source);
	}

	/**
	 * 解密方法 source： 源数据
	 */
	public static byte[] privateDecrypt(byte[] source,PrivateKey privateKey) throws Exception {
		Cipher cipher=Cipher.getInstance(ALGORITHM_RSA);
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return cipher.doFinal(source);
	}
	
	/**
	 * 将私钥byte[]转为PrivateKey对象。
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static PrivateKey byte2PrivateKey(byte[] privateKey) throws Exception{
		PKCS8EncodedKeySpec keySpec=new PKCS8EncodedKeySpec(privateKey);
		KeyFactory keyFactory=KeyFactory.getInstance(ALGORITHM_RSA);
		return keyFactory.generatePrivate(keySpec);
	}
	
	/**
	 * 将公钥byte[]转为PublicKey对象。
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static PublicKey byte2PublicKey(byte[] publicKey) throws Exception{
		X509EncodedKeySpec keySpec=new X509EncodedKeySpec(publicKey);
		KeyFactory keyFactory=KeyFactory.getInstance(ALGORITHM_RSA);
		return keyFactory.generatePublic(keySpec);
	}
	
	
}
