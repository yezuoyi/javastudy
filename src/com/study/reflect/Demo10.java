package com.study.reflect;

import java.lang.reflect.Method;



public class Demo10 {
    public static void main(String[] args) {
        Class<?> demo = null;
        Object obj=null;
        try {
            demo = Class.forName("com.study.reflect.Person2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
         obj=demo.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        setter(obj,"Sex","��",String.class);
        getter(obj,"Sex");
    }
 
    /**
     * @param obj
     *            �����Ķ���
     * @param att
     *            ����������
     * */
    public static void getter(Object obj, String att) {
        try {
            Method method = obj.getClass().getMethod("get" + att);
            System.out.println(method.invoke(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * @param obj
     *            �����Ķ���
     * @param att
     *            ����������
     * @param value
     *            ���õ�ֵ
     * @param type
     *            ����������
     * */
    public static void setter(Object obj, String att, Object value,
            Class<?> type) {
        try {
            Method method = obj.getClass().getMethod("set" + att, type);
            method.invoke(obj, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}// end class