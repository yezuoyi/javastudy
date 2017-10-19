package com.study.thread;

public class JoinDemo1 {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Thread t = new Thread(new Runnable() {
	             
	            @Override
	            public void run() {
	                System.out.println("Wati 3 seconds.");
	                for (int i = 1; i <= 3; i++) {
	                    System.out.println(i);
	                    try {
	                        Thread.sleep(1000);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	            }
	        });
	        t.start();
	        try {
	            t.join();
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("Main thread End.");
	    }
}
