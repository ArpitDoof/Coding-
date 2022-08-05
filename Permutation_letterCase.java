package coding;

import java.util.ArrayList;

public class Permutation_letterCase {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ArrayList<String> list = new ArrayList<>();
			solve("a1B2","",list);
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
	}
	public static void solve(String inp,String op,ArrayList<String> list)
	{
		if(inp.length()==0)
		{
			//System.out.println(op);
			list.add(op);
			return;
		}
		if(!Character.isDigit(inp.charAt(0)))
		{String op1= op;
		String op2 =op;
		op1 = op1+Character.toString(Character.toUpperCase(inp.charAt(0)));
		op2 = op2+Character.toString(Character.toLowerCase(inp.charAt(0)));
		inp = inp.substring(1);
		solve(inp,op1,list);
		solve(inp,op2,list);
		}
		else
		{
			String op1 =op;
			op1 = op1+Character.toString(inp.charAt(0));
			inp = inp.substring(1);
			solve(inp,op1,list);
		}
	}
	
	
	
	
}
