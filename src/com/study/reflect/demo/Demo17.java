package com.study.reflect.demo;


interface fruit{
    public abstract void eat();
}
 
class Apple implements fruit{
    public void eat(){
        System.out.println("Apple");
    }
}
 
class Orange implements fruit{
    public void eat(){
        System.out.println("Orange");
    }
}
 
class Factory{
    public static fruit getInstance(String ClassName){
        fruit f=null;
        try{
            f=(fruit)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
public class Demo17 {
    public static void main(String[] a){
        fruit f=Factory.getInstance("com.study.reflect.demo.Apple");
        if(f!=null){
            f.eat();
        }
    }
}