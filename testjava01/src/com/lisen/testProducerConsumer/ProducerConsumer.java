package com.lisen.testProducerConsumer;


   /*    范例名称：生产者--消费者问题
    *    源文件名称：ProducerConsumer.java
    *    要  点：
    *        1. 共享数据的不一致性/临界资源的保护
    *        2. Java对象锁的概念
    *        3. synchronized关键字/wait()及notify()方法
    */
public class ProducerConsumer {

       public static void main(String[] args) {
           SyncStack stack = new SyncStack();
           Consumer consumer = new Consumer(stack);
           Producer producer = new Producer(stack);

           Thread c = new Thread(consumer);
           Thread p = new Thread(producer);

           c.start();
           p.start();
           //System.out.println("==========================================");
           //char []data = new char[6];
           //System.out.println(data.length);
       }

}
