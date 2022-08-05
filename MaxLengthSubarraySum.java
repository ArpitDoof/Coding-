package coding;
import java.util.*;
public class MaxLengthSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] =new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		VariableSlidingWindow(size,arr,k);
		sc.close();
	}
	
	public static void VariableSlidingWindow(int size,int arr[],int k)
	{
		int i=0,j=0;
		int  max=0;long sum=0;
		while(j<size)
		{
			sum+=arr[j];
			if(sum==k)
			{
				max=Math.max(j-i+1, max);
			}
			if(sum>k)
			{
				while(sum>k)
				{
					sum=sum-arr[i];
					i++;
				}
			}
			
				j++;
		}
		System.out.println(max);
	}

}
