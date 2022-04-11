package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(long id, String particular, String quantity, String unitvalue) {
		super();
		this.id = id;
		this.particular = particular;
		this.quantity = quantity;
		this.unitvalue = unitvalue;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Bill_id")
	private long id;
	private String particular;
	private String quantity;
	private String unitvalue;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getParticular() {
		return particular;
	}
	public void setParticular(String particular) {
		this.particular = particular;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitvalue() {
		return unitvalue;
	}
	public void setUnitvalue(String unitvalue) {
		this.unitvalue = unitvalue;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", particular=" + particular + ", quantity=" + quantity + ", unitvalue=" + unitvalue
				+ "]";
	}
	
}
