package amazon;

public class EZYBinarySearchAPICall {

	
	//mock API
	boolean isBadVersion(int i) {
		return true;
	}
	
	public int firstBadVersion(int n) {
		
		int l=1;
		int f=n;
		
		while(f<n) {
			int mid=f+(l-f)/2;
			if(isBadVersion(n)) {
				n=mid;
			}
			else {
				f=mid+1;
			}
		}
		
		return f;
	}
	
	
	
	
	
	
	
	
	
	
	 public int firstBadVersionK(int n) {
	        
	        
	        int f=1; int l=n; 
	        while(f<=l) {
	            int mid= f +(l-f)/2;
	            if(isBadVersion(mid)) {
	                l=mid-1;
	            }
	        else {
	            f=mid+1;
	        }
	        }
	        
	        return f;
	        
	    }
	
	
}
