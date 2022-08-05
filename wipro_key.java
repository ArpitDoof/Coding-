package coding;

public class wipro_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findKey(3521,2452,1352));

	}
	public static int findKey(int input1,int input2,int input3) {
		String inp1 = Integer.toString(input1);
		String inp2 = Integer.toString(input2);
		int dup = input3,max=Integer.MIN_VALUE;
		while(dup!=0) {
			int d = dup%10;
			max =  Math.max(d, max);
			dup=dup/10;
		}
		int thou = (int)(inp1.charAt(1))-48;
		int hund = (int)(inp2.charAt(2))-48;
		int ans = (thou*hund)-max;
		return ans;
		
	}

}
