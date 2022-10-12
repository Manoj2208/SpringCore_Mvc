package com.manu.springbootpersonandaadhar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manu.springbootpersonandaadhar.dto.Person;
import com.manu.springbootpersonandaadhar.repository.PersonRepository;

@Repository
public class PersonDao {
	@Autowired
	PersonRepository personRepository;
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
	public List<Person> getAllPerson(){
		return personRepository.findAll();
	}
	
	public Person getPersonById(int id) {
		Optional<Person> optional = personRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}
	public String deletePerson(int id) {
		Optional<Person> optional = personRepository.findById(id);
		if(optional.isPresent()) {
			personRepository.delete(optional.get());
			return "Person Data is deleted";
		} else {
			return "Person Data is not found";
		}
	}
	
	public Person updatePerson(Person person) {
		Optional<Person> optional = personRepository.findById(person.getId());
		if(optional.isPresent()) {
			return personRepository.save(person);
		} else {
			return null;
		}
	}

}
