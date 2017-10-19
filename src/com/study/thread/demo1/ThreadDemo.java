package com.study.thread.demo1;


class MyThread implements java.lang.Runnable
{
    private int threadId;
    private static Object lock = new Object();
    public MyThread(int id)
    {
        this.threadId = id;
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
        for (int i = 0; i < 10; ++i)
        {
            new Thread(new MyThread(i)).start();
            Thread.sleep(1);
        }
    }
}