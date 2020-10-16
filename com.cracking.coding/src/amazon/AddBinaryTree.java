package amazon;

import tree.TreeNode;

public class AddBinaryTree {
	 TreeNode root;
	int sum=0;
	
	
	// this is actually easy 
	/**
	 * Now
	 * 1: check for root
	 * 2: first check right ones which are greater 
	 * 3: move to the ones which are less such as left and then change values like wise 
	 * @param root1
	 */
	void help(TreeNode root1) {
		
		if(root1==null) return;
		
		help(root1.right);
		sum+=root1.val;
		root1.val=sum;
		help(root1.left);
	}
	
	
	
	 public static void main(String[] args) 
	    {
		 
		 AddBinaryTree tree = new AddBinaryTree(); 
	  
	        /* Let us create following BST 
	              50 
	           /     \ 
	          30      70 
	         /  \    /  \ 
	       20   40  60   80 */
	  
	        tree.insert( 50); 
	        tree.insert(30); 
	        tree.insert( 20); 
	        tree.insert( 40); 
	        tree.insert( 70); 
	        tree.insert( 60); 
	        tree.insert( 80); 
	  
	        System.out.println();
	        
	        
	      //  tree.modifyBST(tree.root); 
	  
	        // print inoder tarversal of the modified BST 
	        tree.inorder(); 
	        tree.help1();
	        System.out.println();
	        tree.inorder(); 

	    } 
	 
	 
	 void help1() {
		 
		 help(root);
	 }
	 
	 
	  void inorder() 
	    { 
	        inorderUtil(this.root); 
	    } 
	 
	  public void insert(int data) 
	    { 
	        this.root = this.insertRec(this.root, data); 
	    } 
	  
	  
	   void inorderUtil(TreeNode node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        inorderUtil(node.left); 
	        System.out.print(node.val + " "); 
	        inorderUtil(node.right); 
	    } 
	 
	 
	 
	 TreeNode insertRec(TreeNode node, int data) 
	    { 
	        /* If the tree is empty, return a new node */
	        if (node == null) { 
	            root = new TreeNode(data); 
	            return root; 
	        } 
	  
	        /* Otherwise, recur down the tree */
	        if (data <= node.val) { 
	            node.left = this.insertRec(node.left, data); 
	        } 
	        else { 
	            node.right = this.insertRec(node.right, data); 
	        } 
	        return node; 
	    } 
	 
	} 
	
	

