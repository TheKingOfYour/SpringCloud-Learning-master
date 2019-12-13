package com.lisen.testArray;

import java.util.Arrays;
import java.util.List;

public class TArray02 {

    public static void main(String[] args) {

        String[] str = new String[]{"aaa","bbb","ccc"};
        List<String> strings = Arrays.asList(str);

        System.out.println("---------:" + strings.get(2));

        //不可以进行add()与remove()方法，因为是固定长度大小的列表
        //strings.add("ddd");
        //System.out.println("------------------:" + strings.get(3));


    }

}
