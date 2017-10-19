package com.study.other;



class Cordinate{
	private int x;
	private int y;
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
}

public class TestArg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cordinate a = new Cordinate();
		a.setX(5);
		a.setY(10);
		
		scale(a);
		
		System.out.println("x= "+a.getX()+", y="+a.getY());

	}

	private static void scale(Cordinate a) {
		// TODO Auto-generated method stub
		a.setX(50);
		a.setY(100);
	}

}
