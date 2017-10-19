package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 *  结论:
	List删除还是用迭代器的比较好,其它的都会有问题.
 * @author yezuoyi
 *
 * @since 2014-9-4
 */
public class ArrayListDemo {
	
	public static void main(String []args){
		
		//1,2 有问题
	//	method1();
	//	method2();
		
		//遍历时删除，只能用iterator
	//	method3();
		
		method4();
	}

	/**
	 * (3) asList得到的数组是的没有add和remove方法的
	 * @author yezuoyi
	 *
	 * @since 2014-9-4
	 */
	private static void method4() {
		List<String> list =  Arrays.asList(new String[]{"hello","world"});
	/*	List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");*/
		System.out.println(list);
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String item = iter.next();
			if(item.equals("world")){
				iter.remove();
			}
			System.out.println(item);
		}
		
		System.out.println(list);

	}

	private static void method3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("two");
        list.add("two");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            if(s.equals("two")){
                iter.remove();
            }
        }
        System.out.println(list);
        
	}

	/**
	 * java.util.ConcurrentModificationException
		at java.util.AbstractList$Itr.checkForComodification(AbstractList.java:372)
		at java.util.AbstractList$Itr.next(AbstractList.java:343)
		at com.study.collection.ArrayListDemo.method2(ArrayListDemo.java:26)
		at com.study.collection.ArrayListDemo.main(ArrayListDemo.java:10)
	 * @author yezuoyi
	 *
	 * @since 2014-9-4
	 */
	private static void method2() {
		try{
			 ArrayList<String> list = new ArrayList<String>();
		        list.add("one");
		        list.add("two");
		        list.add("two");
		        list.add("two");
		        list.add("two");
		        for(String s:list){
		            if(s.equals("two")){
		                list.remove(s);
		            }
		        }
		        System.out.println(list);
		}catch(Exception e){
			e.printStackTrace();
		}
       
	}

	private static void method1() {
		ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("two");
        list.add("two");
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("two")){
                list.remove(i);
            }
        }
        System.out.println(list);//[one, two, two]
        
	}
}
