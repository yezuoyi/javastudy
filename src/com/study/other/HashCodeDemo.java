package com.study.other;

import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {

		// TODO Auto-generated method stub
	    public static void main(String[] args){
	        Set<String> skuSet =new HashSet<String>();
	        skuSet.add("ATX10UVA4Y=1");
	        skuSet.add("ATX10UVA55=1");
	       System.out.println(skuSet.hashCode());
	    }

}
