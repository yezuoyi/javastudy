package com.study.reflect;




public class Demo5{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.study.reflect.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //ȡ�ø���
        Class<?> temp=demo.getSuperclass();
        System.out.println("�̳еĸ���Ϊ��   "+temp.getName());
    }
}