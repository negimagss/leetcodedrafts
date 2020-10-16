package Stack;

import java.util.Stack;

public class validateStackSeq946 {

	public static void main(String[] args) {

		int[] pushed= {1,2,3,4,5};
		int[] popped= {4,5,3,2,1};
		int[] nums= {3,4,5,2};

		System.out.println(new validateStackSeq946().validateStackSequences(pushed, popped));
	
		System.out.println(new validateStackSeq946().maxProduct(nums));

	
	
	}

	
	  public int maxProduct(int[] nums) {
	        
	        
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i< nums.length;i++) { 
	            for(int j=0;j<nums.length;j++) {
	                
	                if(i==j){continue;}
	                int temp=(nums[i]-1) * (nums[j]-1);
	                if(max<temp) {
	                    max=temp;
	                }
	                
	                
	            }
	        }
	        
	        return max;
	        
	        
	    }
	
	
	
	
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		
		//push each element to the value
		for (int x : pushed) {
			stack.push(x);
			while (!stack.empty() && stack.peek() == popped[i]) {
				stack.pop();
				i++;
			}
		}
		//stack.isEmpty();
		return stack.empty();
	}
	
	
	 public boolean validateStackSequencesmy(int[] pushed, int[] popped) {
		    
	        Stack<Integer> st = new  Stack<>();
	        int i=0;
	        for(int j : pushed) {
	            st.push(i);
	            while(!st.empty() &&  st.peek()==popped[i]) {
	                st.pop();
	                i++;
	            }
	            
	        }
	        
	        return st.empty();
	        
	    }
}
