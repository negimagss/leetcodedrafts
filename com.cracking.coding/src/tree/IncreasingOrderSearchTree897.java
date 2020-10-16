package tree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree897 {

	 public TreeNode increasingBST(TreeNode root) {
	       
	        // do inroder first to save the values in ascending and save in a list 
	        
	        
	        inorder(root);
	        TreeNode a= new TreeNode(0), curr;
	        curr =a;
	        
	        for(int i : arr) {
	            
	            curr.right= new TreeNode(i);
	            curr=curr.right;
	        }
	        return a.right;
	        
	        
	        
	    }
	    
	    List<Integer> arr = new ArrayList<Integer>();
	    
	    void inorder(TreeNode root) {
	        
	        if(root==null) return;
	        inorder(root.left);
	        arr.add(root.val);
	        inorder(root.right);
	        
	    }
	    
	
	
	
}
