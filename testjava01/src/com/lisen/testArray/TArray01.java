package com.lisen.testArray;

public class TArray01 {

    public static void main(String[] args) {

            int a[];
            a = new int[6];

            for (int i = 0; i<=5; i++){
                a[i] = i;
                System.out.println("------>" + a[i]);
            }

            int b[] = new int[5];
            System.out.println(b[0]);
            b[0] = 5;
            System.out.println(b[0]);
    }
}
