package com.cracking.coding.Arrays;

public class GSSecondhighestNumber {

	
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
		secondHigh(arr);
	}
	static void secondHigh(int[] arr) {
		
		
		
		int first= Integer.MAX_VALUE, second= Integer.MAX_VALUE;
		
		
		for(int i : arr )
		{
			
			if(i<first) {
				second=first;
				first=i;
			}
			else if(i <second && i!=first) {
				second=i;
			}
			
			
		}
		
		
		System.out.println(second + " " + first);
		
		
		
		
	}
	
	
	
}
