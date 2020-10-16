package amazon;

public class DFSSErverProblem {

	
	public int countServers(int[][] grid) {
	     int count=0;
	    
	    for(int i=0;i<grid.length;i++)
	        for(int j=0;j<grid[0].length;j++)
	        {
	            if(grid[i][j]==1)
	            {
	                if(dfs(i,j,grid))
	                {
	                    count++;
	                }
	            }
	        }
	    
	    
	    return count;
	}

	public boolean dfs(int row, int col, int grid[][])
	{
	    if(row<0 && row>=grid.length && col<0 && col>= grid[0].length && grid[row][col]!=1)
	        return false;
	    
	    for(int i=0;i<grid.length;i++)
	    {
	        if(i!=row && grid[i][col]==1)
	            return true;
	    }
	    
	    for(int i=0;i<grid[0].length;i++)
	    {
	        if(i!=col && grid[row][i]==1)
	            return true;
	    }
	    
	    
	    return false;
	}
	
}
