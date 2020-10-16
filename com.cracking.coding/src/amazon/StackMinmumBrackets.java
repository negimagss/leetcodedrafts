package amazon;

import java.util.Stack;

public class StackMinmumBrackets {

	
	
	public static void main(String[] args) {
		
	}
	
	   public int minAddToMakeValid(String S) {
	       
	        //tack<Charcter> st = new Stack<Character>();
	       Stack<Character> st1 = new Stack<Character>();
	        
	       Stack<Character> st = new Stack<Character>();

	        for(char c: S.toCharArray()) {
	            
	            if(c=='(') {st.push(c);}
	            else {
	                st1.push(')');
	            }
	            
	            if(st.isEmpty()) continue;
	            if(c==')' && st.peek()=='(') {
	                st.pop();
	                st1.pop();
	            }
	            
	        }
	        
	        
	        
	        
	     
	        
	      return st.size() +st1.size();  
	        
	        
	    }
	
	
}
