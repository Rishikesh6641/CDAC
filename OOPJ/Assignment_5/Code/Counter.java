package Counter;

public class Counter {
	
	private static int counter;
	
	public Counter()
	{
		counter++;
	}
	
	public static void getCounter()
	{
		System.out.println("Counter:"+counter);
	}

}

class Main
{
	public static void main(String args[])
	{
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
		Counter c4=new Counter();
		
		Counter.getCounter();
		
	}
}
