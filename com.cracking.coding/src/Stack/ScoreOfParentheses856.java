package Stack;

public class ScoreOfParentheses856 {

	
	
	public static void main(String[] args) {
		
		ScoreOfParentheses856 ch = new ScoreOfParentheses856();
		ch.scoreOfParentheses("(()(()))");
	}
	 public int scoreOfParentheses(String S) {
	        int ans = 0, bal = 0;
	        for (int i = 0; i < S.length(); ++i) {
	            if (S.charAt(i) == '(') {
	                bal++;
	            } else {
	                bal--;
	                if (S.charAt(i-1) == '(')
	                    ans += 1 << bal;
	            }
	        }

	        return ans;
	    }
	  public int scoreOfParenthesesN(String S) {
	        return F(S, 0, S.length());
	    }

	    public int F(String S, int i, int j) {
	        //Score of balanced string S[i:j]
	        int ans = 0, bal = 0;

	        // Split string into primitives
	        for (int k = i; k < j; ++k) {
	            bal += S.charAt(k) == '(' ? 1 : -1;
	            if (bal == 0) {
	                if (k - i == 1) ans++;
	                else ans += 2 * F(S, i+1, k);
	                i = k+1;
	            }
	        }

	        return ans;
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
