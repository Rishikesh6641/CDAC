class pattern22
{
 public static void main(String args[])
 {
  
  for(int i=9;i>=1;i--)
  {
   if(i%2==0)
   continue;
   for(int j=9;j>=i;j--)
   System.out.print(" ");
   
   for(int j=1;j<=i;j++)
   {
    System.out.print("* ");
   }
   System.out.println();
  }
  
  for(int i=3;i<=9;i++)
  {
	if(i%2==0)
		continue;
	
	for(int j=9;j>=i;j--)
		System.out.print(" ");
	
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	
	System.out.println();
  }
 }
}

  
   
   