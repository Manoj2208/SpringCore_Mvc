package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	public void savestudent(Student student) {
		repository.save(student);
	}
	public Student getStudentById(int id) {
		return repository.findById(id).get();
		 
	}

}
