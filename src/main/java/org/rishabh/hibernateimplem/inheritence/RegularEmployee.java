package org.rishabh.hibernateimplem.inheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//Implementing SINGLE TABLE inheritence strategy

@Entity
@DiscriminatorValue("REGULAR_EMPLOYEE")
public class RegularEmployee extends Employee{

	float salary;
	int bonus;
	
	public RegularEmployee(){
		
	}
	
	public RegularEmployee(float salary,int bonus){
		this.salary= salary;
		this.bonus =bonus;
	}
	
	public RegularEmployee(String name,float salary,int bonus){
		super(name);
		this.salary= salary;
		this.bonus =bonus;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
