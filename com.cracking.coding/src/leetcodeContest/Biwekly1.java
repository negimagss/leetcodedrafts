package leetcodeContest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biwekly1 {
	 static void generate(int ones, int zeroes, String str, int len) { 
	        // If length of current string becomes same as desired length  
	        if (len == str.length()) { 
	            System.out.print(str + " "); 
	            return; 
	        } 
	  
	        generate(ones + 1, zeroes, str + "1", len); 
	  
	        if (ones < zeroes) { 
	            generate(ones, zeroes + 1, str + "0", len); 
	        } 
	        
	    }
	 
	public static List<String> arr = new ArrayList<String>();
	 public Biwekly1() {
		// TODO Auto-generated constructor stub
		 //L
	 
	 }
	 
	 
	 public static void printBin(String soFar, int iterations) {
		    if(iterations == 0) {
		    	arr.add(soFar);
		        System.out.println(soFar);
		    }
		    else {
		        printBin(soFar + "0", iterations - 1);
		        printBin(soFar + "1", iterations - 1);
		    }
		}
	  
	// Driver program to test above function  
	    public static void main(String[] args) { 
	        String str = ""; 
	       // generate(0, 0, str, 4); 
	        printBin("", 2);
	      
	        System.out.println("=====================================");
	        for(String a : arr) {
	        	System.out.println(a);
	        }
	        
	        
	        
	    } 
	    
	    
	    
	    
	    // answer is here 
	    public boolean hasAllCodes(String s, int k) {
	        int targetCount = 1 << k;
	        int n = s.length();
	        Set<String> seen = new HashSet<>();
	        for(int i = 0; i < n; i++) {
	            int j = i + k;
	            if(j > n)
	                break;
	            String s0 = s.substring(i, j);
	            seen.add(s0);
	            if(seen.size() == targetCount) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    
	    
	
}
