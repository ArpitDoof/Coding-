package coding;

import java.util.Scanner;

public class Knapsack01TopDownDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int wt[]= new int[n];
		int  val[] = new int[n];
		for(int i=0;i<n;i++)
			wt[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			val[i]=sc.nextInt();
		
		int cap = sc.nextInt();
		System.out.print(helper(wt,val,n,cap));;
		sc.close();
	}
	
	public static int helper(int wt[],int val[],int n,int cap)
	{
		int dp[][] = new int[n+1][cap+1];
		
		
		
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<cap+1;j++)
			{
				
				if(i==0||j==0)
					dp[i][j]=0;
				else if(wt[i-1]<=j)
					dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
				else 
					dp[i][j]=dp[i-1][j];
					
			}
		}
		return dp[n][cap];
	}

}
