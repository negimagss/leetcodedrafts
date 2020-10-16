package amazon;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;





/**
 * 
 * 
 * 
 * 
  /* Constructed binary tree is 
            10 
          /   \ 
        8      2 
      /  \    / 
    3     5  2 
 *
 * 
 * 
 * Given a binary tree, print all root-to-leaf paths
Last Updated: 18-03-2019
For the below example tree, all root-to-leaf paths are:
10 –> 8 –> 3
10 –> 8 –> 5
10 –> 2 –> 2
 * @author Vikas
 *
 */
public class GFGPrintRoottoLead {




	static void printSingles(TreeNode node) 
	{ 
		// Base case 
		if (node == null) 
			return; 

		// If this is an internal node, recur for left 
		// and right subtrees 
		if (node.left != null && node.right != null) 
		{ 
			printSingles(node.left); 
			printSingles(node.right); 
		} 

		// If left child is NULL and right is not, print right child 
		// and recur for right child 
		else if (node.right != null) 
		{ 
			System.out.print(node.right.val + " "); 
			printSingles(node.right); 
		} 

		// If right child is NULL and left is not, print left child 
		// and recur for left child 
		else if (node.left != null) 
		{ 
			System.out.print( node.left.val + " "); 
			printSingles(node.left); 
		} 
	}


	TreeNode root; 

	/*Given a binary tree, print out all of its root-to-leaf 
      paths, one per line. Uses a recursive helper to do  
      the work.*/
	void printPaths(TreeNode node)  
	{ 
		int path[] = new int[1000]; 
		printPathsRecur(node, path, 0); 
	} 

	/* Recursive helper function -- given a node, and an array 
       containing the path from the root node up to but not  
       including this node, print out all the root-leaf paths.*/
	void printPathsRecur(TreeNode node, int path[], int pathLen)  
	{ 
		if (node == null) 
			return; 

		path[pathLen] = node.val; 
		pathLen++; 

		/* it's a leaf, so print the path that led to here  */
		if (node.left == null && node.right == null) 
		{ printArray(path, pathLen); 
		}
		printPathsRecur(node.left, path, pathLen); 
		printPathsRecur(node.right, path, pathLen); 

	} 

	/* Utility function that prints out an array on a line. */
	void printArray(int ints[], int len)  
	{ 
		int i; 
		for (i = 0; i < len; i++)  
		{ 
			System.out.print(ints[i] + " "); 
		} 
		System.out.println(""); 
	} 

	// driver program to test above functions 
	public static void main(String args[])  
	{ 
		GFGPrintRoottoLead tree = new GFGPrintRoottoLead(); 
		tree.root = new TreeNode(10); 
		tree.root.left = new TreeNode(8); 
		tree.root.right = new TreeNode(2); 
		tree.root.left.left = new TreeNode(3); 
		tree.root.left.right = new TreeNode(5); 
		tree.root.right.left = new TreeNode(2); 

		/* Let us test the built tree by printing Insorder traversal */
		//printbyLevel(tree.root);
		//tree.printPaths(tree.root);

		TreeNode root;
		root = new TreeNode(1); 
		root.left = new TreeNode(2); 
		root.right = new TreeNode(3); 
		root.left.right = new TreeNode(4); 
		root.right.left = new TreeNode(5); 
		root.right.left.right = new TreeNode(6); 



		findIFnotcousing(root);
	} 

	static void printbyLevel(TreeNode tree) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(tree);
		//int level=1;
		while(!q.isEmpty()) {
			int l =q.size();
			for(int i =0;i<l;i++) {

				TreeNode a= q.poll();
				System.out.print(a.val +" ");
				if(a.left!=null) {
					q.add(a.left);
				}

				if(a.right!=null) {
					q.add(a.right);
				}

			}
			System.out.println();
		}

	}



	/**
	 * 
	 * 
	 * https://www.geeksforgeeks.org/print-nodes-dont-sibling-binary-tree/
	 * @param tree
	 */
	static void findIFnotcousing(TreeNode tree) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(tree);
		int level=0;
		while(!q.isEmpty()) {
			int l =q.size();

			for(int i =0;i<l;i++) {

				TreeNode t= q.poll();

				if(t.left!=null && t.right!=null) {
					System.out.println("Have sibling");
				}
				else if(t.left!=null || t.right!=null){
					if(t.left==null) {
						System.out.print(t.right.val + " ");
					}
					else if(t.right==null) {
						System.out.print(t.left.val + " ");
					}
				}
				if(t.left!=null) {
					q.add(t.left);
				}

				if(t.right!=null) {
					q.add(t.right);
				}
			}
			System.out.println();
			System.out.println("The level is : " + level++);
			l=l+1;

		}

	}

	
	
	int depth(TreeNode tree) {
		if(tree==null) return 0;

		int l = depth(tree.left);
		int r= depth(tree.right);

		if(l>r) {
			return l+1;
		}
		return r+1;
	}
}
