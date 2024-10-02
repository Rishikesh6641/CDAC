package org.stack;

public class Stack {
	
	int[] stack;
	int top;
	int size;
	public Stack()
	{
	}
	public Stack(int size)
	{
		this.size=size;
		top=-1;
		stack=new int[size];
	}
	public boolean isFull()
	{
		return this.top==size-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
			return;
		}
		stack[++top]=data;
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
	public int peek()
	{
		return stack[top--];
	}		
}
