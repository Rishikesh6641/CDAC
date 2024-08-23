class pattern18
{
 public static void main(String args[])
 {
  
  for(int i=1;i<=7;i++)
  {
   if(i%2==0)
   continue;
    for(int j=7;j>=i;j--)
		System.out.print(" ");
	
    for(int j=1;j<=i;j++)
    {
     System.out.print("* ");
    }
   
    System.out.println();
  }
  
  for(int i=7;i>0;i--)
  {
   if(i%2==0)
   continue;

   for(int j=5;j<=i;j++)
	   System.out.print(" ");
   
   for(int j=1;j<=i-2;j++)
   {
    System.out.print(" *");
   }
   System.out.println();
  }
 }
}

	
   
  
	