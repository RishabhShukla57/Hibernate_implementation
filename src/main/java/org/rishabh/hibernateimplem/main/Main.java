package org.rishabh.hibernateimplem.main;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.rishabh.hibernateimplem.inheritence.ContractEmployee;
import org.rishabh.hibernateimplem.inheritence.Employee;
import org.rishabh.hibernateimplem.inheritence.RegularEmployee;
import org.rishabh.hibernateimplem.persistence.HibernateUtil;

public class Main {
	public static void main(String [] args){
		/*Stock stock = new Stock();
		stock.setStockCode("AMB");
		stock.setStockName("AMBUJA CEMENT");
		StockDetail stockDetail = new StockDetail("Good Share", "Ambuja group");
		stock.setStockDetail(stockDetail);
		stock.setStockPrice(923);
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session  =  sessionFactory.openSession();
		session.beginTransaction();
		session.save(stockDetail);
		session.save(stock);
		session.getTransaction().commit();
		sessionFactory.close();
		*/
		
		
		
			inheritenceStrategy();
		
		
		
		
		
	}
	
	
	static void inheritenceStrategy()  
			{
		Session inSession = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction t =  inSession.beginTransaction();
		Employee employee = new Employee("rishabh");
		ContractEmployee contractEmployee = new ContractEmployee("satyam",20,"2 months");
		RegularEmployee regularEmployee = new RegularEmployee("Kriti",1000, 130);
		RegularEmployee regularEmployee1 = new RegularEmployee(1003, 13);
		inSession.save(employee);
		inSession.save(contractEmployee);
		inSession.save(regularEmployee);
		t.commit();
		inSession.close();
		
	}

}
