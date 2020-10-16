package amazon;

public class StringRepeatingString {

	//return (s + s).substring(1, 2 * s.length() - 1).contains(s);
	
	
	public boolean repeatedSubstringPattern(String str) {
		int l = str.length();
		for(int i=l/2;i>=1;i--) {
			if(l%i==0) {
				int m = l/i;
				String subS = str.substring(0,i);
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<m;j++) {
					sb.append(subS);
				}
				if(sb.toString().equals(str)) return true;
			}
		}
		return false;
	}
	
	
	//https://leetcode.com/problems/implement-strstr/
	
	public int strStr(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length()) return i;
		      if (i + j == haystack.length()) return -1;
		      if (needle.charAt(j) != haystack.charAt(i + j)) break;
		    }
		  }
		}
	
	
	
	// https://leetcode.com/problems/repeated-string-match/
	
	
	  public int repeatedStringMatch(String A, String B) {
	        int q = 1;
	        StringBuilder S = new StringBuilder(A);
	        for (; S.length() < B.length(); q++) S.append(A);
	        if (S.indexOf(B) >= 0) return q;
	        if (S.append(A).indexOf(B) >= 0) return q+1;
	        return -1;
	    }
	
	
	
}
