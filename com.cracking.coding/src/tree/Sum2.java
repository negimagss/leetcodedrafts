package tree;

import java.util.ArrayList;
import java.util.List;

public class Sum2 {

	
	
	
	
	 List<List<Integer>> l1 =null;
	    
	    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        l1=new ArrayList<List<Integer>>();
	        
	        List<Integer> l = new ArrayList<Integer>();
	        
	        calcSum(root, sum, 0, l);
	        return l1;
	        
	    }
	    
	    
	    void calcSum(TreeNode root , int sum , int total , List<Integer> l ) {
	        if(root==null) return;
	        int sumN = total + root.val;
	        l.add(root.val);
	        
	        if(root.left == null && root.right==null) {
	            if(sum==sumN) {
	            l1.add(l);
	            l.remove(l.size()-1);
	            }
	         return;
	        }
	        calcSum(root.left , sum, sumN , l);
	        calcSum(root.right , sum, sumN , l);
	        
	    }
	    
	    
	    public static void main(String[] args) {
			Sum2 s = new Sum2();
			TreeNode root=null;
			s.pathSum(root, 10);
		}
	    
	
	
	
}
