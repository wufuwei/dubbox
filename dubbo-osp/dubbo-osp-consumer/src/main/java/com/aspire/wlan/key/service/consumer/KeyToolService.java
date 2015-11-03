package com.aspire.wlan.key.service.consumer;

import com.aspire.wlan.key.service.IKeyToolService;

public class KeyToolService {
	private IKeyToolService keyToolService;

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性 */

	public void setKeyToolService(IKeyToolService service) {
		this.keyToolService = service;
	}

	public IKeyToolService getKeyToolService() {
		return this.keyToolService;
	}

	/**
	 * 使用用户的公钥对对称密钥进行加密，得到加密后的对称密钥。
	 * 
	 * @param publicKey
	 * @return
	 */
	public String getEncryptKey(String publicKey) throws Exception {
		return keyToolService.getEncryptKey(publicKey);
	}

	/**
	 * 对卡数据进行加密；原理：实现方通过 encryptKey 找到从缓存中找到对应的对称密钥，再使用对称密钥对carinfo进行对称加密。
	 * 
	 * @param cardinfo
	 *            原始卡数据；
	 * @param encryptKey
	 *            通过方法 getEncryptKey(String publicKey)得到的加密后的对称密钥。
	 * @return
	 */
	public String getEncryptCardinfo(String cardinfo, String encryptKey)
			throws Exception {
		return keyToolService.getEncryptCardinfo(cardinfo, encryptKey);
	}
	
	public void removeSymmetricKey(String encryptKey){
		keyToolService.removeSymmetricKey(encryptKey);
	}
}
