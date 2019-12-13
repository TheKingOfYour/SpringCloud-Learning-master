package com.lisen.testIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

public class TestFileInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;

        int b = 0;

        try {
            in = new FileInputStream("D:/testIOStream/01.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        long num = 0;

        try {
            while ((b = in.read()) != -1){
                System.out.print((char) b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("总共读取了："+ num + "个字节");
        } catch (Exception e) {
            e.printStackTrace();
        }




    }





}
