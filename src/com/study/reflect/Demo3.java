package com.study.reflect;



import java.lang.reflect.Constructor;
 
class Person1{
     
    public Person1() {
         
    }
    public Person1(String name){
        this.name=name;
    }
    public Person1(int age){
        this.age=age;
    }
    public Person1(String name, int age) {
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "["+this.name+"  "+this.age+"]";
    }
    private String name;
    private int age;
}
 
public class Demo3 {
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.study.reflect.Person1");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person1 per1=null;
        Person1 per2=null;
        Person1 per3=null;
        Person1 per4=null;
        //取得全部的构造函数
        Constructor<?> cons[]=demo.getConstructors();
        try{
            per1=(Person1)cons[0].newInstance();
            per2=(Person1)cons[1].newInstance("Rollen");
            per3=(Person1)cons[2].newInstance(20);
            per4=(Person1)cons[3].newInstance("Rollen",20);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
    }
}
