package coding;

public class CountSquareSubmatricesContaining1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int countSquares(int[][] matrix) {
	       int n=matrix.length;
	        int m =matrix[0].length;int sum=0;
	        int dp[][] = new int[n][m];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                if(i==0 || j==0)
	                {dp[i][j]=matrix[i][j];
	                 if(matrix[i][j]==1)
	                     sum++;}
	        
	        
	        for(int i=1;i<n;i++)
	            for(int j=1;j<m;j++)
	            {
	                if(matrix[i][j]==1)
	                {
	                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
	                    sum=sum+dp[i][j];
	                }
	            }
	        return sum;
	    }
	}
}
