package Question_10;

public class Main_10 {
	public static void main(String[] args)
	{
		
		int range=2;
		int cnt=1;
		
		for(int i=1;i<=7;i++)
		{
			range=2*cnt;
			if(i<=4)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" "+i*j);
				}
			}
			
			else
			{
				for(int j=1;j<=i-range;j++)
				{
					System.out.print(" "+i*j);
				}
				
				cnt++;
			}
			if(i==7)
			System.out.print(" "+i);
			System.out.println();
		}

	}
}
