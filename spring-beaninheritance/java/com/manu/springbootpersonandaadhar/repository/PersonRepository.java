package com.manu.springbootpersonandaadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manu.springbootpersonandaadhar.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
