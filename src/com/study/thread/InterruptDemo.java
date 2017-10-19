package com.study.thread;


public class InterruptDemo extends Thread {

    public static void main(String[] args) throws InterruptedException {
        //�����߳�
        InterruptDemo sleep = new InterruptDemo();
        //�����߳�
        sleep.start();

        //���߳��ж�5����
        Thread.sleep(5000);
        //sleep���̱߳��ж�
        sleep.interrupt();
    }

    public void run() {
        try {
            //��һ������ѭ����ÿһ���ӡһ����Ϣ
            while (true) {
                sleep(1000);
                System.out.println(getName() + " Is Running");
            }
        } catch (InterruptedException e) {
            //���ն��Ժ��ӡһ����Ϣ
            System.out.println(getName() + " Is Interrupted");
            return;
        }
    }
}
