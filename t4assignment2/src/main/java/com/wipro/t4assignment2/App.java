package com.wipro.t4assignment2;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.t4assignment2.config.Config;
import com.wipro.t4assignment2.model.Employee;
import com.wipro.t4assignment2.model.PassPort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting of the application -----------------------------" );
        
        SessionFactory sessionFactory=Config.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
        PassPort passPort1=new PassPort(1,"India");
        
        PassPort passPort2=new PassPort(2,"America");
        
        Employee employee1=new Employee(1, "atul patel", passPort1);
        
        Employee employee2=new Employee(2,"ajay Yadav",passPort2);
        
          session.save(passPort1);
          session.save(passPort2);
          
           session.save(employee1);
           session.save(employee2);
           
         session.remove(employee1);
           
           transaction.commit();
           
           session.close();
          
        
        
        
        
        
    }
}
