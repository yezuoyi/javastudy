package com.study.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDups {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		for (String a : args)
			if (!s.add(a))
				System.out.println("Duplicate detected: " + a);

		System.out.println(s.size() + " distinct words: " + s);
		
	//	List<String> list = new ArrayList<E>(c)
	}

}
