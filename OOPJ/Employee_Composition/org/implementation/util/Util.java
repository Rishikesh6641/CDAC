package org.implementation.util;

import java.time.LocalDate;
import java.util.Scanner;

import org.implementation.employee.Employee;

public class Util {
	
	private Employee emp;
	private static Scanner sc=new Scanner(System.in);
	public Util()
	{
		this.emp=new Employee();
	}
	
	public void acceptRecord()
	{
		System.out.println("Enter Employee id:");
		emp.setEmpid(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Employee Name:");
		emp.setName(sc.nextLine());
		

		System.out.println("Enter Salary:");
		emp.setSalary(sc.nextFloat());
	}
	
	public void setJoiningDate()
	{
		LocalDate ldt=LocalDate.now();
		
		int day=ldt.getDayOfMonth();
		emp.getJoining_date().setDay(day);
		
		int month=ldt.getMonthValue();
		emp.getJoining_date().setMonth(month);
		
		int year=ldt.getYear();
		emp.getJoining_date().setYear(year);
	}
	public void printRecord()
	{
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getJoining_date().toString());
	}
	static public Menu menulist()
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.PrintReocrd");
		System.out.println("3.Set Date");
		
		return Menu.values()[sc.nextInt()];
	}
	
	public static void closeResource()
	{
		sc.close();
	}

}
