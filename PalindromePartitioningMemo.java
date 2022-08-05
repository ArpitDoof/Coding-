package coding;

public class PalindromePartitioningMemo {
    static int dp[][] = new int[1000][1000];
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++)
			for(int j=0;j<1000;j++)
				dp[i][j]=-1;
		
		System.out.println(helper("“ababbbabbababa"));
	}
	public static int helper(String s)
	{
		int i=0,j=s.length()-1;
		return solve(s,i,j);
	}
	static int left=0,right=0;
	public static int solve(String s,int i,int j)
	{    int min=Integer.MAX_VALUE;
		if(i>=j)
			return 0;
		 if(isPalindrome(s,i,j))
			 return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		
		for(int k=i;k<=j-1;k++)
		{
			if(dp[i][k]!=-1)
				return dp[i][k];
			else
			{
				left = solve(s,i,k);
				dp[i][k]=left;//as now we know at least ans of one substring i.e i to k
			}
			if(dp[k+1][j]!=-1)
				return dp[k+1][j];
			else
			{
				right = solve(s,k+1,j);
				dp[k+1][j]=right;
			}
			
			min=Math.min(left+right+1, min);
		}
		return dp[i][j]=min;
	}
	
	public static boolean isPalindrome(String s,int i,int j)
	{   
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;j--;
			}
			else
			{
				return false;
			}
			
		}
	return true;
	}

}
