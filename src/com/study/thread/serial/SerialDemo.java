package com.study.thread.serial;

class Online implements Runnable {
	private boolean syn_flag = false;// �����ź�����־

	public Online() {
		// TODO Auto-generated constructor stub
	}

	public synchronized boolean isSyn_flag() {
		return syn_flag;
	}

	public synchronized void setSyn_flag(boolean syn_flag) {
		this.syn_flag = syn_flag;
	}

	private synchronized void waitForMutex() {
		int i = 0;
		while (syn_flag) {
			try {
				if (i < 2) {
					System.out.println("Online thread wait...");
				}
				i++;
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���߳�ռ�û����ź���...");
	}

	public synchronized void releaseMutex() {
		// �ͷŻ����ź���
		System.out.println("���߳�ִ����ɣ��ͷŻ����ź���������");
		setSyn_flag(false);
		// ���ѵȴ�
		System.out.println("֪ͨ���̼߳���ִ�С�����");
		notify();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			// �Ƿ���Ҫ�ȴ�
			waitForMutex();
			// ռ�û����ź���
			setSyn_flag(true);
			for (int i = 0; i < 10; i++) {
				System.out.println("Online ��һ��" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// �ͷŻ����ź���
			System.out.println("���߳��ͷŻ����ź���������");
			setSyn_flag(false);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// �Ƿ���Ҫ�ȴ�
			waitForMutex();
			// ռ�û����ź���
			setSyn_flag(true);
			for (int i = 0; i < 10; i++) {
				System.out.println("Online �ڶ���" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// �ͷŻ����ź���
			System.out.println("���߳��ͷŻ����ź���������");
			setSyn_flag(false);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// �Ƿ���Ҫ�ȴ�
			waitForMutex();
			// ռ�û����ź���
			setSyn_flag(true);
			for (int i = 0; i < 10; i++) {
				System.out.println("Online ������" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// �ͷŻ����ź���
			System.out.println("���߳��ͷŻ����ź���������");
			setSyn_flag(false);

		}
	}

}

public class SerialDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������߳�
		Online online=new Online();
		new Thread(online).start();
		
		for(int i=0;i<100;i++){
			System.out.println("main thread:"+i);
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==3||i==10){
				//��i==3 i==10ʱģ�����߳���Ҫ����������Դ��
				//��ʱ��Ҫ�ȴ����߳�ִ���괮�ڶ�д��Դ�������̶߳�д�����ͷŻ����źű������ж�online�߳�
				System.out.println("cmd is comming...");
				viewMutex(online);
				System.out.println("pause the online thread...");
			}
			if(i==7||i==17){
				//��i==7 i==17ʱģ�����̲߳����괮����Դ��
				//��ʱ��Ҫ�ͷŻ����źű�����֪ͨonline�̼߳���ִ��
				online.releaseMutex();
				System.out.println("start the online thread...");
			}
		}
		
	}
	public static void viewMutex(Online online){
		int i=0;
		while(online.isSyn_flag()){//�л����ź������ȴ�
			if(i==0){
				System.out.println("�л����ź��������̵߳ȴ�...");
			}
			i++;
		}
		//�޻����ź�����ռ��
		online.setSyn_flag(true);
		System.out.println("���߳�ռ�û����ź���...");
	}
}
