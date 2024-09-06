package org.Employee;
import java.util.Scanner;

public class Employee {
	
	int empid;
	String name;
	float Salary;
	String city;
	static Scanner sc=new Scanner(System.in);
	public void setRecord()
	{
		System.out.println("Enter Employee Id:");
		this.empid=Employee.sc.nextInt();
		Employee.sc.nextLine();
		System.out.println("Enter Name");
		this.name=Employee.sc.nextLine();
		System.out.println("Enter Salary:");
		this.Salary=Employee.sc.nextFloat();
		Employee.sc.nextLine();
		System.out.println("Enter City:");
		this.city=Employee.sc.nextLine();
	}
	
	public void getRecord()
	{
		System.out.println("Name:"+this.name);
		System.out.println("ID:"+this.empid);
		System.out.println("Salary:"+this.Salary);
		System.out.println("City:"+this.city);
	}
	
	
	public static void main(String args[]) {
		Employee e=new Employee();
		
		e.setRecord();
		e.getRecord();
	}

}
