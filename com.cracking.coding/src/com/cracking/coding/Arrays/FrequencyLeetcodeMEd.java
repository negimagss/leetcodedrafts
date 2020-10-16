package com.cracking.coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FrequencyLeetcodeMEd {



	public static void main(String[] args) {
		String s ="tree";
		char ch[] = new char[s.length()];
		ch=s.toCharArray();
		Arrays.parallelSort(ch);

		/*
		 * //get all the map now Map<Character, Integer> m = new HashMap<Character,
		 * Integer>(); for(char c :ch) { m.put(c, m.getOrDefault(c, 0)+1); }
		 * 
		 * List<Character> l = new ArrayList<Character>(); Collections.sort(l, (a,b)->
		 * m.get(b)-m.get(a));
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(char c : l) { int copies = m.get(c); for (int i = 0; i < copies; i++) {
		 * sb.append(c); } }
		 * 
		 * 
		 * 
		 * System.out.println(sb);
		 */

		//int nums[] = new int[4];
		int nums[]= {1,4,3,4};
		FrequencyLeetcodeMEd f = new FrequencyLeetcodeMEd();
		System.out.println(f.strcut123(nums));
		System.out.println("Output is : \"");
		if("star".contains("fsafsa")) {

		}

	}

	public boolean strcut123(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int max = Integer.MIN_VALUE;
		for (int i = nums.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() < nums[i]) {
				max = stack.pop();
			}
			if (nums[i] > max) stack.push(nums[i]);
			if (nums[i] < max) return true;
		}


		System.out.println();
		return false;
	}





	public int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> st = new Stack<>();
		for(int i : asteroids) {

			
			// will enter the first one from the stack 
			if(st.isEmpty() || i>0) {
				st.push(i);
			}
			
			
			
			else {
				while(true) {
					int p =st.peek();
					// if last element is greater then 0 then push to the stack 
					if(p<0) {
						st.push(i);
						break;
					}
					// if the element is equal to the negetive value of then we kill both 
					else if(p==-i) {
						st.pop();
						break;
					}
					// if peek is greater then we break and omit the other 
					else if(p>-i) {
						break;
					}
					else {
						st.pop();
						if(st.isEmpty()) {
							st.push(i);
							break;
						}
					}
				}
			}
		}
		int arr[] = new int[st.size()];
		for(int i =arr.length-1;i>=0;i--) {
			arr[i]=st.pop();
		}




		return arr;







	}









}
