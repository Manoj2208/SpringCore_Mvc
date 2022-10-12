package com.manu.dto;

import org.springframework.stereotype.Component;

@Component
public class Person {
	int id;
	String name;
	int age;

	public void savePerson(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public void getPerson() {
		System.out.println("Person id:" + id);
		System.out.println("Person Name:" + name);
		System.out.println("Person Age:" + age);
	}

}
