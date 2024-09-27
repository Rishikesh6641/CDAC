import java.util.Scanner;

class GCD
{
	public static int gcd(int num1,int num2)
	{
		if(num1==num2)
		return num1;
		else if(num1>num2)
		return gcd(num1-num2,num2);
		else
		return gcd(num1,num2-num1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println(GCD.gcd(num1,num2));
	}
}
		