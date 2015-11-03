package com.aspire.wlan.key.encrypt;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import com.aspire.wlan.key.util.CodesUtil;

/**
 * RSA 工具类，编码为Base64
 * @author wufuwei
 *
 */
public class RSAUtil4Base64 extends RSAUtil {
	/**
	 * 生成公钥；
	 * @param keyPair
	 * @return
	 */
	public static String getPublicKey2Base64(KeyPair keyPair) {
		return CodesUtil.bytes2Base64(getPublicKey(keyPair));
	}

	/**
	 * 生成私钥；
	 * 
	 * @param keyPair
	 * @return
	 */
	public static String getPrivateKey2Base64(KeyPair keyPair) {
		return CodesUtil.bytes2Base64(getPrivateKey(keyPair));
	}

	/**
	 * 对源子串使用RSA的公钥加密。
	 * @param source
	 * @param publicKey
	 * @return
	 * @throws Exception
	 */
	public static String publicEncrypt2Base64(String source, String publicKey)
			throws Exception {
		byte[] bytes = source.getBytes(CHART_SET);
		byte[] bytesPublicKey = CodesUtil.base642Bytes(publicKey);
		PublicKey publicKeyObject = byte2PublicKey(bytesPublicKey);
		byte[] encryptBytes = publicEncrypt(bytes, publicKeyObject);
		return CodesUtil.bytes2Base64(encryptBytes);

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
	
	public static void main(String[] args) throws Exception{
		
		String cardInfo="3KEUE87927F03 8DEJMD";
		System.out.println("source="+cardInfo);
		
		//生成对称秘钥；
		//String HexKey = DESUtil4Hex.gen3DesKey2Hex();
		
		String HexKey="a137cb8c890b6b082675fdde7ab38cf60bd93b676b97ad07";
		
		System.out.println("HexKey="+HexKey);
		
		//使用对称秘钥对卡信息进行加密。
		String cardEncry=DESUtil4Hex.encrypt3DES2Hex(cardInfo,HexKey);
		System.out.println("cardEncry="+cardEncry);
		
		
		
		//String source="4ce562e56b34a7e31ae867e2a77952d9d958294373b92a25";
		//System.out.println("source="+source);
	
		//KeyPair keyPair=RSAUtil4Base64.getKeyPair();
		//String publicKey=RSAUtil4Base64.getPublicKey2Base64(keyPair);
		//String privateKey=RSAUtil4Base64.getPrivateKey2Base64(keyPair);
		//System.out.println("publicKey="+publicKey);
		//System.out.println("privateKey="+privateKey);
		
		String publicKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDKtM4fYLdbwJ+Iz+7yMt8FFM4+K874+FVnJ0KiXfIZQxmAKo2mpG24Xfz8UCkKlgtOGyfNJ4He8ER8jEoaWMwpNEwUF0opthwduM/DK0y63+08BXCaMvbpyu/2gK3ZBa1/QSFYYZ8kgkVES5KwvZd8qnF9fJwHHtG69/o0M/U6UQIDAQAB";
		String privateKey="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMq0zh9gt1vAn4jP7vIy3wUUzj4rzvj4VWcnQqJd8hlDGYAqjaakbbhd/PxQKQqWC04bJ80ngd7wRHyMShpYzCk0TBQXSim2HB24z8MrTLrf7TwFcJoy9unK7/aArdkFrX9BIVhhnySCRURLkrC9l3yqcX18nAce0br3+jQz9TpRAgMBAAECgYABWgVJ1kZCuV0W93P7b3VnPkVFytr9dAJ1xqA+Huw/WOAxp5b8Nnp40T+fmxU6+dcndSzlxE6sYuPCBNl1pYPu+1mZ6mml0qLq0WoPF4mgG/F2Patv3raEW3as30JI99x2L2qW8FMPPYqWahGaUWymKE1Bx3RzAnp/BMfFQnxutQJBAPv/pOiIwALwPH2H7zgQyrFLhZasJ7tCQoStiTAz1dKNHMRRrRgtmXqO15HM4CnQzjykTXuQKMyE2HuCwVS6bjcCQQDN7MqPq5mR7rBqN7blVxevLQcyng2eunhru35XahAAfqxfERJwsabMD36AWmJtt7H4+2tXBujojspOT5cKwpe3AkB9hEkcdbjF/ejzUbjqgRqkkoxYjyk/EXLWaSVy9+6h8B2K/2+rIlNXAz0GZzikO1fuRpw9VoGr1OOLKYaocC+jAkAEHO+q0PWfSZIyfOxlRkkN0atsImYJPpY7KKKMYmzxZZZRy8h/gbzgJIsVSzjeEiY23+az9UpfosJ9r+9HYr2fAkEAzQ9MGHvT8Wx3Wg2UVK1XpqS3/lFZiPEnFaFHpu4QB3cpXDxtyHM3h75c93SNG6zteAwW+2XS6vxlK6hhgn16Fg==";
		System.out.println("privateKey="+privateKey);
		
		//使用公钥对对称秘钥进行加密；
		String publicEncrypt2Base64= RSAUtil4Base64.publicEncrypt2Base64(HexKey,publicKey);
		System.out.println("publicEncrypt2Base64="+publicEncrypt2Base64);
		
		//使用私钥对对称秘钥进行解密；
		String privateDecrypt2Base64=privateDecrypt2Base64(publicEncrypt2Base64, privateKey);
		System.out.println("HexKey="+privateDecrypt2Base64);
		
		cardInfo=DESUtil4Hex.decrypt3DES(cardEncry,privateDecrypt2Base64);
		System.out.println("cardInfo="+cardInfo);
	}

}
