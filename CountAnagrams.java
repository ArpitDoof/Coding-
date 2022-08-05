package coding;

import java.util.HashMap;
import java.util.Scanner;

public class CountAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s =sc.next();
		String ptr = sc.next();
		SlidingWindow(s,ptr);
		sc.close();
	}
	
	public static void SlidingWindow(String s,String ptr)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		int k= ptr.length();
		for(int i=0;i<ptr.length();i++)
		{
			map.put(ptr.charAt(i), map.getOrDefault(ptr.charAt(i),0)+1);
		}
		int i=0,j=0,ans=0;
		int count=map.size();
		while(j<s.length())
		{
			if(map.containsKey(s.charAt(j)))
			{
				map.put(s.charAt(j), map.get(s.charAt(j))-1);
				if(map.get(s.charAt(j))==0)
					count--;
			}
			if(j-i+1<k)
			{
				j++;
			}
			else if(j-i+1==k)
			{
				if(count==0)
					ans++;
				if(map.containsKey(s.charAt(i)))
				{
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
					if(map.get(s.charAt(i))==1)
						count++;
				}
				
				i++;j++;
			}
			
		}
		System.out.println(ans);
	}

}
