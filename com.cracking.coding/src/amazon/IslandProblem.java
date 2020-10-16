package amazon;



/**
 * Island prpblem I learned that one should be brave 
 * I never allowed myself to solve a single of these questions which is bad 
 * @author Vikas
 *
 */
public class IslandProblem {

	// traversal 
	
	
	public static void main(String[] args) {
		
	}
	int numisland(int[][] grid) {
		int numIs=0;
	
		
		for(int i=0;i< grid.length ;i++) {
			for(int j=0;j< grid[i].length;j++) {
				
				if(grid[i][j]=='1') {
					numIs++;
					help(grid, i, j);
				}
			}
			
		}
		
		
		
		return numIs;
	}
	
	
	
	void help(int[][] grid, int i, int j) {
		
		// check if the case is for the extremes or 0
		
		if(i< 0 || i> grid.length || j< 0 || j > grid[i].length || grid[i][j]==0) {
			return;
		}
		
		help(grid , i+1 , j);
		help(grid , i-1 , j);
		help(grid , i , j+1);
		help(grid , i , j-1);

		
		
		
	}
}
