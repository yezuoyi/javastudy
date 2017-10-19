package com.study.generic;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");*/
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
		
		System.out.println(p1.getkey()+","+p1.getValue());
		System.out.println(p2.getkey()+","+p2.getValue());
		
		Box<Integer> intBox = new Box<>();
		intBox.set(123);
		System.out.println(intBox.get());
	}

}
