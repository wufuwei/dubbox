package redis.test;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
	static JedisPool pool = new JedisPool("10.12.8.174", 30001);

	public void doSomething() {
		Jedis jedis = null;
		try {
			System.out.println("pool="+pool);
			jedis = pool.getResource();
			// / ... do stuff here ... for example
			jedis.set("foo", "bar");
			String foobar = jedis.get("foo");
			System.out.println("foobar="+foobar);
			jedis.zadd("sose", 0, "car");
			jedis.zadd("sose", 0, "bike");
			Set<String> sose = jedis.zrange("sose", 0, -1);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
	}
	
	public static void main(String[] args){
		RedisUtil util=new RedisUtil();
		util.doSomething();
		pool.destroy();
	}

}
