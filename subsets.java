package coding;

public class subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve("ab","");
	}
	
	public static void solve(String in,String out)
	{
		if(in.length()==0)
		{
			System.out.println(out);
			return;
		}
		
		String op1= out;
		String op2=out;
		op2 = op2+Character.toString(in.charAt(0));
		in = in.substring(1);
		solve(in,op1);
		solve(in,op2);
	}

}
