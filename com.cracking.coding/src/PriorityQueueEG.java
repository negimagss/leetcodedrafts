import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class PriorityQueueEG {

	
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue();
		
		q.add(10);
		q.add(10);
		
		q.add(10);
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(5);
		q.add(111);
		q.add(112);
		q.add(50);
		q.add(70);
		q.add(80);q.add(90);
		q.add(30);
		q.add(-1);
		System.out.println(q);
		q.remove(0);
		System.out.println("=============================");
		//System.out.println(q);
	    q.remove();
		System.out.println("=============================");

		System.out.println(q);	q.remove();
		
		System.out.println(q);	q.remove();
		
		System.out.println(q);	q.remove();
		
		System.out.println(q);
		
		
		System.out.println();
		
		
		
		
	}
	
	 public int thirdMax(int[] nums) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        Set<Integer> set = new HashSet<>();
	        for (int i : nums) {
	            if (!set.contains(i)) {
	                pq.offer(i);
	                set.add(i);
	                if (pq.size() > 3) {
	                    set.remove(pq.poll());
	                }
	            }
	        }
	        if (pq.size() < 3) {
	            while (pq.size() > 1) {
	                pq.poll();
	            }
	        }
	        return pq.peek();
	    }
	
	
	
	
}
