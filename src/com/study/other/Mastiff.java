package com.study.other;

class Dog {
	public String type = "3.父类成员变量赋的值";

	public Dog() {
		System.out.println("5.父类构造器--type-->" + type);
		type = "父类构造器赋的值";
		System.out.println("6.父类构造器----type--->" + type);
	}

	{
		System.out.println("4.block---type--->" + type);
		type = "父类块赋的值";
	}

	static {
		System.out.println("1. 父类  static block");
	}
}

public class Mastiff extends Dog {
	public String type = "7.成员变量赋的值";

	public Mastiff() {
		System.out.println("10.构造器---type--->" + type);
		type = "构造器赋的值";
	}

	public void say() {
		System.out.println("11.say---type---->" + type);
	}

	{
		System.out.println("8.block---type--->" + type);
		type = "块赋的值";

	}

	{
		System.out.println("9.block");
	}

	static {
		System.out.println("2.static block");
	}

	public static void main(String[] args) {
		Mastiff mastiff = new Mastiff();
		mastiff.say();
	}
}
