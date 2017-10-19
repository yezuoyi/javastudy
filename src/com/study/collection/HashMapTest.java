package com.study.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Product{
	private String channelSku;
	private String name;
	public String getChannelSku()
	{
		return channelSku;
	}
	public void setChannelSku(String channelSku)
	{
		this.channelSku = channelSku;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "{"+channelSku+":"+name+"}" ;
	}
	
}

public class HashMapTest
{
	public static void main(String[] args){
		ArrayList<Product> list = new ArrayList<>();
		Product p1 = new Product();
		p1.setChannelSku("AA");
		p1.setName("AA-1");
		list.add(p1);
		
		Product p2 = new Product();
		p2.setChannelSku("AA");
		p2.setName("AA-2");
		list.add(p2);
		
		Product p3 = new Product();
		p3.setChannelSku("BB");
		p3.setName("BB-1");
		list.add(p3);
		
		Product p4 = new Product();
		p4.setChannelSku("BB");
		p4.setName("BB-2");
		list.add(p4);
		
		Product p5 = new Product();
		p5.setChannelSku("BB");
		p5.setName("BB-3");
		list.add(p5);
		
		Product p6 = new Product();
		p6.setChannelSku("cc");
		p6.setName("cc-1");
		list.add(p6);
		
		HashMap<String,ArrayList<Product>> hmap = new HashMap<>();
		for(Product product:list){
			String key = product.getChannelSku();
			if(hmap.containsKey(key)){
				hmap.get(key).add(product);
			}else{
				ArrayList<Product> productList = new ArrayList<>();
				productList.add(product);
				hmap.put(key, productList);
			}
		}
		
		Set<Entry<String, ArrayList<Product>>> set = hmap.entrySet();
		Iterator<Entry<String, ArrayList<Product>>> iterator = set.iterator();
		while (iterator.hasNext())
		{
			Entry<String, ArrayList<Product>> mentry = iterator.next();
			System.out.println(mentry.getKey()+":"+mentry.getValue().toString());
		}
		
	}
}
