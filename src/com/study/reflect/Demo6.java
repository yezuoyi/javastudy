package com.study.reflect;

import java.lang.reflect.Constructor;


public class Demo6{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.study.reflect.Person1");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Constructor<?>cons[]=demo.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println("构造方法：  "+cons[i]);
        }
    }
}