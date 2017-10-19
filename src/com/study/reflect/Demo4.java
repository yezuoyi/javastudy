package com.study.reflect;


interface China{
    public static final String name="Rollen";
    public static  int age=20;
    public void sayChina();
    public void sayHello(String name, int age);
}
 
class Person2 implements China{
    public Person2() {
         
    }
    public Person2(String sex){
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public void sayChina(){
        System.out.println("hello ,china");
    }
    @Override
    public void sayHello(String name, int age){
        System.out.println(name+"  "+age);
    }
    private String sex;
}
 
public class Demo4{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.study.reflect.Person2");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //保存所有的接口
        Class<?> intes[]=demo.getInterfaces();
        for (int i = 0; i < intes.length; i++) {
            System.out.println("实现的接口   "+intes[i].getName());
        }
    }
}
