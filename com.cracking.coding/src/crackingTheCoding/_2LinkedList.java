package crackingTheCoding;

import amazon.ListNode;

public class _2LinkedList {

	int printinkedList(ListNode list , int i) {
		
		if(list==null) return 0;
		
		int index = printinkedList(list.next , i) +1;
		if(index==i) {
			System.out.println(list.val);
		}
		return index;
	}
	
	
	
	
	
	
	
}
