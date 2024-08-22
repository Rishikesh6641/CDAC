
import  java.util.Scanner;


class stud
{
 public static void main(String args[])
 {
  int s1,s2,s3;
  int total;
  int cnt=0;
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter marks of subject1:");
  s1=sc.nextInt();
  
  System.out.println("Enter marks of subject2:");
  s2=sc.nextInt();
  
  System.out.println("Enter marks of subject3:");
  s3=sc.nextInt();
  
  total=s1+s2+s3;
  
  /*if(total>=120)
  {
   System.out.println("Pass");
  }
  else
  {
   if(s1<40)
    cnt++;   
   if(s2<40)
    cnt++;
   if(s3<40)
    cnt++;
	System.out.println(cnt);
  }*/
 }
}

  