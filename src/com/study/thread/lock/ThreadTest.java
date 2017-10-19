package com.study.thread.lock;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++){
			Foo f1 = new Foo();
			Foo f2 = new Foo();
			new Thread(f1).start();
			new Thread(f2).start();
		}
	
	}

}
