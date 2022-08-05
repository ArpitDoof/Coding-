package coding;

import java.util.Scanner;

public class SubsetSumRecursionMemo {
	
	static boolean dp[][] = new boolean[1000][1000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++)
		{
			for(int j=0;j<1000;j++)
			{
				dp[i][j]=false;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		//int  val[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
//		for(int i=0;i<n;i++)
//			val[i]=sc.nextInt();
		
		int sum = sc.nextInt();
		System.out.print(helper(arr,n,sum));;
		sc.close();
	}
	public static boolean helper(int arr[],int n,int sum)
	{
		if(sum==0)
			return true;
		else if(n==0)
			return false;
		
		if(dp[n][sum]==true)
			return dp[n][sum];
		if(arr[n-1]<=sum)
		return dp[n][sum]=helper(arr,n-1,sum-arr[n-1]) || helper(arr,n-1,sum);
		
		else 
			return dp[n][sum]=helper(arr,n-1,sum);
	}
}
