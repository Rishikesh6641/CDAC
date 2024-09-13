package BankAccount;
import java.util.Scanner;
class Bank
{
	private int ac_no;
	private String name;
	private float balance;
	private int pin;
	static String Bankname="State Bank of India";
	private static Scanner sc=new Scanner(System.in);
	
	public Bank()
	{
	}
	public Bank(int ac_no,String name,int pin)
	{
		this.ac_no=ac_no;
		this.name=name;
		this.pin=pin;
	}
		public void Deposit()
	{
		System.out.println("Enter Pin:");
		if(this.pin==sc.nextInt())
		{
			System.out.println("Enter  the amount:");
			this.balance+=sc.nextFloat();	
			System.out.println("Balance:"+balance);
		}
		else 
			System.out.println("Invalid pin");
	}
	public void Withdraw()
	{
		System.out.println("Enter Pin:");
		if(this.pin==sc.nextInt())
		{
			sc.nextLine();
			this.balance-=sc.nextFloat();	
			System.out.println("Balance:"+balance);
		}
		else 
			System.out.println("Invalid pin");
	}
	@Override
	public String toString() {
		return this.name+" "+this.ac_no+" "+Bank.Bankname;
	}
}
class Saving extends Bank
{
	private static float limit=15000.0f;
	private static Scanner sc=new Scanner(System.in);
	public Saving(int ac_no,String name,int pin)
	{
		super(ac_no,name,pin);
	}	
	@Override
	public void Withdraw() {
		System.out.println("Enter  the amount:");
		if(sc.nextInt()>limit)
		{
			System.out.println("Limit of saving : "+limit);
		}
		else
		super.Withdraw();
	}
	@Override
	public String toString() {
		return super.toString()+" "+Saving.limit;
	}
}
public class Program {
	public static void main(String arggs[])
	{
		Saving s=new Saving(1001,"Rishikesh",2001);
		s.Deposit();
		s.Withdraw();
	}
}



















