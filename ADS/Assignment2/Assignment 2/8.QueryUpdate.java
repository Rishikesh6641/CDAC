import java.util.Scanner;
import java.util.Arrays;

class QueryUpdate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		char ch='y';
		while(ch!='n')
		{
			System.out.println("Enter Starting point: ");
			int start=sc.nextInt();
			System.out.println("Enter Ending Point: ");
			int end=sc.nextInt();
			System.out.println("Enter Element");
			int ele=sc.nextInt();
			for(int i=start;i<end;i++)
			{
				arr[i]+=ele;
			}
			
			System.out.println("More Queries : ");
			ch=sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(arr[size-1]);

	}
}

		