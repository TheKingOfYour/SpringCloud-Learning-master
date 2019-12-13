package com.lisen.testIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream {

    public static void main(String[] args) {

        FileInputStream in = null;

        try {
            in = new FileInputStream("D:testIOStream/01.txt");

            BufferedInputStream bin = new BufferedInputStream(in);
            int c = 0;
            System.out.println((char)bin.read());
            System.out.println((char)bin.read());
            bin.mark(5);
           // bin.mark(100);// 在第100个字符处做一个标记
            for (int i = 0; i <= 10 && (c = bin.read()) != -1; i++) {
                System.out.print((char) c);
                }
            System.out.println();
            bin.reset();// 重新回到原来标记的地方
            for (int i = 0; i <= 10 && (c = bin.read()) != -1; i++) {
                System.out.print((char) c);
           }
            bin.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
