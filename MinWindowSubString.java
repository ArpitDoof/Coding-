package coding;
import java.util.*;

public class MinWindowSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minWindow("ADOBECODEBANC","ABC"));
	}
	public static String minWindow(String s, String t) {
		
		 if(s.length()<t.length())
			 return "";
		 
		 else
		 {
		    
			 int i=0,j=0,ans=Integer.MAX_VALUE;String str="";int count=0;
			 HashMap<Character,Integer> map =new HashMap<>();
			 
			 for(int k =0 ;k<t.length();k++)
			 {
				 map.put(t.charAt(k),map.getOrDefault(t.charAt(k), 0)+1);
			 }
			 count = map.size();
			 while(j<=s.length())
			 {   if(count!=0) {
				 if(j<s.length() &&   map.containsKey(s.charAt(j)))
				 {
					 
					 map.put(s.charAt(j), map.get(s.charAt(j))-1);
					 if(map.get(s.charAt(j))==0)
						 count--;
					 
					 
					
				 }
				 j++;
			 }
				 if(count==0)
				 {
					 if(ans>j-i)
					 {
						 ans=j-i;
						 str = s.substring(i,j);
					 }
					 if(map.containsKey(s.charAt(i)))
							 {
						 map.put(s.charAt(i),map.get(s.charAt(i))+1);
						 if(map.get(s.charAt(i))==1)
							 count++;
							 }
					 
					 i++;
			 }
			 }
		return str; }
			 
			 //System.out.println(str);
		 }
	}

			
				
				
			