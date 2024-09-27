import java.util.Scanner;
import java.lang.String;
class FirstUniqueElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=0;
		
		for(int i=0;i<str.length();i++)
		{
			flag=0;
			for(int j=i+1;j<str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}