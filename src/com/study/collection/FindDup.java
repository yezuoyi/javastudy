package com.study.collection;

import java.util.*;
import java.util.stream.*;

public class FindDup {
	public static void main(String[] args) {
		String  argsTest = "z y x w d c b a";
		String[]  arg = argsTest.split("\\s+");
		Set<String> distinctWords = Arrays.asList(arg).stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
		
		/*
		 * ´íÎó´úÂë
		String [] arr2 = str.split(" ");
		for(String ss : arr2){
		    System.out.println(ss);
		}*/
		String type = "html";
		 if(type!=null){
             String extension = "."+type;
             System.out.println(extension);
         }
		
	}
}
