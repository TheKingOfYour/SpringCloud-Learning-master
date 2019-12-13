package com.lisen.testDeadLock;

/**
 * 模拟线程死锁问题
 */
public class TestDeadLock implements  Runnable{

    public int flag = 1;
    static Object o1 = new Object();
    static Object o2 = new Object();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"的flag为："+flag);
        /*
11       * 运行程序后发现程序执行到这里打印出flag以后就再也不往下执行后面的if语句了
12       * 程序也就死在了这里，既不往下执行也不退出
13       */
        //flag等于1的线程
        if(flag == 1){
            //将o1对象锁住
            synchronized (o1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("flag为1的线程。。。。。。");
                /**
26               * 前面已经锁住了对象o1，只要再能锁住o2，那么就能执行打印出1的操作了，可是这里无法锁定对象o2，
27               * 因为在另外一个flag=0这个线程里面已经把对象o1给锁住了，尽管锁住o2这个对象的线程会每隔500毫秒睡眠一次，可是在睡眠的时候仍然是锁住o2不放的
29               */
                synchronized (o2){
                    System.out.println("------>" + "1");
                }
            }
        }
         /*
35        * 这里的两个if语句都将无法执行，因为已经造成了线程死锁的问题,flag=1这个线程在等待flag=0这个线程把对象o2的锁解开，
36        * 而flag=0这个线程也在等待flag=1这个线程把对象o1的锁解开,然而这两个线程都不愿意解开锁住的对象，所以就造成了线程死锁的问题
39        */
        if(flag == 0){
            synchronized (o2){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("flag为0的线程。。。。。。");
                synchronized (o1){
                    System.out.println("------>" + "0");
                }
            }
        }
    }

    public static void main(String[] args) {
        TestDeadLock t1 = new TestDeadLock();
        TestDeadLock t2 = new TestDeadLock();
        t1.flag = 1;
        t2.flag = 0;
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        tt1.setName("线程td1");
        tt2.setName("线程td2");
        tt1.start();
        tt2.start();
    }

}
