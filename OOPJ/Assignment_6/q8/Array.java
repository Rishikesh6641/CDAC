package q8;

import java.util.Scanner;

public class Array {
	
	int[] arr;
	private static Scanner sc=new Scanner(System.in);
	
	public Array(int size)
	{
		this.arr=new int[size];
	}
	
	public void setArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			sc.nextLine();
			System.out.print("Enter Element");
			this.arr[i]=sc.nextInt();
		}
	}
	
	public void getArray(int index)
	{
		if(index>arr.length-1)
			System.out.println("invalid Index");
		else
			System.out.println(this.arr[index]);
	}

}
