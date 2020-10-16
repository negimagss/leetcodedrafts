package goldmanSachs;

public class ProductofArray {

	public static void main(String[] args) {
		int nums[] = new int[] {1, 2, 3, 4, 5};
		new ProductofArray().productExceptSelf(nums);
	}
	
	
	public int[] productExceptSelf(int[] nums) {
	    int[] result = new int[nums.length];
	    for (int i = 0, tmp = 1; i < nums.length; i++) {
	        result[i] = tmp;
	        tmp *= nums[i];
	    }
	    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
	        result[i] *= tmp;
	        tmp *= nums[i];
	    }
	    
	    System.out.println(result);
	    return result;
	}
	
	
	
	
}
