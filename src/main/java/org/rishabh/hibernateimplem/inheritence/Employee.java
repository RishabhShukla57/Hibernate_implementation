package org.rishabh.hibernateimplem.inheritence;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GeneratorType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	//@Column(name="emp_id")
	protected int id;
	@Column(name="Name_of_employee")
	protected String name;
	
	public Employee(){
		
	}
	
	public Employee(String name){
		this.name =  name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
