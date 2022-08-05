package coding;
import java.util.*;
public class LongestSubStringWithKChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int size = sc.nextInt();
		
		System.out.println(func("aaaa",2));
	}
	
	public static int func(String s,int k)
	{
		int i=0,j=0,ans=0;
		HashMap<Character,Integer> map = new HashMap<>();
		while(j<s.length())
		{
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
			
			if(map.size()==k)
			{
				ans = Math.max(ans, j-i+1);
			}
			else if(map.size()>k)
			{
				while(map.size()>k)
				{
					if(map.get(s.charAt(i))==1)
						map.remove(s.charAt(i));
					else if(map.get(s.charAt(i))>1)
						map.put(s.charAt(i), map.get(s.charAt(i))-1);
					
					i++;
				}
			}
			j++;
		}
		if(ans==0)
			return  -1;
		else
		    return ans;
	}

}
