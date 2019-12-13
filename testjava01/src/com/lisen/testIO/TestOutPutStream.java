package com.lisen.testIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutPutStream {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        int b = 0;

        try {
            in = new FileInputStream("D:/testIOStream/01.txt");

            out = new FileOutputStream("D:/testIOStream/02.txt");

            while((b = in.read()) != -1){
                out.write(b);
            }

            in.close();
            out.close();
            System.out.println("写入成功，请到D盘下testIOStream中的02.txt查看");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("最终的finally。。。");
        }


    }
}
