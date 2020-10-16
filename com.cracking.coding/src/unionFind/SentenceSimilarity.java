package unionFind;

import java.util.HashMap;
import java.util.Map;

public class SentenceSimilarity {
	   public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
	        if(words1.length!=words2.length){
	            return false;
	        }
	        
	        Map<String,String> map = new HashMap<>();
	        for(String[] ele:pairs){
	            map.put(ele[0],ele[0]);
	            map.put(ele[1],ele[1]);
	        }
	        
	        for(String[] ele:pairs){
	            String par1 = findParent(ele[0],map);
	            String par2 = findParent(ele[1],map);
	            if(!par1.equals(par2)){
	                map.put(par1,par2);
	            }
	        }
	        for(int i=0;i<words1.length;i++){
	            if(words1[i].equals(words2[i])){
	                continue;
	            }
	            if(!map.containsKey(words1[i]) || !map.containsKey(words2[i])){
	                return false;
	            }
	            String par1 = findParent(words1[i],map);
	            String par2 = findParent(words2[i],map);
	            if(!par1.equals(par2)){
	                return false;
	            }
	        }
	        
	        return true;
	        
	    }
	    
	    public String findParent(String str,Map<String,String> map){
	         while(!str.equals(map.get(str))){
	              map.put(str,map.get(str));
	              str = map.get(str);              
	         }
	        
	         return str;
	    }
}
