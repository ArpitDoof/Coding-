package coding;

import java.util.Scanner;

public class permutation_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String out=Character.toString(s.charAt(0));
		s=s.substring(1);
       solve(s,out);
	}
	
	public static void solve(String inp, String op)
	{
		if(inp.length()==0)
		{
			System.out.println(op);
			return;
		}
		String op1 = op;
		String op2 = op;
		op1 = op1+" ";
		op1= op1+Character.toString(inp.charAt(0));
		op2 = op2+Character.toString(inp.charAt(0));;
		inp = inp.substring(1);
		solve(inp,op1);
		solve(inp,op2);
		
	}

}
