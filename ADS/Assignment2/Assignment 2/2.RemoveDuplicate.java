import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
class RemoveDuplicate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Value for arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		
		Set<Integer> set=new HashSet<>();
		
		
		for(int i=0;i<size;i++)
		{
			set.add(arr[i]);
		}
		int[] arr2=new int[set.size()];
		Iterator<Integer>itr=set.iterator();
		int ele=0,j=0;
		while(itr.hasNext())
		{
			ele=itr.next();
			arr2[j]=ele;
			j++;
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.length);
	}
}





		