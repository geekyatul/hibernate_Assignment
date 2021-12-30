package com.wipro.hibernate.t5allassignment.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate.t5allassignment.config.Config;
import com.wipro.hibernate.t5allassignment.models.Car;


public class CarDao {
	
	
	  public void saveCar(Car car)
	  {
		  Transaction transaction=null;
		  
		  try(Session session=Config.getSessionFactory().openSession()) {
			  
			  transaction=session.beginTransaction();
			    session.save(car);
			    
			   transaction.commit();
			   session.close();
			  
		  }
		  catch (Exception e) {
			  if(transaction!=null)
				 transaction.rollback();
		
		}
	  }
	  
	  public List<Car> diplayAllCar()
	  {
		  Transaction transaction=null;
		  List<Car> listofCarList=null;
		  
		  try(Session session=Config.getSessionFactory().openSession()) {
			  
			  transaction=session.beginTransaction();
			  
			  String query="from Car";
			  listofCarList=session.createQuery(query).list();
			  
			  
			   transaction.commit();
			   session.close();
			  
		  }
		  catch (Exception e) {
			  if(transaction!=null)
				 transaction.rollback();
		
		}
		  return listofCarList;
	  }
	  
	
	  public List<Car> diplayManufacturerName()
	  {
		  Transaction transaction=null;
		  List<Car> listofCarList=null;
		  
		  try(Session session=Config.getSessionFactory().openSession()) {
			  
			  transaction=session.beginTransaction();
			  
			  String query="from Car as car where car.manufacturer like 'V%' ";
			  listofCarList=session.createQuery(query).list();
			  
			  
			   transaction.commit();
			   session.close();
			  
		  }
		  catch (Exception e) {
			  if(transaction!=null)
				 transaction.rollback();
		
		}
		  return listofCarList;
	  }
    
	  public Car searchByRegNo(String regNo)
	  {
		  Transaction transaction=null;
		  Car car=null;
		  
		  try(Session session=Config.getSessionFactory().openSession()) {
			  
			  transaction=session.beginTransaction();
			  
			  String queryString="from Car as car where car.regNo=:id ";
			  Query query=session.createQuery(queryString);
			  query.setParameter("id",regNo);
			    car=(Car) query.getSingleResult();
			   
			    
			   transaction.commit();
			   session.close();
			  
		  }
		  catch (Exception e) {
			  if(transaction!=null)
				 transaction.rollback();
		
		}
		  return car;
	  }

	  public List<Car> allCarsPriceLessThanSixLpa()
	  {
		  Transaction transaction=null;
		  List<Car> listofCars=null;
		  
		  try(Session session=Config.getSessionFactory().openSession()) {
			  
			  transaction=session.beginTransaction();
			  
			  String queryString="from Car as car where car.price<=600000 ";
			    listofCars=session.createQuery(queryString).list();
			   
			    
			   transaction.commit();
			   session.close();
			  
		  }
		  catch (Exception e) {
			  if(transaction!=null)
				 transaction.rollback();
		
		}
		  return listofCars;
	  }

}
