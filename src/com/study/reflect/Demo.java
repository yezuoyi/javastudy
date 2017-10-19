package com.study.reflect;

/**
 * 通过一个对象获得完整的包名和类名
 * */
class DemoTest {
	// other codes...
	public void print(){
		System.out.println("Hello,world");
	}
}

public class Demo {
	public static void main(String[] args) {
		DemoTest demo = new DemoTest();
		System.out.println(demo.getClass().getName());
	}
}
