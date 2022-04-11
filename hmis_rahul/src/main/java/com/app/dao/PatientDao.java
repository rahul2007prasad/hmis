package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Patient;

public interface PatientDao extends JpaRepository<Patient, Long>{

	
	List<Patient> findByName(String name);
}
