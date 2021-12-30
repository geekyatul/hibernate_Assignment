package com.wipro.t6assignment2.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contract_employee")
@PrimaryKeyJoinColumn(name="Id")
public class Contract_Employee extends Employee {

	 
	private int allowance;
	
	   public Contract_Employee() {}
         
	   public Contract_Employee(String name,int salary)
	   {
		   super(name,salary);
	   }
	   
	   public Contract_Employee(int allowance)
	   {
		   this.allowance=allowance;
	   }

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
      	
	   
	   

}
