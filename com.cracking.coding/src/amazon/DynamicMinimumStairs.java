package amazon;

public class DynamicMinimumStairs {
	  public int minCostClimbingStairs(int[] cost) {
	       
	        
	        int a =0, b =0;
	        
	        
	        for(int i =0;i< cost.length ;i++) {
	            
	            int k = cost[i] + Math.min(a, b);
	            a=b;
	            b=k;
	        }
	        
	        return Math.min(a, b);
	    }
}
