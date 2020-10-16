package unionFind;

import org.junit.Test;

public class FriendCircle {

	
	
	
	@Test
	public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] == 1) {
                    uf.union(i, j);
                } 
            }
        }
        return uf.count();
    }
	
	
	
	
    class UnionFind {
        int[] path; 
        int count;
        public UnionFind(int n) {
            path = new int[n];
            count = n;
            for (int i = 0; i < n; i++) {
                path[i] = i;
            }
        }
        public int find(int i) {
            while (i != path[i]) i = path[i];
            return i;
        }
        public void union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI == rootJ) return;
            path[rootI] = rootJ; 
            count--;
        }
        public int count() {
            return count;
        }
    }
	
	
}
