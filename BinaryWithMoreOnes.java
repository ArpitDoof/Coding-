package coding;

import java.util.ArrayList;

public class BinaryWithMoreOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       helper(3);
	}
	public static void helper(int n)
	{
		String op = "1";
		ArrayList<String> list = new ArrayList<>();
		solve(op,n-1,0,0,list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	public static void solve(String op,int n,int one,int zero,ArrayList<String> ans)
	{
		if(n==0)
		{
			 ans.add(op);
			return;
		}
		
		if(one<=n)
		{   String op1 = op;
		op1 = op1+"1";
			solve(op1,n-1,one+1,zero,ans);
		}
		if(zero<=one)
		{
			String op2 = op;
			op2=op2+"0";
			solve(op2,n-1,one,zero+1,ans );
		}
		return;
	}

}
