package com.study.thread.lock;

public class Foo implements Runnable {

	private static byte[] lock = new byte[0];
	
	
	public void print(){
		for(int i=0;i<10;i++){
			System.out.println(i+" "+this);
		}
	}

	@Override
	public void run() {
		methodC();
	}

	public synchronized void methodA() {
		//System.out.println(this);
		print();
	}

	public void methodB() {
		synchronized (this) {
			//System.out.println(this);
			print();
		}
	}

	public void methodC() {
		synchronized (lock) {
			//System.out.println(lock);
			print();
			
		}
	}
}
