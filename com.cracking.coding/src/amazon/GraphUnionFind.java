package amazon;

import java.util.Arrays;
import java.util.Stack;




/**
 * 
 * 
 * 
 * 1135. Connecting Cities With Minimum Cost

 * There are N cities numbered from 1 to N.

You are given connections, where each connections[i] = [city1, city2, cost] represents the cost to connect city1 and city2 together.  (A connection is bidirectional: connecting city1 and city2 is the same as connecting city2 and city1.)

Return the minimum cost so that for every pair of cities, there exists a path of connections (possibly of length 1) that connects those two cities together.  The cost is the sum of the connection costs used. If the task is impossible, return -1.
 * 
 * 
 * @author Vikas
 *
 */
public class GraphUnionFind {


	public static void main(String[] args) {
		int N=3;
		int connections[][]= {
				{1,2,5},{1,3,6},{2,3,1}
		};

		String str ="what";
		char ch[] = str.toCharArray();
		Stack<Character > ch = new Stack<>();
Arrays.sort(conections)l;
		System.out.println(new GraphUnionFind().minimumCost(N, connections));
	}



	int[] parent;
	int n;

	private void union(int x, int y) {
		System.out.println("Union Start: " +parent);printArray();

		int px = find(x);
		int py = find(y);

		if (px != py) {
			parent[px] = py;
			n--;
			System.out.println(parent);printArray();

		}
		System.out.println(parent);printArray();

	}

	private int find(int x) {
		System.out.println("Find start : "+parent);printArray();
		while(parent[x]!=x) {
			x=parent[x];
		}
		System.out.println("Find end : "+parent);printArray();

		return parent[x];
	}

	public int minimumCost(int N, int[][] connections) {
		parent = new int[N + 1];
		n = N;
		for (int i = 0; i <= N; i++) {
			parent[i] = i;
		}

		Arrays.sort(connections, (a, b) -> (a[2] - b[2]));
		System.out.println(parent);printArray();
		int res = 0;

		for (int[] c : connections) {
			int x = c[0], y = c[1];
			if (find(x) != find(y)) {
				res += c[2];
				union(x, y);
				System.out.println("Main loop every time : "+parent);
				printArray();
			}
		}

		return n == 1 ? res : -1;
	}
	
	
	void printArray() {
		for(int i : parent) {
			System.out.print(i);
		}
		System.out.println();
	}
}
