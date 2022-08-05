package coding;
import java.util.Stack;
public class delete_mid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int k = (s.size()/2)+1;
        deleteMid(s,k);
        display(s);
	}
	public static void deleteMid(Stack<Integer> s,int k)
	{
		if(k==1)
		{
			s.pop();
			return;
		}
		
		int temp = s.pop();
		deleteMid(s,k-1);
		s.push(temp);
	}
	
	public static void display(Stack<Integer> s)
	{
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
