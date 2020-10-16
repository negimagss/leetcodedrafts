package amazon;

import java.util.ArrayList;
import java.util.List;

public class GFGBacktrackingPermutationofString {

	
	
	
	public static void main(String[] args) 
    { 
        String str1 = "ABC"; 
        int n = str1.length(); 
        GFGBacktrackingPermutationofString permutation = new GFGBacktrackingPermutationofString(); 
     //   permutation.permute(str1, 0, n-1); 
        
        
        
        List<String> results = new ArrayList<String>();
        String test_str = "abcd";
        char[] chars = test_str.toCharArray();
        results.add(new String("" + chars[0]));
        for(int j=1; j<chars.length; j++) {
            char c = chars[j];
            int cur_size = results.size();
            //create new permutations combing char 'c' with each of the existing permutations
            for(int i=cur_size-1; i>=0; i--) {
                String str = results.remove(i);
                for(int l=0; l<=str.length(); l++) {
                    results.add(str.substring(0,l) + c + str.substring(l));
                }
            }
        }
        System.out.println("Number of Permutations: " + results.size());
        System.out.println(results);
        
        
        
    } 
  
    /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
	
	
}
