package coding;

public class FloorOfAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2,4, 8, 10, 10, 12, 19},target=5;
		System.out.println(CeilOfTarget(a,target));
		System.out.println(floorOfTarget(a,target));

	}
	public static int floorOfTarget(int nums[],int target) {
		int low=0,high=nums.length-1,floor=-1;
		while(low<=high) {
			int mid =low+(high-low)/2;
			if(nums[mid]<target)
			{
				floor= Math.max(nums[mid], floor);
				low=mid+1;
			}
			else if(nums[mid]>target)
				high=mid-1;
			else
				low=mid+1;
		}
		return floor;
	}
	public static int CeilOfTarget(int nums[],int target) {
		int low=0,high=nums.length-1,ceil=Integer.MAX_VALUE;
		while(low<=high) {
			int mid =low+(high-low)/2;
			if(nums[mid]>target)
			{
				ceil= Math.min(nums[mid], ceil);
				high=mid-1;
			}
			else if(nums[mid]>target)
				high=mid-1;
			else
				low=mid+1;
		}
		return ceil;
	}

}
