package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CourseSchedule1 {

	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int[] p : prerequisites) {
            if(!map.containsKey(p[0]))
                map.put(p[0], new ArrayList<>());
            map.get(p[0]).add(p[1]);
            if(!DFS(p[0], p[1], map))
                return false;
        }
        return true;
    }
    
    public boolean DFS(int val, int k, Map<Integer, List<Integer>> map) {
        if(val == k)
            return false;
        if(!map.containsKey(k))
            return true;
        for(int n : map.get(k)) {
           if(!DFS(val, n, map))
                return false;
        }
        return true;
    }
    
   //========================================= Method 2 ======================
    
    private HashMap<Integer, List<int[]>> graph = new HashMap<>();
    private HashSet<Integer> whiteSet = new HashSet<>();
    private HashSet<Integer> greySet = new HashSet<>();
    private HashSet<Integer> blackSet = new HashSet<>();
    private boolean cycleDetected = false;

    
    
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        
        for (int i = 0; i < numCourses; i++)
            whiteSet.add(i);

        for (int[] edge: prerequisites){
            addToGraph(edge[1] , new int[]{edge[0], 1});
        }
        for (int i = 0 ; i < numCourses; i++){
            if(whiteSet.contains(i)){
                dfs(i);
                if(cycleDetected)
                    break;
            }
        }

        if(cycleDetected)
            return false;
        
        if(blackSet.size() == numCourses)
            return true;
        return false; 
    }
    
    private void dfs(int vertex){

        whiteSet.remove(vertex);
        greySet.add(vertex);

        List<int[]> adjList =graph.get(vertex);
        if(adjList != null && adjList.size() > 0){
            for (int i = 0; i < adjList.size(); i++){
                int[] edge = adjList.get(i);

                int u = edge[0];
                int w = edge[1];

                if(greySet.contains(u)){
                    cycleDetected = true;
                    return;
                }

                if(whiteSet.contains(u)){
                    dfs(u);
                }
            }
        }
        greySet.remove(vertex);
        blackSet.add(vertex);
    }

    private void addToGraph(int vertex, int[] edge){
        List<int[]> list = graph.getOrDefault(vertex, new ArrayList<>());
        list.add(edge);
        graph.put(vertex, list);
    }
    
    
    
    
    
    
    
	
	
	
}
