

class largest
{
 public static void main(String args[])
 {
  int n=4825;
  int bak=n;
  int largest=0;
  
  while(n!=0)
  {
   int temp=n%10;
   if(temp>largest)
   largest=temp;
   
   n/=10;
  }
  System.out.println("Largest from "+bak+" is "+largest);
 }
}
