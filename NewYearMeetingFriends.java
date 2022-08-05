package coding;

import java.util.Scanner;

public class NewYearMeetingFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int x3=sc.nextInt();
		int max=Math.max(x1, x2);
		int min =Math.min(x1, x2);
		System.out.println(Math.max(x3, max)-Math.min(min, x3));
	}

}
