package com.manu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manu.dto.Child;
import com.manu.dto.Parent;

public class TestContainer {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("inheritance.xml");
		Parent p=(Parent) ac.getBean("parent");
		Child c=(Child) ac.getBean("child");
		System.out.println("------parent here-----");
		System.out.println(p.getCountry());
		System.out.println(p.getState());
		System.out.println("----child here-------");
		System.out.println(c.getCountry());
		System.out.println(c.getState());
		System.out.println(c.getDistrict());
		System.out.println(c.getPost());
		
	}

}
