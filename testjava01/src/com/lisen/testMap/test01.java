package com.lisen.testMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test01 {
    public static void main(String[] args) {

        /*
        Map map = new HashMap();
        map.put("user",new User(1,"11"));
        map.put("user",new User(2,"22"));
        map.put("user",new User(3,"33"));
       // List<Map> list = new ArrayList();
        map.put("VVV","VVV");

        User o = (User)map.get(0);
        System.out.println(o);
        */
        Map map = new HashMap();
        map.put("aaa",111);
        System.out.println(map.get("aaa"));
        map.put("aaa",222);
        System.out.println(map.get("aaa"));


    }
}
