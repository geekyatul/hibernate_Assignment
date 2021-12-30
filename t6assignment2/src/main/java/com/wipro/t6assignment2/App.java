package com.wipro.t6assignment2;

import javax.crypto.Cipher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.t6assignment2.config.Config;
import com.wipro.t6assignment2.model.Contract_Employee;
import com.wipro.t6assignment2.model.Employee;
import com.wipro.t6assignment2.model.Regular_Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting of assignment 6 assign 2---------------------------------" );
        
        SessionFactory sessionFactory=Config.getSessionFactory();
        
        Session session=sessionFactory.openSession();
        
        Transaction transaction=session.beginTransaction();
        
        Employee employee1=new Employee("atul patel",22500);
        
        Regular_Employee regular_employee=new Regular_Employee("amit yadav",24343);
            regular_employee.setQplc(4000);          
        
         Contract_Employee contract_employee =new Contract_Employee("Rahul Patel",354645);
              contract_employee.setAllowance(3454);
            
             session.save(employee1);
             session.save(regular_employee);
             session.save(contract_employee);
             
             transaction.commit();
             session.close();
             
             System.out.println("the end of program--------------------------------------");
    }
}
