package q5;

import java.util.Scanner;

public class Main {
	Scanner sc=new Scanner(System.in);
	public void accept(int[] arr) {
		
		
		for(int  i=0;i<arr.length;i++)
		{
			System.out.println("Enter: ");
			arr[i]=sc.nextInt();
		}
		
	}
	public void intersection(int[] arr, int[] arr2) {
		
		int i=0;
		int j=0;
		
		while(i<arr.length)
		{
			if(arr[i]==arr2[j])
			{
				System.out.println(" "+arr[i]);
				i++;
				j++;
			}
			else
				i++;
		}
		
	}
	public void closere()
	{
		sc.close();
	}
	
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		int[] arr2=new int[5];
		Main m=new Main();
		
		m.accept(arr);
		System.out.println("*************************");
		m.accept(arr2);
		
		m.intersection(arr,arr2);
		m.closere();
	}


	

	

}
