package q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	int[] arr;
	Scanner sc=new Scanner(System.in);
	public Main(int size)
	{
		this.arr=new int[size];
	}
	
	public void acceptRecord()
	{
		for(int i=0;i<this.arr.length;i++)
		{
			System.out.println("Enter Value : ");
			this.arr[i]=sc.nextInt();
		}
		
	}
	
	public void printRecord()
	{
		System.out.println(Arrays.toString(this.arr));
	}
	
	public void resourceclose()
	{
		sc.close();
	}
	public static void main(String[] args)
	{
		
		Main m=new Main(5);
		
		m.acceptRecord();
		
		m.printRecord();
		
		m.resourceclose();
	}
}
