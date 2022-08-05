package coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Wipro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
        char ch[]  = helper(arr);
        for(int i=0;i<ch.length;i++)
        		{
        	System.out.println(ch[i]);
        		}
	}
	
	public static char[] helper(int arr[])
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
			map.put(arr[i], i);
		
		Arrays.sort(arr);
		
		char ch[] = new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int pos= map.get(arr[i]);
			ch[pos] = (char)(97+i);
		}
		return ch;
	}
 
}
