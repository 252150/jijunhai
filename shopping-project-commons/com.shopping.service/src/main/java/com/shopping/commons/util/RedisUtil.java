package com.shopping.commons.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {

	private static JedisPoolConfig jpc;
	private static JedisPool jp;
	static {
		jpc = new JedisPoolConfig();
		jpc.setMaxTotal(20);
		jpc.setMaxIdle(5);
		jpc.setTestOnBorrow(true);
		jp = new JedisPool(jpc, "localhost", 6379, 10 * 1000, "252");
	}
     public static String GetValue(String key) {
    	Jedis jedis=jp.getResource();
    	String value=null;
    	 try {
    		 value=jedis.get(key);
    		 
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }finally {
    		 jedis.close();
    	 }
    	 return value;
     }
     public static void SetValue(String key,String value) {
     	Jedis jedis=jp.getResource();
     
     	 try {
     		 jedis.set(key, value);
     		 
     	 }
     	 catch(Exception e){
     		 e.printStackTrace();
     	 }finally {
     		 jedis.close();
     	 }
     
      }

}
