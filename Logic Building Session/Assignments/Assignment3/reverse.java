import java.util.Scanner;

class reverse
{
 public static void main(String args[])
 {
  int n=1234,rev=0;
  int bak=n;
  while(n!=0)
  {
   int t=n%10;
   rev=rev*10+t;
   n/=10;
  }
  
  System.out.println(rev);
 }
}
