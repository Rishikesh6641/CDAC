import java.util.Scanner;

class discount
{
 public static void main(String args[])
 {
  int amount;
  int discount;
  int per;
  int member;
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Amount:");
  amount=sc.nextInt();
  
  if(amount>=1000)
  {
   per=(amount/100)*20;
   amount=amount-per;
  }
  else if(amount<1000 && amount>=500)
  {
	per=(amount/100)*10;
	amount=amount-per;
  }
  else
  {
	per=(amount/100)*5;
	amount=amount-per;
  }

  System.out.println("Enter 1 if member Or else enter any other number");
  member=sc.nextInt();x
  
  if(member==1)
  {
	int t=(amount/100)*5;
    amount=amount-t;
  }
 	  
  System.out.println(amount);
 }
}

   