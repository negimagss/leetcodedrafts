package tree;

import java.util.List;

public class MaxmDeathN559 {


	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}

		int max = 0;
		for (Node child : root.children) { //replace left&right to for loop
			int value = maxDepth(child);

			if (value > max) {
				max = value;
			}
		}
		return max +1;
	}



}
class Node {
	public int val;
	public List<Node> children;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};