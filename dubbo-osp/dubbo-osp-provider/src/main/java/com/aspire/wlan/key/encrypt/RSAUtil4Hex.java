package com.aspire.wlan.key.encrypt;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import com.aspire.wlan.key.util.CodesUtil;

/**
 * RSA 工具类，编码为HEX
 * @author wufuwei
 *
 */
public class RSAUtil4Hex extends RSAUtil{

	/**
	 * 生成公钥；
	 * 
	 * @param keyPair
	 * @return
	 */
	public static String getPublicKey2Hex(KeyPair keyPair) {
		return CodesUtil.bytes2Hex(getPublicKey(keyPair));
	}

	/**
	 * 生成私钥；
	 * 
	 * @param keyPair
	 * @return
	 */
	public static String getPrivateKey2Hex(KeyPair keyPair) {
		return CodesUtil.bytes2Hex(getPrivateKey(keyPair));
	}

	/**
	 * 对源子串使用RSA的公钥加密。
	 * @param source
	 * @param publicKey
	 * @return
	 * @throws Exception
	 */
	public static String publicEncrypt2Hex(String source, String publicKey)
			throws Exception {
		byte[] bytes = source.getBytes(CHART_SET);
		byte[] bytesPublicKey = CodesUtil.hex2Bytes(publicKey);
		PublicKey publicKeyObject = byte2PublicKey(bytesPublicKey);
		byte[] encryptBytes = publicEncrypt(bytes, publicKeyObject);
		return CodesUtil.bytes2Hex(encryptBytes);

	}

	/**
	 * 对加密后的子串使用RSA的私钥进行解密。
	 * @param source 
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static String privateDecrypt2Hex(String source, String privateKey)
			throws Exception {
		byte[] bytesSource = CodesUtil.hex2Bytes(source);

		byte[] bytesPrivateKey = CodesUtil.hex2Bytes(privateKey);

		PrivateKey PrivateKeyObject = byte2PrivateKey(bytesPrivateKey);

		byte[] decryptBytes = privateDecrypt(bytesSource, PrivateKeyObject);
		return new String(decryptBytes, CHART_SET);

	}
	
	public static void main(String[] args) throws Exception{
		String source="4ce562e56b34a7e31ae867e2a77952d9d958294373b92a25";
		System.out.println("source="+source);
		KeyPair keyPair=RSAUtil4Hex.getKeyPair();
		String publicKey=RSAUtil4Hex.getPublicKey2Hex(keyPair);
		String privateKey=RSAUtil4Hex.getPrivateKey2Hex(keyPair);
		System.out.println("publicKey="+publicKey);
		System.out.println("privateKey="+privateKey);
		
		String publicEncrypt2Hex= RSAUtil4Hex.publicEncrypt2Hex(source,publicKey);
		System.out.println("publicEncrypt2Hex="+publicEncrypt2Hex);
		
		String privateDecrypt2Hex=privateDecrypt2Hex(publicEncrypt2Hex, privateKey);
		System.out.println("source="+privateDecrypt2Hex);
		
	}

}

