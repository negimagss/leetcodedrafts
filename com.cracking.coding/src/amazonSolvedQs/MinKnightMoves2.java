package amazonSolvedQs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinKnightMoves2 {

	
	
	 public static void main(String[] args) {
	        MinKnightMoves2 obj = new MinKnightMoves2();
	        int soln = obj.minMoves(9, 4,4, 4,8);
	        System.out.println(soln);
	    }

	    int minMoves(int n, int startRow, int startCol, int endRow, int endCol)   {
	        if(startRow == endRow && startCol == endCol)
	            return 0;

	        Queue<int[]> q = new LinkedList<>();
	        q.add(new int[]{startRow, startCol});
	        boolean visited[][] = new boolean[n][n];
	        visited[startRow][startCol] = true;
	        int steps = 0;
	        boolean found = false;
	        while(!q.isEmpty() && !found) {
	            int size = q.size();
	            for(int i = 0; i< size; i++)    {
	                int [] curr = q.poll();
	                if(curr[0] == endRow && curr[1] == endCol)  {
	                    return steps;
	                }

	                for(int [] neighbor: getNeighbors(curr[0], curr[1], n, visited))    {
	                    q.add(neighbor);
	                }
	            }
	            steps ++;
	        }

	        return -1;
	    }

	    List<int[]> getNeighbors(int r1, int c1, int n, boolean[][] visited)  {
	        List<int[]> neighbors = new ArrayList<>();

	        int rC [] = {-2,-2,-1,-1,1,1,2,2};
	        int cC [] = {-1,1,-2,2,-2,2,-1,1};

	        for(int i = 0; i< rC.length; i++)   {
	            int newR = r1 + rC[i];
	            int newC = c1 + cC[i];

	            if(newR >= 0 && newC >=0 && newR <n && newC < n && !visited[newR][newC])    {
	                visited[newR][newC] = true;
	                neighbors.add(new int[]{newR, newC});
	            }
	        }
	        return  neighbors;
	    }
	
	
}
