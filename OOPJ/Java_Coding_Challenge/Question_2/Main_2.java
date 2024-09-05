package Question_2;

public class Main_2 {
	
	public static void main(String[] args)
	{
		int side=0;
		
		for(int i=11;i>=1;i--)
		{
			if(i%2==0)
			{
				System.out.println();
				continue;
			}
			
			else if(i==11)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
			}
			
			else
			{
				for(int j=0;j<=side;j++)
				{
					System.out.print(" ");
				}
				side++;
				for(int j=1;j<=i;j++)
				{
					if(j==1 || j==i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
			}
		}
	}

}
