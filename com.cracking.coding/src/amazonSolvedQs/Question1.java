package amazonSolvedQs;

import java.util.Arrays;

/**
 * https://leetcode.com/discuss/interview-question/833164/
 * @author Vikas
 *
 */
public class Question1 {

	public static void main(String[] args) {
		int n = 11373;
		System.out.println(solve(n));
	}
	
	private static int solve(int n) {
		int mod = (int)1e9 + 7;
		boolean[] arr = new boolean[(int)1e6 + 1];
		Arrays.fill(arr, true);
		for(int i=2;i*i<=(int)1e6;i++) {
			if(arr[i]) {
				for(int j=i;j*i<=(int)1e6;j++) {
					arr[i*j] = false;
				}
			}
		}
		arr[1] = false;
		arr[0] = false;
		String s = String.valueOf(n);
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		for(int i=1;i<=s.length();i++) {
			for(int j=Math.max(0, i-6);j<i;j++) {
				if(arr[Integer.parseInt(s.substring(j, i))]) {
					dp[i] = (dp[i] + dp[j]) % mod;
				}
			}
		}
		return dp[s.length()];
	}
	
	
	
	
	
	
	
	// this is a backtracking question 
	
	
	
	
	
	
	
	
	
	// https://leetcode.com/discuss/interview-question/762546/
	/**
	 * Simple question using the pattern matching fashion 
	 */
	//https://leetcode.com/discuss/interview-question/711882/Interview-Question-or-Amazon-or-Need-Help!-or-SDE
	
	
	
	//https://leetcode.com/discuss/interview-question/867506/Amazon-Question-Please-Help
	//https://leetcode.com/discuss/interview-question/325840/amazon-phone-screen-moving-requests
	//https://leetcode.com/discuss/interview-question/443941/Amazon-or-Onsite-or-Switch-Office-Buildings
	
	
	//https://leetcode.com/discuss/interview-question/762854/Amazon-or-Onsite-question-2020-Rejected
	
	
	
	
	
}
