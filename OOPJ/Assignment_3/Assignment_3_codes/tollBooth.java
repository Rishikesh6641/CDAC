package org.toll_booth;
import java.util.Scanner;

public class tollBooth {
	
	int car;
	int motorcycle;
	int truck;
	Scanner sc=new Scanner(System.in);
	public void carRecord()
	{
		this.car++;
		System.out.println("Enter Number:");
		String num=sc.nextLine();
		System.out.println(num);
		System.out.println("Toll Recived!!!");
		
	}
	public void bikeRecord()
	{
		this.motorcycle++;
		System.out.println("Enter Number:");
		String num=sc.nextLine();
		System.out.println(num);
		System.out.println("Toll Recived!!!");
	}
	public void truckRecord()
	{
		this.truck++;
		System.out.println("Enter Number:");
		String num=sc.nextLine();
		System.out.println(num);
		System.out.println("Toll Recived!!!");
	}
	public void revenue()
	{
		int rev=(this.car*50)+(this.motorcycle*30)+(this.truck*100);
		System.out.println("Total Earned:"+rev);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		tollBooth tb=new tollBooth();
		int flag=1;
		
		int choice=0;
		
		do
		{
			System.out.println("Enter Choice:");
			System.out.println("Enter 1 for Car:");
			System.out.println("Enter 2 for Bike:");
			System.out.println("Enter 3 for Truck:");
			System.out.println("Enter 4 for Revenue:");
			System.out.println("Enter 5 Exit:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:tb.carRecord();
					break;
			case 2:tb.bikeRecord();
					break;
			case 3:tb.truckRecord();
					break;
			case 4:System.out.println("Revenue Genrated");
					tb.revenue();
					break;
			default:flag=0;
				
			}
			
		}while(flag!=0);
		sc.close();
	}

}
