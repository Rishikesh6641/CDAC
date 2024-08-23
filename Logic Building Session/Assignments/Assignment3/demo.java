class demo
{
 public static void main(String s[])
 {
  int a=10;
  int b=10;
  int c=10;
  
  int result1=++a + b++ + ++c;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println("Result-1 "+result1);
  
  int result2=a++ + ++b + c++;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println("Result-2 "+result2);
 }
}

  
  