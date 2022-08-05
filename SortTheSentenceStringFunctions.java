package coding;

public class SortTheSentenceStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String sortSentence(String s) {
	     String words[] = s.split(" ");
	        String ans[] = new String[words.length];
	        for(String word: words)
	        {
	            int position  = ((int)word.charAt(word.length()-1))-48;
	            ans[position-1]=word.substring(0,word.length()-1);
	        }
	        
	        String str = String.join(" ",ans);
	        return str;
	    }
}
