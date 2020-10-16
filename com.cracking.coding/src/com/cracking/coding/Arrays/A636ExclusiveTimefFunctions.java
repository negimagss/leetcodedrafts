package com.cracking.coding.Arrays;
import java.util.*;
public class A636ExclusiveTimefFunctions {
	//636. Exclusive Time of Functions
	/**
	 * logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
	n=2;
	 * @param args
	 */

	public static void main(String[] args) {
		///List<String> logs = new 
		//logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]





	}

	public int[] exclusiveTime(int n, List < String > logs) {


		// take a stack
		Stack<Integer> stack = new Stack < > ();

		int[] res = new int[n];


		// save the first one here 
		String[] s = logs.get(0).split(":");
		stack.push(Integer.parseInt(s[0]));// saving the value here for 0
		int i = 1, prev = Integer.parseInt(s[2]); //parse the value 
		while (i < logs.size()) {
			s = logs.get(i).split(":");
			if (s[1].equals("start")) {
				if (!stack.isEmpty())
					res[stack.peek()] += Integer.parseInt(s[2]) - prev;
				stack.push(Integer.parseInt(s[0]));
				prev = Integer.parseInt(s[2]);
			} else {
				res[stack.peek()] += Integer.parseInt(s[2]) - prev + 1;
				stack.pop();
				prev = Integer.parseInt(s[2]) + 1;
			}
			i++;
		}
		return res;
	}



	public int[] exclusiveTime1(int n, List < String > logs) {
		
		
		Stack < Integer > stack = new Stack < > ();
		
		int[] res = new int[n];
		// save the first one
		String[] s = logs.get(0).split(":");
		stack.push(Integer.parseInt(s[0]));
		int i = 1, time = Integer.parseInt(s[2]);
		while (i < logs.size()) {
			s = logs.get(i).split(":");
			while (time < Integer.parseInt(s[2])) {
				res[stack.peek()]++;
				time++;
			}
			if (s[1].equals("start"))
				stack.push(Integer.parseInt(s[0]));
			else {
				res[stack.peek()]++;
				time++;
				stack.pop();
			}
			i++;
		}
		return res;
	}


//	71. Simplify Path




}
