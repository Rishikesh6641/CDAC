package q3;

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
		for(int element:this.arr)
		{
			System.out.println(element);
		}
	}
	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		for(int ele:this.arr)
		{
			if(ele>largest)
				largest=ele;
		}
		return largest;
	}
	public int getMin()
	{
		int min=Integer.MAX_VALUE;
		
		for(int ele:this.arr)
		{
			if(min>ele)
				min=ele;
		}
		return min;
	}
}
