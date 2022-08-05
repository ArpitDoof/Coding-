package coding;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLong();
		System.out.println(helper(arr,n));
		
	}
	public static int helper(long arr[],int n)
	{
		int max=Integer.MIN_VALUE,len=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i-1]<arr[i])
				len++;
			else
			{
				if(len>max)
					max=len;
				len=1;
			}
		}
		max=Math.max(max, len);
		return max;
	}

}
