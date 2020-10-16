package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchBinaryTree {

	
	
	public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (val < root.val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
    
    
    
    public TreeNode searchBSTR(TreeNode root, int val) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.val == val) return curr;
            if (val < curr.val && curr.left != null) queue.add(curr.left);
            else if (val > curr.val && curr.right != null) queue.add(curr.right);
        }
        return null;
}
    
	
	
	
	
}
