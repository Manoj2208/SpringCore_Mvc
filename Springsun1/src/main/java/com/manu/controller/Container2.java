package com.manu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manu.TestConfiguration;
import com.manu.dto.Branch;

public class Container2 {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(TestConfiguration.class);
		Branch b=(Branch) ac.getBean("branch");
		b.a.display();
	}

}
