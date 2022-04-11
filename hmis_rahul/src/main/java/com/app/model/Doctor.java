package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Doctor_id")
	private long id;
	private String name;
	private String designation;
	private String degree;
	private String experiance;
	private String address;
	private String emailId;
	private String contactNumber;
	
	public Doctor() {
		System.out.println("in constr of "+getClass().getName());
	}
	public Doctor(long id, String name, String designation, String degree, String experiance, String address,
			String emailId, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.degree = degree;
		this.experiance = experiance;
		this.address = address;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getExperiance() {
		return experiance;
	}
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", designation=" + designation + ", degree=" + degree
				+ ", experiance=" + experiance + ", address=" + address + ", emailId=" + emailId + ", contactNumber="
				+ contactNumber + "]";
	}
	
	
}
