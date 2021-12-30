package com.wipro.hibernate.t3assignment2;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.t3assignment2.config.Config;
import com.wipro.hibernate.t3assignment2.models.Question;

/**
 * Hello world!
 *
 */
public class App 
{
	  static SessionFactory sessionFactory=Config.getSessionFactory();
	
    public static void main( String[] args )
    {
        System.out.println("Start of assignment");
        
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
        System.out.println("Start of assignment");
        
        Question q1=new Question("Cleanest city of India?","Indore");
        List<String> options=new ArrayList<>();
        options.add("Banglore");
        options.add("Jabalpur");
        options.add("Chennai");
        options.add("Gujrat");
        q1.setOptions(options);
        
        Question q2=new Question("Who is prime minster of India?","Narendra Modi");
        List<String> options2=new ArrayList<>();
        options2.add("Narendra Modi");
        options2.add("Rahul Gandhi");
        options2.add("Atul Patel");
        options2.add("Akshay Kumar");
        q2.setOptions(options2);
       
        
        session.persist(q1);
        session.persist(q2);
        transaction.commit();
        session.close();
        
        
        
    }
}
