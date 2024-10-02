import java.util.Scanner;

class RemoveSpaces
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		str.trim();
		String[] arr=str.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			result=result+arr[i];
		}
		
		System.out.println(result);
	}
}
