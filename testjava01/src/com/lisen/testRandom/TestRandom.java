package com.lisen.testRandom;

import java.util.Random;

/**
 * 随机生成7位邀请码
 */
public class TestRandom {

    public static void main(String[] args) {
        //String str = genRandomNum();
        //System.out.println( "随机复制码" + str);
        for(int i = 0; i < 30; i++){
            System.out.println( i+"---随机复制码---" + genRandomNum());
        }
    }
    public static String genRandomNum(){
        int  maxNum = 62;//36
        int i;
        int count = 0;
        char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while(count < 7){
            i = Math.abs(r.nextInt(maxNum));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count ++;
            }
        }
        return pwd.toString();
    }

}
