import java.util.Arrays;

class CircularQ
{
	int[] cq;
	int front,rear,size;
	public CircularQ()
	{
		this(5);
	}
	public CircularQ(int size)
	{
		this.size=size;
		this.front=-1;
		this.rear=-1;
		cq=new int[size];
	}
	public boolean isEmpty()
	{
		return front==-1;
	}
	public boolean isFull()
	{
		return this.front==0 && this.rear==size-1 || this.front==this.rear+1%size;
	}
	public void Enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is Full !!");
			return;
		}
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else
			rear=rear+1%size;
		cq[rear]=x;
	}
	
	public void Dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
		else
		{
			System.out.println(cq[front]+"Deleted!!");
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			front=front+1%size;
		}
	}
	
	public void showQ()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!");
			return;
		}
		int i=front;
		do
		{
			System.out.println(cq[i]);
			i=i+1%size;
		}while(i!=rear);
		System.out.println(Arrays.toString(cq));
	}
	
	public static void main(String args[])
	{
		CircularQ c=new CircularQ();
		c.Enqueue(200);
		c.Enqueue(20);
		c.Enqueue(10);
		c.Enqueue(20);	
		c.Enqueue(10);
		//c.Enqueue(20);
		c.showQ();
		//c.Dequeue();
		//c.Dequeue();
		//c.showQ();
	}
}
		