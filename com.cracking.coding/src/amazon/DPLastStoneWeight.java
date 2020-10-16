package amazon;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class DPLastStoneWeight {

	
	
	public static void main(String[] args) {
		
		int stones[] = {31,26,33,21,40};
		System.out.println(new DPLastStoneWeight().lastStoneWeightII(stones));
		
		
		System.out.println(new DPLastStoneWeight().lastStoneWeightII1(stones));
		
	      PriorityQueue<Integer>  st = new  PriorityQueue<Integer>();
	      for(int i : stones) {
	            st.add(i);
	        }
			System.out.println(st);

		st.remove();
		System.out.println(st);
		st.remove();
		System.out.println(st);
		st.remove();
		System.out.println(st);
		st.remove();
		System.out.println(st);
		st.remove();
		System.out.println(st);
		
		
		int k[] = { 2, 3, 1};
		 PriorityQueue<Integer>  st1 = new  PriorityQueue<Integer>();
	      for(int i : k) {
	            st1.add(i);
	        }
		System.out.println(st1);
	      int count=1;
	      while(count!=2) 
	      {
	    	  st1.remove();
	    	  count++;
	      }
	      
	      System.out.println("Answer " + st1.peek());
		
	}
	public int lastStoneWeightII1(int[] stones) {
        
	      //Arrays.sort(stones);  
	      PriorityQueue<Integer>  st = new  PriorityQueue<Integer>();
	        for(int i : stones) {
	            st.add(-i);
	        }
	        
	        
	        
	        while(st.size()>1) {
	            
	            int a =-st.remove();
	            int b =-st.remove();
	            if(a!=b) {
	                st.add(-(a-b));
	            }
	        }
	        
	        
	        return st.isEmpty()?0:-st.remove();
	    }

	public int lastStoneWeightII(int[] stones) {
        
	     // Arrays.sort(stones);  
	      Stack<Integer>  st = new  Stack<Integer>();
	        for(int i : stones) {
	            st.add(i);
	        }
	
	        while(st.size()>1) {
	            
	            int a =st.pop();
	            int b =st.pop();
	            if(b!=a) {
	                st.push(Math.abs(b-a));
	            }
	        }
	        return st.isEmpty()?0:st.pop();
	    }
}
