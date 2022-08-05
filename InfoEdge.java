package coding;

public class InfoEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Helper("64563"));
	}
	public static String Helper(String s)
	{
		long sum=0;
		for(char ch:s.toCharArray())
		{
			int n = (int)ch-48;
			sum+=n;
		}
		if(sum%3==0)
			return "Yes";
		else
			return "No";
	}
}
