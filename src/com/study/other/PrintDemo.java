package com.study.other;

class AV
{
	int x;
	int y;

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public void print()
	{
		System.out.println(this.getX() + "-" + this.getY());
	}

}

public class PrintDemo
{

	public static void main(String[] args)
	{
		AV av = test();
		System.out.println("********************");
		av.print();

	}

	private static AV test()
	{
		AV a = new AV();
		a.setX(10);
		a.setY(20);
		a.print();
		changeAvx(a, 5);
		a.print();
		changeAvy(a, 51);
		a.print();
		return a;
	}

	private static void changeAvy(AV a, int i)
	{
		a.setY(i);
	}

	private static void changeAvx(AV a, int v)
	{
		a.setX(v);
	}

}
