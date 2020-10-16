package unionFind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmailNameJohn {

	 class UnionFind {
	        int[] father;
	        int size;
	        UnionFind(int n) {
	            father = new int[n];
	            for (int i = 0; i < n; i++) {
	                father[i] = i;
	            }
	            size = n;
	        }
	        
	        public void union(int x, int y) {
	            x = find(x);
	            y = find(y);
	            if (x != y) {
	                size--;
	                father[x] = y;
	            }
	        }
	        
	        public int find(int x) {
	            if (x == father[x]) {
	                return x;
	            }
	            father[x] = find(father[x]);
	            return father[x];
	        }
	    }
	    
	    public List<List<String>> accountsMerge(List<List<String>> accounts) {
	        UnionFind uf = new UnionFind(accounts.size());
	        Map<String, Integer> e2a = new HashMap<>();
	        
	        for (int i = 0; i < accounts.size(); i++) {
	            List<String> a = accounts.get(i);
	            // for each email
	            for (int j = 1; j < a.size(); j++) {
	                String e = a.get(j);
	                if (e2a.containsKey(e)) {
	                    uf.union(e2a.get(e), i);
	                    e2a.put(e, uf.find(i));
	                } else {
	                    e2a.put(e, uf.find(i));
	                }
	            }
	        }
	        
	        Map<Integer, Set<String>> newAccounts = new HashMap<>();
	        for (int i = 0; i < uf.father.length; i++) {
	            int index = uf.find(i);
	            if (!newAccounts.containsKey(index)) {
	                newAccounts.put(index, new HashSet<>());
	            }
	            
	            for (int j = 1; j < accounts.get(i).size(); j++) {
	                newAccounts.get(index).add(accounts.get(i).get(j));
	            }
	        }
	        
	        List<List<String>> res = new ArrayList<>();
	        for (int id : newAccounts.keySet()) {
	            List<String> sub = new ArrayList<>();
	            sub.add(accounts.get(id).get(0));
	            sub.addAll(newAccounts.get(id));
	            Collections.sort(sub);
	            res.add(sub);
	        }
	        
	        return res;
	    }
}
