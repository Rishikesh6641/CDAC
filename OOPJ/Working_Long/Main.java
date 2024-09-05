package Working_Long;

public class Main {
	
	
	public static void q2()
	{
		System.out.println(Long.BYTES);
	}
	public static void q3()
	{
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
	public static void q4()
	{
		long n=7893203223L;
		System.out.println(Long.toString(n));
	}
	public static void q5()
	{
		String s="7038588818";
		System.out.println(Long.parseLong(s));
	}
	public static void q6()
	{
		String s="Ab12cd3";
		System.out.println(Long.parseLong(s));
	}
	public static void q7()
	{
		Long n=12345L;
		System.out.println(Long.valueOf(n));
	}
	public static void q8()
	{
		String n="12345";
		System.out.println(Long.valueOf(n));
	}
	public static void q9()
	{
		long a=1000000;
		long b=2000000;
		System.out.println(Long.sum(a,b));
	}
	public static void main(String...args)
	{
		q2();
		q3();
		q4();
		q5();
		//q6();
		q7();
		q8();
		q9();
		System.out.println(Integer.toBinaryString(70));
		
	}

}
