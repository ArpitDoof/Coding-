package coding;

public class NextAlphabetBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a','e','i','o','u'};
				System.out.println(nextAlpha(arr,'e'));
		}

	
	
	public static char nextAlpha(char arr[] ,char ch) {
		int low=0,high=arr.length-1;char next=ch;
		while(low<=high) {
			int mid =low+(high-low)/2;
			if(arr[mid]==ch)
				low=mid+1;
			else if(arr[mid]<ch)
				low=mid+1;
			else
			{
				next=arr[mid];
				high=mid-1; 
			}
		}
		return next;
	}

}
