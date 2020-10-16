package AlgoExpert;

public class LongestRepeatingCharacter {
	/**
	 * https://leetcode.com/problems/longest-repeating-character-replacement/submissions/
	 * 
	 * 
	 * 
	 * Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.

In one operation, you can choose any character of the string and change it to any other uppercase English character.

Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.

Note:
Both the string's length and k will not exceed 104.

Example 1:

Input:
s = "ABAB", k = 2

Output:
4

Explanation:
Replace the two 'A's with two 'B's or vice versa.
	 * @param s
	 * @param k
	 * @return
	 */
	public int characterReplacement(String s, int k)
	{
		int[] count = new int[128];
		int max=0;
		int start=0;
		for(int end=0; end<s.length(); end++)
		{
			max = Math.max(max, ++count[s.charAt(end)]);
			if(max+k<=end-start)
				count[s.charAt(start++)]--;
		}
		return s.length()-start;
	}



	static int maxTurbulenceSize(int[] A) {
		A = new int[]{9,4,2,10,7,8,8,1,9};
		int max=0;
		int count=1;
		int a=0; 
		int b=0;
		int c=0;


		for(int i =0;i<A.length;i++) {

			a=A[i];
			b=A[i+1];
			c=A[i+2];

			if(a>b && c>b) {
				count+=2;
				i=i+1;
				max=Math.max(count,max);
			}
			else {
				count=0;

			}


			//if()

		}

		System.out.println(max);
		return max;



	}
	public static void main(String[] args) {
		maxTurbulenceSize(null);
	}




	/**
	 * 1423. Maximum Points You Can Obtain from Cards
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the 
rightmost card first will maximize your total score. The optimal strategy is to take the 
three cards on the right, giving a final score of 1 + 6 + 5 = 12.
	 * @param cardPoints
	 * @param k
	 * @return
	 */
	public int maxScore(int[] cardPoints, int k) {
		if(cardPoints == null || cardPoints.length == 0 || k == 0){return 0;}
		int sum = 0; // window: start = 0; end = k;
		for(int i = 0; i < k; i++){ 
			sum += cardPoints[i];// add tehe firrst k 
		}
		if(k != cardPoints.length){ //if window size is smaller then array size
			int newSum = sum; // window: start = 0; end = k;  
			for(int end = k - 1; end >= 0; end--){ //sliding window left => start = -1 or cardPoints.length - 1
				newSum -= cardPoints[end];
				newSum += cardPoints[cardPoints.length - (k - end)];
				if(newSum > sum){
					sum = newSum;
				}
			}
		}

		return sum;
	}


/**
 * 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

 * Input: nums = [8,2,4,7], limit = 4
Output: 2 
Explanation: All subarrays are: 
[8] with maximum absolute diff |8-8| = 0 <= 4.
[8,2] with maximum absolute diff |8-2| = 6 > 4. 
[8,2,4] with maximum absolute diff |8-2| = 6 > 4.
[8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
[2] with maximum absolute diff |2-2| = 0 <= 4.
[2,4] with maximum absolute diff |2-4| = 2 <= 4.
[2,4,7] with maximum absolute diff |2-7| = 5 > 4.
[4] with maximum absolute diff |4-4| = 0 <= 4.
[4,7] with maximum absolute diff |4-7| = 3 <= 4.
[7] with maximum absolute diff |7-7| = 0 <= 4. 
Therefore, the size of the longest subarray is 2.
 * @param nums
 * @param limit
 * @return
 */


    public int longestSubarray(int[] nums, int limit) {
        
        int arr[] = new int[nums.length];
        
        arr[0]=1;
        for(int i=1;i<nums.length-1;i++) {
            if(Math.abs(nums[i-1] - nums[i]) <=limit) {
                arr[i]=1;
            }
            else {
                arr[i]=-1;
            }
        }
        
        int count=1;
        int max=0;
        for(int i=0;i<arr.length;i++) {
            
            if(arr[i]==-1) {
                max=Math.max(count,max);
                count=1;
                continue;
            }
           
            max=Math.max(count, max);
            count++;
            
            
        }
        
        return max;
        
        
    }

/**
 *  
https://leetcode.com/problems/get-equal-substrings-within-budget/
Example 1:

Input: s = "abcd", t = "bcdf", maxCost = 3
Output: 3
Explanation: "abc" of s can change to "bcd". That costs 3, so the maximum length is 3.
Example 2:
 * @param s
 * @param t
 * @param maxCost
 * @return
 */
    
    
    
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0;
        int r = 0;
        int max = 0;
        while (r < s.length()) {
            maxCost -= Math.abs(s.charAt(r) - t.charAt(r));
            r++;
            if (maxCost >= 0) {
                max = Math.max(max, r - l);
            }
            while (maxCost < 0) {
                maxCost += Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
        }
        return max;
    }




}
