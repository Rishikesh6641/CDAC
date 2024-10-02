import java.util.Scanner;

class StrPalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=0;
		for(int i=0,j=str.length()-1;i<=j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(false);
		else
			System.out.println(true);
	}
}
