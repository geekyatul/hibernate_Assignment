package com.wipro.t4assignment1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Department_Of_t4")
public class Department {
	
	@Id
	private int id ;
	private String DepartmentName;
	
	@OneToMany
	private List<Employee> employee;
	
    public Department() {}
	
	public Department(int id, String departmentName, List<Employee> employee) {
		super();
		this.id = id;
		DepartmentName = departmentName;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", DepartmentName=" + DepartmentName + ", employee=" + employee + "]";
	}
	
	
	  
	
	

}
