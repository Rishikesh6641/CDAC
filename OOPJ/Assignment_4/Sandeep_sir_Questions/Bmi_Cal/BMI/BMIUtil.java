package BMI;

import java.util.Scanner;

public class BMIUtil {
	
	private BMITracker bmit;
	
	Scanner sc=new Scanner(System.in);
	public BMIUtil()
	{
		this.bmit=new BMITracker();
	}
	
	public void acceptRcord()
	{
		System.out.print("Enter Weight");
		bmit.setWeight(sc.nextDouble());
		sc.nextLine();
		System.out.print("Enter Height");
		bmit.setHeight(sc.nextDouble());
		
	}
	
	public void printRecord()
	{
		System.out.println(bmit.getHeight());
		System.out.println(bmit.getWeight());
		double bmi=bmit.Calculate();
		System.out.println("BMI: "+bmi);
		if(bmi>=30)
			System.out.println("obese");
		else if(bmi<30 && bmi>=25)
			System.out.println("Overweight");
		else if(bmi<25 && bmi>=18)
			System.out.println("Normal");
		else
			System.out.println("UnderWeight");
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
	
	public void Resourcerelease()
	{
		sc.close();
	}
}
