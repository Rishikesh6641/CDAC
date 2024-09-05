package Question_8;

public class Main_8 {
	
	public static void main(String[] args)
	{
		
		for(int i=5;i>=1;i--)
		{
			if(i==5)
			{
				System.out.print(0);
				System.out.println();
			}
			
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
				if(j==5)
				{
					System.out.print(0);
				}
			}
			
			for(int j=5;j>=i;j--)
			{
				//System.out.print("j");
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
