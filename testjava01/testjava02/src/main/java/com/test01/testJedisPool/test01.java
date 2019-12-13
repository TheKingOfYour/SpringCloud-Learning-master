package com.test01.testJedisPool;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class test01 {
    public static void main(String[] args) {

        //连接池配置
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();

        //设置最大的空闲连接为默认值的5倍
        poolConfig.setMaxTotal(GenericObjectPoolConfig.DEFAULT_MAX_TOTAL * 5);
        //设置最大的空闲连接数为默认值的3倍
        poolConfig.setMaxIdle(GenericObjectPoolConfig.DEFAULT_MAX_IDLE * 3);
        //设置最小的空闲连接数为默认的2倍
        poolConfig.setMinIdle(GenericObjectPoolConfig.DEFAULT_MIN_IDLE * 2);
        //设置开启jmx功能
        poolConfig.setJmxEnabled(true);
        //设置连接池没有连接后客户端的最大等待时间
         poolConfig.setMaxWaitMillis(3000);

        //初始化Jedis连接池
        JedisPool jedisPool = new JedisPool(poolConfig,"127.0.0.1",6379);

        Jedis jedis = null;

        try {
            //1.从连接池获取到jedis对象
            jedis = jedisPool.getResource();
            //2.执行操作
            String a = jedis.get("a");
            System.out.println("------>:" + a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(jedis != null){
                //如果使用JedisPool，close操作不是关闭连接，而是代表将连接归还给连接池
                jedis.close();
            }
        }
    }
}
