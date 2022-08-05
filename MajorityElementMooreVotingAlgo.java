package coding;

public class MajorityElementMooreVotingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int majorityElement(int[] nums) {
        //Moore Voting Algorithm
        int count=0,elem=0;
        for(int i:nums)
        {
            if(count==0)
                elem=i;
            if(elem==i)count++;
            else
                count--;
        }
        return elem;
        
    }
}
