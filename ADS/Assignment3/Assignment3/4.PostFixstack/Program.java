package org.stack;

import java.util.Scanner;

public class Program {
	
	public int function(int op1,int op2,char c)
	{
		int sum=0;
		switch(c)
		{
		case '+':sum=op1+op2;
		break;
		case '-':sum=op1-op2;
		break;
		case '*':sum=op1*op2;
		break;
		case '/':
			if(op1<op2)
			{
				int twmp=op1;
				op1=op2;
				op2=twmp;
			}
			sum=op1/op2;
		break;
		case '^':sum=op1+op2;
		break;
		}
		
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Expresion : ");
		String exp=sc.nextLine();
		
		Program p=new Program();
		Stack stk=new Stack(exp.length());
		
		char[] ch=exp.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='^')
			{
				int sum=p.function(stk.peek(),stk.peek(), ch[i]);
				stk.push(sum);
			}
			else
			{
				int ele=Integer.parseInt(Character.toString(ch[i]));
				stk.push(ele);
			}
		}
		System.out.println(stk.peek());
		sc.close();
	}
}
