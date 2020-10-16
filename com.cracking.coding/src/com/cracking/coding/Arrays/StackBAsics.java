package com.cracking.coding.Arrays;

import java.util.Arrays;

public class StackBAsics {

	int arr[];
	int min;;
	int max;

	
	StackBAsics(){
		arr = new int[3];
		
		min=3;
		max=-1;
	}
	
	
	void pop() {
		if(max==0) {
			System.out.println("Empty!!");
		}
		else {
			arr[max]=0;
			max--;
		System.out.println(arr[max]);
			//max--;
		}
	}
	
	void peek() {
		System.out.println(arr[max]);
	}
	
	
	void push(int i) {
		
		if(max> min) {
			System.out.println("Overflow");
			return;
		}
		
		max++;
		arr[max]=i;
		System.out.println(arr[max]);

		//max++;
	}
	
	public static void main(String[] args) {
		StackBAsics s = new StackBAsics();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.pop();

		
		Arrays.asList(s.arr);

		// sort stack using two or more stacks
		
		
		
		
		
		
		
		
		
		
	
	}
	
	// stack as linkedlist 
	//parentheses 
	/**
	 * 1: using parentheses for calculating the stack
	 */
	
}
