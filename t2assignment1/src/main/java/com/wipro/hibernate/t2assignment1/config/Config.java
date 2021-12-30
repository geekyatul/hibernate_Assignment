package com.wipro.hibernate.t2assignment1.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.wipro.hibernate.t1assignment2.models.Product;
import com.wipro.hibernate.t2assignment1.models.Employee;

public class Config {
	
	private static SessionFactory sessionFactory=null;
	
	   public static SessionFactory getSessionFactory()
	   {
		   if(sessionFactory==null)
		   {
			   Configuration configuration=new Configuration().configure().addAnnotatedClass(Employee.class);
		         
			   sessionFactory=configuration.buildSessionFactory();  
			   
		   }
		   return sessionFactory;
	   }

}
