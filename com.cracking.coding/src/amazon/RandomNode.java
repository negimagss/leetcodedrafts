package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
public class RandomNode {

	public Node cpy(Node node) {
		
		
		Node arr = node;
		//Queue<Node> st = new DeQueu<Node>();
		List<Node> st = new ArrayList<Node>();
		
		while(node!=null) {
			st.add(node.next);
			st.add(node.random);
			node=node.next;
		}
		Node k= new Node(-1, null , null);
		Node m=k;
		for(int i=st.size()-1 ;i>=0;i--) {
			k=st.get(i);
		}
		
		return k;
	}
	
	  HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

	  public Node copyRandomList(Node head) {

	    if (head == null) {
	      return null;
	    }

	    // If we have already processed the current node, then we simply return the cloned version of
	    // it.
	    if (this.visitedHash.containsKey(head)) {
	      return this.visitedHash.get(head);
	    }

	    // Create a new node with the value same as old node. (i.e. copy the node)
	    Node node = new Node(head.val, null, null);

	    // Save this value in the hash map. This is needed since there might be
	    // loops during traversal due to randomness of random pointers and this would help us avoid
	    // them.
	    this.visitedHash.put(head, node);

	    // Recursively copy the remaining linked list starting once from the next pointer and then from
	    // the random pointer.
	    // Thus we have two independent recursive calls.
	    // Finally we update the next and random pointers for the new node created.
	    node.next = this.copyRandomList(head.next);
	    node.random = this.copyRandomList(head.random);

	    return node;
	  }
	
}
