package com.study.other;

class Dog {
	public String type = "3.�����Ա��������ֵ";

	public Dog() {
		System.out.println("5.���๹����--type-->" + type);
		type = "���๹��������ֵ";
		System.out.println("6.���๹����----type--->" + type);
	}

	{
		System.out.println("4.block---type--->" + type);
		type = "����鸳��ֵ";
	}

	static {
		System.out.println("1. ����  static block");
	}
}

public class Mastiff extends Dog {
	public String type = "7.��Ա��������ֵ";

	public Mastiff() {
		System.out.println("10.������---type--->" + type);
		type = "����������ֵ";
	}

	public void say() {
		System.out.println("11.say---type---->" + type);
	}

	{
		System.out.println("8.block---type--->" + type);
		type = "�鸳��ֵ";

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
