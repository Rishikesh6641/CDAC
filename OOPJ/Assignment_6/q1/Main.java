package q1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println(Arrays.toString(arr));
		
		for(int index=0;index<arr.length;index++)
		{
			System.out.println("Enter Value a["+index+"] :");
			arr[index]=sc.nextInt();
		}
		
		for(int element:arr)
		{
			System.out.println("Elment"+element);
		}
		
		sc.close();
	}

}
