package com.wipro.t4assignment2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_PassPort")
public class Employee {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne
	@JoinColumn(name="passport_id")
	private PassPort passPort;
	
	public Employee(int id, String name, PassPort passPort) {
		super();
		this.id = id;
		this.name = name;
		this.passPort = passPort;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PassPort getPassPort() {
		return passPort;
	}
	public void setPassPort(PassPort passPort) {
		this.passPort = passPort;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", passPort=" + passPort + "]";
	}
	
	

}
