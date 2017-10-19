package com.study.designmodel.command;

public class Test {

	public static void main(String[] args) {
		Receiver receiver = new MyReceiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
		

		
	}
}
