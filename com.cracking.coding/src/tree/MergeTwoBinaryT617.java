package tree;

public class MergeTwoBinaryT617 {



	/*
	 * will take the base tree as 1 t1 
	 * 1: Will check if either of tree is null and return the other
	 * 2: add the two numbers at the 
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		if(t1==null)  return t2;
		if(t2==null) return t1;

		t1.val+= t2.val;
		t1.left =mergeTrees(t1.left , t2.left);
		t1.right =mergeTrees(t1.right , t2.right);
		return t1;
	}
}
