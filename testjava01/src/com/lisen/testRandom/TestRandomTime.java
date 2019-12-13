package com.lisen.testRandom;

import java.util.Date;

/**
 * 利用时间戳，随机生成8位随机数，包含字母数字
 * 有重复的。。不适用
 */
public class TestRandomTime {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i = 0; i < 30; i++){
            System.out.println(new Date());
            System.out.println(toHex(new Date().getTime()));
            System.out.println("-----------");
        }

    }
    /**
     * 获取8位不重复随机码（取当前时间戳转化为十六进制）
     * @author ShelWee
     * @param time
     * @return
     */
    public static String toHex(long time){
        return Integer.toHexString((int)time);
    }
}
