import java.lang.Scanner;

class GCD
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();
  int num2=sc.nextInt();
  
  int result=HCF(num1,num2);
  
  System.out.println(result);
 }
 
 public static int HCF(int num1,int num2)
 {
  int result;
	
  if(num1==num2)
  return num1;
  
  else
  {
   if(num1>num2)
   {
    result=HCF(num1-num2,num2);
   }
   
   else
   {
    result=HCF(num1,num2-num1);
	}
   }
   
   return result;
  }
 }
 
