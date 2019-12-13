package com.lisen.bean;

import com.lisen.bean.User;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Map map = new HashMap();

        User user = new User();

        map.put("user01",user);

        user.setId(1);
        user.setName("xiaobai");
        user.setAge("nan");

        User user01 = (User)map.get("user01");

        System.out.println(user01.getName());

    }
}
