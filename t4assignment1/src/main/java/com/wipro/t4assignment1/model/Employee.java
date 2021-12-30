package com.wipro.t4assignment1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Employee_department")
public class Employee {
	
	
	  @Id
	  private int id ;
	  private String name;
	  private String designation;
	  
	  @ManyToOne
	  private Department department;
	  
	  
	  public Employee() {}

	public Employee(int id, String name, String designation, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ "]";
	}
	
	
	  
	  
	  
	 
	  

}
