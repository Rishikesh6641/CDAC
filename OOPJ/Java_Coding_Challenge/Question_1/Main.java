package Question_1;

public class Main {
	
	public static void main(String[] args)
	{
		int side=5;
		
		for(int i=1;i<=11;i++)
		{
			if(i%2==0)
			{
				System.out.println();
				continue;
			}
			
			else
			{
				if(i==11)
				{
					for(int j=1;j<=11;j++)
					{
						System.out.print("*");
					}
				}
				
				else
				{
					for(int j=1;j<=side;j++)
					{
						System.out.print(" ");
					}
					side--;
					
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
}

