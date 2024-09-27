import java.util.Scanner;

class Square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		if(n%2!=0)
		n=n-1;
		
		while(n>2)
		{
			n=n/2;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

			