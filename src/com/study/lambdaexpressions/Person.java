package com.study.lambdaexpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	int age;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printPerson() {
		System.out.println(this.toString());
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Hell");
		p.setBirthday(LocalDate.now());
		p.setAge(21);
		p.setGender(Sex.FEMALE);
		p.setEmailAddress("lili@163.com");
		p.printPerson();
	}

	public static int compareByAge(Person a, Person b) {
		// return a.birthday.compareTo(b.birthday);
		return a.age - b.age;
	}

	public static List<Person> createRoster() {
		List<Person> personList = new ArrayList<Person>();
		for (int i = 0; i < 30; i++) {
			Person p = new Person();
			p.setName("Hell " + i);
			p.setBirthday(LocalDate.now());
			p.setAge(1 + (int) (Math.random() * 50));
			p.setGender(i % 2 == 0 ? Sex.FEMALE : Sex.MALE);
			p.setEmailAddress("lili" + i + "@163.com");
			personList.add(p);
		}
		return personList;
	}
}