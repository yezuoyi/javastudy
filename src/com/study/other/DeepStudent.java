package com.study.other;

public class DeepStudent implements Cloneable {
    String name;// ��������
    int age;
    DeepProfessor p;// ѧ��1��ѧ��2������ֵ����һ���ġ�

    DeepStudent(String name, int age, DeepProfessor p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    public Object clone() {
        DeepStudent o = null;
        try {
            o = (DeepStudent) super.clone();
            //�����õĶ���Ҳ���и���
            o.p = (DeepProfessor) p.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }

    public static void main(String[] args) {
        DeepProfessor p = new DeepProfessor("wangwu", 50);
        DeepStudent s1 = new DeepStudent("zhangsan", 18, p);
        DeepStudent s2 = (DeepStudent) s1.clone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);
        System.out.println("name=" + s2.p.name + "," + "age=" + s2.p.age);
        //������ѧ��1��2�Ľ��ڳ�Ϊlisi,ageΪ30��
    }
}

class DeepProfessor implements Cloneable {
    String name;
    int age;

    DeepProfessor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        DeepProfessor o = null;
        try {
            o = (DeepProfessor)super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}