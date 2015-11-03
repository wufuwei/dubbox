package com.aspire.wlan.key.service.impl;

import redis.clients.jedis.JedisCluster;

import com.aspire.redis.RedisTemplate;
import com.aspire.wlan.key.encrypt.DESUtil4Hex;
import com.aspire.wlan.key.encrypt.RSAUtil4Base64;
import com.aspire.wlan.key.service.IKeyToolService;

public class KeyToolService implements IKeyToolService {
	private String hexKey = null;

	private RedisTemplate redisTemplate = null;

	public void setRedisTemplate(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	private JedisCluster jedisCluster = null;

	public void setJedisCluster(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

	@Override
	public String getEncryptKey(String publicKey) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("jedisCluster=" + jedisCluster);
			System.out.println("redisTemplate=" + redisTemplate);

			hexKey = DESUtil4Hex.gen3DesKey2Hex();
			String publicEncrypt2Base64 = RSAUtil4Base64.publicEncrypt2Base64(
					hexKey, publicKey);
			System.out.println("publicEncrypt2Base64=" + publicEncrypt2Base64);

			String key = jedisCluster.set(publicEncrypt2Base64, hexKey);
			System.out.println("jedis key=" + key);
			return publicEncrypt2Base64;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}

	}

	@Override
	public String getEncryptCardinfo(String cardinfo, String encryptKey)
			throws Exception {
		// TODO Auto-generated method stub
		try {
			long start = System.currentTimeMillis();
			hexKey = jedisCluster.get(encryptKey);
			System.out.println("hexkey=" + hexKey + ",time="
					+ (System.currentTimeMillis() - start));
			String cardEncry = DESUtil4Hex.encrypt3DES2Hex(cardinfo, hexKey);
			System.out.println("cardEncry=" + cardEncry + ",time="
					+ (System.currentTimeMillis() - start));

			jedisCluster.set(cardEncry, cardEncry);

			return cardEncry;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	@Override
	public void removeSymmetricKey(String encryptKey) {
		try {
			jedisCluster.del(encryptKey);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
