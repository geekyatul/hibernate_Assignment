package com.wipro.t6assignment1.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regular_employee")
@DiscriminatorValue("regular_employee")
public class Regular_Employee extends Employee {
	
	private int qplc;
	
	public Regular_Employee() {}

	public Regular_Employee(String name,int salary)
	{
		super(name,salary);
	}
	
	public Regular_Employee(int qplc)
	{
		this.qplc=qplc;
	}

	public int getQplc() {
		return qplc;
	}

	public void setQplc(int qplc) {
		this.qplc = qplc;
	}

	@Override
	public String toString() {
		return "Regular_Employee [qplc=" + qplc + "]";
	}
	
}
