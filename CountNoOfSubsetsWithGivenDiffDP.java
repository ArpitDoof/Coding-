package coding;

import java.util.Scanner;

public class CountNoOfSubsetsWithGivenDiffDP {

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
		int diff= sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		int res = (sum+diff)/2;
		
		System.out.print(helper(arr,n,res));;
		sc.close();
	}
	public static int helper(int arr[],int n ,int sum)
	{
		int dp[][] =new int [n+1][sum+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=sum;j++)
				{if(i==0)
				  dp[i][j]=0;
				if(j==0)
					dp[i][j]=1;
				}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				
				if(arr[i-1]<=j)
				{
					dp[i][j]= dp[i-1][j-arr[i-1]]+dp[i-1][j];
				}
				else if(arr[i-1]>j)
					dp[i][j]=dp[i-1][j];
			}
		}
		return dp[n][sum];
	}

}
