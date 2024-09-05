package Question_5;

public class Main_5 {
	
	public static void main(String...args)
	{
		int spcae=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=spcae;j++)
			{
				System.out.print(" ");
			}
			spcae--;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
