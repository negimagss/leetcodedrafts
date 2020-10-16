package amazon;

import java.util.Hashtable;

public class GFGEasy {



	/**
	 * Roman Numerals
	 * @param num
	 * @return
	 */
	public static int rtoi(String num)
	{      

		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		ht.put('i',1);
		ht.put('x',10);
		ht.put('c',100);
		ht.put('m',1000);
		ht.put('v',5);
		ht.put('l',50);
		ht.put('d',500);


		int intNum=0;
		int prev = 0;
		for(int i = num.length()-1; i>=0 ; i--)
		{
			int temp = ht.get(num.charAt(i));
			if(temp < prev)
				intNum-=temp;
			else
				intNum+=temp;
			prev = temp;
		}
		return intNum;
	}



	/**
	 * https://www.geeksforgeeks.org/count-d-digit-positive-integers-with-0-as-a-digit/
	 * 
Now the count of numbers having at least one zero 
can be obtained by subtracting Non_Zero from Total.
Hence Answer would be given by:
9*(10d-1 - 9d-1 ) 
	 * @param d
	 * @return
	 */

	static int findCount(int d) 
	{ 
		return 9 * ((int)(Math.pow(10, d - 1))  
				- (int)(Math.pow(9, d - 1))); 
	} 




	/**
	 * Count number of occurrences (or frequency) in a sorted array
Last Updated: 10-09-2018
Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)
Examples:

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
	 */

	static int binarySearch(int arr[], int l, 
			int r, int x) 
	{ 
		if (r < l) 
			return -1; 

		int mid = l + (r - l) / 2; 

		// If the element is present  
		// at the middle itself 
		if (arr[mid] == x) 
			return mid; 

		// If element is smaller than  
		// mid, then it can only be  
		// present in left subarray 
		if (arr[mid] > x) 
			return binarySearch(arr, l,  
					mid - 1, x); 

		// Else the element can 
		// only be present in 
		// right subarray 
		return binarySearch(arr, mid + 1, r, x); 
	} 

	// Returns number of times x 
	// occurs in arr[0..n-1] 
	static int countOccurrences(int arr[],  
			int n, int x) 
	{ 
		int ind = binarySearch(arr, 0,  
				n - 1, x); 

		// If element is not present 
		if (ind == -1) 
			return 0; 

		// Count elements on left side. 
		int count = 1; 
		int left = ind - 1; 
		while (left >= 0 &&  
				arr[left] == x) 
		{ 
			count++; 
			left--; 
		} 

		// Count elements  
		// on right side. 
		int right = ind + 1; 
		while (right < n &&  
				arr[right] == x) 
		{ 
			count++; 
			right++; 
		} 

		return count; 
	} 


	// Driver code 
	public static void main(String[] args)  
	{ 
		int arr[] = {1, 2, 2, 2, 2,  
				3, 4, 7, 8, 8}; 
		int n = arr.length; 
		int x = 2; 
		System.out.print(countOccurrences(arr, n, x)); 
	} 

}
