package org.implementation.employee;

import org.implementation.date.Date;

public class Employee {
	
	private String name;
	private int empid;
	private float salary;
	private Date joining_date=new Date();
	
	public Employee()
	{
		this.name="";
		this.empid=0;
		this.salary=0.0f;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	

}
