package com.study.thread.demo2;

class MyThread implements java.lang.Runnable
{
    private int threadId;
    
    public MyThread(int id)
    {
        this.threadId = id;
    }
    @Override
    public  void run() 
    {
        taskHandler(this.threadId);
    }
    private static synchronized void taskHandler(int threadId)
    {
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thread ID: " + threadId + " : " + i);
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