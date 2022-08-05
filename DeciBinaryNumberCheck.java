package coding;

public class DeciBinaryNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(minPartitions("32"));
	}

	    public static int minPartitions(String n) {
	    
	        
	      int maxDigit=0;
	        for(char ch : n.toCharArray())
	        {
	            int digit=(int)ch;
	            if(digit>maxDigit)
	                maxDigit=digit;
	            
	        }
	        return maxDigit-48;
	        
	    }
	}

