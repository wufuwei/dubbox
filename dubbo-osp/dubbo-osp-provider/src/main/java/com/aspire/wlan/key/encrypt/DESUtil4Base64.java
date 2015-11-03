package com.aspire.wlan.key.encrypt;

import java.io.IOException;

import javax.crypto.SecretKey;

import com.aspire.wlan.key.util.CodesUtil;

/**
 * 密钥、加密后为Base64
 * @author wufuwei
 *
 */
public class DESUtil4Base64 extends DESUtil{
	

	/**
	 * 加密
	 * 
	 * @param source 源子串信息
	 * @param base64Key base64后的对称密钥。 
	 * @return
	 * @throws Exception
	 */
	public static String encrypt3DES2Base64(String source, String base64Key)
			throws Exception {
		return CodesUtil.bytes2Base64(encrypt3DES(source.getBytes(CHART_SET), loadKey3DES(base64Key)));
	}
	
	/**
	 * 解密得到字符串。
	 * @param source
	 * @param base64Key
	 * @return
	 * @throws Exception
	 */
	public static String decrypt3DES(String source,  String base64Key) throws Exception{
		byte[] bytes=CodesUtil.base642Bytes(source);
		return new String(decrypt3DES(bytes,loadKey3DES(base64Key)),CHART_SET);
	}

	/**
	 * 产生64位对称秘钥，并转成base64
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String gen3DesKey2Base64() throws Exception {
		return CodesUtil.bytes2Base64(gen3DesKey());

	}




	/**
	 * 将base64的key序列号成SecretKey
	 * 
	 * @param base64Key
	 * @return
	 * @throws IOException
	 */
	private static SecretKey loadKey3DES(String base64Key)
			throws IOException {
		byte[] bytes = CodesUtil.base642Bytes(base64Key);
		SecretKey key = loadKey(bytes);
		return key;
	}





	public static void main(String[] args) throws Exception {
		String source="3KEUE87927F03 8DEJMD";
		System.out.println("source="+source);
		String base64Key = DESUtil4Base64.gen3DesKey2Base64();
		System.out.println("key="+base64Key);
		String des=DESUtil4Base64.encrypt3DES2Base64(source,base64Key);
		System.out.println("des="+des);
		source=DESUtil4Base64.decrypt3DES(des,base64Key);
		
		System.out.println("source="+source);
	}

}
