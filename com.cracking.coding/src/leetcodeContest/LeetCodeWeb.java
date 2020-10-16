package leetcodeContest;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 5, 4};
		System.out.println(new LeetCodeWeb().findLeastNumOfUniqueInts(arr,1));
	}

	
	
	public int findLeastNumOfUniqueInts(int[] arr, int mi) {
	      
        int n=arr.length;
       Map<Integer, Integer> m = new HashMap<Integer, Integer>(); 
        int count = 0; 
        int size = 0; 
  
        // Store the occurrence of ids 
        for (int i = 0; i < n; i++) 
        { 
  
            // If the key is not add it to map 
            if (m.containsKey(arr[i]) == false) 
            { 
                m.put(arr[i], 1); 
                size++; 
            } 
  
            // If it is present then increase the value by 1 
            else m.put(arr[i], m.get(arr[i]) + 1); 
        } 
  
        // Start removing elements from the beginning 
        for (Map.Entry<Integer, Integer> mp: m.entrySet()) 
        { 
            // Remove if current value is less than 
            // or equal to mi 
            if (mp.getKey() <= mi) 
            { 
                mi -= mp.getKey(); 
                count++; 
            } 
            // Return the remaining size 
            else return size - count; 
        } 
  
        return size - count; 
        
        
    }
	
	
	
	
}
