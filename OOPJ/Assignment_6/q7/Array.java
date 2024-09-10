package q7;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	int[] arr;
	private static Scanner sc=new Scanner(System.in);
	
	public Array(int size)
	{
		this.arr=new int[size];
	}
	
	public void acceptRecord()
	{
		for(int i=0;i<arr.length;i++)
		{
			sc.nextLine();
			System.out.print("Enter Element");
			this.arr[i]=sc.nextInt();
		}
	}
	
	public void printRecord()
	{
		System.out.println(Arrays.toString(this.arr));
	}
}
