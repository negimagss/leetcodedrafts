package amazon;

import java.util.ArrayList;
import java.util.List;

public class DFSAsFarLandAsPossible {
	public int maxDistance(int[][] grid) {
        List<Point> lands = new ArrayList<Point>();
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[0].length; ++j) {
                if(grid[i][j] != 0) {
                    lands.add(new Point(i, j));
                } 
            }
        }
        
        if(lands.size() == 0 || lands.size() == grid.length * grid[0].length) {
            return -1;
        }

        int maxMinDist = Integer.MIN_VALUE;
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[0].length; ++j) {
                if(grid[i][j] == 0) {
                    maxMinDist = Math.max(maxMinDist, checkMinDist(lands, i, j));
                } 
            }
        }
        
        return maxMinDist;
    }
    
    
    private int checkMinDist(List<Point> lands, int x, int y) {
        int dist = Integer.MAX_VALUE;
        for(Point land : lands) {
            dist = Math.min(dist, Math.abs(land.x - x) + Math.abs(land.y - y));
        }
        
        return dist;
    }
    
    
    public class Point {
        public int x;
        public int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
