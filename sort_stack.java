package coding;

import java.util.Stack;

public class sort_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(5);
		s.push(1);
		s.push(4);
		s.push(3);
		
		sort(s);
		display(s);
		
	}
	
	public static void sort(Stack<Integer> s)
	{
		if(s.isEmpty())
			return;
		int temp = s.pop();
		sort(s);
		
		insert(s,temp);
		
	
	}
	public static void display(Stack<Integer> s)
	{
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
	
	public static void insert(Stack<Integer> s,int temp)
	{
		if(s.isEmpty() || s.peek()<=temp)
			{s.push(temp);return;}
		
		int t = s.pop();
		insert(s,temp);
		s.push(t);
	}

}
