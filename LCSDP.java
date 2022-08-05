//Longest Common Subsequence Problem solution using TOP DOWN APPROACH
//Given two sequences, find the length of longest subsequence present in both of them.
//A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 
//
//For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.

package coding;

import java.util.Scanner;

public class LCSDP {

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
		
		int i=n,j=m;String ans="";
		while(i>0 && j>0)
		{
			if(s.charAt(i-1)==w.charAt(j-1))
			{   ans=s.charAt(i-1)+ans;  
				i--;
				j--;
			}
			else
			{
				if(dp[i-1][j]>dp[i][j-1])
					i--;
				else
					j--;
			}
		}
		return ans;
				
	}
	

}
