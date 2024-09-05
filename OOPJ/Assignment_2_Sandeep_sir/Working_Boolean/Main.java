package Working_Boolean;

public class Main {
	
	
	public static void q1()
	{
		boolean status=true;
		String str=Boolean.toString(status);
		System.out.println(str);

	}
	public static void q2()
	{
		String strStatus=new String("true");
		boolean boolean_value=Boolean.parseBoolean(strStatus);
		System.out.println(boolean_value);
	}
	public static void q3()
	{
		String str="0";
		boolean value=Boolean.parseBoolean(str);
		System.out.println(value);
	}
	public static void q4()
	{
		boolean value=false;
		boolean value_of=Boolean.valueOf(value);
		System.out.println(value_of);
	}
	public static void q5()
	{
		String value="true";
		boolean value_of=Boolean.valueOf(value);
		System.out.println(value_of);
	}
	public static void q6()
	{
		String value="123";
		boolean converted=Boolean.valueOf(value);
		System.out.println(converted);
	}
	public static void main(String[] args)
	{
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

}
