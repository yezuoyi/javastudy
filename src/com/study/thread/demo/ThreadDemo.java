package com.study.thread.demo;


class MyThread implements java.lang.Runnable
{
    private int threadId;
    private Object lock;
    public MyThread(int id, Object obj)
    {
        this.threadId = id;
        this.lock = obj;
    }
    @Override
    public  void run() 
    {
        synchronized(lock)
        {
            for (int i = 0; i < 100; ++i)
            {
                System.out.println("Thread ID: " + this.threadId + " : " + i);
            }
        }
    }
}
public class ThreadDemo
{
    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException
    {
        Object obj = new Object();
        for (int i = 0; i < 10; ++i)
        {
            new Thread(new MyThread(i, obj)).start();
            Thread.sleep(1);
        }
    }
}