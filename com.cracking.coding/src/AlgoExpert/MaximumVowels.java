package AlgoExpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumVowels {



	/** not the best solution 
	 * 
	 * n2 slution will give when interview starts 
	 * @param s
	 * @param k
	 * @return
	 */
	public int maxVowels(String s, int k) {



		int sum=0;
		for(int i=0;i<s.length()-k+1;i++) {

			//run the loop
			String a= s.substring(i, i+k);
			int sum1=0;
			for(char ch : a.toCharArray()) {

				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					sum1++;
				}
			}
			if(sum1>sum) {
				sum=sum1;
			}

		}



		return sum;


	}



	static void maxVowels1(String s, int k) {
		s="abciiidef";
		k=3;

		Set<Character> ch = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int n=s.length();
		int count=0;
		int max=0;
		for(int i=0;i<n ;i++) {

			if(ch.contains(s.charAt(i))) {
				count++;
			}
			if(i>=k && ch.contains(s.charAt(i-k))) {
				count--;
			}
			max= Math.max(max, count);
		}

		System.out.println(max);    	





	}
	public static void main(String[] args) {
		maxVowels1("", 0);
	}




}
