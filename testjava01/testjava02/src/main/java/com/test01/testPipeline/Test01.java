package com.test01.testPipeline;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;

import java.util.List;

public class Test01 {

    @Test
    public void test01(){
        Jedis jedis = null;
        try {
            jedis = new Jedis("127.0.0.1",6379);
            //1.生成pipeline对象
            Pipeline pipelined = jedis.pipelined();
            //2.pipeline命令执行，此时命令并没有真正的执行

            pipelined.del("test");
            //System.out.println("---:" + test);
//            for(String  key : keys){
//                pipelined.del(key);
//            }
            //3.执行命令
            pipelined.sync();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    @Test
    public void test02(){
        Jedis jedis = null;

        try {
            jedis = new Jedis("127.0.0.1",6379);
            Pipeline pipelined = jedis.pipelined();
            pipelined.set("vvv","666");
            pipelined.incr("vvv");
            List<Object> list = pipelined.syncAndReturnAll();

            for(Object object : list){
                System.out.println("-----:" + object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    @Test
    public void test03(){
        Jedis jedis = null;

        try {
            jedis = new Jedis("127.0.0.1",6379);
            String key = "vvv";
            String script = "return redis.call('get',KEYS[1])";
            Object eval = jedis.eval(script, 1, key);
            System.out.println(eval);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }






























}
