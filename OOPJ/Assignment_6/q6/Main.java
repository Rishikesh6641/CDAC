package q6;

public class Main {
	
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5,0,7,8,9,10};
		
		int n=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];			
		}
		int missing=n*(n+1)/2;
		missing=missing-sum;
		System.out.println("Missing value: "+missing);
	}

}
