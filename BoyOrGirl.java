package coding;

import java.util.HashMap;
import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char ch:s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		if(map.size()%2==0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}

}
