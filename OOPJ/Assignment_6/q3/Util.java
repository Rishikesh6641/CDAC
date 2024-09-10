package q3;

import java.util.Scanner;

public class Util {
	
	private Array a;
	static Scanner sc=new Scanner(System.in);
	public Util()
	{
		System.out.println("Enter Size:");
		this.a=new Array(sc.nextInt());
	}
	public void acceptRecord()
	{
		a.setElement();
	}
	public void printRecord()
	{
		a.getElement();
	}
	public void getmin()
	{
		System.out.println("Min element: "+a.getMin());
	}
	public void  getLargest()
	{
		System.out.println("Max element: "+a.getLargest());
	}	
	public static IoOpreation menulist()
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept");
		System.out.println("2.Largest Element");
		System.out.println("3.Smallest Element ");
		System.out.println("4.Print");
		return IoOpreation.values()[sc.nextInt()];
	}

}
