package com.lisen.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestAnimal {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(
                Arrays.asList(
                        new Animal("xiaobai",22),
                        new Animal("xiaobai",22),
                        new Animal("xiaohei",18)
                )
        );


        animals.add(new Animal("xiaohua",18));
        System.out.println("------>:" + animals);
        System.out.println("========================================");
        //distinct   去重List内重复对象
        //collect　　可以传入集合中的常用方法，例如：Collector.toList()将流转回集合
        System.out.println(animals.stream().distinct().collect(Collectors.toList()));
    }

}
