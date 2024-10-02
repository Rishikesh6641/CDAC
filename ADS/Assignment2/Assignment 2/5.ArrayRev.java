import java.util.Scanner;
import java .util.Arrays;
class ArrayRev
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Value for arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0,j=size-1;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
