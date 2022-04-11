package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Doctor;
import com.app.model.Patient;

public interface DoctorDao extends JpaRepository<Doctor, Long>{
	List<Doctor> findByName(String name);
}
