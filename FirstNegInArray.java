package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstNegInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k =sc.nextInt();
		SlidingWindow(arr,size,k);
		sc.close();
	}
	
	public static void SlidingWindow(int arr[],int size,int k)
	{
		int i=0,j=0;
		ArrayList<Integer> list = new ArrayList<>();
		 ArrayList<Integer> ans = new ArrayList<>();
		while(j<size)
		{
			if(arr[j]<0)
				{
				list.add(arr[j]);
				}
			if(j-i+1<k)
				j++;
			else if(j-i+1==k)
			{
				if(list.size()!=0)
					{
					ans.add(list.get(0));
					if(list.get(0)==arr[i])
						list.remove(0);
					}
				else if(list.size()==0)
					ans.add(0);
				i++;j++;
				
			}
			

}
		for(i=0;i<ans.size();i++)
			System.out.println(ans.get(i));
	}
}
