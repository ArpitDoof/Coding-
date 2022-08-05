package coding;

import java.util.Scanner;

public class EqualSumPartitionTopDownDP {

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
	{   boolean dp[][]= new boolean[n+1][sum+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<=sum;j++)
			{
				if(i==0)
					dp[i][j]=false;
				if(j==0)
					dp[i][j]=true;
				
				if(arr[i-1]<=j)
					dp[i][j]= dp[i-1][j-arr[i-1]]|| dp[i-1][j];
				else
					dp[i][j]=dp[i-1][j];
			}
				
		}
		return dp[n][sum];
	}

}
