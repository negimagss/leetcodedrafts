package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCountNumberTeams {

	
	
	 public static int solution(int[] l1) {
	        // Your code here
	        
	        Arrays.sort(l1);
	        // remove duplicates
	        
	        List<Integer> arr = new ArrayList<Integer>();
	        Map<Integer, Integer> mp = new HashMap<>();
	        for(int i=0;i<l1.length;i++) {
	            if(!mp.containsKey(l1[i])) {
	            	mp.put(l1[i], 1);
	                arr.add(l1[i]);
	            }
	        }
	        
	        
	        
	        
	        Integer[] l= new Integer[arr.size()];
	        l=(Integer[]) arr.toArray();
	        Arrays.sort(l);
	         
	        int count=0;
	        for(int i=0;i<l.length-2;i++) {
	            
	            for(int j=i+1 ;j<l.length-1;j++) {
	                for(int k=j+1;k<l.length;k++) {
	                    if(l[j]%l[i]==0 && l[k]%l[j]==0) {
	                        
	                        count++;
	                    }
	                    
	                    
	                }
	            }
	        }
	        
	        return count;
	        
	    }
	
	
	
	 public int numTeams(int[] ratings) {
	        
	       // Arrays.parallelSort(a);
	        
	        int count=0;
	        // we need to meet two conditions only 
	         for(int i=0;i< ratings.length-2;i++) {
	             
	             for(int j =i+1;j<ratings.length-1;j++ )
	             {
	                 int k=j+1;
	                 while(k<ratings.length) {
	                     
	                     if(ratings[i] < ratings[j] && ratings[j] < ratings[k] && ratings[i] < ratings[k] )
	                     {
	                    count++;     
	                     }
	                      if(ratings[i] >ratings[j] && ratings[j] > ratings[k] && ratings[i] > ratings[k] )
	                     {
	                    count++;     
	                     }
	                     k++;
	                 }
	                 
	             }
	         }  
	      
	        
	        return count;
	    }
	 
	 
	 public int numTeams_1(int[] rating) {
		    int res = 0;
		    for (int i = 1; i < rating.length - 1; ++i) {
		        int less[] = new int[2], greater[] = new int[2];
		        for (int j = 0; j < rating.length; ++j) {
		            if (rating[i] < rating[j])
		                ++less[j > i ? 1 : 0];
		            if (rating[i] > rating[j])
		                ++greater[j > i ? 1 : 0];
		        }
		        res += less[0] * greater[1] + greater[0] * less[1];
		    }
		    return res;
		}
	 
	 
	 
	 
	
	
	
}
