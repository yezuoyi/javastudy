package com.study.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/* This is how to declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");

		/* Display content using Iterator */
		Set<Entry<Integer, String>> set = hmap.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext())
		{
			Entry<Integer, String> mentry = iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		if (hmap.containsKey(3))
		{
			System.out.println(hmap.get(3));
		}

		System.out.println("*********************************");

		for (Map.Entry<Integer, String> entry : hmap.entrySet())
		{
			System.out.println("[key:" + entry.getKey() + ", value:" + entry.getValue() + "]");
		}

		System.out.println("*********************************");

		/* Get values based on key */
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);

		/* Remove values based on key */
		hmap.remove(3);
		System.out.println("Map key and values after removal:");
		Set<?> set2 = hmap.entrySet();
		Iterator<?> iterator2 = set2.iterator();
		while (iterator2.hasNext())
		{
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Communication and Networking");
		System.out.println("Values before remove: " + map);
		// Remove value for key 102
		map.remove(102);
		System.out.println("Values after remove: " + map);
		
		
		
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("h");
		list.add("f");
		list.add("s");
		
		for (String s : new ArrayList<String>(list))     
		{
		    list.add("u");
		}
		
		System.out.println(list);
		
		
		
		
		
		
		

	}

}
