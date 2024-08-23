import java.util.Scanner;

class factorial
{

  public static int fact(int n)
  {
   int f;
   if(n==1)
   return 1;
   else
    f=fact(n-1);
	
   return f*n;
}
    
  public static void main(String args[])
  {
   int n;
   int res;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number:");
   n=sc.nextInt();
   res=fact(n);
   System.out.println("Factorial:"+res);
  }
}