package com.cracking.coding.Arrays;

public class GoldmanCubeRoot {
	
	
	 static int arr1[] = new int[]{1, 5, 9, 10, 15, 20}; 
	    static int arr2[] = new int[]{2, 3, 8, 13}; 
	     
	    
	    /**
	     * Merge two sorted arrays 
	     * @param m
	     * @param n
	     */
	    static void merge(int m, int n) 
	    { 
	        // Iterate through all elements of ar2[] starting from 
	        // the last element 
	        for (int i=n-1; i>=0; i--) 
	        { 
	            /* Find the smallest element greater than ar2[i]. Move all 
	               elements one position ahead till the smallest greater 
	               element is not found */
	            int j, last = arr1[m-1]; 
	            for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--) 
	                arr1[j+1] = arr1[j]; 
	       
	            // If there was a greater element 
	            if (j != m-2 || last > arr2[i]) 
	            { 
	                arr1[j+1] = arr2[i]; 
	                arr2[i] = last; 
	            } 
	        } 
	    }
	
	
	
	 public int mySqrt(int x) {
		    if (x < 2) return x;

		    long num;
		    int pivot, left = 2, right = x / 2;
		    while (left <= right) {
		      pivot = left + (right - left) / 2;
		      num = (long)pivot * pivot;
		      if (num > x) right = pivot - 1;
		      else if (num < x) left = pivot + 1;
		      else return pivot;
		    }

		    return right;
		  }

	 // Returns the absolute value of n-mid*mid*mid 
    static double diff(double n,double mid) 
    { 
        if (n > (mid*mid*mid)) 
            return (n-(mid*mid*mid)); 
        else
            return ((mid*mid*mid) - n); 
    } 
      
    // Returns cube root of a no n 
    static double cubicRoot(double n) 
    { 
        // Set start and end for binary search 
        double start = 0, end = n; 
   
        // Set precision 
        double e = 0.0000001; 
   
        while (true) 
        { 
            double mid = (start + end)/2; 
            double error = diff(n, mid); 
   
            // If error is less than e then mid is 
            // our answer so return mid 
            if (error <= e) 
                return mid; 
   
            // If mid*mid*mid is greater than n set 
            // end = mid 
            if ((mid*mid*mid) > n) 
                end = mid; 
   
            // If mid*mid*mid is less than n set 
            // start = mid 
            else
                start = mid; 
        } 
    } 
      
    // Driver program to test above function 
    public static void main (String[] args)  
    { 
        double n = 3; 
        System.out.println("Cube root of "+n+" is "+cubicRoot(n)); 
        
        double i;
        double precision = 0.000001;
        int num=3;
        for( i = 1; (i*i*i) <= num; ++i);
        for(--i; (i*i*i) < num; i += precision);
        System.out.println("Cube root of the given number is "+i);
        
        
        
        
    } 
}
