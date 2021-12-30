package com.wipro.hibernate.t2assignment1;

import java.util.List;

import com.wipro.hibernate.t2assignment1.dao.EmployeeDao;
import com.wipro.hibernate.t2assignment1.models.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EmployeeDao employeeDao=new EmployeeDao(); 
        
        Employee emp1=new Employee("Atul patel","B1");
        
        //save the object 
        employeeDao.saveEmployee(emp1);
        
        //get all the employee
        List<Employee> employeeList=employeeDao.getAllEmployee();
        for(Employee emp:employeeList)
        {
        	System.out.println(emp);
        }
        
        //update employee whoes id is 23
        
        // first fetch the value 
        Employee employee=employeeDao.getEmployeeById(23);
        employee.setEmployeeName("Amit Yadav");
        employeeDao.updateEmployee(employee);
        
        //delete whoes id is 23
        
         employeeDao.deleteEmployeeById(23);
        
    }
}
