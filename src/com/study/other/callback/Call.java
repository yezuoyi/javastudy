package com.study.other.callback;

public class Call {

	private MyCallBack myCallBack;
	
	public void setCallBack(MyCallBack myCallBack){
		this.myCallBack = myCallBack;
	}
	
	public void doCall(int a){
		myCallBack.fun(a);
	}

}
