import java.util.Scanner;

class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1,c=0;
		
		if(num>=1)
		System.out.print(0);
		if(num>=2)
		System.out.print(1);
		
		for(int i=2;i<num;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c);
		}
	}
}