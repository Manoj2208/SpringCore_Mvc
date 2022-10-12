package com.manu.springbootpersonandaadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manu.springbootpersonandaadhar.dto.Aadhar;

public interface AadharRepository extends JpaRepository<Aadhar , Integer> {

}
