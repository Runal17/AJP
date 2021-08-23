package com.hibernate.demo;

import java.time.LocalDate;

import javax.persistence.Id;


@javax.persistence.Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private Double empSalary;
	private boolean isEmpperm;
	private LocalDate empDateOfJoining;
	
	
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(int empId, String empName, Double empSalary, boolean isEmpperm, LocalDate empDateOfJoining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.isEmpperm = isEmpperm;
		this.empDateOfJoining = empDateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", isEmpperm="
				+ isEmpperm + ", empDateOfJoining=" + empDateOfJoining + "]";
	}
	
	
}
