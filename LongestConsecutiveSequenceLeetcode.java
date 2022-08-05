package coding;

import java.util.HashSet;

public class LongestConsecutiveSequenceLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestConsecutive(int[] nums) {
	       HashSet<Integer> set = new HashSet<>();
	        for(int i:nums)
	            set.add(i);
	        
	        int longestStreak=0;
	            for(int num:nums){
	            if(!set.contains(num-1))
	            {
	                int curr= num;
	                int currentStreak=1;
	                while(set.contains(curr+1))
	                {
	                    curr=curr+1;
	                    currentStreak=currentStreak+1;
	                }
	                longestStreak=Math.max(longestStreak,currentStreak);
	            }
	            }
	        return longestStreak;
}
