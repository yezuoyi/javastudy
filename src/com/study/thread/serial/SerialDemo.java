package com.study.thread.serial;

class Online implements Runnable {
	private boolean syn_flag = false;// 互斥信号量标志

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
		System.out.println("子线程占用互斥信号量...");
	}

	public synchronized void releaseMutex() {
		// 释放互斥信号量
		System.out.println("主线程执行完成，释放互斥信号量。。。");
		setSyn_flag(false);
		// 唤醒等待
		System.out.println("通知子线程继续执行。。。");
		notify();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			// 是否需要等待
			waitForMutex();
			// 占用互斥信号量
			setSyn_flag(true);
			for (int i = 0; i < 10; i++) {
				System.out.println("Online 第一块" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// 释放互斥信号量
			System.out.println("子线程释放互斥信号量。。。");
			setSyn_flag(false);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 是否需要等待
			waitForMutex();
			// 占用互斥信号量
			setSyn_flag(true);
			for (int i = 0; i < 10; i++) {
				System.out.println("Online 第二块" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// 释放互斥信号量
			System.out.println("子线程释放互斥信号量。。。");
			setSyn_flag(false);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 是否需要等待
			waitForMutex();
			// 占用互斥信号量
			setSyn_flag(true);
			for (int i = 0; i < 10; i++) {
				System.out.println("Online 第三块" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// 释放互斥信号量
			System.out.println("子线程释放互斥信号量。。。");
			setSyn_flag(false);

		}
	}

}

public class SerialDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//启动子线程
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
				//在i==3 i==10时模拟主线程需要操作串口资源。
				//此时需要等待子线程执行完串口读写资源，当子线程读写完后会释放互斥信号变量，中断online线程
				System.out.println("cmd is comming...");
				viewMutex(online);
				System.out.println("pause the online thread...");
			}
			if(i==7||i==17){
				//在i==7 i==17时模拟主线程操作完串口资源。
				//此时需要释放互斥信号变量，通知online线程继续执行
				online.releaseMutex();
				System.out.println("start the online thread...");
			}
		}
		
	}
	public static void viewMutex(Online online){
		int i=0;
		while(online.isSyn_flag()){//有互斥信号量，等待
			if(i==0){
				System.out.println("有互斥信号量，主线程等待...");
			}
			i++;
		}
		//无互斥信号量，占用
		online.setSyn_flag(true);
		System.out.println("主线程占用互斥信号量...");
	}
}
