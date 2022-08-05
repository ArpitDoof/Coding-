package coding;

public class MinimumDifferenceElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,10};int key=7;
		int ceil = ceil(arr,key);
		
		int floor = floor(arr,key);
		System.out.println(ceil+" "+floor);
		System.out.println( Math.min(ceil-key, key-floor));

	}
	public static int floor(int arr[],int key) {
		int low=0,high=arr.length-1,res=0;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]<=key) {
				low=mid+1;
				res=arr[mid];
			}
			else if(arr[mid]>key)
				high=mid-1;
			
		}
		return res;
	}
	
	public static int ceil(int arr[],int target) {
		int low=0,high=arr.length,ans=0;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]==target)
			{
				high=mid-1;
				
			}
			else if(arr[mid]<target)
				low=mid+1;
			else
				{high=mid-1;
				ans=arr[mid];
				}
		}
		return ans;
	}

}
