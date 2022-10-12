package com.manu.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch {

	public Adress a;

	Branch(@Autowired Adress a) {
		this.a = a;

	}

}
