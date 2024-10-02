import java.util.Arrays;

class DQ
{
	int[] dq;
	int size;
	int front,rear;
	
	public DQ()
	{
		this(5);
	}
	public DQ(int size)
	{
		this.size=size;
		dq=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	
	public boolean isEmpty()
	{
		return front==-1;
	}
	public boolean isFull()
	{
		return (front==0 && rear==size-1) || (rear+1==front);
	}
	
	public void frontInsert(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			return;
		}
		
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
			front=size-1;
		else
			front--;
		
		dq[front]=x;
	}
	
	public void rearInsert(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			return;
		}
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(rear==size-1)
		{
			rear=0;
		}
		else 
			rear++;
		dq[rear]=x;
	}
	public void frontDelete()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		System.out.println(dq[front]+" Deleted");
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(front==size-1)
		{
			front=0;	
		}
		else
			front++;
	}
	
	public void rearDelete()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		System.out.println(dq[rear]+" Deleted");
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(rear==0)
		{
			rear=size-1;	
		}
		else
			rear--;
	}
	public void show()
	{
		System.out.println(Arrays.toString(dq));
	}
	
	public static void main(String args[])
	{
		DQ obj=new DQ();
		obj.frontInsert(1);
		obj.frontInsert(2);
		obj.rearInsert(3);
		obj.rearInsert(4);
		obj.frontInsert(5);
		obj.show();
		
		obj.rearDelete();
		obj.rearDelete();
		obj.rearDelete();
		obj.rearDelete();
		obj.rearDelete();
		obj.rearDelete();
		obj.show();
	}
}