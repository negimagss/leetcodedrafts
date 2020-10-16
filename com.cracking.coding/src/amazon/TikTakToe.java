package amazon;

public class TikTakToe {

	private int rows[], cols[], diagonal, antiDiagonal, n;

	public TikTakToe(int n) {
		rows = new int[n];
		cols = new int[n];
		this.n = n;
	}

	public int move(int row, int col, int player) {
		int toAdd = player == 1 ? 1 : -1;           // use 1 for player 1 and -1 for player 2

		rows[row] += toAdd;
		cols[col] += toAdd;

		if(row == col) diagonal += toAdd;
		if(col == cols.length-row-1) antiDiagonal += toAdd;

		if(rows[row] == n || cols[col] == n || diagonal == n || antiDiagonal == n)
			return 1;
		if(rows[row] == -n || cols[col] == -n || diagonal == -n || antiDiagonal == -n)
			return 2;
		return 0;
	}
	
	
}
