package tree;

import java.util.ArrayList;
import java.util.List;





/**
 * A nide question 
 * @author Vikas
 *
 */
public class LoneNode1469 {
	 List<Integer> arr = new ArrayList<Integer>();
	    
	    public List<Integer> getLonelyNodes(TreeNode root) {
	     // only child and also no child 
	        
	        dfs(root);
	        
	        return arr;
	        
	    }
	    
	    public void dfs(TreeNode root) {
	        
	        if(root== null) {return;}
	        
	        if(root.left==null && root.right!=null) {
	            arr.add(root.right.val);
	            
	        }
	        else if(root.left!=null && root.right==null) {
	            arr.add(root.left.val);
	        }
	        
	        dfs(root.left);
	        dfs(root.right);
	        
	    }
	    
}
