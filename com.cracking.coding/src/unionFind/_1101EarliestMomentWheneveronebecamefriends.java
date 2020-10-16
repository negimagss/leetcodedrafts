package unionFind;

import java.util.Arrays;

public class _1101EarliestMomentWheneveronebecamefriends {

	
	
	
	 public int earliestAcq(int[][] logs, int N) {
	        // sort the array 
	        Arrays.sort(logs, (a, b) -> (a[0] - b[0]));
	        UF uf = new UF(N);
	        for(int[]log : logs){
	            uf.union(log[1], log[2]);
	            if(uf.clusters == 1)
	                return log[0];
	        }
	        return -1;
	    } 
	
	public static void main(String[] args) {
		int arr[][] = {
				{20190101,0,1},
				{20190104,3,4},
				{20190107,2,3},
				{20190211,1,5},
				{20190224,2,4}, 
				{20190301,0,3},
				{20190312,1,2},
				{20190322,4,5}
				
		};
		int N=6;
		
		System.out.println(new _1101EarliestMomentWheneveronebecamefriends().earliestAcq(arr, N));
		
		
	}



class UF  {
	int clusters=0;
	int ancestors[];
	
	
	
	
	public UF(int N) {
		ancestors = new int[N];
		this.clusters=N;
		int i=0;
		for(i=0;i<ancestors.length;i++) {
			ancestors[i]=i;
		}
	}
	
// will combine the two numbers using find 	
public void union(int a , int b ) { 
	int fA= find(a);
	int fB=find(b);
	
	
	if(fA!=fB) {
		ancestors[fB]=fA;
		clusters--;
	}
	
}

public int find(int a) {
	if(ancestors[a]!=a) {
		int p =find(ancestors[a]);
		ancestors[a]=p;
	}
	return ancestors[a];
}
	
}
}

