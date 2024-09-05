package Question_10;

public class Main {
	
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[2]);
		int c=0;
		
		if(args[1].equals("+"))
		{
			c=1;
		}
		else if(args[1].equals("-"))
		{
			c=2;
		}
		else if(args[1].equals("/"))
		{
			c=3;
		}
		else
		{
			c=4;
		}
		
		switch(c)
		{
		case 1:System.out.println(m+n);
				break;
		case 2:System.out.println(m-n);
				break;
		case 3:System.out.println(m/n);
				break;
		case 4:System.out.println(m%n);
				break;
		default:System.out.println("Invalid Opreation");
		}
	}

}
