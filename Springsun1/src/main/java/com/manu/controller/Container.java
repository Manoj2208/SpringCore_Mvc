package com.manu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manu.TestConfiguration;
import com.manu.dto.Person;

public class Container {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(TestConfiguration.class);
		Person p=(Person) ac.getBean("person");
		p.display();
	}

}
