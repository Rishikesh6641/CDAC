package Question_8;

public class Main {
	
	public static void main(String[] args)
	{
		boolean b=true;
		String sb=Boolean.toString(b);
		char c='C';
		String sc=Character.toString(c);
		long l=70983434L;
		String sl=Long.toString(l);
		int n=90;
		String sn=Integer.toString(n);
		double d=70.0;
		String sd=Double.toString(d);
		float f=1.1f;
		String sf=Float.toString(f);
		short s=32000;
		String ss=Short.toString(s);
		byte by=127;
		String sby=Byte.toString(by);
		
		String ans=String.valueOf(sb);
		String ans2=String.valueOf(sc);
		String ans3=String.valueOf(sl);
		String ans4=String.valueOf(sn);
		String ans5=String.valueOf(sd);
		String ans6=String.valueOf(sby);
		String ans7=String.valueOf(sf);
		String ans8=String.valueOf(ss);
		
		System.out.println(ans);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		System.out.println(ans5);
		System.out.println(ans6);
		System.out.println(ans7);
		System.out.println(ans8);
		
		
	}

}
