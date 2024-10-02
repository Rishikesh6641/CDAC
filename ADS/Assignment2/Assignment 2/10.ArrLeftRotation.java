import java.util.Scanner;
import java.util.Arrays;

class ArrLeftRotation
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter Number of rotations: ");
		int rotation=sc.nextInt();
		int[] temparr=new int[rotation];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Value for arr["+i+"] : ");
			arr[i]=sc.nextInt();
			
			if(i<rotation)
				temparr[i]=arr[i];
				
		}
		System.out.println("Original array: "+Arrays.toString(arr));
		System.out.println("Temp array: "+Arrays.toString(temparr));

		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i+rotation<=arr.length-1)
				arr[i]=arr[i+rotation];
			else
				arr[i]=temparr[j++];
		}
		System.out.println("Output array: "+Arrays.toString(arr));
	}
}
