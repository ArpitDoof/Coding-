package coding;
import java.util.*;
public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] =  new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print(totalFruit(arr));
	}
	
	public static int totalFruit(int fruits[])
	{
		int i=0,j=0,ans=Integer.MIN_VALUE;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(j<fruits.length)
		{
			map.put(fruits[j], map.getOrDefault(fruits[j], 0)+1);
			if(map.size()<2)
				j++;
			else if(map.size()==2)
			{
				ans = Math.max(ans, j-i+1);
				j++;
			}
			else if(map.size()>2)
			{
				while(map.size()>2)
				{
					map.put(fruits[i], map.get(fruits[i])-1);
					if(map.get(fruits[i])==0)
						map.remove(fruits[i]);
					i++;
				}
				j++;
			}
			
			
		}
		return ans;
	}

}
