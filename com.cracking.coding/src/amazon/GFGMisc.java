package amazon;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class GFGMisc {



	/**
	 * https://www.geeksforgeeks.org/build-lowest-number-by-removing-n-digits-from-a-given-number/
	 * 
	 * https://www.geeksforgeeks.org/calculate-angle-hour-hand-minute-hand/
	 * 
	 * 
	 * https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
	 * 
	 * 
	 */


	public static void main(String args[])  
	{ 
		TreeNode tree = new TreeNode(); 
		tree = new TreeNode(26); 
		tree.left = new TreeNode(10); 
		tree.right = new TreeNode(3); 
		tree.left.left = new TreeNode(4); 
//		tree.left.left.left = new TreeNode(3);
//		tree.left.left.right = new TreeNode(1);
		tree.left.right = new TreeNode(6); 
		tree.right.right = new TreeNode(3); 
		//postFix(tree, 0);

	//	System.out.println("hi");
		//Queue<TreeNode> q = new LinkedList<TreeNode>();


		System.out.println(new GFGMisc().isSumTree1(tree));





	}

	static int x=0;
	static int level=0;
	static int postFix(TreeNode root , int a) {
		if(root==null) {
			return 0;
		}
		//System.out.println("Enter:" + x++ + "  value " + root.val);
		//x
		int l= postFix(root.left,level);
		int r=postFix(root.right, level);
		level++;
		//System.out.println("Level is : "+ level);

		System.out.println("Enter:" + x++ + "  value " + root.val);
		if(l+r==root.val) {
			System.out.println(root.val);
		}

		return root.val;

	}


	int isSumTree(TreeNode node)  
	{ 
		int ls, rs; 

		/* If node is NULL or it's a leaf node then 
	           return true */
		if ((node == null) || (node.left == null && node.right == null)) 
			return 1; 

		/* Get sum of nodes in left and right subtrees */
		ls = sum(node.left); 
		rs = sum(node.right); 

		/* if the node and both of its children satisfy the 
	           property return 1 else 0*/
		if ((node.val == ls + rs) && (isSumTree(node.left) != 0) 
				&& (isSumTree(node.right)) != 0) 
			return 1; 

		return 0; 
	} 
	int sum(TreeNode node)  
	{ 
		if (node == null) 
			return 0; 
		return sum(node.left) + node.val + sum(node.right); 
	} 


	
	
	
	int isLeaf(TreeNode node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        return 0; 
    } 
   
    /* returns 1 if SumTree property holds for the given 
       tree */
    int isSumTree1(TreeNode node)  
    { 
        int ls; // for sum of nodes in left subtree 
        int rs; // for sum of nodes in right subtree 
   
        /* If node is NULL or it's a leaf node then 
         return true */
        if (node == null || isLeaf(node) == 1) 
            return 1; 
   
        if (isSumTree(node.left) != 0 && isSumTree(node.right) != 0)  
        { 
            // Get the sum of nodes in left subtree 
            if (node.left == null) 
                ls = 0; 
            else if (isLeaf(node.left) != 0) 
                ls = node.left.val; 
            else
                ls = 2 * (node.left.val); 
   
            // Get the sum of nodes in right subtree 
            if (node.right == null) 
                rs = 0; 
            else if (isLeaf(node.right) != 0) 
                rs = node.right.val; 
            else
                rs = 2 * (node.right.val); 
               
            /* If root's data is equal to sum of nodes in left 
               and right subtrees then return 1 else return 0*/
            if ((node.val == rs + ls)) 
                return 1; 
            else
                return 0; 
        } 
   
        return 0; 
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	

}
