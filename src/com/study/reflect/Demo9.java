package com.study.reflect;

import java.lang.reflect.Method;

public class Demo9 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.study.reflect.Person2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// ����Person���е�sayChina����
			Method method = demo.getMethod("sayChina");
			method.invoke(demo.newInstance());
			// ����Person��sayHello����
			method = demo.getMethod("sayHello", String.class, int.class);
			method.invoke(demo.newInstance(), "Rollen", 20);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}