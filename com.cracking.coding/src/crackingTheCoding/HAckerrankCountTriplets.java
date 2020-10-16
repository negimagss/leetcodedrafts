package crackingTheCoding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HAckerrankCountTriplets {

/**
 * You are given an array and you need to find number of tripets of indices  such that the elements at those indices are in geometric progression for a given common ratio  and .

For example, . If , we have  and  at indices  and .

Function Description

Complete the countTriplets function in the editor below. It should return the number of triplets forming a geometric progression for a given  as an integer.

countTriplets has the following parameter(s):

arr: an array of integers
r: an integer, the common ratio
Input Format

The first line contains two space-separated integers  and , the size of  and the common ratio.
The next line contains  space-seperated integers .

Constraints

Output Format

Return the count of triplets that form a geometric progression.

Sample Input 0

4 2
1 2 2 4
Sample Output 0

2
Explanation 0

There are  triplets in satisfying our criteria, whose indices are  and 

Sample Input 1

6 3
1 3 9 9 27 81
Sample Output 1

6
Explanation 1

The triplets satisfying are index , , , ,  and .

Sample Input 2

5 5
1 5 5 25 125
 */
	
	 static long countTriplets(List<Long> arr, long r) {
	        long total = 0;
	        Map<Long, Long> count = new HashMap<>(); // count of ints
	        Map<Long, Long> tuplets = new HashMap<>(); // map 2nd -> count of links
	        
	        for (int i = 0; i < arr.size(); ++i) {
	            //System.out.printf("i=%d\n", i);
	            long val = arr.get(i);
	            // inc total
	            if (val % r == 0 && tuplets.containsKey(val / r)) {
	                total += tuplets.get(val / r);
	                //System.out.printf("%dx %d -> %d -> %d\n", t.count, t.first, val / r, val);
	            }
	            // create links/tuplets
	            if (tuplets.containsKey(val)) {
	                tuplets.put(val, tuplets.get(val) + count.get(val/r));
	                //System.out.printf("%dx %d -> %d\n", tuplets.get(val).count, tuplets.get(val).first, val);
	            } else if (val % r == 0 && count.containsKey(val / r)) {
	                //System.out.printf("%dx %d -> %d\n", count.get(val/r), val/r, val);
	                tuplets.put(val, count.get(val / r));
	            }

	            // inc count
	            if (count.containsKey(val))
	                count.put(val, count.get(val)+1);
	            else
	                count.put(val, 1L);
	        }

	        return total;
	    }


	
	
}
