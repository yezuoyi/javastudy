package com.study.designmodel.brigde;

public class MyBridge extends Bridge {
	public void method(){
		getSource().method();
	}
}
