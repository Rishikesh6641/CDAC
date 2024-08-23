import java.util.Scanner;

class fibonaci
{
 public static void main(String args[])
 {
  int a=0,b=1,c=0;
  
  for(int i=0;i<21;i++)
  {
   c=a+b;
   a=b;
   b=c;
   System.out.println("."+c);
  }
 }
}
  
  