import java.util.Scanner;
import java.lang.String;

class discount
{
 public static void main(String args[])
 {
  int amount;
  int discount;
  int per;
  String member;
  
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

  System.out.println("Do you have membership card:");
  member=sc.next();
  member=member.toLowerCase();
  
  if(member.equals("yes"))
  {
    int t=(amount/100)*5;
    amount=amount-t;
  }
 	  
  System.out.println(amount);
 }
}

   