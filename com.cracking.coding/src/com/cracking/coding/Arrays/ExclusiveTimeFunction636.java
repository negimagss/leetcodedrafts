package com.cracking.coding.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExclusiveTimeFunction636 {

	
	 public int[] exclusiveTime(int n, List<String> logs) {
		    int[] res = new int[n];
		    Stack<Integer> stack = new Stack<>();
		    int prevTime = 0;
		    for (String log : logs) {
		        String[] parts = log.split(":");
		        if (!stack.isEmpty()) res[stack.peek()] +=  Integer.parseInt(parts[2]) - prevTime; 
		        prevTime = Integer.parseInt(parts[2]);
		        if (parts[1].equals("start")) stack.push(Integer.parseInt(parts[0]));
		        else {
		            res[stack.pop()]++;
		            prevTime++;
		        }
		    }
		    return res;
		}
	 
	 public static void main(String[] args) {
		ExclusiveTimeFunction636 ex =new ExclusiveTimeFunction636();
		List<String> logs = new ArrayList<String>();
		logs.add("0:start:0");
		logs.add("1:start:2");
		logs.add("1:end:5");
		logs.add("0:end:6");
		
		int[] arr = new int[4];
		arr=ex.exclusiveTime(2, logs);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	 
	 
	
	
}
