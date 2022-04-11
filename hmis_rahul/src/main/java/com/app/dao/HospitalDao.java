package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Hospital;

public interface HospitalDao extends JpaRepository<Hospital, Long>{

}
