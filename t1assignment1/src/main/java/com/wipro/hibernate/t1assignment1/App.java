package com.wipro.hibernate.t1assignment1;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import com.wipro.hibernate.t1assignment1.models.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Employee.class);
         
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        
        Employee employee1=new Employee("Atul Patel","Manager",700000);
        Employee employee2=new Employee("Ajay Yadav","Manager",800000);
        Employee employee3=new Employee("Amit Yadav","Manager",500000);
        Employee employee4=new Employee("Sachin Singh","Manager",700000);
        Employee employee5=new Employee("Rahul Patel","Manager",400000);
        Employee employee6=new Employee("Deepak Parita","Manager",70430000);
        Employee employee7=new Employee("Lalit Rathore","HR",500000);
        Employee employee8=new Employee("Anshul Gandhi","Manager",7800000);
        Employee employee9=new Employee("Mohit Singh","HR",700565000);
        Employee employee10=new Employee("Tarun Rathore","Manager",700045400);
        
        Transaction transaction=session.beginTransaction();
        
          session.save(employee1);
          session.save(employee2);
          session.save(employee3);
          session.save(employee4);
          session.save(employee5);
          session.save(employee6);
          session.save(employee7);
          session.save(employee8);
          session.save(employee9);
          session.save(employee10);
          
          transaction.commit();
          
          session.close();
        
    
    }
}
