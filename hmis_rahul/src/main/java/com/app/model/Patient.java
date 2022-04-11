package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Patient {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="patient_id")
	private long id;
	private String name;
	private String address;
	private String gender;
	private String emailId;
	private String contactNUmber;
	private String disease;
	
	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "Doctor_id"))
	private Doctor doctor;
	public Patient() {
		super();
	}
	
	public Patient(long id, String name, String address, String gender, String emailId, String contactNUmber,
			String disease, Doctor doctor) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.emailId = emailId;
		this.contactNUmber = contactNUmber;
		this.disease = disease;
		this.doctor = doctor;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNUmber() {
		return contactNUmber;
	}

	public void setContactNUmber(String contactNUmber) {
		this.contactNUmber = contactNUmber;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", emailId="
				+ emailId + ", contactNUmber=" + contactNUmber + ", disease=" + disease + ", doctor=" + doctor + "]";
	}
	
	
	
}
