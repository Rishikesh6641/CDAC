package org.Loan_Calculator;

import java.util.Scanner;

public class Loan_Calculator {
	
	float principal;
	int rate;
	int years;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord()
	{
		System.out.println("Enter Principal amount:");
		this.principal=sc.nextFloat();
	
		System.out.println("Enter Rate of intrest:");
		this.rate=sc.nextInt();
		
		System.out.println("Enter years:");
		this.years=sc.nextInt();
	}
	public double monthlyPayment()
	{
		float mir=this.rate/12;
		float nom=this.years*12;
		double sum=mir*1+Math.pow(mir, nom)/1+ Math.pow(mir, nom)-1;
		double mp=this.principal*sum;
		return mp;
	}
	public void display(double mp)
	{
		//System.out.println(this.principal);
		System.out.println("*************");
		System.out.println(this.principal-mp);
	}

	public static void main(String[] args)
	{
		Loan_Calculator lc=new Loan_Calculator();
		lc.acceptRecord();
		double mp=lc.monthlyPayment();
		lc.display(mp);
		
		
	}

}
