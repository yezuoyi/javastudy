package com.study.designmodel.builder;

import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		builder.produceSmsSender(10);
		List<Sender> list = builder.getList();
		
		Iterator<Sender> iter = list.iterator();
		while(iter.hasNext()){
			Sender sender = iter.next();
			sender.send();
		}
		
	}
}