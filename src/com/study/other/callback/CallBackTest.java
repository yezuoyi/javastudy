package com.study.other.callback;

public class CallBackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Call caller = new Call();

		// 实例化具体回调函数，实现回调方法
		caller.setCallBack(new MyCallBack() {

			@Override
			public void fun(int a) {
				// TODO Auto-generated method stub
				System.out.println("hello,world"+a);
			}
		});

		caller.doCall(100);
		
		Call caller1 = new Call();
		caller1.setCallBack(new TestMyCallBack());
		caller1.doCall(50);

	}

}
