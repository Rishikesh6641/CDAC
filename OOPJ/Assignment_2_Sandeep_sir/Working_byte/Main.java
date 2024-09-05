package Working_byte;

public class Main {
	
	public static void q1()
	{
		System.out.println(Byte.BYTES);
	}
	public static void q2()
	{
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}
	public static void q3()
	{
		byte b=110;
		String str=Byte.toString(b);
		System.out.println(str);
	}
	public static void q4()
	{
		String str="123";
		byte b=Byte.parseByte(str);
		System.out.println(b);
	}
	public static void q5()
	{
		String number="127";
		byte b=Byte.valueOf(number);
		System.out.println(b);
	}
	public static void q6()
	{
		String strNumber="Ab12Cd3";
		byte b=Byte.parseByte(strNumber);
		System.out.println(b);
	}
	public static void q7()
	{
		byte b=-128;
		byte c=Byte.valueOf(b);
		System.out.println(c);
	}
	public static void q8()
	{
		String b="-128";
		byte c=Byte.valueOf(b);
		System.out.println(c);
	}
	public static void main(String args[])
	{
		q1();
		q2();
		q3();
		q4();
		q5();
		//q6();
		q7();
		
	}
}
