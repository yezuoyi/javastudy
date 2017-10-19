package com.study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d1 = 1.2;
		Double d2 = 0.9;
		Double d3 = 3.1;
		Double d4 = 0.3;
		
		List<Double> dlist = new ArrayList<>();
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);
		dlist.add(d4);
		
		Collections.sort(dlist);
		Collections.reverse(dlist);
		
		System.out.println(dlist.get(0));
		
		System.out.println(dlist.get(1));

	}

}
