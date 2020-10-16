package crackingTheCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// google interview question 
public class StacksAndQueues {

	
	
	static void infix(String s) { 
		
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('*');
		arr.add('+');
		arr.add('-');
		arr.add('/');
		Stack<Character> st = new Stack<>();
		Set<Character> set = new HashSet<Character>(arr);
		for(char ch : s.toCharArray()) {
			if(!set.contains(ch)) {
				st.push(ch);
				//continue;
			}
			else {
				int num1 =st.pop()-'0';
				int num2=st.pop() -'0';
				if(ch=='*') {
					int num= num1*num2+'0';
					char a = (char)(num);
					st.push(a);
				}
				if(ch=='/') {
					int num= num1/num2+'0';
					char a = (char)(num);
					st.push(a);
				}
				
				if(ch=='+') {
					int num= num1+num2+'0';
					char a = (char)(num);
					st.push(a);
				}
				
				if(ch=='-') {
					int num= num2-num1+'0';
					char a = (char)(num);
					st.push(a);
				}
				
				
				
				
			}
		}
		
		System.out.println(st.pop());
		
	}
	
	
	
	
	 public static void main(String[] args) 
	    { 
		 
		 
		 infix("123+*8-");
		 
//	        String str = "ABC"; 
//	        int n = str.length(); 
//	        StacksAndQueues permutation = new StacksAndQueues(); 
//	        permutation.permute(str, 0, n-1); 
	    } 
	  
	    /** 
	     * permutation function 
	     * @param str string to calculate permutation for 
	     * @param l starting index 
	     * @param r end index 
	     */
	    private void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	            System.out.println(str); 
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str = swap(str,l,i); 
	                permute(str, l+1, r); 
	                str = swap(str,l,i); 
	            } 
	        } 
	    } 
	  
	    /** 
	     * Swap Characters at position 
	     * @param a string value 
	     * @param i position 1 
	     * @param j position 2 
	     * @return swapped string 
	     */
	    public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	  
	}
	
	
