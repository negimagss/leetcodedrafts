package amazon;

import java.util.Arrays;

public class Googlefun {

	
	
	 public static void main(String[] args){
	        //Test input
		 int[] x= {13, 5, 6, 2, 5};
		 int[] y= {5, 2, 5, 13};
		 
		 
		/*
		 * int[] x= {14, 27, 1, 4, 2, 50, 3, 1}; int[] y= {2, 4, -4, 3, 1, 1, 14, 27,
		 * 50};
		 * 
		 * 
		 * int[] x= {14, 27, 1, 4, 2, 50, 3, 1}; int[] y= {2, 4, -4, 3, 1, 1, 14, 27,
		 * 50};
		 * 
		 * 
		 * int[] x= {14, 27, 1, 4, 2, 50, 3, 1}; int[] y= {2, 4, -4, 3, 1, 1, 14, 27,
		 * 50};
		 */
		 
		 
	      System.out.println( solution(x, y));
	    }
	  public static int solution(int[] x, int[] y) {
	        // Your code here
	        
	        Arrays.sort(x);
	        Arrays.sort(y);
	        int val=0;
	        if(x.length < y.length) {
	        val=returnSol(x, y);    
	        }
	        else {
	            val=returnSol(y,x);
	        }
	        
	        return val;
	        
	        
	    }
	    
	    
	    static int returnSol(int[] x , int[] y) {
	        
	        int val=0;
	        for(int i=0;i<y.length;i++) {
	         if(x[i]!=y[i]) {
	            val=y[i];
	            break;
	         }   
	        }
	        return val;
	    }
	    
	    
	    
	    public static void largestnumber(int[] arr) {
	    
	    	Arrays.sort(arr);
	    	// now create a number using the numer from list 
	    	
	    	
	    	
	    	
	    	
	    }
	
	
}
