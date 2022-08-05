package coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MaxInSubarray {
  public static void main(String args[])
  {
	  Scanner sc  = new Scanner(System.in);
	  int size= sc.nextInt();
	  int arr[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int k =sc.nextInt();
	  ArrayList<Integer> list = SlidingWindow(size,arr,k);
	  for(int i=0;i<list.size();i++)
	  {
		  System.out.println(list.get(i));
	  }
  }
  
  public static ArrayList<Integer> SlidingWindow(int size,int arr[],int k)
  {
	  //Stack<Integer> st = new Stack<Integer>();
	  Queue<Integer> q =new LinkedList<>();
	  int i=0,j=0;
	  ArrayList<Integer> ans = new ArrayList<>();
	  while(j<size)
	  {
		  while(q.size()>0 && q.peek()<arr[j])
		  {
			  q.remove();
		  }
		  q.add(arr[j]);
		  if(j-i+1<k)
			  j++;
		  else if(j-i+1==k)
		  {
			  ans.add(q.peek());
			  if(arr[i]==q.peek())
			  {
				  q.remove();
			  }
			  i++;j++;
		  }
	  }
	  return ans;
		  
  }
}
