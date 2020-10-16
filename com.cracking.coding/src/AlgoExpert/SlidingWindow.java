package AlgoExpert;

import java.util.Arrays;
import java.util.Queue;

import org.junit.Test;

import tree.TreeNode;



interface one {
	static String a="Naveen";
	static void show() {
		System.out.println("Hey");
	}
}
public class SlidingWindow implements one {

	static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {

		Arrays.sort(calories);
		int point = 0;
		for(int i = 0, win = 0; i < calories.length; ++i) {
			win += calories[i];
			if(i >= k - 1) {                                                       // reach a k sequence already.
				if(i > k - 1) { 
					win -= calories[i - k]; }                          // more than k sequence already
				if(win < lower) { --point ; }
				else if(win > upper) { ++point; }
			}
		}
		return point;
	}


	public static void main(String[] args) {
		//int arr[] = {7, 10, 12, 7, 9, 14};
		int arr[] = {3,2};
		int upper =12;
		int lower =11;
		int k=2;
		dietPlanPerformance(arr, k, lower, upper);
		System.out.println();
		one.show();
		//a="get";
		specialArray(arr);
	}




	/**
	 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.

Return the length of the longest (contiguous) subarray that contains only 1s. 



Example 1:

Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation: 
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
	 * @param A
	 * @param K
	 * @return
	 */
	public int longestOnes(int[] A, int K) {
		int i = 0, j;
		for (j = 0; j < A.length; ++j) {
			if (A[j] == 0) K--;
			if (K < 0 && A[i++] == 0) K++;
		}
		return j - i;
	}


	public void show() {
		// TODO Auto-generated method stub

	}


	/**
	 * 1151. Minimum Swaps to Group All 1's Together

Given a binary array data, return the minimum number of swaps required to group all 1’s present in the array together in any place in the array.



Example 1:

Input: data = [1,0,1,0,1]
Output: 1
Explanation: 
There are 3 ways to group all 1's together:
[1,1,1,0,0] using 1 swap.
[0,1,1,1,0] using 2 swaps.
[0,0,1,1,1] using 1 swap.
The minimum is 1.
	 */

	public int minSwaps(int[] data) {

		// first count number of 1s in the array
		int numOnes = 0;
		for (int num : data) {
			if (num == 1) numOnes++;
		}

		// for every fixed window with size numOnes, the swaps need to do is the number of zeros within this window (or window size - number of ones)
		int k = numOnes;
		int maxOnes = 0;
		int windowOnes = 0;

		for (int l = 0, r = 0; r < data.length; r++) {

			windowOnes += data[r];

			if (r - l == k - 1) {
				maxOnes = Math.max(maxOnes, windowOnes);
				windowOnes -= data[l++];
			}
		}

		return k - maxOnes;
	}




	/**
	 * Example 1:

Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
Output: 16
Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
	 * @param customers
	 * @param grumpy
	 * @param X
	 * @return
	 */
	@Test
	public int maxSatisfied(int[] customers, int[] grumpy, int X) {
		int n = customers.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (grumpy[i] == 0) {
				sum += customers[i];
			}
		}
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
		return max;
	}

	static int specialArray(int[] nums1) {

		int []nums = {3,5} ;
		//Arrays.sort(nums);
		//int count=0;
		for(int i=0;i<nums.length;i++) {

			int count=0;
			for(int j=0;j<nums.length;j++) {                
				if(nums[i] <=nums[j]) {
					count++;
				}
			}

			for(int j=0;j<nums.length;j++) {
				if(count==nums[j]) 
				{
					return count;
				}
			}

		}


		return -1;


	}



	public boolean isEvenOddTree(TreeNode root) {

		Queue<Integer> qu= new LinkedList<Integer>();

		qu.






	}





}
