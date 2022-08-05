package coding;

public class NearlySortedGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10, 3, 40, 20, 50, 80, 70};
				System.out.println(nearlySorted(nums,40));
	}
	public static int nearlySorted(int nums[],int target)
	{
		int low=0,n=nums.length,high=n-1;
		
		while(low<=high) {
			int mid= low+(high-low)/2;
			if(nums[mid]==target)
				return mid;
			else if(mid-1>=low && nums[mid-1]==target)
				return mid-1;
			else if(mid+1<=high && nums[mid+1]==target)
				return mid+1;
			
			else if(nums[mid]<target)
				low=mid+2;
			else 
				high=mid-2;
		}
		
		return -1;
	}

}
