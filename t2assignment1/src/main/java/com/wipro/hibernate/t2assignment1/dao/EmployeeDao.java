package com.wipro.hibernate.t2assignment1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate.t2assignment1.config.Config;
import com.wipro.hibernate.t2assignment1.models.Employee;


public class EmployeeDao {
	
	
	public void saveEmployee(Employee employee)
	{
		Transaction transaction=null;
		
		try(Session session=Config.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.save(employee);
			
			transaction.commit(); 
		}catch (Exception e) {
			if(transaction!=null)
			{
				transaction.rollback();
			}
			System.out.println("Error Messgage"+e.getMessage());
		}
		
	} 
	
	public void updateEmployee(Employee employee)
	{
		Transaction transaction=null;
		
		try(Session session=Config.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.saveOrUpdate(employee);
			
			transaction.commit(); 
		}catch (Exception e) {
			if(transaction!=null)
			{
				transaction.rollback();
			}
			System.out.println("Error Messgage"+e.getMessage());
		}
		
	} 
	
	public Employee getEmployeeById(int id)
	{
		Transaction transaction=null;
		
		Employee employee=null;
		try(Session session=Config.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			
		   employee=session.get(Employee.class, id);
			
			transaction.commit(); 
		}catch (Exception e) {
			if(transaction!=null)
			{
				transaction.rollback();
			}
			System.out.println("Error Messgage"+e.getMessage());
		}
		return employee;
		
	} 
	
	public List<Employee> getAllEmployee()
	{
		Transaction transaction=null;
		List<Employee> employeesList=null;
		try(Session session=Config.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			
			employeesList=session.createQuery("from Employee").list();
			
			transaction.commit();
			
		}catch (Exception e) {
			
		    if(transaction!=null)
		    	 transaction.rollback();
		}
		return employeesList;
	}
	
	public void deleteEmployeeById(int id)
	{
		Transaction transaction=null;
		Employee employee=null;
		try(Session session=Config.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			
			employee=session.get(Employee.class, id);
			session.remove(employee);
			
			transaction.commit();
			
		}catch (Exception e) {
			
		    if(transaction!=null)
		    	 transaction.rollback();
		}
	
	}
	
	

}
