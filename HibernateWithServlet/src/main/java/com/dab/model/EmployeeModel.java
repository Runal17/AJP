package com.dab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeModel {
	@Id
	private int empid;
	private String empname;
	private String desig;
	private String comp;
	private String email;
	
	
	
}
