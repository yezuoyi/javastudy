package com.study.reflect;

/**
 * ͨ��һ�������������İ���������
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
