package com.study.designmodel.factory.simple;

public class Test {
	public static void main(String[] args){
		Api api = ApiFactory.createApi("ApiA");
		api.operate();
		api = ApiFactory.createApi("ApiB");
		api.operate();
		
		api = ApiFactory.getApiA();
		api.operate();
		
		api = ApiFactory.getApiB();
		api.operate();
	}
}
