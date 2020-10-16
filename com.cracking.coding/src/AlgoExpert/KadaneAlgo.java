package AlgoExpert;

import java.util.Arrays;

public class KadaneAlgo {
// a good example of dynami cprogramming 
	
	
	public static void main(String[] args) {
		
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(Arrays.toString(arr));

		maxSubArray(arr);
		System.out.println(Arrays.toString(arr));
//
		int trr[] = {-2,1,-3,4,-1,2,1,-5,4};
	rerunDP(trr);
		System.out.println(Arrays.toString(trr));
//
//		
//		int brr[]= {7,1,5,3,6,4};
		//maxProfit(brr);
		
		//System.out.println(Arrays.toString(arr));
	}
	
	
	/**
	 * Algorithm goes is that we check maximum value b/w the difference and presnet elemnt should be taken in acocut 
	 * @param nums
	 * @return
	 */
	
	  public static  int maxSubArray(int[] nums) {
		int max =nums[0];
		int curr= max; 
		for(int i =1;i<nums.length ;i++) {
			
			curr+=nums[i];
			curr= Math.max(curr, nums[i]);
			max=Math.max(max, curr);
		}
		  
		  System.out.println(max);
		  
		    return max;
		  }
	  
	  
	  
	  
	  static void rerunDP(int arr[]) {
		int max=arr[0];
		for(int i =01;i< arr.length;i++) {
			
			
			if(arr[i-1]>0) {
				arr[i]+=arr[i-1];
			}
			
			max= Math.max(arr[i], max);
		}
		System.out.println(max);
	  }
	  
	  static void beststock(int arr[]) {
		  
		  int max= 0;
		  for(int i=1;i<arr.length;i++) {
			  if(arr[i-1] <arr[i]) {
				  arr[i]-=arr[i-1];
			  }
			  max = Math.max(arr[i], max);
			  
		  }
		  System.out.println(max);
		  
	  }
	  
	  
	  static int maxProfit(int[] prices) {
	        int maxCur = 0, maxSoFar = 0;
	        for(int i = 1; i < prices.length; i++) {
	        	maxCur+=prices[i]-prices[i-1];
	        	
	        	
	            maxCur = Math.max(0, maxCur);
	            maxSoFar = Math.max(maxCur, maxSoFar);
	            prices[i-1]=maxSoFar;
	        }
			System.out.println(Arrays.toString(prices));

	        return maxSoFar;
	    }
	  
	  
	  
	  
	  
	
	
}
