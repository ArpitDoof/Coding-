package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sum_ofAllPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int input2 = sc.nextInt();
		int input1[] = new int[input2];
		for(int i=0;i<input2;i++)
		{
			input1[i] =sc.nextInt(); 
		}
		
		System.out.println(findSumOfPrimes(input1,input2));
		
		
	}
	public static int findSumOfPrimes(int input1[],int input2)
	{
		ArrayList<Integer> list  =new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for(int i=0;i<input2;i++)
		{
			if(checkPrime(input1[i]))
				{
				list.add(input1[i]);
		}
		}
		int sum=0;
		if(!list.isEmpty()) {
			Collections.sort(list);
			
			for(int i=1;i<list.size();i++)
			{
				sum+=list.get(i);
			}
			
		}
		else
		{
			Arrays.sort(input1);
			for(int i=1;i<input1.length;i++)
			{
				sum+=input1[i];
			}
			
	}
		return sum;
	}
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
