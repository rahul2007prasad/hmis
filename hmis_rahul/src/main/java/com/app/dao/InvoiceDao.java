package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Long>{

}
