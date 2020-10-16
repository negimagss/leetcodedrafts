package Stack;

import java.util.Stack;

public class DecodeStringIndex880 {

	/**
	 * 
	 * leet2code3
	 * leetleet
	 * leetleetcodeleetleetcodeleetleetcode
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println(new DecodeStringIndex880().decodeAtIndex("abc", 1));
	}
	public String decodeAtIndex(String S, int K) {

		//char[] ch = new char[]
		Stack<Character> st = new Stack<>();
		// push all to stack
		for(int i=S.length()-1;i>=0;i--) {
			st.push(S.charAt(i));        
		}


		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

		while(!st.isEmpty()) {

			if(Character.isDigit(st.peek())) {

				int num = st.pop()-'0';

				sb1.append(sb);
				StringBuilder s1 = new StringBuilder();
				String a=sb1.toString();
				s1=sb1;
				for(int i =0;i< num-1;i++) {
					// sb.append(sb.toString());
					sb1.append(a);

				}
				sb.delete(0, sb.length());
			}
			else {
				sb.append(st.pop());
			}
		}

		System.out.println(sb1);
		if(sb1.length()==0) {
			String.valueOf(S.charAt(K-1));
		}

		return String.valueOf(sb1.charAt(K-1));  
	}


	public String decodeAtIndex1(String S, int K) {

		long curLength = 0;
		char c = 0;

		for (int i = 0; i < S.length(); i++) {
			c = S.charAt(i);
			if (Character.isDigit(c)) { 
				curLength *= c - '0';
			}
			else { 
				curLength++;
			}
		}

		for (int i = S.length() - 1; i >= 0; i--) {
			c = S.charAt(i);
			if (Character.isDigit(c)) { 
				curLength /= c - '0';
				K %= curLength;
			}
			else { 
				if (K == 0 || K == curLength) {
					return "" + c;
				}
				curLength--;
			}
		}

		throw null;
	}




}
