package Question_9;

public class Main_9 {
	
	public static void main(String...args)
	{
		int num=1;
		int sum=0;
		for(int i=1;i<10;i++)
		{
			sum=0;
			if(i!=1)
			{
				num=(num*10)+i;
			}
			
			sum=num*8+i;
			System.out.println(num+" X 8 + "+i+" = "+sum);
		}
	}

}
