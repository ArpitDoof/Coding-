//Coin Change Problem Minimum Numbers of coins
//Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?
//Example:
//
//Input: coins[] = {25, 10, 5}, V = 30
//Output: Minimum 2 coins required
//We can use one coin of 25 cents and one of 5 cents 




package coding;

import java.util.Scanner;

public class CoinChange2DP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int coin[]= new int[n];
		//int  val[] = new int[n];
		for(int i=0;i<n;i++)
		coin[i]=sc.nextInt();
//		for(int i=0;i<n;i++)
//			val[i]=sc.nextInt();
		
		int sum = sc.nextInt();
		System.out.print(helper(coin,n,sum));;
		sc.close();
	}
	
	public static int helper(int coin[],int n,int sum)
	{
		int dp[][]= new int[n+1][sum+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=sum;j++)
			{   if(j==0)
				dp[i][j]=0;
				if(i==0)
					dp[i][j]=Integer.MAX_VALUE-1;
				
			}
		}
		//for(int i=1;i<=n;i++)
			for(int j=1;j<=sum;j++)
			{
				if(j%coin[0]==0)
					dp[1][j]=j/coin[0];
				else
					dp[1][j]=Integer.MAX_VALUE-1;//-1 is done so that when in 1 is added later on then integer does not overflow.
			}
			
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=sum;j++)
				{
					if(coin[i-1]<=j)
						dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coin[i-1]]);
					else
						dp[i][j]=dp[i-1][j];
				}
			}
			return dp[n][sum];
	}
}
