package coding;

import java.util.Vector;
public class vec_impl {

	
		public static void main(String args[])
		{
			Vector<Integer> vec = new Vector<>();
			vec.add(1);
			vec.add(6);
			vec.add(3);
			vec.add(5);
			vec.add(4);
			vec.add(2);
			//System.out.println(vec.remove(vec.lastElement()));
			
			sort(vec);
			display(vec);
	}
		
		public static void sort(Vector<Integer> vec)
		{
			if(vec.size()==0)
			{
				return ;
			}
			int temp = vec.lastElement();
			vec.remove(vec.lastElement());
			
			sort(vec);
			insert(vec,temp);
		}
		public static void display(Vector<Integer> vec)
		{
			while(!vec.isEmpty())
			{
				System.out.print(vec.lastElement());
				vec.remove(vec.lastElement());
			}
		}
		
		public static void insert(Vector<Integer> vec,int temp)
		{
			if(vec.size()==0 || vec.lastElement()<=temp)
			{
				vec.add(temp);return;
			}
			
			int t = vec.lastElement();
					vec.remove(vec.lastElement());
			insert(vec,temp);
			vec.add(t);
		}
}