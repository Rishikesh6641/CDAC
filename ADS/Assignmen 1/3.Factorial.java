import java.util.Scanner;

class Factorial
{
	public int fact(int n)
	{
		if(n<=1)
		return 1;
		else
		return n*fact(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factorial f=new Factorial();
		System.out.println(f.fact(num));
	}
}

		