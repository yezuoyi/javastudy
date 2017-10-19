package com.study.collection;

import java.util.HashMap;
import java.util.Map;

public class Freq {
    public static void main(String[] args) {
    	
    	String input = "if it is to be it is up to me to delegate";
    	String [] args1 = input.split(" ");
        Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : args1) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
