package crackingTheCoding;

public class QueueToDoGoogle {
public static void main(String[] args) {
	         System.out.println(solution(17, 4));
	         
	         
	         char[] ch = new char[5];
	         for(char c : ch) {
	        	 System.out.println(c);
	         }
	         
	         
	         System.out.println("Final + " + ch);
	         
	         
	         
}
	
	public static int solution(int start, int length) { 
		   //Declaration of necessary variables
		    int i,j;
	    	int c = length;
	    	int sol = 0;
	    	i=start;
	        while(c>0)
	    	{   j=i+length-(length-c)-1;
	    		if(i!=j)
	    			sol = sol ^ CalculateXOR(i,j);
	            else
	            	sol = sol ^ i;
	            i=i+(length);
	            c--;
	        }
		return sol;  //Required Checksum
	    } 

	    public static int CalculateXOR(int m, int n) {
	        int[] arr;
	        if(m % 2 == 0)
	        	arr = new int[] {n, 1, n^1, 0};
	        else
	        	arr = new int[] {m, m^n, m-1, (m-1)^n};
	        return arr[(n-m) % 4];
	        
	        
	        
	        
	}
	
	
	
}
