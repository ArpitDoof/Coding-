package coding;

import java.util.HashMap;

public class CommonAlphabetLowerWipro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input1[]= {'g','q','r'};
		char input2[] = {'r','t','u'};
		
		System.out.println(SumOfCommonAlpha(input1,input2));

	}
	public static int SumOfCommonAlpha(char input1[],char input2[]) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(char num:input1) {
			if(!map.containsKey(num))
			map.put(num, 1);
			else
				map.put(num, map.get(num)+1);
			
		}
		int sum=0;
		for(char num: input2) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)-1);
				sum+=(int)num;
			}
		}
		
		return calculateDigitsSum(sum);
		
	}
	public static int calculateDigitsSum(int sum) {
		int ans=0;
		
		while(sum!=0) {
			int d = sum%10;
			ans+=d;
			sum=sum/10;
		}
		if(ans<10)
			return ans;
		else
			return calculateDigitsSum(ans);
	}

}
