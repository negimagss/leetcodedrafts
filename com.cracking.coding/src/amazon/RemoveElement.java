package amazon;

public class RemoveElement {
	 public int removeElement(int[] nums, int val) {
	        
	        int tot=0;
	        for(int i=0;i<nums.length ;i++) {
	            if(nums[i]!=val) {nums[tot]=nums[i]; tot++;}
	            
	        }
	        
	        
	        return tot;
	        
	        
	        
	    }
}
