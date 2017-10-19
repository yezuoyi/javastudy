package com.study.thread;


public class InterruptDemo extends Thread {

    public static void main(String[] args) throws InterruptedException {
        //创建线程
        InterruptDemo sleep = new InterruptDemo();
        //启动线程
        sleep.start();

        //主线程中断5秒钟
        Thread.sleep(5000);
        //sleep子线程被中断
        sleep.interrupt();
    }

    public void run() {
        try {
            //做一个无限循环，每一秒打印一条信息
            while (true) {
                sleep(1000);
                System.out.println(getName() + " Is Running");
            }
        } catch (InterruptedException e) {
            //被终端以后打印一条信息
            System.out.println(getName() + " Is Interrupted");
            return;
        }
    }
}
