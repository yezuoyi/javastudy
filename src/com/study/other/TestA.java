package com.study.other;

public class TestA {
	private   Cordinate aMember;
	public static void main(String[] args){
			TestA testA = new TestA();
			testA.init(testA.getaMember());
			testA.out();
	}

	public void out(){
	//	System.out.println(testA.getaMember().getX()+","+testA.getaMember().getY());
		
		System.out.println(aMember.getX()+","+aMember.getY());
	}
	
	
	private  void init(Cordinate aMember2) {
		aMember2.setX(10);
		aMember2.setY(11);
	}

	public Cordinate getaMember() {
		if(aMember==null){
			aMember = new Cordinate();
		}
		return aMember;
	}

	public void setaMember(Cordinate aMember) {
		this.aMember = aMember;
	}
	
	
}
