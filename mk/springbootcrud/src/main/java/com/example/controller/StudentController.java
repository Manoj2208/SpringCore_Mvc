package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping(value = "/save")
	public int saveStudent(@RequestBody Student student) {
		studentService.savestudent(student);
		return student.getId();
		
		
	}
	@GetMapping("/student/{studentid}")
	public Student getStudentById(@PathVariable("studentid") int id) {
		return studentService.getStudentById(id);
	}

}
