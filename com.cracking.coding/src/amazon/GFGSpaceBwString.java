package amazon;

public class GFGSpaceBwString {

	
	/**
	 * https://www.geeksforgeeks.org/print-possible-strings-can-made-placing-spaces/
	 * Input:  str[] = "ABC"
Output: ABC
        AB C
        A BC
        A B C
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		printPattern("ABC");
	}
	 static void printPatternUtil(String str, char buf[], int i, int j, int n) 
	    { 
	        if (i == n) { 
	            buf[j] = '\0'; 
	            System.out.println(buf); 
	            return; 
	        } 
	  
	        // Either put the character 
	        buf[j] = str.charAt(i); 
	        printPatternUtil(str, buf, i + 1, j + 1, n); 
	  
	        // Or put a space followed by next character 
	        buf[j] = ' '; 
	        buf[j + 1] = str.charAt(i); 
	  
	        printPatternUtil(str, buf, i + 1, j + 2, n); 
	    } 
	 
	 
	 static void printPattern(String str) 
	    { 
	        int len = str.length(); 
	  
	        // Buffer to hold the string containing spaces 
	        // 2n-1 characters and 1 string terminator 
	        char[] buf = new char[2 * len]; 
	  
	        // Copy the first character as it is, since it will be always 
	        // at first position 
	        buf[0] = str.charAt(0); 
	        printPatternUtil(str, buf, 1, 1, len); 
	    } 
	
	
}
