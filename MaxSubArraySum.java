package coding;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int size= sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i] =sc.nextInt();
		}
		int k =sc.nextInt();
		slidingWindow(arr,size,k);
		sc.close();
	}
	
	public static void slidingWindow(int arr[], int size,int k)
	{
		int i=0,j=0;long sum=0,max=0;
		while(j<size)
		{
			sum+=arr[j];
			if(j-i+1 < k)
			{
				j++;
			}
			else if(j-i+1==k)
			{
				max = Math.max(sum, max);
				sum = sum-arr[i];
				i++;j++;
				
			}
		}
		System.out.println(max);
	}

}
