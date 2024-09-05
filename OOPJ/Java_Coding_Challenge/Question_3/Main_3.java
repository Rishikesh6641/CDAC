package Question_3;

public class Main_3 {
	
	public static void main(String[] args)
	{
		int space=13;
		int j=65;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0 && i!=10)
			{
				System.out.println();
				space--;
			}
			else
			{
				if(i==9)
					continue;
				for(int l=1;l<space;l++)
				{
					System.out.print(" ");
				}
				space--;
				int k=0;
				while(k<i)
				{	
					
					System.out.print(" "+(char)j);
					j=j+1;
					k++;
					if(j==91)
						break;
				}
				
			 }
		}
	}	
}
