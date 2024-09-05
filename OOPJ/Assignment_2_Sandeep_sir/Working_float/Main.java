package Working_float;

public class Main {
	
	public static void q2()
	{
		System.out.println(Float.BYTES);
	}
	public static void q3()
	{
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
	}
	public static void q4()
	{
		System.out.println(Float.parseFloat("10.9"));
	}
	public static void q5()
	{
		
		System.out.println(Float.toString(1.7f));
	}
	public static void q6()
	{
		System.out.println(Float.parseFloat("Ab12cd3"));
	}
	public static void q7()
	{
		System.out.println(Float.valueOf(10));
	}
	public static void q8()
	{
		System.out.println(Float.valueOf("123"));
	}
	public static void q9()
	{
		System.out.println(Float.sum(112.3f, 984.5f));
	}
	public static void q10()
	{
		System.out.println(Float.min(112.3f, 556.6f));
		System.out.println(Float.max(112.3f,556.6f));
	}
	public static void q11()
	{
		System.out.println(Math.sqrt(25.0f));
	}
	public static void q12()
	{
		System.out.println(0.0/0.0);
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
		q9();
		q10();
		q11();
		q12();
		
	}

}
