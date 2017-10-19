package com.study.reflect;

class Person {
	
	public Person(String name, int age) {
        this.age=age;
        this.name=name;
    }
	
	public Person(){}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
}

public class Demo2 {
	
	/**
	 * 所以大家以后再编写使用Class实例化其他类的对象的时候，一定要自己定义无参的构造函数 
	 * @param args
	 *
	 * @author yezuoyi
	 *
	 * @since 2014-8-26
	 */
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.study.reflect.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) demo.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		per.setName("Rollen");
		per.setAge(20);
		System.out.println(per);
	}
}
