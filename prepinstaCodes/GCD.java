class GCD
{
 public static void main(String args[])
 {
  int num1=36;
  int num2=72;
  
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
 