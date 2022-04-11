package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String address;
	private String website;
	private String contactNumber;
	public long getId() {
		return id;
	}
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(long id, String name, String address, String website, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.website = website;
		this.contactNumber = contactNumber;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", address=" + address + ", website=" + website
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	
}
