package com.study.string;

/**
 * he String class has thirteen constructors that allow you to provide the
 * initial value of the string using different sources, such as an array of
 * characters:
 * 
 * @author yezuoyi
 * 
 * @since 2014-8-28
 */

public class Demo1 {
	
	
	/**
	 * 
	 * @param args
	 * 
	 * @author yezuoyi
	 * 
	 * @since 2014-8-28
	 */
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	
	public static void method1(){
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
	}
	public static void method2(){
		   String palindrome = "Dot saw I was Tod";
	        int len = palindrome.length();
	        char[] tempCharArray = new char[len];
	        char[] charArray = new char[len];
	        
	        // put original string in an 
	        // array of chars
	        for (int i = 0; i < len; i++) {
	            tempCharArray[i] = palindrome.charAt(i);
	        } 
	        
	        // reverse array of chars
	        for (int j = 0; j < len; j++) {
	            charArray[j] = tempCharArray[len - 1 - j];
	        }
	        
	        String reversePalindrome = new String(charArray);
	        System.out.println(reversePalindrome);
	}
}
