package org.discount.counter;
import java.util.Scanner;

public class discount {
	
	private int amount;
	private float disc;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount:");
		this.amount=sc.nextInt();
		System.out.println("Enter Discount percentage");
		this.disc=(float)sc.nextFloat();
		
	}
	
	public void display()
	{
		float discount=this.amount*(this.disc/100);
		System.out.println("Discounted amount:"+discount);
		float finalprice=this.amount-discount;
		System.out.println("Final price: "+ finalprice);
	}
	public static void main(String[] args)
	{
		discount d=new discount();
		d.acceptRecord();
		d.display();
	}

}
