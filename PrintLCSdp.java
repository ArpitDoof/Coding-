package coding;

import java.util.Scanner;

public class PrintLCSdp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s =sc.next();
		
		String w =sc.next();
		System.out.println(helper(s,w,s.length(),w.length()));
		sc.close();
	}
	public static String helper(String s,String w,int n,int m)
	{
		String dp[][]= new String[n+1][m+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=m;j++)
			{
				if(i==0 || j==0)
					dp[i][j]="";
			}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(s.charAt(i-1)==w.charAt(j-1))
					dp[i][j]=dp[i-1][j-1]+Character.toString(s.charAt(i-1));
				else
				{
					if(dp[i][j-1].length()>dp[i-1][j].length())
						dp[i][j]=dp[i][j-1];
					else
						dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][m];
	}
}
