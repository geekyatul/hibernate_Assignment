package com.wipro.hibernate.t2assignment1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_table")
public class Employee {

	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String employeeName;
	private String employeeBand;
	
	public Employee() {}
	
	public Employee(String employeeName, String employeeBand) {
		super();
		this.employeeName = employeeName;
		this.employeeBand = employeeBand;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeBand() {
		return employeeBand;
	}
	public void setEmployeeBand(String employeeBand) {
		this.employeeBand = employeeBand;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeBand="
				+ employeeBand + "]";
	}
	
	
}
