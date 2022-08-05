package coding;

public class CountGoodSplitsSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    public int numSplits(String s) {
	        int goodSplits=0;
	        int left[] =new int[26];//to store frequencies in the left substring
	        int right[] =  new int[26];// to  store frequencies in the right substring
	        for(int i=0;i<s.length();i++)
	        {   char ch = s.charAt(i);
	            right[ch-'a']++;//shows there is no left now but only the right right=s.length and left=0
	        }
	        
	        for(int i=0;i<s.length();i++)
	        {
	            char ch = s.charAt(i);
	            left[ch-'a']++;//current character has become part of the left part
	            
	            right[ch-'a']--;//if the current part is in left part then the right part has to be deleted.
	            //character count in right array will get less after each iteration as i++ bcoz left substring size increases
	            int distinctNumberInTheLeft = countDistinct(left);
	            int distinctNumberInTheRight = countDistinct(right);
	            
	            if(distinctNumberInTheRight==distinctNumberInTheLeft)
	                goodSplits++;
	        }
	        return goodSplits;
	        
	        
	    }
	    public static int countDistinct(int arr[]){
	        int count=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]!=0)
	                count++;
	        }
	        return count;
	    }
	}

