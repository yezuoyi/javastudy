package com.study.designmodel.adapter.interfaceadapter;

public class WrapperTest {

	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1();
		System.out.println("\n");
		source1.method2();
		
		System.out.println("*******************");
		source2.method1();
		source2.method2();
	}
}