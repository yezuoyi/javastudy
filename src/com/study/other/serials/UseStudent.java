package com.study.other.serials;

import java.io.*;

/**
 * Title:Ӧ��ѧ���� Description:ʵ��ѧ����ʵ�������л��뷴���л� Copyright: copyright(c) 2012
 * Filename: UseStudent.java
 * 
 * @author Wang Luqing
 * @version 1.0
 */

public class UseStudent {
	public static void main(String[] args) {
		Student st = new Student("Tom", 'M', 20, 3.6);
		File file = new File("E:\\student.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			// Student�������л�����
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.flush();
			oos.close();
			fos.close();

			// Student�������л�����
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student st1 = (Student) ois.readObject();
			System.out.println("name = " + st1.getName());
			System.out.println("sex = " + st1.getSex());
			System.out.println("year = " + st1.getYear());
			System.out.println("gpa = " + st1.getGpa());
			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
