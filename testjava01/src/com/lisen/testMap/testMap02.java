package com.lisen.testMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testMap02 {
    public static void main(String[] args) {

        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("m2",map2);
        map1.put("vvv",666);
        map2.put("a1",111);
        map2.put("a2",222);
        Object m2 = map1.get("m2");
        System.out.println("------>" + m2);
        Set set = map1.keySet();

        System.out.println(set);

    }
}
