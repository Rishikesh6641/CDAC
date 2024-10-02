import java.util.Scanner;

class RevWords
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		String[] arr=str.split(" ");
		String res="";
		for(int i=arr.length-1;i>=0;i--)
		{
			res=res+arr[i];
			res=res+" ";
		}
		
		System.out.println(res);
	}
}
