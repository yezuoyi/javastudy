package com.study.other;

import java.math.BigInteger;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] buff= new byte[1024];
		System.out.println(buff.length);
		
		ArrayTest a = new ArrayTest();
		
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getCanonicalName());
		
		
		short i = 1;
		//i = i+ 1; 报错，翻译不过
		i+=1;
		System.out.println(i);
		char h = '我';
		System.out.println(h);
		
		System.out.println(2<<3);//最有效的乘法
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("max = "+max+" min = "+min);
		
		float maxf = Float.MAX_VALUE;
		float minf = Float.MIN_VALUE;
		
		System.out.println("maxf = "+maxf+" minf = "+minf);
		
		System.out.println(Math.PI);
		
		BigInteger aI = new BigInteger("123456789101112");
		System.out.println(aI);
		
		
		int ay = 8>>1;
		int azy = 8<<1;
		int azzy = 8>>>1;
		System.out.println(ay+"--"+azy+"--"+azzy);
	}
	

}
