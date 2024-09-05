package Working_short;

public class Main {
	
	
	public static void q2()
	{
		System.out.println(Short.BYTES);
	}
	public static void q3()
	{
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
	public static void q4()
	{
		short s=1234;
		String str=Short.toString(s);
		System.out.println(str);
	}
	public static void q5()
	{
		String str="32000";
		short s=Short.parseShort(str);
		System.out.println(s);
	}
	public static void q6()
	{
		String str="Ab12cd3";
		short s=Short.parseShort(str);
		System.out.println(s);
	}
	public static void q7()
	{
		short s=1234;
		short s1=Short.valueOf(s);
		System.out.println(s);
	}
	public static void q8()
	{
		String str="-32768";
		short s=Short.valueOf(str);
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		q2();
		q3();
		q4();
		q5();
		//q6();
		q7();
		q8();
	}

}
