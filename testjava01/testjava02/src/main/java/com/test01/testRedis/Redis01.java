package com.test01.testRedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Redis01 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("test", "my forst jedis");
        String str = jedis.get("test");
        System.out.println(str);
        jedis.close();
    }
    Jedis jedis  = new Jedis("127.0.0.1",6379);

    @Test
    public void test01(){

        try {
            jedis.set("test","这是我测试的Java中的Jedis");
            System.out.println("获取到redis中key为test的值为：" + jedis.get("test"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    @Test
    public void test02(){

        try {
            String test = jedis.set("test", "666");
            System.out.println("------>:" + test);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jedis.close();
        }
    }

    @Test
    public void testIncr(){
        try {
            jedis.set("num01","11");
            Long incr = jedis.incr("num01");
            System.out.println("---:" + incr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    @Test
    public void testHset(){
        try {
            jedis.hset("myHash","f1","v1");
            jedis.hset("myHash","f2","v2");
            System.out.println("myHash---f1--->:" + jedis.hget("myHash","f1"));
            System.out.println("myHash--->:" + jedis.hgetAll("myHash"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }


    @Test
    public void testZset(){
        try {
            jedis.zadd("myzset",99,"xiaobai");
            jedis.zadd("myzset",66,"xiaohei");
            jedis.zadd("myzset",33,"xiaohua");
            System.out.println("--->:" + jedis.zrangeByScoreWithScores("myzset",0,100));
            Double zscore = jedis.zscore("myzset", "xiaobai");
            System.out.println("xiaobai的成绩为：" + zscore);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }

    }


















}
