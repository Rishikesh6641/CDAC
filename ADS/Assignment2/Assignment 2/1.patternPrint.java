import java.util.Scanner;

class patternPrint
{
	public static void main(String[] rgs)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println();
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		}
	}
}
