import java.util.Scanner;


class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int bak=num;
		int cube=0;
		int sum=0;
		while(num!=0)
		{
			cube=(int)Math.pow((num%10),3);
			sum+=cube;
			num/=10;
		}
		
		if(sum==bak)
		System.out.println(sum==bak);
		
		else
		System.out.println(sum==bak);
	}
}
