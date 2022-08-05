package coding;

import java.util.ArrayList;

public class Josephus_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helper(40,7);
	}
	public static void helper(int n,int k)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			ans.add(i+1);
		}
		solve(0,ans,k-1);
		
	}
	public static void solve(int index,ArrayList<Integer> ans,int k)
	{
		if(ans.size()==1)
		{
			System.out.println(ans.get(0));
			return;
		}
		
		index = (index+k)%ans.size();
		ans.remove(index);
		//index = (index+1)%ans.size();
		solve(index,ans,k);
	}

}
