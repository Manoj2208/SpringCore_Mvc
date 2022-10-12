package com.manu.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.manu.dto.Person;

public class TestContainer {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("person.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		Person p=(Person) bf.getBean("person");
		p.savePerson(23, "sai", 24);
		p.getPerson();
	}
}
