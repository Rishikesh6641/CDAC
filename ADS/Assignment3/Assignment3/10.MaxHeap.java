import java.util.Arrays;

class MaxHeap
{
	
	public void heapify(int[] arr,int n,int i)
	{
		int largest=i;
		int lc=2*i+1;
		int rc=2*i+2;
		
		if(lc<n && arr[lc]>arr[largest])
			largest=lc;
		
		if(rc<n && arr[rc]>arr[largest])
			largest=rc;
		
		if(largest!=i)
		{
			int  temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heapify(arr,n,largest);
		}
	}
	
	public void heap(int[] arr)
	{
		int n=arr.length;
		
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		//System.out.println("hhh"+Arrays.toString(arr));
		for(int i=0;i<n-1;i++)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			//System.out.println("hhh2222"+Arrays.toString(arr));
			heapify(arr,i,0);
		}
	}
	public void display(int[] arr)
	{
		int i=1;
		int n=arr.length;
		System.out.print("Max-Heap=[");
		while(i<n)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.print("],Extracted Max="+arr[0]);
	}
	public static void main(String args[])
	{
		MaxHeap m=new MaxHeap();
		
		int[] arr={12, 7, 15, 5};
		m.heap(arr);	
		
		m.display(arr);
	}
}