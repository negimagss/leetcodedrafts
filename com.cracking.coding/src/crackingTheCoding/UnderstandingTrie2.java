package crackingTheCoding;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingTrie2 {

	 public int[][] indexPairs(String text, String[] words) {
	        //build the trie
	        List < int[] > res = new ArrayList < int[] > ();
	        Trie root = new Trie();
	        for (String w: words) {
	            Trie curr = root;
	            for (char c: w.toCharArray()) {
	                if (curr.children[c - 'a'] == null) {
	                    curr.children[c - 'a'] = new Trie();
	                }
	                curr = curr.children[c - 'a'];
	            }
	            curr.end = true;
	        }
	        StringBuilder path = new StringBuilder();
	        //traverseTrie(root, path);

	        int len = text.length();
	        for (int i = 0; i < len; i++) {
	            Trie curr = root;
	            for (int j = i; j < len; j++) {
	                curr = curr.children[text.charAt(j) - 'a'];
	                if (curr == null) break;
	                if (curr.end) res.add(new int[] {
	                    i,
	                    j
	                });
	            }
	        }

	        // convert output from list to array
	        int[][] f = new int[res.size()][2];
	        int i = 0;
	        for (int[] p: res) {
	            f[i] = p;
	            ++i;
	        }
	        return f;
	    }

	    private void traverseTrie(Trie node, StringBuilder path) { //this method is for debugging your trie by printing it.
	        for (char i = 0; i < 26; i++) {
	            Trie c = node.children[i];
	            if (c != null) {
	                path.append(Character.toString((char)((char) i + 'a')));
	                if (c.end) System.out.println(path);
	                traverseTrie(c, path);
	                path.setLength(path.length() - 1);
	            }
	        }
	    }

	    public class Trie {
	        Trie[] children;
	        boolean end;

	        public Trie() {
	            end = false;
	            children = new Trie[26];
	        }
	    }
	}