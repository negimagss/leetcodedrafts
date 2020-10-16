package com.cracking.coding.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Gel2 {


	public static void main(String[] args) {




		System.out.println(	new Gel2().solution("3x2x", "8"));
		System.out.println(	new Gel2().solution("A2Le", "2pL1"));
		System.out.println(	new Gel2().solution("a10", "10a"));
		System.out.println(	new Gel2().solution("APP", "APP"));


	}
	
	 public boolean solution(String S, String T) {
	        // write your code in Java SE 8
	        // find length of the two strings 
	        if(S.equals(T)) return true;

	        // if the length of the two is not same it will return false
	        int l1=calculateLength(S);
	        int l2 =calculateLength(T);
	        if(l1!=l2) return false;
	         
	         // check for the same sequence 


		Map<Integer, Character> mS = new HashMap<Integer, Character>();
		Map<Integer, Character> mT = new HashMap<Integer, Character>();
		position(S, mS );
		position(T, mT );
	          

		for (int i = 0; i < mS.keySet().size(); i++) { // use iterator instead

				// of for

				if (mS.containsKey(i) && mT.containsKey(i)) {

					if (!mS.get(i).equals(mT.get(i))) return false;

				}

			}

			return true;
	    }
	   // calculating length of the string 
	    int calculateLength(String S) {
	      
	        int count=0;


	       for(int i=0;i< S.length();i++) {
	           if(Character.isLetter(S.charAt(i))) {
	              count++;
	          }
	           else {
	             count  =count+Integer.parseInt(String.valueOf(S.charAt(i)));
	             }
	        }

	         return count;
	     }

	     public void position(String s,  Map<Integer, Character> m) {

			int diff = 0;
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i)))
					if (diff > 0)
						m.put(i + diff - 1, s.charAt(i));
					else
						m.put(i, s.charAt(i));
				else {
					diff += Character.getNumericValue(s.charAt(i));
					int j = i + Character.getNumericValue(s.charAt(i));
					if(i+1 < s.length())
						m.put(j, s.charAt(i + 1));
					i = i + 1;
				}
			}
		}


	
	
}
