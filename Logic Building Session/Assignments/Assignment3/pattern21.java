class pattern21
{
 public static void main(String... args)
 {
  for(int i=1;i<=9;i++)
  {
	if(i%2==0)
		continue;
	for(int j=1;j<=i;j++)
	{
	 if(j%2!=0)
	 System.out.print(j);
	 else
	 {
	  System.out.print("*");
	 }
	}
	
	System.out.println();
   }
  }
 }



	
  