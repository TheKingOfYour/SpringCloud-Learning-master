package com.lisen.testProducerConsumer;

public class Consumer implements Runnable {
    SyncStack stack;
    public Consumer(SyncStack s){
        stack = s;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 20; i++){
            char pop = stack.pop();
            System.out.println("消费：" + pop);
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
