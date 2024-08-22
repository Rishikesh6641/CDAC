
import java.util.Scanner;

class calculator
{
 public static void main(String args[])
 {
  int a;
  int b;
  int result;
  int o;
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number 1:");
  a=sc.nextInt();
  System.out.println("Enter Number 2:");
  b=sc.nextInt();
  System.out.println("Enter choice:");
  o=sc.nextInt();
  
  
  switch(o)
  {
   case 1:result=a+b;
          System.out.println(result);
		  break;
   case 2:result=a-b;
          System.out.println(result);
		  break;
   case 3:result=a*b;
          System.out.println(result);
		  break;
   case 4:if(b==0)
          System.out.println("Cant divide by zero");
          else{
          result=a/b;
          System.out.println(result);
          }
          break;
   default:System.out.println("invalid opreation");
  }
 }
}
