package coding;
import java.util.*;
public class NewProgrammingLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt(),count=0;
		for(int k = 0;k<t;k++)
		{
			int a=sc.nextInt();
			int b =sc.nextInt();
			int n = sc.nextInt();
			
			while(a<=n)
			{
				int temp =a+b;
				b=Math.max(a, b);
				a=temp;
				count++;
			}
			System.out.println(count);
			count=0;
		}
		
	}

}
