package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import tree.TreeNode;

public class GFGMirrorBinaryTree {

	static List<Integer> arr1 = new ArrayList<Integer>();
	static void print(TreeNode tree) {
		if(tree==null) 
			{
			System.out.println(arr1);
			
			//arr1.remove(arr1.size()-1);
			return; }
		arr1.add(tree.val);
		System.out.print(tree.val+"  ");
		print(tree.left);
		print(tree.right);
		
		
		
	}
	
	
	public static void main(String[] args)  
	{ 
		GFGMirrorBinaryTree tree = new GFGMirrorBinaryTree(); 
		TreeNode a = new TreeNode(1); 
		TreeNode b = new TreeNode(1); 
		a.left = new TreeNode(2); 
		a.right = new TreeNode(3); 
		a.left.left = new TreeNode(4); 
		a.left.right = new TreeNode(5); 

		b.left = new TreeNode(3); 
		b.right = new TreeNode(2); 
		b.right.left = new TreeNode(5); 
		b.right.right = new TreeNode(4); 

		
		print(a);
		
		
	/**	
		
		if (tree.areMirror(a, b) == true) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 


		System.out.println(rtoi("xciv"));


		
		*/
		System.out.println();
		System.out.println(findCount(10)); 




	}
	boolean areMirror(TreeNode a, TreeNode b)  
	{ 
		/* Base case : Both empty */
		if (a == null && b == null) 
			return true; 

		// If only one is empty 
		if (a == null || b == null)  
			return false; 

		/* Both non-empty, compare them recursively 
	           Note that in recursive calls, we pass left 
	           of one tree and right of other tree */
		return a.val == b.val 
				&& areMirror(a.left, b.right) 
				&& areMirror(a.right, b.left); 
	}




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

	static int findCount(int d) 
	{ 
		return 9 * ((int)(Math.pow(10, d - 1))  
				- (int)(Math.pow(9, d - 1))); 
	} 


	
	
	
	/**
	 * Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value. Expected Time Complexity is O(n2).

Examples:

Input : arr[] = {-2, 0, 1, 3}
        sum = 2.
Output : 2
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3) 

Input : arr[] = {5, 1, 3, 4, 7}
        sum = 12.
Output : 4
Explanation :  Below are triplets with sum less than 12
               (1, 3, 4), (1, 3, 5), (1, 3, 7) and 
               (1, 4, 5)
	 */
	static int arr[] = new int[]{5, 1, 3, 4, 7}; 


	static int countTriplets(int n, int sum) 
	{ 
		// Sort input array 
		Arrays.sort(arr); 

		// Initialize result 
		int ans = 0; 

		// Every iteration of loop counts triplet with 
		// first element as arr[i]. 
		for (int i = 0; i < n - 2; i++) 
		{ 
			// Initialize other two elements as corner elements 
			// of subarray arr[j+1..k] 
			int j = i + 1, k = n - 1; 

			// Use Meet in the Middle concept 
			while (j < k) 
			{ 
				// If sum of current triplet is more or equal, 
				// move right corner to look for smaller values 
				if (arr[i] + arr[j] + arr[k] >= sum) 
					k--; 

				// Else move left corner 
				else
				{ 
					// This is important. For current i and j, there 
					// can be total k-j third elements. 
					ans += (k - j); 
					j++; 
				} 
			} 
		} 
		return ans; 
	} 

	
	
	/**
	 * Euilibrium 
	 * can be solved by just sum and negate to find the pivot 
	 */



}
