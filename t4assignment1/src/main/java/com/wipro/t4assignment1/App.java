package com.wipro.t4assignment1;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.t4assignment1.config.Config;
import com.wipro.t4assignment1.model.Department;
import com.wipro.t4assignment1.model.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting of application " );
        
        SessionFactory sessionFactory=Config.getSessionFactory();
        
        Session session=sessionFactory.openSession();
       org.hibernate.Transaction transaction=session.beginTransaction();
       
       
       Department department1=new Department();
       department1.setId(1);
       department1.setDepartmentName("It");
       
       
       Department department2=new Department();
       department2.setId(2);
       department2.setDepartmentName("Manger");
       
       Employee employee1=new Employee(1, "atul patel", "Backend-Enginner", department1);
       
       Employee employee2=new Employee(2, "Aman Gupta", "Associate-1", department1);
       
       List<Employee> employeeListOfdepartment1=new ArrayList<>();
       
       employeeListOfdepartment1.add(employee1);
       employeeListOfdepartment1.add(employee2);
         
         department1.setEmployee(employeeListOfdepartment1);
         
       
         
         Employee employee3=new Employee(3, "Ajay Yadav", "General", department2);
         
         Employee employee4=new Employee(4, "Aman Gupta", "Hr-Manger", department2);
         
         List<Employee> employeeListOfdepartment2=new ArrayList<>();
         
         employeeListOfdepartment2.add(employee3);
         employeeListOfdepartment2.add(employee4);
           
           department1.setEmployee(employeeListOfdepartment2);
           
           
           session.save(department1);
           session.save(department2);
           
           session.save(employee1);
           session.save(employee2);
           session.save(employee3);
           session.save(employee4);
           
           session.remove(department1);
           
           
           
           transaction.commit();
           
           session.close();
           
           
         
       
       
       
       
       
        
        
        
        
    }
}
