package Question_7;

public class Main_7 {
	
	public static void main(String...args)
	{
		int size=10;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=0;j<=size-i;j++)
			{
				System.out.print(" ");
			}
			size--;
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
