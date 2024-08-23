import java.util.Scanner;

class Sumofnaturalnumbers
{
 public static void main(String args[])
 {
  int no;
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Number:");
  no=sc.nextInt();
  
  int sum=(no*(no+1))/2;
  
  System.out.println("total:"+sum);
 }
}
