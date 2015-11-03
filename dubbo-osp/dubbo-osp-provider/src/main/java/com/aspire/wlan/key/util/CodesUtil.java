package com.aspire.wlan.key.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class CodesUtil {

	/**
	 * 去掉回车，换回等字符。
	 * 注： \n 回车( ) \t 水平制表符( ) \s 空格(\u0008) \r 换行( )
	 * 
	 */

	public static String replaceBlank(String str) {
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}

	/**
	 * byte[] 转换为 base64，并去掉回车换回空格。
	 * 
	 * @param bytes
	 * @return
	 */

	public static String bytes2Base64(byte[] bytes) {
		BASE64Encoder base64Encoder = new BASE64Encoder();
		return replaceBlank(base64Encoder.encode(bytes));
	}
	
	/**
	 * base64解码为byte[]
	 * @param base64
	 * @return
	 * @throws IOException
	 */
	public static byte[] base642Bytes(String base64) throws IOException {
		BASE64Decoder base64Decoder = new BASE64Decoder();
		return base64Decoder.decodeBuffer(base64);
	}

	/**
	 * byte[] 转换为16进制字符
	 * 
	 * @param bytes
	 * @return
	 */
	public static String bytes2Hex(byte[] bytes) {
		StringBuilder hex = new StringBuilder();
		for (byte b : bytes) {
			boolean negative = false;
			if (b < 0) {
				negative = true;
			}
			int inte = Math.abs(b);
			if (negative) {
				inte = inte | 0x80;
			}
			String temp = Integer.toHexString(inte & 0XFF);
			if (temp.length() == 1) {
				hex.append("0");
			}
			hex.append(temp.toLowerCase());

		}
		return hex.toString();
	}

	/**
	 * 
	 * @param hex
	 * @return
	 */
	public static byte[] hex2Bytes(String hex) {
		byte[] bytes = new byte[hex.length() / 2];
		for (int i = 0; i < hex.length(); i = i + 2) {
			String subStr = hex.substring(i, i + 2);
			boolean negative = false;
			int inte = Integer.parseInt(subStr, 16);
			if (inte > 127) {
				negative = true;
			}
			if (inte == 128) {
				inte = -128;
			} else if (negative) {
				inte = 0 - (inte & 0x7F);
			}
			byte b = (byte) inte;
			bytes[i / 2] = b;
		}
		return bytes;
	}
}
