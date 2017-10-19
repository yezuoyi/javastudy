package com.study.thread;


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建SleepThread子线程
        SleepThread sleep = new SleepThread("MySleepThread");
        //创建JoinThread子线程，同时把上面的SleepThread线程作为参数传入
        JoinThread join = new JoinThread("MyJoinThread", sleep);
        
        //启动2个子线程
        sleep.start();
        join.start();

        //主线程中断3秒钟
        Thread.sleep(3000);
        //SleepThread子线程被中断
        sleep.interrupt();
        Thread.sleep(3000);
        join.interrupt();
    }
}

//创建一个线程类，作用如下：
//1，每个1秒钟打印一条信息
//2，如果该线程被中断，则打印被中断的信息
class SleepThread extends Thread {

    public SleepThread(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(">>> " + getName() + " Is Interrupted");
                return;
            }
            System.out.println(getName() + " Is Running");
        }
    }
}

//创建另外一个线程类，作用如下：
//1，调用join函数，与传入的SleepThread线程保持同步
//   也就是说在线程SleepThread执行完毕后，JoinThread才继续执行
//2，每个1秒钟打印一条信息
//3，如果该线程被中断，则打印被中断的信息
class JoinThread extends Thread {
    private SleepThread sleep = null;

    //SleepThread作为构造函数的参数，用于线程同步操作
    public JoinThread(String name, SleepThread sleep) {
        super(name);
        this.sleep = sleep;
    }

    public void run() {
        try {
            //注释去掉了，看看结果！！
            this.sleep.join();

            while (true) {
                sleep(1000);
                System.out.println(getName() + " Is Running");
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
