package com.study.thread;

class MyThread implements java.lang.Runnable
{
    private int threadId;

    public MyThread(int id)
    {
        this.threadId = id;
    }
    @Override
    public   void run() //��ס����this����
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
	 * ��������һ�δ��룬����������run()�����м�����synchronized�ؼ��֣�ϣ���ܶ�run�������л�����ʣ�
	 * ���������������ϣ��������������Ϊ����synchronized��ס����this���󣬼���ǰ�����̶߳�����
	 * �����д�����10���̣߳���ÿ���̶߳�����this����Ķ��������ⲻ��ʵ���̵߳�ͬ����
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