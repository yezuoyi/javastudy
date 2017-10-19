package com.study.thread;

class MyThread implements java.lang.Runnable
{
    private int threadId;

    public MyThread(int id)
    {
        this.threadId = id;
    }
    @Override
    public   void run() //锁住的是this对象
    {
    	handler(threadId);
    	/*for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thread ID: " + threadId + " : *********************************************************" + i);
        }*/
    }
    
    public static synchronized void handler(int threadId2){
    	for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thread ID: " + threadId2 + " :     public static synchronized void handler(int threadId2){" + i);
        }
    }
}
public class ThreadDemo
{
 
	/**
	 * 先来看第一段代码，这里我们在run()方法中加入了synchronized关键字，希望能对run方法进行互斥访问，
	 * 但结果并不如我们希望那样，这是因为这里synchronized锁住的是this对象，即当前运行线程对象本身。
	 * 代码中创建了10个线程，而每个线程都持有this对象的对象锁，这不能实现线程的同步。
	 * @param args
	 * @throws InterruptedException
	 *
	 * @author yezuoyi
	 *
	 * @since 2014-8-26
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