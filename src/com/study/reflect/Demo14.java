package com.study.reflect;


class test{
    
}
public class Demo14{
    public static void main(String[] args) {
        test t=new test();
        System.out.println("�������  "+t.getClass().getClassLoader().getClass().getName());
    }
}