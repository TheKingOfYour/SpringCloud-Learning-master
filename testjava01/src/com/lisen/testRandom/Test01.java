package com.lisen.testRandom;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * 生成随机数
 */
public class Test01 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(Math.random()*2 + 0.1);
        System.out.println(b1);
        BigDecimal b2 = new BigDecimal(Math.random()*2 + 0.1);
        System.out.println(b2);
        BigDecimal add = b1.add(b2);
        BigDecimal bigDecimal = add.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(bigDecimal);

//        Random r = new Random();
//        for(int i = 0 ; i< 20 ; i++){
//            double v = r.nextDouble()*2 + 0.1;
//            DecimalFormat df = new DecimalFormat( "0.00" );
//            String str = df.format(v);
//            double v1 = Double.parseDouble(str);
//            System.out.println(v1);
//            double random = Math.random()*2 + 0.1;
//            System.out.println("--->" + random);
//        }

    }
}
