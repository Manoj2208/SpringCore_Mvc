package com.manu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manu.dto.Person;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("person.xml");
		Person p=(Person) ac.getBean("person");
		p.savePerson(24, "manoj", 22);
		p.getPerson();
	}

}
