package coding;

public class BoreMooreAlgoMajorityOneThirdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<Integer> majorityElement(int[] nums) {
	        int num1=0,num2=0,c1=0,c2=0;
	        for(int i:nums)
	        {
	            if(i==num1)
	                c1++;
	            else if(i==num2)
	                c2++;
	            else if(c1==0)
	            {
	                num1=i;
	                c1=1;
	            }
	            else if(c2==0)
	            {
	                num2=i;
	                c2=1;
	            }
	            else
	            {
	                c1--;c2--;
	            }
	            
	        }int count1=0,count2=0;
	        List<Integer> ans = new ArrayList<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(num1==nums[i])count1++;
	            
	            else if(num2==nums[i])count2++;
	        }
	        if(count1>nums.length/3)
	        ans.add(num1);
	        if(count2>nums.length/3)
	        ans.add(num2);
	        return ans;
	    }
}
