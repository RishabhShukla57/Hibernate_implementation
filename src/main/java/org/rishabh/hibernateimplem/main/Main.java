package org.rishabh.hibernateimplem.main;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.rishabh.hibernateimplem.model.Stock;
import org.rishabh.hibernateimplem.persistence.HibernateUtil;

public class Main {
	public static void main(String [] args){
		Stock stock = new Stock();
		stock.setStockCode("AMB");
		stock.setStockName("AMBUJA CEMENT");
		
		stock.setStockPrice(923);
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session  =  sessionFactory.openSession();
		session.beginTransaction();
		session.save(stock);
		session.getTransaction().commit();
		sessionFactory.close();
		
	}

}
