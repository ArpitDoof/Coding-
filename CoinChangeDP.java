package coding;

import java.util.Scanner;

public class CoinChangeDP {

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
			 for(int j=0;j<=sum;j++)
			 { if(i==0)
					 dp[i][j]=0;
		       if(j==0)
		    	   dp[i][j]=1;
			 }
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=sum;j++)
			 {
				 if(coin[i-1]<=j)
					 dp[i][j]=dp[i-1][j] + dp[i][j-coin[i-1]];
				 else
					 dp[i][j]=dp[i-1][j];
					 
			 }
		 }
		 return dp[n][sum];
	 }

}
