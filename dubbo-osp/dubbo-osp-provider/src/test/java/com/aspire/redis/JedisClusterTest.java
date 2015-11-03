package com.aspire.redis;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;


public class JedisClusterTest  {
	JedisCluster jc=null;
	public  void test(){
		//String paths="classpath:META-INF/spring/dubbo-redis-provider.xml" ;
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext(paths);
		//this.jc=(JedisCluster)applicationContext.getBean("jedisClusterMutil");
		
		jc=initJedisCluster();
		System.out.println("jc="+jc);
		for(int i=0;i<10000;i++){
			System.out.println(jc.set("key-"+i, "valueawfw-"+i));
		}
		
		for(int i=0;i<10000;i++){
			System.out.println(jc.get("key-"+i));
		}
	}
	
	public JedisCluster initJedisCluster(){
		HostAndPort h1=new HostAndPort("10.12.9.169",7000);
		HostAndPort h2=new HostAndPort("10.12.9.169",7001);
		HostAndPort h3=new HostAndPort("10.12.9.170",7000);
		HostAndPort h4=new HostAndPort("10.12.9.170",7001);
		HostAndPort h5=new HostAndPort("10.12.9.171",7000);
		HostAndPort h6=new HostAndPort("10.12.9.171",7001);
		
		/*
		HostAndPort h1=new HostAndPort("10.1.3.195",6379);
		HostAndPort h2=new HostAndPort("10.1.3.196",6379);
		HostAndPort h3=new HostAndPort("10.1.3.197",6379);
		HostAndPort h4=new HostAndPort("10.1.3.195",6380);
		HostAndPort h5=new HostAndPort("10.1.3.196",6380);
		HostAndPort h6=new HostAndPort("10.1.3.197",6380);
		*/
		
		Set<HostAndPort> set=new HashSet<HostAndPort>();
		set.add(h1);
		set.add(h2);
		set.add(h3);
		set.add(h4);
		set.add(h5);
		set.add(h6);
		JedisCluster jc=new JedisCluster(set);
		return jc;
	}
	
	public static void main(String[] args){
		JedisClusterTest test=new JedisClusterTest();
		test.test();
	}
}
