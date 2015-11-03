package com.aspire.wlan.key.tool;

import com.aspire.wlan.key.decrypt.DecryptUtil;

/**
 * 解密卡数据工具。
 * 
 * @author wufuwei
 * 
 */
public class CardDecryptedInstance {

	private String symmetricKey = null;

	public CardDecryptedInstance() {

	}

	/**
	 * 方式一：设置key。此方法在实现时，将使用privateKey对encryptKey进行解密，得到对称秘钥。
	 *  String privateKey 认证平台RSA生成的私钥，使用1024bit的密钥，并使用base64进行编码。
	 *  String encryptKey  使用认证平台RSA提供的公钥对“对称密钥”加密后的base64编码之后的密文，此数据来源于卡数据文件的“文件头”中的“EncryptKey”。
	 */

	public void setKey(String privateKey, String encryptKey) throws Exception {
		symmetricKey = DecryptUtil.privateDecrypt2Base64(encryptKey,
				privateKey);
		//System.out.println(symmetricKey);

	}

	/**
	 * 实现对单条卡数据解密。返回一条解密后的卡明文数据：卡号+空格+密码。 String sourceCardData
	 * 单条使用对称秘钥加密后的卡数据。如：8C5F3F7315B9308EE7E309CFD103EEEA4DCD98738808D530
	 */
	public String decryptedCardData(String sourceCardData) throws Exception {
		return DecryptUtil.decrypt3DES(sourceCardData, symmetricKey);

	}

	/**
	 * 方式二：设置对称秘钥key。 String symmetricKey 3DES对称密钥。
	 */

	public void setSymmetricKey(String symmetricKey) {
		this.symmetricKey = symmetricKey;
	}

	public static void main(String[] args) throws Exception {

		//使用公钥加密对称密钥的数据；相当于头文件中的EncryKey;
		String EncryptKey = "qC+zHWhiLEmsFSCVTpVCNndDjYMduGOzzzPq8p5sulnwTcvYijy3+4g/l9N7H7v2W0Y8LGLCXl4h8+cyTTcSc+YnFW3kmjypcrYHs9UHZH/pPnJrJNtl7B2kc+x3w0Mr4r/+zI/k5moENKuHFP6qdSRNA/iHzgkHWft/AAIZVbo=";
		
		//私钥；
		String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMq0zh9gt1vAn4jP7vIy3wUUzj4rzvj4VWcnQqJd8hlDGYAqjaakbbhd/PxQKQqWC04bJ80ngd7wRHyMShpYzCk0TBQXSim2HB24z8MrTLrf7TwFcJoy9unK7/aArdkFrX9BIVhhnySCRURLkrC9l3yqcX18nAce0br3+jQz9TpRAgMBAAECgYABWgVJ1kZCuV0W93P7b3VnPkVFytr9dAJ1xqA+Huw/WOAxp5b8Nnp40T+fmxU6+dcndSzlxE6sYuPCBNl1pYPu+1mZ6mml0qLq0WoPF4mgG/F2Patv3raEW3as30JI99x2L2qW8FMPPYqWahGaUWymKE1Bx3RzAnp/BMfFQnxutQJBAPv/pOiIwALwPH2H7zgQyrFLhZasJ7tCQoStiTAz1dKNHMRRrRgtmXqO15HM4CnQzjykTXuQKMyE2HuCwVS6bjcCQQDN7MqPq5mR7rBqN7blVxevLQcyng2eunhru35XahAAfqxfERJwsabMD36AWmJtt7H4+2tXBujojspOT5cKwpe3AkB9hEkcdbjF/ejzUbjqgRqkkoxYjyk/EXLWaSVy9+6h8B2K/2+rIlNXAz0GZzikO1fuRpw9VoGr1OOLKYaocC+jAkAEHO+q0PWfSZIyfOxlRkkN0atsImYJPpY7KKKMYmzxZZZRy8h/gbzgJIsVSzjeEiY23+az9UpfosJ9r+9HYr2fAkEAzQ9MGHvT8Wx3Wg2UVK1XpqS3/lFZiPEnFaFHpu4QB3cpXDxtyHM3h75c93SNG6zteAwW+2XS6vxlK6hhgn16Fg==";
		
		//加密后的卡信息数据；相当于txt文件中的逐条加密后的卡数据。
		String EncryptCard = "9241e4f0f98070e86f2743456f96757ac2481a1491aa8357";

		CardDecryptedInstance instance = new CardDecryptedInstance();

		/************* 方式一 *************************/
		// 设置私钥和加密后的对称秘钥；
		instance.setKey(privateKey, EncryptKey);
		// 开始逐条解密。
		String data = instance.decryptedCardData(EncryptCard);
		 System.out.println("data=" + data);

		 
		/************* 方式二 *************************/
		 //直接设置对称密钥。
		String symmetricKey="a137cb8c890b6b082675fdde7ab38cf60bd93b676b97ad07";
		// 设置私钥和加密后的对称秘钥；
		 instance.setSymmetricKey(symmetricKey);
		// 开始逐条解密。
		 data=instance.decryptedCardData(EncryptCard);
		 System.out.println("data=" + data);


	}

}
