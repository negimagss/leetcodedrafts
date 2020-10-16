package goldmanSachs;

public class KingsProbabilityinChessBoard {

	
	  private int[][]dir = new int[][]{{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}};
	    public double knightProbability(int N, int K, int r, int c) {
	        return find(N,K,r,c);
	    }
	    public double find1(int N,int K,int r,int c){
	        if(r < 0 || r > N - 1 || c < 0 || c > N - 1) return 0;
	        if(K == 0)  return 1;
	        double rate = 0;
	        for(int i = 0;i < dir.length;i++){
	            rate += 0.125 * find(N,K - 1,r + dir[i][0],c + dir[i][1]);
	        }
	        return rate;
	    }
	
	
	    
	     // DP solution for this quqetsion 
	    
	    private int[][]dir1 = new int[][]{{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}};
	    private double[][][] dp;
	    public double knightProbability1(int N, int K, int r, int c) {
	        dp = new double[N][N][K + 1];
	        return find1(N,K,r,c);
	    }
	    public double find(int N,int K,int r,int c){
	        if(r < 0 || r > N - 1 || c < 0 || c > N - 1) return 0;
	        if(K == 0)  return 1;
	        if(dp[r][c][K] != 0) return dp[r][c][K];
	        double rate = 0;
	        for(int i = 0;i < dir1.length;i++)   rate += 0.125 * find(N,K - 1,r + dir1[i][0],c + dir1[i][1]);
	        dp[r][c][K] = rate;
	        return rate;
	    }
	    
	    
	    
	
}
