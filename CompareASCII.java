package coding;

public class CompareASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindCountOfOrderedWords("Egg Ant Pen"));

	}
	public static int FindCountOfOrderedWords(String input1)
	{
		String str[] = input1.split(" ");
		int ans=0;
		for(String s: str) {
			boolean flag=true;
			int prev=s.charAt(0);
			for(int i=1;i<s.length();i++) {
				int curr= s.charAt(i);
				if(flag) {
				if(curr<prev) {
					flag=false;
				}
				prev=curr;
			  }
			}
			if(flag)
				ans++;
		}
		return ans;
	}

}
