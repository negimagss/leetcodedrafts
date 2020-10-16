package amazon;

import java.util.HashMap;
import java.util.Map;




/**
 * 
 * 
 * 
 * 399. Evaluate Division

https://leetcode.com/problems/evaluate-division/
 * You are given equations in the format A / B = k, where A and B are variables represented as strings, and k is a real number (floating-point number). Given some queries, return the answers. If the answer does not exist, return -1.0.

The input is always valid. You may assume that evaluating the queries will result in no division by zero and there is no contradiction.

 

Example 1:

Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
Explanation: 
Given: a / b = 2.0, b / c = 3.0
queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
Example 2:

Input: equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
Output: [3.75000,0.40000,5.00000,0.20000]
Example 3:

Input: equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
Output: [0.50000,2.00000,-1.00000,-1.00000]
 
 * @author Vikas
 *
 */
public class GraphUFEvaluateEquation {

	
	
	  public double[] calcEquation(String[][] e, double[] values, String[][] q) {
	        double[] res = new double[q.length];
	        Map<String, String> root = new HashMap<>();
	        Map<String, Double> dist = new HashMap<>();
	        for (int i = 0; i < e.length; i++) {
	            String r1 = find(root, dist, e[i][0]);
	            String r2 = find(root, dist, e[i][1]);
	            root.put(r1, r2);
	            dist.put(r1, dist.get(e[i][1]) * values[i] / dist.get(e[i][0]));
	        }
	        for (int i = 0; i < q.length; i++) {
	            if (!root.containsKey(q[i][0]) || !root.containsKey(q[i][1])) {
	                res[i] = -1.0;
	                continue;
	            }
	            String r1 = find(root, dist, q[i][0]);
	            String r2 = find(root, dist, q[i][1]);
	            if (!r1.equals(r2)) {
	                res[i] = -1.0;
	                continue;
	            }
	            res[i] = (double) dist.get(q[i][0]) / dist.get(q[i][1]);
	        }
	        return res;
	    }
	    
	    private String find(Map<String, String> root, Map<String, Double> dist, String s) {
	        if (!root.containsKey(s)) {
	            root.put(s, s);
	            dist.put(s, 1.0);
	            return s;
	        }
	        if (root.get(s).equals(s)) return s;
	        String lastP = root.get(s);
	        String p = find(root, dist, lastP);
	        root.put(s, p);
	        dist.put(s, dist.get(s) * dist.get(lastP));
	        return p;
	    }
	
}
