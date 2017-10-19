package com.study.reflect;




public class Demo5{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.study.reflect.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //取得父类
        Class<?> temp=demo.getSuperclass();
        System.out.println("继承的父类为：   "+temp.getName());
    }
}