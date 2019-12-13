package com.test01.testProtobuf;

import redis.clients.jedis.Jedis;

import java.util.Date;

public class test {
    public static void main(String[] args) {

        ProtostuffSerializer p = new ProtostuffSerializer();
        Jedis jedis = new Jedis("127.0.0.1",6379);

        String key = "club1";
        Club c = new Club();
        c.setId(1);
        c.setName("MV");
        c.setInfo("6666");
        c.setCreateDate(new Date());
        c.setRank(1);
        //序列化
        byte[] serialize = p.serialize(c);
        jedis.set(key.getBytes(),serialize);

        //反序列化
        byte[] bytes = jedis.get(key.getBytes());
        Club club = p.deserialize(bytes);
        System.out.println("--->" + club);


    }
}
