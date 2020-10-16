package tree;

import java.util.LinkedList;
import java.util.Stack;

public class RangeSumofBST938 {

	
	/**
	 * uses queues 
	 * 
	 * A B C D E F 
	 * @param root
	 * @param L
	 * @param R
	 * @return
	 */
	 public int rangeSumBSTbfs(TreeNode root, int L, int R) {
	     // check if the root is null   
		 if(root==null)
	            return 0;
	        int sum = 0;
	        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
	        list.add(root);
	        while(!list.isEmpty()){
	            TreeNode current = list.poll();
	            if(current.val >= L && current.val <= R)
	                sum += current.val;
	            if(current.left!=null)
	                list.add(current.left);
	            if(current.right!=null)
	                list.add(current.right);
	        }
	        return sum;
	    }
	
	
	
	
	int ans=0;
	public int rangeSumBSTdfs(TreeNode root, int L, int R) {

		if(root==null) return 0;
		if(root.val>=L && root.val <=R) {
			ans+=root.val;
		}
		if(L<root.val) {
			rangeSumBST(root.left, L , R);  
		}
		if(R>root.val) {
			rangeSumBST(root.right, L, R);
		}
		return ans;
	}



	public int rangeSumBST(TreeNode root, int L, int R) {
		// if the root is 0   
		if(root == null) return 0;

		// check the right one 
		if(root.val > R) return rangeSumBST(root.left, L, R);
		// check the left one
		if(root.val < L) return rangeSumBST(root.right, L, R);
		// return the same
		return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);      
	}



	public int rangeSumBST_1(TreeNode root, int L, int R) {
		int ans = 0;
		Stack<TreeNode> stack = new Stack();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node != null) {
				if (L <= node.val && node.val <= R)
					ans += node.val;
				if (L < node.val)
					stack.push(node.left);
				if (node.val < R)
					stack.push(node.right);
			}
		}
		return ans;
	}





}
