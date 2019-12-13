package com.lisen.testRandom;

/**
 * 测试16进制中的a与A是不是同一个数
 */
public class Test16 {
    public static void main(String[] args) {

        int a = Integer.parseInt("aaaa", 16);
        int a1 = Integer.parseInt("A", 16);
        System.out.println("a--->" + a + "     a1--->" + a1);
    }
}
