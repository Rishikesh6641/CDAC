package org.example.vehicle;

import java.util.Scanner;

class Vehicle{
	private int year;
	private String make;
	
	public Vehicle()
	{
		
	}
	public Vehicle(int year, String make)
	{
		this.year=year;
		this.make=make;
	}
	
	@Override
	public String toString() {
		
		return this.year+" "+this.make;
	}
}
class Car extends Vehicle
{
	private String modle;
	
	public Car(int year,String make,String modle)
	{
		super(year,make);
		this.modle=modle;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+this.modle;
	}
}
public class Program {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Make:");
		String make=sc.nextLine();
		
		System.out.println("Enter Modle:");
		String m=sc.nextLine();
		
		Car c=new Car(year,make,m);
		System.out.println(c.toString());
		sc.close();
	}
}

/*Create a base class Vehicle with attributes like make and year. 
Provide a constructor in Vehicle to initialize these attributes.
Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model.
Write a program to create a Car object and display its details.*/


