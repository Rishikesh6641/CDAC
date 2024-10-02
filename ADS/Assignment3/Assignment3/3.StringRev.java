import java.util.Scanner;

class StringRev
{
	char[] arr;
	int top;
	int size;
	public StringRev()
	{
		this(5);
	}
	public StringRev(int size)
	{
		this.size=size;
		arr=new char[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return this.top==-1;
	}
	public boolean isFull()
	{
		return this.top==size-1;
	}
	
	public void push(char data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
			return;
		}
		arr[++top]=data;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		top--;
	}
	
	public char peek()
	{
		return arr[top--];
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		
		StringRev stk=new StringRev(str.length());
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			stk.push(ch[i]);
		}
		String result="";
		for(int i=0;i<ch.length;i++)
		{
			result=result+stk.peek();
		}
		
		System.out.println(result);
	}
}