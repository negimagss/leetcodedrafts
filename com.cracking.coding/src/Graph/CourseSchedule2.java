package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule2 {

	
	/**
	 * Using queue for the same BFS solution for the same 
	 */
	
	
	public static void main(String[] args) {
		
		int prerequisites[][] = {
				{1,0},
				{2,0},
				{3,1},
				{3,2}
		};
		int numCourses=4;
		
		
		int order[] = new CourseSchedule2().findOrder(numCourses, prerequisites);
		System.out.println(Arrays.toString(order));
	}
	
	
	
	public int[] findOrder(int numCourses, int[][] prerequisites) { 
	    if (numCourses == 0) return null;
	    // Convert graph presentation from edges to indegree of adjacent list.
	    int indegree[] = new int[numCourses], order[] = new int[numCourses], index = 0;
	    for (int i = 0; i < prerequisites.length; i++) // Indegree - how many prerequisites are needed.
	        indegree[prerequisites[i][0]]++;    

	       
	    System.out.println(Arrays.toString(indegree) + "is the indegree arary after first change" );
	   
	    Queue<Integer> queue = new LinkedList<Integer>();
	    for (int i = 0; i < numCourses; i++) 
	        if (indegree[i] == 0) {
	            // Add the course to the order because it has no prerequisites.
	            order[index++] = i;
	            queue.offer(i);
	        }
	    System.out.println(Arrays.toString(order) + "is the Order arary after first change" );
	       System.out.println(Arrays.toString(indegree) + "is the indegree arary after first change" );
	       System.out.println(queue + "is the queue after first change" );
	       
	    // How many courses don't need prerequisites. 
	    while (!queue.isEmpty()) {
	        int prerequisite = queue.poll(); // Already finished this prerequisite course.
	        for (int i = 0; i < prerequisites.length; i++)  {
	            if (prerequisites[i][1] == prerequisite) {
	            	
	            	System.out.println();
	                indegree[prerequisites[i][0]]--; 
	                if (indegree[prerequisites[i][0]] == 0) {
	                    // If indegree is zero, then add the course to the order.
	                    order[index++] = prerequisites[i][0];
	                    queue.offer(prerequisites[i][0]);
	                }
	            }
	            System.out.println("for the array of prerequisite the value of I will be : " + i);
	            System.out.println(Arrays.toString(order) + "is the Order arary after first change" );
	       System.out.println(Arrays.toString(indegree) + "is the indegree arary after first change" );
	       System.out.println(queue + "is the queue after first change" );
	            
	            
	        }
	    }
	System.out.println(Arrays.toString(order) + "is the Order arary after first change" );
	       System.out.println(Arrays.toString(indegree) + "is the indegree arary after first change" );
	       System.out.println(queue + "is the queue after first change" );
	    return (index == numCourses) ? order : new int[0];
	}
	
	
	
}
