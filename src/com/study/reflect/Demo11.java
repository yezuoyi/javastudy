package com.study.reflect;

import java.lang.reflect.Field;



/**
 * ͨ�������������
 * @author yezuoyi
 *
 * @since 2014-8-26
 */
public class Demo11 {
    public static void main(String[] args) throws Exception {
        Class<?> demo = null;
        Object obj = null;
 
        demo = Class.forName("com.study.reflect.Person2");
        obj = demo.newInstance();
 
        Field field = demo.getDeclaredField("sex");
        field.setAccessible(true);
        field.set(obj, "��");
        System.out.println(field.get(obj));
    }
}// end class