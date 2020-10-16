package amazon;



/**
 * 
 * 
 * 
 * 
 Input : 
                 1
               /   \
              2     3
             / \     \
            4   5     6             
Output : 1 2 4

Input :
        1
      /   \
    2       3
      \   
        4  
          \
            5
             \
               6
Output :1 2 4 5 6
 * 
 *
 */
public class GFGPRintLeftView {
	 Node1 root; 
	    static int max_level = 0; 
	  
	    // recursive function to print left view 
	    void leftViewUtil(Node1 node, int level) 
	    { 
	        // Base Case 
	        if (node == null) 
	            return; 
	  
	        // If this is the first Node1 of its level 
	        if (max_level < level) { 
	            System.out.print(" " + node.data); 
	            max_level = level; 
	        } 
	  
	        // Recur for left and right subtrees 
	        leftViewUtil(node.left, level + 1); 
	        leftViewUtil(node.right, level + 1); 
	    } 
	  
	    // A wrapper over leftViewUtil() 
	    void leftView() 
	    { 
	        leftViewUtil(root, 1); 
	    } 
	  
	    /* testing for example Node1s */
	    public static void main(String args[]) 
	    { 
	        /* creating a binary tree and entering the Node1s */
	    	GFGPRintLeftView tree = new GFGPRintLeftView(); 
	        tree.root = new Node1(12); 
	        tree.root.left = new Node1(10); 
	        tree.root.right = new Node1(30); 
	        tree.root.right.left = new Node1(25); 
	        tree.root.right.right = new Node1(40); 
	  
	      //  tree.leftView(); 
	        
	        
	        int sum = 21; 

	        GFGPRintLeftView tree1 = new GFGPRintLeftView(); 
	        tree1.root2 = new Node1(10); 
	        tree1.root2.left = new Node1(8); 
	        tree1.root2.right = new Node1(2); 
	        tree1.root2.left.left = new Node1(3); 
	        tree1.root2.left.right = new Node1(5); 
	        tree1.root2.right.left = new Node1(2); 
	   
	        if (tree1.hasPathSum(tree1.root, sum)) 
	            System.out.println("There is a root to leaf path with sum " + sum); 
	        else
	            System.out.println("There is no root to leaf path with sum " + sum);
	        
	        
	       
	        
	        Node1 r= tree1.root3;
	        tree1.createBTS(r, 10);
	        tree1.createBTS(r, 9);
	        tree1.createBTS(r, 11);
	        tree1.createBTS(r, 8);
	        tree1.createBTS(r, 6);
	        tree1.createBTS(r, 15);
	        tree1.createBTS(r, 14);
	        tree1.createBTS(r, 4);
	        
	        
	        //searlize
	        tree1.printBTS(tree1.root3);
	        
	        
	        
	        
	    } 
	    
	    
	    
	    void printBTS(Node1 root3 ) {
	    	this.root3=root3;
	    	if(root==null) return;
	    	System.out.println(root.data);
	    	printBTS(root.left);
	    	printBTS(root.right);
	    	
	    }
	    
	    
	    Node1 root3;
	    
	    void createBTS( Node1 root3 ,int val) {
	    	if(root3==null) {
	    		root3 = new Node1(val);
	    		return;
	    	}
	    	if(root3.data > val) {
	    		createBTS( root3.left , val);
	    	}
	    	else {
	    		createBTS(root3.right , val);
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    Node1 root2; 
	       
	    /* 
	     Given a tree and a sum, return true if there is a path from the root 
	     down to a leaf, such that adding up all the values along the path 
	     equals the given sum. 
	    
	     Strategy: subtract the node value from the sum when recurring down, 
	     and check to see if the sum is 0 when you run out of tree. 
	     */
	   
	    boolean hasPathSum(Node1 node, int sum)  
	    { 
	        if (node == null) 
	            return sum == 0; 
	        return hasPathSum(node.left, sum - node.data) ||  
	               hasPathSum(node.right, sum - node.data); 
	    } 
	      
	    
	    
	    
	    
	    
	    
}

class Node1 { 
    int data; 
    Node1 left, right; 
  
    public Node1(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 


