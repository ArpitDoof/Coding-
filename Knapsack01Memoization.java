package coding;
import java.util.*;
public class Knapsack01Memoization {
    static int dp[][] = new int[1000][1000];
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays.fill(dp,-1);
		for(int i=0;i<1000;i++)
		{
			for(int j=0;j<1000;j++)
			{
				dp[i][j]=-1;
			}
		}
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
		if(n==0 || cap==0)
			return 0;
		if(dp[n][cap]!=-1)
			return dp[n][cap];
		if(wt[n-1]<=cap)
			return dp[n][cap] = Math.max(val[n-1]+helper(wt,val,n-1,cap-wt[n-1]), helper(wt,val,n-1,cap));
		else 
			return dp[n][cap] = helper(wt,val,n-1,cap);
	}

}
