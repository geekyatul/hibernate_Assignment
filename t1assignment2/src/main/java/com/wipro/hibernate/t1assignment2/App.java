package com.wipro.hibernate.t1assignment2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.wipro.hibernate.t1assignment2.models.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println( "Hello World!" );
        
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Product.class);
         
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        
        Transaction transaction=session.beginTransaction();
        
        Product product1=new Product("Bag",12323);
        Product product2=new Product("Pen",12323);
        Product product3=new Product("Computer",12323.45f);
        Product product4=new Product("Copy",1232.3f);
        Product product5=new Product("Mobile",12.323f);
        Product product6=new Product("Power Bank",133.f);
        Product product7=new Product("Note",14534);
        Product product8=new Product("Sticker",1233323);
        Product product9=new Product("Earphone",123723);
        Product product10=new Product("Phone",1232453);
        
        session.save(product1);
        session.save(product2);
        session.save(product3);
        session.save(product4);
        session.save(product5);
        session.save(product6);
        session.save(product7);
        session.save(product8);
        session.save(product9);
        session.save(product10);
        
         transaction.commit();
         session.close();
       
    }
}
