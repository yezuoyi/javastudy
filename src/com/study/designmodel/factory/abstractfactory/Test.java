package com.study.designmodel.factory.abstractfactory;

public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
		provider= new SendSmsFactory();
		sender = provider.produce();
		sender.Send();
	}
}
