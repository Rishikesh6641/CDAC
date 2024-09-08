package EmployeeUtil;

import Employee.Employee;
import java.util.Scanner;
public class EmployeeUtil {
	
	private Employee emp;
	Scanner sc=new Scanner(System.in);
	
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
		sc.nextLine();
		
		System.out.println("Enter Salary:");
		emp.setIn_salary(sc.nextDouble());
		
	}
	
	public void printRecord()
	{
		System.out.println("Empid "+emp.getEmpid());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getIn_salary());
	}
	/*public void CompanyRecord()
	{
		System.out.println("Total Employee: "+Employee.getTotal_employee());
		System.out.println("Total Expense: "+Employee.getTotal_salary());
		System.out.println("Raise Per: "+Employee.getPer());
	}*/	
	public Employee getemp()
	{
		return emp;
	}

}
