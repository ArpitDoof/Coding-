package coding;

import java.util.Scanner;

public class LongestSubStringDP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s =sc.next();
		
		String w =sc.next();
		System.out.println(helper(s,w,s.length(),w.length()));
		sc.close();
	}
	
	public static int helper(String s,String w,int n,int m)
	{	int best_count=0;
		int dp[][]= new int[n+1][m+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=m;j++)
				if(i==0 || j==0)
					dp[i][j]=0;
		
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
			{
				if(s.charAt(i-1)==w.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
					best_count = Math.max(best_count,dp[i][j]);
				}
				else
					dp[i][j]=0;
			}
		return best_count;
		
	}
}
