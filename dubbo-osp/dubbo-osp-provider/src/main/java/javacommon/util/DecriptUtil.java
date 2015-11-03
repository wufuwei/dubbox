package javacommon.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;

public class DecriptUtil {
	public static String SHA1ToLowerCase(String decript) {
        try {
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
 
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
	
	public static String SHA1ToUpperCase(String decript){
		return SHA1ToLowerCase(decript).toUpperCase();
	}
	public static void main(String[] args){
		String source="W8i2rsB*gG0wogRj%0iGLDU-r1kj4=mFlaXVOpfp201409291539061718极速飞车440113120002001星海传媒00000199201409291539020http://www.baidu.com";
		System.out.println("before decript String source="+source);
		String md5=DigestUtils.md5Hex(source)
				.toUpperCase();
		System.out.println("after MD5 String md5="+md5);
		String dis= DecriptUtil.SHA1ToUpperCase(md5);
		System.out.println("after decript String sign="+dis);

	}
}
