package goldmanSachs;

public class ReachingPoints {

	
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        return helper(sx, sy, tx, ty);
    }
    
    public boolean helper(int x, int y, int tx, int ty){
        while(tx >= x && ty >= y){
            if(tx > ty) {
                if(y == ty) return (tx - x) % ty == 0;
                tx %= ty;
            }
            else {
                if(x == tx) return (ty - y) % tx == 0;
                ty %= tx;
            }
        }
        return false;
    }
}
	
	
	
