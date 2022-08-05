package coding;

public class FirstOneInBinarySortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
		System.out.println(findPos(arr));
	}
	public static int findPos(int arr[]) {
		
		int low=0,high=1,ans=-1;
		while(arr[high]!=1)
			high=high*2;
		
		while(low<=high) {
			int mid =low+(high-low)/2;
			if(arr[mid]==1) {
				high=mid-1;
				ans=mid;
			}
			else if(arr[mid]==0)
			{
				low=mid+1;
			}
		}
		return ans;
	}

}
