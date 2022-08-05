package coding;
import java.util.ArrayList;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	    public ArrayList<ArrayList<Integer>> solve(int numRows) {
	        
	         ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	        ArrayList<Integer> row,pre=null;
	        
	        for(int i=0;i<numRows;i++)
	        {  row = new ArrayList<>();
	            for(int j=0;j<=i;j++)
	            {
	                if(j==0||j==i)
	                    row.add(1);
	                else
	                    row.add(pre.get(j-1)+pre.get(j));
	            }
	         res.add(row);
	         pre=row;
	        }
	        return res;
	    }
	}



