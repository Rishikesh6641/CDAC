package Implemenntaton.array;

import java.util.Arrays;

public class Array {
	
	int[][] arr;
	
	public Array(int row, int col)
	{
		this.arr=new int[row][col];
	}
	public void Book(int seat)
	{
		int row=(seat/10)-1;
		int col=(seat%10)-1;
		this.arr[row][col]=1;
		System.out.println("Seat no "+seat+" Booked");
	}
	
	public void canclebooking(int seat)
	{
		int row=(seat/10)-1;
		int col=(seat%10)-1;
		this.arr[row][col]=0;
		System.out.println("Seat no "+seat+" Booking cancled");
	}
	
	public void Available(int seat)
	{
		int row=(seat/10)-1;
		int col=(seat%10)-1;
		if(this.arr[row][col]==0)
			System.out.println("Seat no "+seat+" Available");
		else
			System.out.println("Seat no "+seat+" not Available");
	}
	public void displayChart()
	{
		for(int i=0;i<this.arr.length;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		//System.out.println(Arrays.deepToString(arr));
	}

}
