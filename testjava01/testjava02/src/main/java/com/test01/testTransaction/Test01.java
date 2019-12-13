package com.test01.testTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test01 {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) throws Exception {
        Test01 t1 = new Test01();
        System.out.println(t1.test01());
    }

    public String test01() throws Exception {
        int i = 1;
        String s = "333";
        if(i > 2){
            s = "22222";
        }else{
            String str = "这是返回错误信息";
            logger.error(str);
            throw new Exception(str);
        }
        logger.info("成功的执行");
        logger.debug("测试debug");
        return s;
    }
}
