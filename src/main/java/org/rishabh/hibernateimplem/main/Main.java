package org.rishabh.hibernateimplem.main;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.rishabh.hibernateimplem.model.Stock;
import org.rishabh.hibernateimplem.model.StockDetail;
import org.rishabh.hibernateimplem.persistence.HibernateUtil;

public class Main {
	public static void main(String [] args){
		oneToOneRelationship();
	}
	
	
	static void oneToOneRelationship()  
	{
		Session inSession = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction t =  inSession.beginTransaction();
		Stock stock = new Stock("AMB","AMBUJA CEMENT",923);
		StockDetail stockDetail = new StockDetail("Good Share", "Ambuja group");
		stock.setStockDetail(stockDetail);
		inSession.save(stock);
		inSession.save(stockDetail);
		t.commit();
		inSession.close();

}

}
