package com.aspire.redis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import redis.clients.jedis.JedisCluster;

@ContextConfiguration(locations = { "classpath:META-INF/spring/dubbo-redis-provider.xml" })
public class RedisTemplateTest extends AbstractJUnit4SpringContextTests {

	RedisTemplate redisTemplate=null;
	JedisCluster jc=null;
	@Before
	public void startup(){
		this.redisTemplate=(RedisTemplate)applicationContext.getBean("redisTemplate");
		this.jc=(JedisCluster)applicationContext.getBean("jedisClusterMutil");
		System.out.println("jc="+jc);
		for(int i=0;i<10000;i++){
			System.out.println(jc.set("key-"+i, "valueawfw-"+i));
		}
		
		for(int i=0;i<10000;i++){
			System.out.println(jc.get("key-"+i));
		}
	}
	
	@Test
	public void testExpire() {
		jc.expire("test", 5);
		
	}

	@Test
	public void testExpireAt() {
		
	}

	@Test
	public void testTrimList() {
		
	}

	@Test
	public void testCountSet() {
		
	}

	@Test
	public void testAddSetStringIntStringArray() {
		
	}

	@Test
	public void testAddSetStringStringArray() {
		
	}

	@Test
	public void testContainsInSet() {
		
	}

	@Test
	public void testGetSet() {
		
	}

	@Test
	public void testRemoveSetValue() {
		
	}

	@Test
	public void testRemoveListValueStringListOfString() {
		
	}

	@Test
	public void testRemoveListValueStringLongListOfString() {
		
	}

	@Test
	public void testRemoveListValueStringLongString() {
		
	}

	@Test
	public void testRangeList() {
		
	}

	@Test
	public void testCountList() {
		
	}

	@Test
	public void testAddListStringIntStringArray() {
		
	}

	@Test
	public void testAddListStringStringArray() {
		
	}

	@Test
	public void testAddListStringListOfString() {
		
	}

	@Test
	public void testGetList() {
		
	}

	@Test
	public void testSetHSet() {
		
	}

	@Test
	public void testGetHSet() {
		
	}

	@Test
	public void testDelHSetStringString() {
		
	}

	@Test
	public void testDelHSetStringStringArray() {
		
	}

	@Test
	public void testExistsHSet() {
		
	}

	@Test
	public void testScanHSet() {
		
	}

	@Test
	public void testHvals() {
		
	}

	@Test
	public void testHkeys() {
		
	}

	@Test
	public void testLenHset() {
		
	}

	@Test
	public void testSetSortedSet() {
		
	}

	@Test
	public void testGetSoredSet() {
		
	}

	@Test
	public void testCountSoredSet() {
		
	}

	@Test
	public void testDelSortedSet() {
		
	}

	@Test
	public void testGetSoredSetByRange() {
		
	}

	@Test
	public void testGetScore() {
		
	}

	@Test
	public void testSetStringStringInt() {
		
	}

	@Test
	public void testSetStringString() {
		/**
		for(int i=0;i<10000;i++){
			jc.set("key-"+i, "valueawfw-"+i);
		}
		*/
	}

	@Test
	public void testGet() {
		/**
		for(int i=0;i<10000;i++){
			System.out.println(jc.get("key-"+i));
		}
		*/
	}

	@Test
	public void testDel() {
		
	}

	@Test
	public void testIncr() {
		
	}

	@Test
	public void testDecr() {
		
	}

}
