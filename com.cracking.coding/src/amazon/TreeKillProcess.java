package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeKillProcess {

	
	
	  enum Level {
		    LOW,
		    MEDIUM,
		    HIGH
		  }

		  public static void main(String[] args) {
		    Level myVar = Level.MEDIUM; 
		    System.out.println(myVar);
		  }
	
	
	
	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < ppid.size(); i++) {
            int parent = ppid.get(i);
            map.putIfAbsent(parent, new ArrayList<>());
            map.get(parent).add(pid.get(i));
        }
        List<Integer> result = new ArrayList<>();
        helper(result, kill, map);
        return result;
    }
    public void helper(List<Integer> result, int id, Map<Integer, List<Integer>> map) {
        result.add(id);
        if (!map.containsKey(id)) return;
        for (int child : map.get(id)) {
            helper(result, child, map);
        }
        return;
    }
}
