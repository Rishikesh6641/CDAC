import java.util.Scanner;

enum menulist{
	
	EXIT,INSERTHEAD,INSERTPOS,APPEND,DELETEHEAD,DELETEPOS,DELETETAIL,LOOPDETECTOR,REVERSELIST,SHOW
}

public class Linklist
{
	Node head;
	
	public Linklist()
	{
		head=null;
	}
	
	class Node
	{
		int data;
		Node next;
		public Node()
		{
		}
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node getHead()
	{
		return  this.head;
	}
	
	public void insertAtBegining(int x)
	{
		Node nw=new Node(x);
		if(head==null)
		{
			head=nw;
		}
		else
			nw.next=head;
			head=nw;
	}
	public void insertInBetween(int x,int pos)
	{
		Node nw=new Node(x);
		Node curr=head;
		for(int i=1;curr!=null && i<pos-1;i++)
		{
			curr=curr.next;
		}
		if(curr==null)
		{
			System.out.println("Invalid Position!!");
			return;
		}
		nw.next=curr.next;
		curr.next=nw;
	}
	public void append(int x)
	{
		Node nw=new Node(x);
		if(head==null)
		{
			head=nw;
			return;
		}
		
		Node last=head;
		while(last.next!=null)
			last=last.next;
		
		last.next=nw;
		nw.next=null;
	}
	
	public void deleteHead()
	{
		if(head==null)
		{
			System.out.println("List is Empty!!");
			return;
		}
		else
			head=head.next;
	}
	public void deletePos(int pos)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node curr=head;
		for(int i=1;curr!=null && i<pos-1;i++)
		{
			curr=curr.next;
		}
		if(curr==null || curr.next==null)
		{
			System.out.println("Invalid Index!!");
			return;
		}
		curr.next=curr.next.next;
	}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		if(curr==head)
		{
			head=null;
			return;
		}
		prev.next=null;
	}	
	public void deleteList()
	{
		head=null;
	}
	public int cntNodes(Node curr,int cnt)
	{
		if(curr==null)
			return 0;
		return cnt+cntNodes(curr.next,cnt++);
	}
	
	public void reverse()
	{
		Node curr=head;
		Node next=null;
		Node prev=null;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public void loopDetector()
	{
		Node fastp=head;
		Node slowp=head;
		int flag=0;
		while(slowp!=null && fastp!=null && fastp.next!=null)
		{
			slowp=slowp.next;
			fastp=fastp.next.next;
			if(fastp==slowp)
			{
				flag=1;
				break;
			}
		}
			
		if(flag==1)
			System.out.println("loop detected!!");
		else
			System.out.println("loop Not Detected!!");
	}
	
	public void showList()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print("---> "+curr.data);
			curr=curr.next;
		}	
	}
	public static menulist menu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("0.exit");
		System.out.println("1.InsertAtBegining");
		System.out.println("2.InsertInBetween");
		System.out.println("3.Append");
		System.out.println("4.DeleteHead");
		System.out.println("5.DeletePosition");
		System.out.println("6.DeleteTail");
		System.out.println("7.LoopDetector");
		System.out.println("8.Reverse");
		System.out.println("9.Show List");
		System.out.println("Enter Choice:");
		return menulist.values()[sc.nextInt()];
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		menulist ch;
		Linklist ll=new Linklist();
		
		while((ch=menu())!=menulist.EXIT)
		{
			switch(ch)
			{
				case INSERTHEAD:
				System.out.println("Enter No: ");
				ll.insertAtBegining(sc.nextInt());
				break;
				case INSERTPOS:
				System.out.println("Enter No: ");
				int no=sc.nextInt();
				System.out.println("Enter  Pos: ");
				int pos=sc.nextInt();
				ll.insertInBetween(no,pos);
				break;
				case APPEND:
				System.out.println("Enter No: ");
				ll.append(sc.nextInt());
				break;
				case DELETEHEAD:
				break;
				case DELETEPOS:
				break;
				case DELETETAIL:
				break;
				case LOOPDETECTOR:
				break;
				case REVERSELIST:
				break;
				case SHOW:
				ll.showList();
				break;
			}
		}
	}
}
	//System.out.println("");
	
	
	
	
	
	
	
	
	
	