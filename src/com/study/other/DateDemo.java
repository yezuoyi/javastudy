package com.study.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {


	
	
	public static void main(String[] args){
		String str ="Tue Mar 29 00:00:00 GMT+08:00 2016";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date startTime = format.parse(str);
			System.out.println(startTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
