import java.util.Arrays;
import java.util.Scanner;


class Stack
{
	int[] stack;
	int top;
	
	public Stack()
	{
		this(5);
	}
	public Stack(int size)
	{
		stack=new int[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return this.top==-1;
	}
	public boolean isFull()
	{
		return this.top==this.stack.length-1;
	}
	
	public void push(int x)
	{
		if(this.isFull())
		{
			System.out.println("Stack is Full!!");
			return;
		}
			stack[++top]=x;
	}
	public void pop()
	{
		if(this.isEmpty())
		{
			System.out.println("Stack is Empty!!");
			return;
		}
		System.out.println("Poped : "+this.stack[top]);
		top--;
	}
	public int getTop()
	{
		return this.top;
	}
	
	public void display()
	{
		int i=this.getTop();
		while(i>=0)
		{
			System.out.println(this.stack[i]);
			i--;
		}
		//System.out.println(Arrays.toString(this.stack));
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Stack: ");
		int size=sc.nextInt();
		Stack st=new Stack(size);
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Value : ");
			st.push(sc.nextInt());
		}
		st.display();
		
		st.pop();
		st.display();
	}
}

	