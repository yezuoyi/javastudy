package com.study.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo{
	public static void main(String[] args) {
	    List<Integer> list = new ArrayList<>();
	    for(int i=0;i<100;i++){
	        list.add(i);
		}
		/*
	    for(Integer it:list){
	        if(it%2==0){
	            list.remove(it);
	        }
	    }*/
	    
	    for(Integer it:list){
	        System.out.println(it);
	    }
	    
	}
}