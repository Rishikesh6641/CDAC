import java.util.Arrays;

class MinHeap
{
	public void heapify(int arr[],int n,int i)
	{
		int smallest=i;
		int lc=2*i+1;
		int rc=2*i+2;
		
		if(lc < n && arr[lc]< arr[smallest])
			smallest=lc;
		if(rc < n && arr[rc]< arr[smallest])
			smallest=rc;
		
		if(smallest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
			
			heapify(arr,n,smallest);
		}
	}
	
	public void heapsort(int[] arr)
	{
		int n=arr.length;
		
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);	
		}
			
		//for(int i=n-1;i>0;i--)
		for(int i=0;i<n-1;i++)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}
	
	public void display(int[] arr)
	{
		int i=1;
		int n=arr.length;
		System.out.print("Min-Heap=[");
		while(i<n)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.print("],Extracted Min="+arr[0]);
	}
	
	public static void main(String[] args)
	{
		//MinHeap m1=new MinHeap();
		//int[] arr={10, 15, 20, 17};
		
		//m1.heapsort(arr);
		
		//m1.display(arr);
		
		MinHeap m=new MinHeap();
		int[] arr={30, 40, 20, 50};
		
		m.heapsort(arr);
		
		m.display(arr);
	}
}
