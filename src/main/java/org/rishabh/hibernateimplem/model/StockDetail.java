package org.rishabh.hibernateimplem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockDetail {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int stockDetailId;
	String comments;
	String investors;
	
	
	public StockDetail(String comments, String investors) {
		super();
		this.comments = comments;
		this.investors = investors;
	}
	
	public int getStockDetailId() {
		return stockDetailId;
	}

	public void setStockDetailId(int stockDetailId) {
		this.stockDetailId = stockDetailId;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getInvestors() {
		return investors;
	}
	public void setInvestors(String investors) {
		this.investors = investors;
	}
	
	
	

}
