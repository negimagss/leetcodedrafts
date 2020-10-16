package AlgoExpert;

import org.junit.Test;

public class SlidingWindow_1 {


	/**
	 *  

   Example 1:

    Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
    Output: 16
    Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
    The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
	 */
	@Test
	public void maxSatisfied() {
		int[] customers= {1,0,1,2,1,1,7,5};
		int[] grumpy = {0,1,0,1,0,1,0,1};
		int X = 3;
		int n = customers.length;
		
		
		
		
		int sum = 0;
		//count the total happy customers
		for (int i = 0; i < n; i++) {
			if (grumpy[i] == 0) {
				sum += customers[i];
			}
		}
		
		//now calculatuing the maximum we  can reach from here 
		int max = Integer.MIN_VALUE;
		int j = 0;
		
		
		for (int i = 0; i + X <= n; i++) {
			while (j < n && j - i + 1 <= X) {
				if (grumpy[j] == 1) {
					sum += customers[j];
				}
				j++;
			}
			max = Math.max(max, sum);
			if (grumpy[i] == 1) {
				sum -= customers[i];
			}
		}
		System.out.println(max);
		// return max;
	}



}
