package com.study.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;



public class Demo8 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.study.reflect.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("===============��������========================");
        // ȡ�ñ����ȫ������
        Field[] field = demo.getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            // Ȩ�����η�
            int mo = field[i].getModifiers();
            String priv = Modifier.toString(mo);
            // ��������
            Class<?> type = field[i].getType();
            System.out.println(priv + " " + type.getName() + " "
                    + field[i].getName() + ";");
        }
        System.out.println("===============ʵ�ֵĽӿڻ��߸��������========================");
        // ȡ��ʵ�ֵĽӿڻ��߸��������
        Field[] filed1 = demo.getFields();
        for (int j = 0; j < filed1.length; j++) {
            // Ȩ�����η�
            int mo = filed1[j].getModifiers();
            String priv = Modifier.toString(mo);
            // ��������
            Class<?> type = filed1[j].getType();
            System.out.println(priv + " " + type.getName() + " "
                    + filed1[j].getName() + ";");
        }
    }
}