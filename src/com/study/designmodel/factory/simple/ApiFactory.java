package com.study.designmodel.factory.simple;

public class ApiFactory {
	public static Api createApi(String apiName){
		if(apiName!=null&&apiName.equals("ApiA")){
			return new ApiA();
		}else{
			return new ApiB();
		}
	}
	
	public static Api getApiA(){
		return new ApiA();
	}
	
	public static Api getApiB(){
		return new ApiB();
	}
}
