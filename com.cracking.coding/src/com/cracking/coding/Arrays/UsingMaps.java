package com.cracking.coding.Arrays;

import java.util.HashMap;
import java.util.Map;

public class UsingMaps {
	public static void main(String[] args) {
		Map<Integer,Integer>  m = new HashMap<Integer, Integer>();


		/*
		 * m.put(1, "Shardul"); m.put(1, "Kas"); m.put(1, "Pas"); m.put(1, "Das");
		 * m.put(2, "Shardul"); m.put(1, "Shardul+shardul"); System.out.println(m);
		 * 
		 * Map<Integer , Integer> m = new HashMap<Integer , Integer>();
		 */

		int nums[] = {3,2,3};
		int maxm=0, val=0;
		for(int i=0 ;i < nums.length ;i++)  {


			if( m.get(nums[i])!=null) {
				m.put(nums[i] ,m.get(nums[i])+1);
			}
			else {
			m.put(nums[i] ,1);
			}



			if(maxm < m.get(nums[i])) {
				maxm=m.get(nums[i]);
				val=nums[i];
			}


		}
		
		// Boyer-Moore Voting Algorithm   very imp
		
		/*
		 * public int majorityElement(int[] nums) { int count = 0; Integer candidate =
		 * null;
		 * 
		 * for (int num : nums) { if (count == 0) { candidate = num; } count += (num ==
		 * candidate) ? 1 : -1; }
		 * 
		 * return candidate; }
		 */
		
		
		System.out.println(val);



	}
}
