package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class REconstructItenary {

	
	   private List<String> res;
	    public List<String> findItinerary(List<List<String>> tickets) {
	        res = new ArrayList<>();
	        Map<String, PriorityQueue<String>> map = new HashMap<>();
	        
	        
	        // get the ticket 
	        for(List<String> list: tickets) {
	            if(!map.containsKey(list.get(0))) map.put(list.get(0), new PriorityQueue<>());
	            map.get(list.get(0)).offer(list.get(1));
	        }
	        
	        helper("JFK", map);
	        
	        return res;
	    }
	    
	    private void helper(String start, Map<String, PriorityQueue<String>> map) {
	        PriorityQueue<String> pq = map.get(start);
	        while(pq != null && pq.size() > 0) {
	            String next = pq.poll();
	            helper(next, map);
	        }
	        
	        res.add(0, start);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /**
	     * 
	     * @param tickets
	     * @return
	     */
	    
	    public List<String> findItinerary1(List<List<String>> tickets) {
	        HashMap<String,PriorityQueue<String>>mp=new HashMap<>();
	        LinkedList<String> res=new LinkedList<>();
	        Stack<String>st=new Stack<>();
	        for(List<String> t:tickets)
	        {
	            if(!mp.containsKey(t.get(0)))
	                mp.put(t.get(0),new PriorityQueue<>());
	            mp.get(t.get(0)).add(t.get(1));
	        }
	        st.push("JFK");
	        while(!st.isEmpty())
	        {
	           while(mp.containsKey(st.peek())&&!mp.get(st.peek()).isEmpty())
	               st.push(mp.get(st.peek()).poll());
	            res.addFirst(st.pop());
	            
	        }
	        return res;
	        
	    }
}
