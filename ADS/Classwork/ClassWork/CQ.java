import java.util.Scanner;

class Cq
{
	int[] queue;
	int size;
	int front;
	int rear;
	
	public Cq()
	{
		this(5);
	}
	
	public Cq(int size)
	{
		this.size=size;
		queue=new int[size];
		front=-1;
		rear=0;
	}
	
	public boolean isEmpty()
	{
		return this.front==-1;
	}
	public boolean isFull()
	{
		return (this.front==0 && rear==size-1) || (front!=0 && (rear+1)%size==front );
	}
	public void enQueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is Full !!");
			return;
		}
		else if(front==-1)
		{
			front=0;
			rear=0;
		}
		else
		rear=(rear+1)%size;
		
		//System.out.println("rear "+rear+" for value "+x);
		queue[rear]=x;
	}
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty !!");
			return;
		}
		else
		{
			System.out.println(queue[front]+" Deleted !!");
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
				front=(front+1)%size;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty ");
			return;
		}
		else
		{
			int i=front-1;
			do
			{
				i++;
				System.out.println(queue[i]);
				
			}while(i!=rear);
		}
	}
	
	public static void main(String args[])
	{
		Cq cq=new Cq();
		
		cq.enQueue(0);
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		cq.enQueue(4);
		//cq.enQueue(5);
		cq.display();
		
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		System.out.println("Queue After Deletion");
		cq.display();
	}
}

		
		