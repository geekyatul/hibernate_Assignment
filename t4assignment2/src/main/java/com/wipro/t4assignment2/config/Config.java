package com.wipro.t4assignment2.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.t4assignment2.model.Employee;
import com.wipro.t4assignment2.model.PassPort;


public class Config {
	
	private static SessionFactory sessionFactory=null;
	
	   public static SessionFactory getSessionFactory()
	   {
		   if(sessionFactory==null)
		   {
			   Configuration configuration=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(PassPort.class);
		         
			   sessionFactory=configuration.buildSessionFactory();  
			   
		   }
		   return sessionFactory;
	   }

}
