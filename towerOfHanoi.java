package coding;

import java.util.Scanner;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in); 
		int n = sc.nextInt();
		char s='A',h='B',d='C';
		solve(n,s,h,d);
	}
	
	public static void solve(int n,char s,char h,char d)
	{
		if(n==1)//single plate is remaining
		{
			System.out.println("Moving disk 1 from"+s+" to "+d);
			return;
		}
		
		solve(n-1,s,d,h);
		System.out.println("Moving disk "+n+" from "+s+" to "+d);
		solve(n-1,h,s,d);
	}
	

}
