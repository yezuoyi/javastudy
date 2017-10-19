package com.study.other;

import java.util.concurrent.atomic.AtomicInteger;

public class PassString {
	
	public class Cordinate{
		private int x;
		private int y;
		public void setX(int x){
			this.x = x;
		}
		public int getX(){
			return x;
		}
		
		public void setY(int y){
			this.y = y;
		}
		public int getY(){
			return y;
		}
	}

	public static void main(String[] args) {
		testString();
		testStringBuilder();
		testInteger();
		testInteger2();
		
		testObject();
		
	}
	 
	private static void testObject() {
		// TODO Auto-generated method stub
		PassString ps=new PassString();
		PassString.Cordinate a = ps.new Cordinate();
		a.setX(5);
		a.setY(10);
		System.out.println("前：");
		System.out.println("x= "+a.getX()+", y="+a.getY());
		
		scale(a);
		System.out.println("后：");
		System.out.println("x= "+a.getX()+", y="+a.getY());
	}

	private static void scale(Cordinate a) {
		// TODO Auto-generated method stub
		a.setX(50);
		a.setY(100);
	}
	private static void testInteger2() {
		// TODO Auto-generated method stub
		AtomicInteger i=new AtomicInteger(40);
		System.out.println("change 前"+i);
		changeIntegerAtomic(i);
		System.out.println("change 后"+i);
	}

	private static void changeIntegerAtomic(AtomicInteger i) {
		// TODO Auto-generated method stub
		i.set(2000);
	}

	private static void testInteger() {
		// TODO Auto-generated method stub
		Integer i=10;
		changeInteger(i);
		System.out.println("i="+i);
	}

	private static void changeInteger(Integer i) {
		// TODO Auto-generated method stub
		i = 1000;
	}

	private static void testStringBuilder() {
		// TODO Auto-generated method stub
			StringBuilder x = new StringBuilder("ab");
			changeStringBuilder(x);
			System.out.println(x);
	
	}
	
	public static void changeStringBuilder(StringBuilder x) {
		x.delete(0, 2).append("cd");
	}

	private static void testString() {
		// TODO Auto-generated method stub
		String x = new String("ab");
		change(x);
		System.out.println(x);
	}

	public static void change(String x) {
		x = "cd";
	}

}
