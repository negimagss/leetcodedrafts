package com.cracking.coding.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Gel {



	public static void main(String[] args) {

		// author arasumran
		int return_counter =Integer.MAX_VALUE;
		int B[] = {1, 1, 6};
		int A[] = {1, 2, 3};
		int C[] = {1, 6, 2, 3};

		System.out.println(new Gel().solution(A));

	}




	int solution(int A[]) {
		int a =Integer.MAX_VALUE;

		for( int i=1;i<7;i++)
		{
			int t=0;
			for(int j =0;j< A.length;j++)
			{
				if(A[j]!=i)
				{
					if((A[j]+i)==7)
					{
						t +=2;
					}else
					{
						t +=1;
					}
				}
			}
			if(t<a)
			{
				a=t;
			}
		}
		return a;
	}





	public boolean isSameText(String s, String t) {

		// count length by adding the sum of digits and the sum of letters

		if(s.contentEquals(t)) return true;

		int LS = calculateLength(s);

		int LT = calculateLength(t);

		// check if the two strings have not the same length

		if (LT != LS)

			return false;

		// determine each identified letter position in String s

		Map<Integer, Character> mS = new HashMap<Integer, Character>();
		Map<Integer, Character> mT = new HashMap<Integer, Character>();
		position(s, mS );
		position(s, mT );
		//	if (!checkSamePos(mS, mT)) return false;
		//return false;

		for (int i = 0; i < mS.keySet().size(); i++) { // use iterator instead

			// of for

			if (mS.containsKey(i) && mT.containsKey(i)) {

				if (!mS.get(i).equals(mT.get(i))) return false;

			}

		}

		return true;


		/*
		 * result = checkSamePos(mS, mT); return result;
		 */

	}

	int calculateLength(String S) {

		int count=0;


		for(int i=0;i< S.length();i++) {
			if(Character.isLetter(S.charAt(i))) {
				count++;
			}
			else {
				count =count + Integer.parseInt(String.valueOf(S.charAt(i)));
			}
		}

		return count;
	}



	public Map<Integer, Character> position1(String s) {

		Map<Integer, Character> m = new HashMap<Integer, Character>();
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

		return m;

	}





	public void position(String s,  Map<Integer, Character> m) {

		//Map<Integer, Character> m = new HashMap<Integer, Character>();
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



	/*
	 * public boolean checkSamePos(Map<Integer, Character> map1, Map<Integer,
	 * Character> map2) {
	 * 
	 * for (int i = 0; i < map1.keySet().size(); i++) { // use iterator instead
	 * 
	 * // of for
	 * 
	 * if (map1.containsKey(i) && map2.containsKey(i)) {
	 * 
	 * if (map1.get(i).equals(map2.get(i)))
	 * 
	 * continue;
	 * 
	 * return false;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * return true;
	 * 
	 * }
	 */

















}

