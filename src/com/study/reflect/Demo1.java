package com.study.reflect;


 
public class Demo1{
	
	
    public static void main(String[] args) {
        Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            //一般尽量采用这种形式
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
         
        System.out.println("类名称   "+demo1.getName());
        System.out.println("类名称   "+demo2.getName());
        System.out.println("类名称   "+demo3.getName());
         
    }
}
