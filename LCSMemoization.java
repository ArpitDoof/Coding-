//Longest Common Subsequence Problem solution using Memoization
//Given two sequences, find the length of longest subsequence present in both of them.
//A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 
//
//For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.




package coding;

import java.util.Scanner;

public class LCSMemoization {
    static int dp[][] = new int[1001][1001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s =sc.next();
		for(int i=0;i<1001;i++)
			for(int j=0;j<1001;j++)
				dp[i][j]=-1;
		
		String w =sc.next();
		System.out.println(LCSMemo(s,w,s.length(),w.length()));
		sc.close();
	}
	public static int LCSMemo(String s,String w,int n,int m)
	{
		if(m==0 || n==0)
			return 0;
		 if(dp[n][m]!=-1)
			 return dp[n][m];
		if(s.charAt(n-1)==w.charAt(m-1))
			return dp[n][m]=1+LCSMemo(s,w,n-1,m-1);
		else
			return dp[n][m]=Math.max(LCSMemo(s,w,n-1,m), LCSMemo(s,w,n,m-1));
	}
}
