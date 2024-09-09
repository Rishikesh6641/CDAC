package CompoundUtil;

import java.util.Scanner;

import CompoundIntrest.Compound;

public class CompoundUtil {
	
	private Compound com;
	Scanner sc=new Scanner(System.in);
	public CompoundUtil()
	{
		this.com=new Compound();
	}
	
	public void acceptRecords()
	{
		
		System.out.println("Enter Intial Invetment:");
		com.setIntitalInvestment(sc.nextDouble());
		
		System.out.println("Enter Annual Intrest:");
		com.setAnnualntrest(sc.nextFloat());
		
		System.out.println("Enter Terms:");
		com.setTerms(sc.nextInt());
		
		System.out.println("Enter Duration:");
		com.setDuration(sc.nextFloat());
		//sc.nextLine();
		//sc.close();
	}
	
	public void printRecord()
	{
		System.out.println(com.getAnnualntrest());
		System.out.println(com.getDuration());
		System.out.println(com.getIntitalInvestment());
		System.out.println(com.getTerms());
	}

	public Compound getCom() {
		return com;
	}
	public int menulist()
	{
		System.out.println("0.Exit");
		System.out.println("1.AcceptRecord");
		System.out.println("2.PrintRecord");
		System.out.println("3.Get Future Value");
		
		return sc.nextInt();
	}
	public void CloseResource()
	{
		sc.close();
	}

}
