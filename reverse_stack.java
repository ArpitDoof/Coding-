package coding;

import java.util.Stack;

public class reverse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> s = new Stack<>();
	        s.push(1);
	        s.push(2);
	        s.push(3);
	        s.push(4);
	        s.push(5);
	        
	        reverse(s);
	        display(s);
	}
	public static void display(Stack<Integer> s)
	{
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
	
	public static void reverse(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int temp = s.pop();
		reverse(s);
		insert(s,temp);
	}
	
	public static void insert(Stack<Integer> s,int temp)
	{
		if(s.isEmpty())
			{	
			s.push(temp);
			return;
			}
		int k = s.pop();
		insert(s, temp);
		s.push(k);
		
	}

}
