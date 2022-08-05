package coding;

import java.util.Scanner;

public class EqualumPartitionRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		//int  val[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
//		for(int i=0;i<n;i++)
//			val[i]=sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			{
			sum+=arr[i];
			}
		if(sum%2==0)
			System.out.print(helper(arr,n,sum/2));
		else
				System.out.println("false");
		sc.close();
	}
	
	public static boolean helper(int arr[],int n,int sum)
	{
		if(sum==0)
			return true;
		else if(n==0)
			return false;
		
		if(arr[n-1]<=sum)
			return helper(arr,n-1,sum-arr[n-1])|| helper(arr,n-1,sum);
		else
			return helper(arr,n-1,sum);
		
	}

}
