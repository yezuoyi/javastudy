package com.study.designmodel.factory.staticfactory;

public class FactoryTest {

	public static void main(String[] args) {	
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}