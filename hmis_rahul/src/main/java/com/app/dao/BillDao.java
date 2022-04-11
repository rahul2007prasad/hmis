package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Bill;

public interface BillDao extends JpaRepository<Bill, Long>{

}
