package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumSubsetProblemDP {

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
		for(int i=0;i<n;i++)
			sum+=arr[i];
		System.out.print(helper(arr,n,sum));;
		sc.close();
	}
	public static int  helper(int arr[],int n,int sum)
	{
		boolean dp[][]= new boolean[n+1][sum+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=sum;j++)
			{
				if(i==0)
					dp[i][j]=false;
				if(j==0)
					dp[i][j]=true;
			}
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
//				if(i==0)
//					dp[i][j]=false;
//				if(j==0)
//					dp[i][j]=true;
				
				if(arr[i-1]<=j)
				{
					dp[i][j] = dp[i-1][j-arr[i-1]]||dp[i-1][j];
				}
				else if(arr[i-1]>j)
					dp[i][j]=dp[i-1][j];
			
			}
		}
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=0;j<=sum/2;j++)
			{
				if(dp[n][j]==true)
					list.add(j);
			}
			int min = Integer.MAX_VALUE;
			for(int i=0;i<list.size();i++)
			{
				min = Math.min(min, sum-2*list.get(i));
			}
			return min;
			
		}
	
	}

