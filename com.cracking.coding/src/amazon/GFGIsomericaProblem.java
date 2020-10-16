package amazon;

import tree.TreeNode;

public class GFGIsomericaProblem {


	/**
	 * Three Possibilitties 
	 * 1: first it has nnot been shifted 
	 * then we just test if the trees are same 
	 * 2: If the isomets then we wil test if the the same will be the same 
	 * 
	 */
	
	boolean checkIsomoer(TreeNode t1, TreeNode t2) {
		if(t1==null && t2== null ) {
			return true;
		}
			
		
		if(t1==null || t2==null) return false;
		
		if(t1.val!=t2.val) return false;
		
		return false;
		
		
	}
	
	
	
	
	
	
	//https://www.geeksforgeeks.org/tree-isomorphism-problem/
}
