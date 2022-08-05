package coding;

import java.util.Scanner;

public class MinNoOfDeletionPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s =sc.next();
		
		String w ="";
		
		for(char ch:s.toCharArray())
			w=ch+w;
		System.out.println(LCS(s,w,s.length(),w.length()));
		sc.close();
					
			}
	
	 public static int LCS(String s,String w,int n,int m)
	 {
		 int dp[][] = new int[n+1][m+1];
			for(int i=0;i<=n;i++)
				for(int j=0;j<=m;j++)
				{
					if(i==0 || j==0)
						dp[i][j]=0;
				}
			for(int i=1;i<n+1;i++)
				for(int j=1;j<m+1;j++)
				{
					if(s.charAt(i-1)==w.charAt(j-1))
						dp[i][j]=1+dp[i-1][j-1];
					else
						dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
	}
			return s.length()-dp[n][m];

}
}
