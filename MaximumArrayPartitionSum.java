package coding;

import java.util.Arrays;

public class MaximumArrayPartitionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public int maxSumAfterPartitioning(int[] arr, int k) {
	        int dp[] = new int[arr.length];
	         Arrays.fill(dp,-1);
	         return helper(arr,k,dp,0);
	    }
	    public static int helper(int arr[],int k,int dp[],int i)
	    {   int maxAns=Integer.MIN_VALUE;
	        if(i==arr.length)
	            return 0;
	        if(dp[i]!=-1)
	            return dp[i];
	       
	     
	     int len=0,sum=0,max=Integer.MIN_VALUE;
	      for(int j=i;j<Math.min((i+k),arr.length);j++)
	      {
	          len++;
	          max=Math.max(max,arr[j]);
	          sum=max*len+helper(arr,k,dp,j+1);
	          maxAns=Math.max(sum,maxAns);
	          
	          
	      }
	     
	     return dp[i]=maxAns;
	    }
	    
	
}
