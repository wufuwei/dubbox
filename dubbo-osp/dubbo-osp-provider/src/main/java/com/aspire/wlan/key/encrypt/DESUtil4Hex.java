package com.aspire.wlan.key.encrypt;

import java.io.IOException;

import javax.crypto.SecretKey;

import com.aspire.wlan.key.util.CodesUtil;

/**
 * 密钥、加密后编码为16进制
 * @author wufuwei
 *
 */
public class DESUtil4Hex extends DESUtil{

	/**
	 * 加密
	 * 
	 * @param source 源子串信息
	 * @param HexKey Hex后的对称密钥。 
	 * @return
	 * @throws Exception
	 */
	public static String encrypt3DES2Hex(String source, String HexKey)
			throws Exception {
		return CodesUtil.bytes2Hex(encrypt3DES(source.getBytes(CHART_SET), loadKey3DES(HexKey)));
	}
	
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
	 * 产生64位对称秘钥，并转成Hex
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String gen3DesKey2Hex() throws Exception {
		return CodesUtil.bytes2Hex(gen3DesKey());

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





	public static void main(String[] args) throws Exception {
		String source="3KEUE87927F03 8DEJMD";
		System.out.println("source="+source);
		String HexKey = DESUtil4Hex.gen3DesKey2Hex();
		System.out.println("key="+HexKey);
		String des=DESUtil4Hex.encrypt3DES2Hex(source,HexKey);
		System.out.println("des="+des);
		source=DESUtil4Hex.decrypt3DES(des,HexKey);
		System.out.println("source="+source);
	}

}
