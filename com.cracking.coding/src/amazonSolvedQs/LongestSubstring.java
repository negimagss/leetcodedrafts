package amazonSolvedQs;

import java.util.Arrays;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring1("bbbb"));
	}


	public static int lengthOfLongestSubstring(String s) {

		//s.replaceAll("[ ]", "");
		//System.out.println(s);
		int[] arr  = new int[128];
		Arrays.fill(arr, 0);
		int l=0;
		int max=0;
		for(char ch : s.toCharArray()) {
			arr[ch]++;
			System.out.println(ch);
			if(arr[ch]>1) {
				if(max<l) {
					max=l;
				}
				l=1;
				Arrays.fill(arr,0);
				continue;
			}
			l++;
		}

		return max>l?max:l;

	}


	static int lengthOfLongestSubstring1(String s) {
		int n = s.length(), ans = 0;
		int[] index = new int[128]; // current index of character
		// try to extend the range [i, j]
		int i=0;
		for (int j = 0; j < n; j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}


	
	
	static void string(String str1, String str2)  {
		
	}
	
	
	

}
