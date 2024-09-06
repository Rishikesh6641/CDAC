package org.Compound_Interest_Calculator_for_Investment;

import java.util.Scanner;

public class Main {
	
	float ii;
	float air;
	float not;
	float years;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Initial Investment:");
		this.ii=sc.nextFloat();
		
		System.out.println("Enter annual investment rate:");
		this.air=sc.nextFloat();
		
		System.out.println("Enter Number of Compounds:");
		this.not=sc.nextFloat();
		
		System.out.println("Enter Years:");
		this.years=sc.nextFloat();
		
		sc.close();		
	}
	
	public double futureValueCalculation()
	{
		double eq=this.air*this.years;
		double sum=1+this.air/Math.pow(this.not,eq);
		double futurevalue=this.ii*sum;
		return futurevalue;
	}
	
	public void printresult(double futurevalue)
	{
		double totalin=futurevalue-this.ii;
		System.out.println(totalin);
	}
	
	public static void main(String[] args)
	{
		Main m=new Main();
		
		m.acceptRecord();
		double ans=m.futureValueCalculation();
		m.printresult(ans);
		
	}

}
