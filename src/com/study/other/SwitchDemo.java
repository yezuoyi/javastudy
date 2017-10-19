package com.study.other;

public class SwitchDemo {
	
	public static final int OPERATE_ONE = 1;
	
	public static final int OPERATE_TWO = 2;
	
	public static final int OPERATE_THREE = 3;
	
	
	
	
	
	public static void opearte(Integer  operateNumber){
		int operateNo = operateNumber.intValue();
		switch (operateNo) {
			case OPERATE_ONE:
				operateOne();
				break;
			case OPERATE_TWO:
				operateTwo();
				break;
			case OPERATE_THREE:
				operateThree();
				break;
			default:
				operateOther();
				break;
		}
		
		
	}
	private static void operateOther() {
		System.out.println("other!");
	}
	private static void operateThree() {
		System.out.println("operating three!!");
	}
	private static void operateTwo() {
		System.out.println("operating two!!");
	}
	private static void operateOne() {
		System.out.println("operating one!!");
	}
	
	
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i=0;i<5;i++){
			opearte(i);
		}
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}
}
