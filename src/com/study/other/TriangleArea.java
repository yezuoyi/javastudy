package com.study.other;

public class TriangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 3.0f;
		float b = 4.0f;
		float c = 5.0f;
		
		float p=(a+b+c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println(area);
		
		
		

	}

}
