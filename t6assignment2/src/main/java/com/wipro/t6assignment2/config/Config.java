package com.wipro.t6assignment2.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.t6assignment2.model.Contract_Employee;
import com.wipro.t6assignment2.model.Employee;
import com.wipro.t6assignment2.model.Regular_Employee;


public class Config {
	
	private static SessionFactory sessionFactory=null;
	
	   public static SessionFactory getSessionFactory()
	   {
		   if(sessionFactory==null)
		   {
			   Configuration configuration=new Configuration().configure().
					   addAnnotatedClass(Employee.class).addAnnotatedClass(Regular_Employee.class).addAnnotatedClass(Contract_Employee.class);
		        
			   sessionFactory=configuration.buildSessionFactory();  
			   
		   }
		   return sessionFactory;
	   }

}
