package EmployeeUtil;

import Employee.Employee;
import java.util.Scanner;
public class EmployeeUtil {
	
	private Employee emp;
	static Scanner sc=new Scanner(System.in);
	
	public EmployeeUtil()
	{
		this.emp=new Employee();
	}
	
	public void accept()
	{
		System.out.println("Enter Empid:");
		emp.setEmpid(sc.nextInt());
		sc.nextLine();

		System.out.println("Name:");
		emp.setName(sc.nextLine());
		
		
		System.out.println("Enter Salary:");
		emp.setIn_salary(sc.nextDouble());
		
		System.out.println("Enter What per You want to raise the Salary:");
		Employee.setPer(sc.nextFloat());
		
	}
	
	public void printRecord()
	{
		System.out.println("Empid "+emp.getEmpid());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getIn_salary());
	}
	public void CompanyRecord()
	{
		System.out.println("Total Employee: "+Employee.getTotal_employee());
		System.out.println("Total Expense: "+Employee.getTotal_salary());
		System.out.println("Raise Per: "+Employee.getPer());
	}
	public static int menulist()
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record of Employee");
		System.out.println("2.Raise Salary");
		System.out.println("3.Print Recors Of Employee");
		System.out.println("4.Print Record of Company");

		System.out.println("Enter Choice:");
		
		return sc.nextInt();
	}
	public Employee getemp()
	{
		return emp;
	}
	public void closeResource()
	{
		sc.close();
	}

}
