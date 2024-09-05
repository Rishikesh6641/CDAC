package Working_Integer;

public class Main {
	
	public static void q2()
	{
		System.out.println(Integer.BYTES);
	}
	public static void q3()
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	public static void q4()
	{
		int n=790;
		System.out.println(Integer.toString(n));
	}
	public static void q5()
	{
		String s="3456";
		System.out.println(Integer.parseInt(s));
	}
	public static void q6()
	{
		String s="Ab12cd3";
		System.out.println(Integer.parseInt(s));
	}
	public static void q7()
	{
		int n=12345;
		System.out.println(Integer.valueOf(n));
	}
	public static void q8()
	{
		String n="12345";
		System.out.println(Integer.valueOf(n));
	}
	public static void q9()
	{
		int a=10;
		int b=20;
		System.out.println(Integer.sum(a,b));
	}
	public static void q10()
	{
		int a=10;
		System.out.println(Integer.toBinaryString(a));
	}
	public static void main(String args[])
	{
		q2();
		q3();
		q4();
		q5();
		//q6();
		q7();
		q8();
		q9();
		q10();
	}
}
