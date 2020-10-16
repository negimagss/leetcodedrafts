package goldmanSachs;

import java.util.ArrayDeque;

public class ShortestSubarraywithSumAtleastK {

	
	public int shortestSubarray(int[] A, int K) {
        int n = A.length;
        int[] prefixSum = new int[n];
        
        prefixSum[0] = A[0];
        for(int i=1;i<n;i++) {
            prefixSum[i] = prefixSum[i-1]+A[i];
        }

        ArrayDeque<Integer> q = new ArrayDeque<>(); //Doubly ended queue in Java.
        
        int ans = -1;
        
        for(int i=0;i<n;i++) {
            if(prefixSum[i]>=K) {
                if(ans==-1) {
                    ans = i+1;
                }
                else {
                    ans = Math.min(ans, i+1);
                }
            }
            
            int ysum = prefixSum[i];
            int xsum = ysum-K;
            
            while(!q.isEmpty() && prefixSum[q.getFirst()]<=xsum) {
                if(ans==-1) {
                    ans = i-q.pollFirst();
                }
                else {
                    ans  = Math.min(ans, i-q.pollFirst());
                }
            }
            
            while(!q.isEmpty() && prefixSum[q.getLast()]>=prefixSum[i]) {
                q.pollLast();
            }
            q.addLast(i);
        }
        
        return ans;
    }
	
	
}
