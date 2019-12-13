package com.lisen.testThread;

public class Thread01 {

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
       // TestThread1 t2 = new TestThread1();
        t1.start();
        for(int i = 0; i <= 10; i++){
            System.out.println("main------>" + i);
        }

        //t2.start();
    }

}

class TestThread extends  Thread{
    public void run(){
        for (int i = 0; i <= 10; i++){
            System.out.println("111111------>" + i);
        }
    }

}
class TestThread1 extends  Thread{
    public void run(){
        for (int i = 0; i <= 10; i++){
            System.out.println("222222------>" + i);
        }
    }

}