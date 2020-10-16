package unionFind;

import java.util.Arrays;

public class _1135ConnectingCitieswithMiniumCost {

	
	
	 int parent[];
	    int n;
	    
	    public int find(int x) {
	        
	        if(parent[x]==x) {
	            return parent[x];
	        }
	        
	        parent[x]=find(parent[x]);
	        return parent[x];
	    }
	    
	    
	   public void union(int x , int y) {
	        int a =find(x);
	        int b=find(y);
	        if(a!=b) {
	            parent[a]=b;
	            n--;
	        }
	    }
	    
	    
	    
	    
	    public int minimumCost(int N, int[][] connections) {
	      parent= new int[N+1];
	      n=N;
	       
	        // initialize the value 
	      for(int i =0;i<=N;i++) {
	          parent[i]=i;
	      }  
	        
	        
	        // sort by rank 
	        
	        Arrays.sort(connections , (a,b) -> (a[2] -b[2]));
	        
	        
	        
	        // now the main login
	        int weight =0;
	        
	        
	        for(int[] conn : connections) {
	            int a= find(conn[0]);
	            int b=find(conn[1]);
	            
	            if(a!=b) {
	                weight+=conn[2];
	                
	                union(a,b);
	            }
	            
	        }
	        return n==1?weight:-1;
	    }
}
