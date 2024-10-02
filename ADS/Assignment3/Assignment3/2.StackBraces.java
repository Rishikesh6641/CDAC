import java.util.Scanner;

class StackBraces
{
	char[] arr;
	int top;
	int size;
	public StackBraces()
	{
		this(5);
	}
	public StackBraces(int size)
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
			return;
		}
		
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
		
		StackBraces stk=new StackBraces();
		
		char[] arr=str.toCharArray();
		int flag=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{')
			{
				stk.push(arr[i]);
			}
			else
			{
				char temp=stk.peek();
				//System.out.print(temp);
				if(temp=='(' && arr[i]!=')')
					{
						flag=1;
						break;
					}
					
				if(temp=='[' && arr[i]!=']')
					{
						flag=1;
						break;
					}
					
				if(temp=='{' && arr[i]!='}')
					{
						flag=1;
						break;
					}
			}
			//System.out.print(arr[i]);
		}
		if(flag==1)
		System.out.println("Not Balanced!!");
		
		else
		System.out.println("Balanced");
	}
}