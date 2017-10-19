package com.study.other;

class Point{
	private Integer x;
	private Integer y;
	private int z;
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
public class InitValueDemo {
	public static void main(String[] args){
		Point point = new Point();
		System.out.println(point.getX()+","+point.getY()+","+point.getZ());
	}
}
