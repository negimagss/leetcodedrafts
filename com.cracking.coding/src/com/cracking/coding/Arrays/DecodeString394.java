package com.cracking.coding.Arrays;

public class DecodeString394 {



	/**
	 * Important i dont understand this one 
	 * Given an encoded string, return its decoded string.

		The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

		You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

		Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

		Examples:

		s = "3[a]2[bc]", return "aaabcbc".
		s = "3[a2[c]]", return "accaccacc".
		s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

	 * 
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */
	public String decodeString(String s) {

		Stack1 st = new Stack1();
		StringBuilder decoded, evaluateBracket , evaluateK;
		int k;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==']')
			{
				k=0;
				evaluateBracket = new StringBuilder();
				while(st.peek()!='[')
				{
					evaluateBracket.append(st.pop());
				}
				st.pop();
				evaluateK=new StringBuilder();
				while(!st.isEmpty() && Character.isDigit(st.peek()))
				{
					evaluateK.append(st.pop()); 
				}
				if(evaluateK.length()!=0)
				{
					k=Integer.parseInt(evaluateK.reverse().toString());
				}
				decoded = new StringBuilder();
				String tmp=evaluateBracket.reverse().toString();
				for(int j=0;j<k;j++)
				{
					decoded.append(tmp); 
				}
				for(int j=0; j<decoded.length();j++)
					st.push(decoded.charAt(j));
			}
			else
				st.push(s.charAt(i));
		}
		decoded = new StringBuilder();
		while(!st.isEmpty())
		{
			if(st.peek()!='[')
				decoded.append(st.peek());
			st.pop();
		}
		return decoded.reverse().toString(); 
	}








	public static void main(String[] args) {
		String str ="3[a]2[bc]";
		System.out.println("Hey");
		String a[]=str.split("/[");
		System.out.println(a);
		Stack1 ch = new Stack1();
		// enter into the stack

		//	String a="";
		/*
		 * while(ch.isEmpty()) {
		 * 
		 * if(ch.peek()==']') { while(ch.isEmpty()) { if(ch.peek()==']') {// break if
		 * another bracket is encountered break; }
		 * 
		 * 
		 * 
		 * 
		 * } }
		 * 
		 * 
		 * }
		 */




	}
}
