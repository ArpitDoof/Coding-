package coding;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		String s = Long.toString(n);
		//System.out.println(s.length());
		long arr[] = new long[s.length()];
		for(int i=arr.length-1;i>=1;i--)
		{
			arr[i]=n%10;
			n=n/10;
			if(arr[i]>=5)
			{arr[i]=9-arr[i];}
		}
		arr[0]=n;
		if(arr[0]>=5 && arr[0]!=9)
			arr[0]=9-arr[0];
		long ans=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			ans=ans*10+arr[i];
		}
		System.out.println(ans);
	}

}
