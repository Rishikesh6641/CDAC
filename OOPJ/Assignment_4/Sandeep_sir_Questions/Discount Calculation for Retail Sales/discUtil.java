package discountUtil;

import java.util.Scanner;

import discount.Discount;

public class discUtil {
	
	private Discount d;
	Scanner sc=new Scanner(System.in);
	public discUtil()
	{
		this.d=new Discount();
	}
	
	public void accept()
	{
		System.out.print("Enter Price: ");
		d.setOriginal_p(sc.nextFloat());
		
		System.out.println("Enter Discount per:");
		d.setPer(sc.nextFloat());
	}
	
	public void printRecord()
	{
		System.out.println("Original Price: "+d.getOriginal_p());
		System.out.println("Disc per: "+d.getPer());
		System.out.println("Price after Disc: "+d.finalprice());
	}
	public int menulist()
	{
		int choice;
		
		System.out.println("0.Exit");
		System.out.println("1.acceptRecord");
		System.out.println("2.printRecord");
		
		choice=sc.nextInt();
		return choice;
	}
	public void closeResources()
	{
		sc.close();
	}
}
