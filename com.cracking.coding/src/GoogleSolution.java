
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GoogleSolution {
	
	 public static void main(String[] args){
	        int[] vals = {}; 
	        System.out.println(solution(vals));
	         String i="322";
			String j="6";
	         int str = Integer.parseInt(i, 2);
	         System.out.println(str + " : is the base value");
	       // System.out.println(Integer.toString(i, 9));
	    } 
	
	
    public static Integer solution(int[] l) {
        // Your code here
          Queue<Integer> q1 = new LinkedList<>();
	        Queue<Integer> q2 = new LinkedList<>();
	        Queue<Integer> q3 = new LinkedList<>();
	        int sum = 0;

	        Arrays.sort(l);
	        for (int d : l) {
	            sum += d;
	            if (d % 3 == 0)
	                q1.add(d);
	            else if (d % 3 == 1) {
	                q2.add(d);
	            } else {
	                q3.add(d);
	            }
	        }
	        if (sum == 0) return 0;
	        List<Integer> result = new ArrayList<>();
	        if (sum % 3 == 0) {
	            result = buildResultList(q1, q2, q3);
	        } else if (sum % 3 == 1) {
	            if (!q2.isEmpty()) {
	                q2.remove();
	            } else {
	                if (!q3.isEmpty()) {
	                    q3.remove();
	                }
	                if (!q3.isEmpty()) {
	                    q3.remove();
	                } else {
	                    return null;
	                }

	            }
	            result = buildResultList(q1, q2, q3);
	        } else if (sum % 3 == 2) {
	            if (!q3.isEmpty()) {
	                q3.remove();
	            } else {
	                if (!q2.isEmpty()) {
	                    q2.remove();
	                }
	                if (!q2.isEmpty()) {
	                    q2.remove();
	                } else {
	                    return null;
	                }
	            }
	            result = buildResultList(q1, q2, q3);
	        }

	        StringBuilder sb = new StringBuilder();
	        for (Integer i : result) {
	            sb.append((int) i);
	        }
	        if(sb.toString().contentEquals("")) return null;
	        int valueis=Integer.parseInt(sb.toString());
	        return valueis;
    }
    private static  List<Integer> buildResultList(Queue<Integer> q1, Queue<Integer> q2, Queue<Integer> q3) {
	        List<Integer> result = new ArrayList<>();
	        while (!q1.isEmpty())
	            result.add(q1.poll());
	        while (!q2.isEmpty())
	            result.add(q2.poll());

	        while (!q3.isEmpty())
	            result.add(q3.poll());

	        Collections.sort(result, Collections.reverseOrder());

	        return result;
	    }
	
}
