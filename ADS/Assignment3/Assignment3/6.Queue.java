class Queue
{
	int[] q;
	int front,rear;
	int size;
	public Queue()
	{
		this(5);
	}
	public Queue(int size)
	{
		this.size=size;
		this.front=-1;
		this.rear=-1;
		q=new int[size];
	}
	
	public boolean isFull()
	{
		return this.rear==size-1;
	}
	public boolean isEmpty()
	{
		return this.front==-1;
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
			rear++;
		
		q[rear]=x;
	}
	public void Dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!");
			return;
		}
		else
		{
			System.out.println(q[front]+" Deleted ");
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
				front++;
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
		while(i<=rear)
		{
			System.out.println(q[i]);
			i++;
		}
	}
	public static void main(String args[])
	{
		Queue queue=new Queue();
		
		queue.Enqueue(1);
		queue.Enqueue(2);
		queue.Enqueue(3);
		
		
		queue.Dequeue();
		queue.Dequeue();
		//queue.Enqueue(15);
		//System.out.println();
		queue.showQ();
	}
}
