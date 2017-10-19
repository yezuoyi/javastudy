package com.study.reflect;


 
public class Demo1{
	
	
    public static void main(String[] args) {
        Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            //һ�㾡������������ʽ
            demo1=Class.forName("com.study.reflect.DemoTest");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        demo2=new Demo().getClass();
        demo3=Demo.class;
        
        try {
			DemoTest dt = (DemoTest) demo1.newInstance();
			
			dt.print();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        System.out.println("������   "+demo1.getName());
        System.out.println("������   "+demo2.getName());
        System.out.println("������   "+demo3.getName());
         
    }
}
