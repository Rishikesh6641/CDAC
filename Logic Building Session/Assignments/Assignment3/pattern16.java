class pattern16
{
 public static void main(String args[])
 {
  for(int i=1;i<=9;i++)
  {
    if(i%2!=0)
	{
		for(int j=9-i;j>0;j--)
		{
			System.out.print(" ");
		}
	 for(int j=1;j<=i;j++)
	 {
	  System.out.print("* ");
	 }
	 System.out.println();
	}
    
  }
 }
}
