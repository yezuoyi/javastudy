package com.study.lambdaexpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	int age;

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