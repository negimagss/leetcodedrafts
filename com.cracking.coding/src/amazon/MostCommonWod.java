package amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWod {

	/**
	 * Elegant solution 
	 * @param paragraph
	 * @param banned
	 * @return
	 */
	   public String mostCommonWord(String paragraph, String[] banned) {
	        
	       
	        
	        String str[]=paragraph.toLowerCase().split("[ !?',;.]");
	        
	        Map<String, Integer>  mp = new HashMap<String , Integer>();
	        
	        for(String a : str) {
	            
	            if(mp.containsKey(a)) {
	                mp.put(a, mp.get(a)+1);
	            }
	            else {
	                mp.put(a, 1);
	            }
	            
	        }
	        String val="";
	        // check maximum one but target
	        List<String> ls = Arrays.asList(banned);
	        
	        int maxValue=0;
	        for (Map.Entry<String, Integer> entry : mp.entrySet()){
	            if(entry.getKey().equals("")) continue;
	            
	              if(entry.getValue() > maxValue && !ls.contains(entry.getKey())){
	              maxValue = entry.getValue();
	              val=entry.getKey();
	          }
	        }
	        
	        
	        return val;
	    }
	
	
}
