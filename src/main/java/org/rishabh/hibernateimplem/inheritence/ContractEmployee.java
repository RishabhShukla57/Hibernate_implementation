package org.rishabh.hibernateimplem.inheritence;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//Implementing SINGLE TABLE inheritence strategy



@Entity
@DiscriminatorValue(value="CONTRACT_EMPLOYEE")
public class ContractEmployee extends Employee {
	float pay_per_hour;
	String contracr_period;
	
	public ContractEmployee(){
		
	}
	
	public ContractEmployee(String name, float pay_per_hour,String contracr_period){
		super(name);
		this.pay_per_hour=pay_per_hour;
		this.contracr_period= contracr_period;
	}
	
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContracr_period() {
		return contracr_period;
	}
	public void setContracr_period(String contracr_period) {
		this.contracr_period = contracr_period;
	}
	
	

}