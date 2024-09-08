package tester;

import java.util.Scanner;

import Employee.Employee;
import EmployeeUtil.EmployeeUtil;

public class Tester {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		EmployeeUtil eu=new EmployeeUtil();
		//EmployeeUtil eu2=new EmployeeUtil();
		
		eu.accept();
		//eu2.accept();
		
		eu.printRecord();
		System.out.println();
		//eu2.printRecord();
		
		System.out.println("Enter Per:");
		Employee.setPer(sc.nextFloat());
		
		//eu.CompanyRecord();
		
		System.out.println("*************");
		
		//eu.CompanyRecord();
		eu.getemp().raise();
		System.out.println("Company Record");
		System.out.println(Employee.getTotal_employee()+" "+Employee.getPer()+" "+Employee.getTotal_salary());
		eu.printRecord();
		
		sc.close();
	}

}
