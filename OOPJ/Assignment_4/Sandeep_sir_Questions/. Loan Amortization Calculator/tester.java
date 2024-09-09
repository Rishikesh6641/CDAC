package tester;

import java.util.Scanner;
import LoanUtil.LoanUtil;

public class tester {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LoanUtil lu=new LoanUtil();
		
		System.out.println("Enter Principal Amount:");
		float principal=sc.nextFloat();
		
		System.out.println("Enter annualIntrest:");
		float annualIntrest=sc.nextFloat();
		
		System.out.println("Enter terms:");
		int terms=sc.nextInt();
		
		lu.acceptRecord(principal,annualIntrest,terms);
		
		lu.printRecord(principal,annualIntrest,terms);		
		
		sc.close();
	}

}
