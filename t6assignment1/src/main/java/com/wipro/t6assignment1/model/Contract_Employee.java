package com.wipro.t6assignment1.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contract_employee")
@DiscriminatorValue("contract_employee")
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
