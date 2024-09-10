package Implemenntaton.array;

import java.util.Scanner;

public class Main {
	
	static Scanner sc=new Scanner(System.in);
	
	public static IOperation menulist()
	{
		System.out.println("0.Exit");
		System.out.println("1.Book");
		System.out.println("2.cancle Booking");
		System.out.println("3.Display Chart");
		System.out.println("4.Avaiblity");
		
		return IOperation.values()[sc.nextInt()];
	}
	
	public static void main(String[] args)
	{
		
		Main m=new Main();
		
		System.out.print("Enter Rows: ");
		int row=sc.nextInt();
		System.out.print("Enter Coloumn: ");
		int col=sc.nextInt();
		Array a=new Array(row,col);
		
		IOperation ch;
		
		while((ch=m.menulist())!=IOperation.Exit)
		{
			switch(ch)
			{
			case book:
				System.out.print("Enter Seat  No: ");
				a.Book(sc.nextInt());
				break;
			case cancle:
				System.out.print("Enter Seat  No: ");
				a.canclebooking(sc.nextInt());
				break;
			case chart:
				a.displayChart();
				break;
			case available:
				System.out.print("Enter Seat  No: ");
				a.Available(sc.nextInt());
				break;
			}
		}
	}

}
