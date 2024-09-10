package q4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	int[] arr;
	private static Scanner sc=new Scanner(System.in);
	public Array(int size)
	{
		this.arr=new int[size];
	}
	public void setElement()
	{
		for(int i=0;i<arr.length;i++)
		{
			sc.nextLine();
			System.out.print("Enter Element");
			
			this.arr[i]=sc.nextInt();
		}
	}
	public void getElement()
	{
		System.out.println(Arrays.toString(this.arr));
	}
	public void removeDuplicate()
	{
		for(int i=0;i<this.arr.length;i++)
		{
			for(int j=i+1;j<this.arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}
	}
}
