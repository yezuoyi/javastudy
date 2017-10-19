package com.study.designmodel.adapter;

public class Adapter extends Source implements Targetable {
//http://m.blog.csdn.net/blog/z_vv11/8808230
	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
}