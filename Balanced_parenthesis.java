package coding;

import java.util.ArrayList;

public class Balanced_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans= bal(3);
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}
	}
	
	public static ArrayList<String> bal(int n)
	{
		int open =n;
		int close =n;
		String op = "";
		ArrayList<String> ans = new ArrayList<>();
		solve(open,close,op,ans);
		return ans;
	}
	public static void solve(int open,int close,String op,ArrayList<String> ans)
	{
		if(open==0 && close==0)
		{
			ans.add(op);
			return;
		}
		if(open!=0)
		{
			String op1 = op;
			op1= op1+"(";
			solve(open-1,close,op1,ans);
		}
		if(close>open)
		{
			String op2 =op;
			op2=op2+")";
			solve(open,close-1,op2,ans);
		}
		return;
	}

}
