package coding;

public class JumpGameGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public boolean canJump(int[] nums) {
	        int lastGoodIndexPos=nums.length-1;//we traverse from the end and see whether we can reach the  lastGoodIndexPos 
	                                           //if yes,that means there is a way to reach to end from that point and thus we                                              update the lastGoodIndexPos.
	        for(int i=nums.length-1;i>=0;i--)
	        {
	            if(i+nums[i]>=lastGoodIndexPos)
	                lastGoodIndexPos=i;
	        }
	        return lastGoodIndexPos==0;
	    }
	}

