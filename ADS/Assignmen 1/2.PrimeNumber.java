import java.util.Scanner;

class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num/i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		System.out.println("flase");
		else
		System.out.println("true");
	}
}
