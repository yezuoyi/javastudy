package com.study.thread;


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        //����SleepThread���߳�
        SleepThread sleep = new SleepThread("MySleepThread");
        //����JoinThread���̣߳�ͬʱ�������SleepThread�߳���Ϊ��������
        JoinThread join = new JoinThread("MyJoinThread", sleep);
        
        //����2�����߳�
        sleep.start();
        join.start();

        //���߳��ж�3����
        Thread.sleep(3000);
        //SleepThread���̱߳��ж�
        sleep.interrupt();
        Thread.sleep(3000);
        join.interrupt();
    }
}

//����һ���߳��࣬�������£�
//1��ÿ��1���Ӵ�ӡһ����Ϣ
//2��������̱߳��жϣ����ӡ���жϵ���Ϣ
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

//��������һ���߳��࣬�������£�
//1������join�������봫���SleepThread�̱߳���ͬ��
//   Ҳ����˵���߳�SleepThreadִ����Ϻ�JoinThread�ż���ִ��
//2��ÿ��1���Ӵ�ӡһ����Ϣ
//3��������̱߳��жϣ����ӡ���жϵ���Ϣ
class JoinThread extends Thread {
    private SleepThread sleep = null;

    //SleepThread��Ϊ���캯���Ĳ����������߳�ͬ������
    public JoinThread(String name, SleepThread sleep) {
        super(name);
        this.sleep = sleep;
    }

    public void run() {
        try {
            //ע��ȥ���ˣ������������
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
