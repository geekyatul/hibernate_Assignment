package com.wipro.t4assignment2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PassPort {

	 @Id
	 private int id;
	 private String country;
	 
	public PassPort(int id, String country) {
		super();
		this.id = id;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "PassPort [id=" + id + ", country=" + country + "]";
	}
	 
	 
	

	
}
