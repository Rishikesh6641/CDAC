import java.util.Scanner;


class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,bak=n;
		
		if(n<0)
			System.out.println(false);
		else
		{
			while(n!=0)
			{
				rev=(rev*10)+(n%10);
				n/=10;
			}
			if(rev==bak)
			System.out.println(rev==bak);
			else
			System.out.println(false);
		}
	}
}

		