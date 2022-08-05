package coding;

public class permutation_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			solve("a1B2","");
	}
	public static void solve(String inp,String op)
	{
		if(inp.length()==0)
		{
			System.out.println(op);
			return;
		}
		String op1= op;
		String op2 =op;
		op1 = op1+Character.toString(Character.toUpperCase(inp.charAt(0)));
		op2 = op2+Character.toString(Character.toLowerCase(inp.charAt(0)));
		inp = inp.substring(1);
		solve(inp,op1);
		solve(inp,op2);
	}
}
