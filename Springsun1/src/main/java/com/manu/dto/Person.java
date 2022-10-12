package com.manu.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Aadhar a;

	public void display() {
		System.out.print("your Aadhar number ->");
		a.number();
	}

}
