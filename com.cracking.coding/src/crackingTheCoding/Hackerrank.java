package crackingTheCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hackerrank {


	public static void main(String[] args) {
		//System.out.println(countStrings("accbb"));
		//System.out.println(gameWinner("wwwbb"));
		List<Integer> a = new ArrayList<>();
		a.add(9);
		a.add(5);
		a.add(8);
		System.out.println(sortedSum(a));



	}


	
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
	 * @param arr
	 * @param r
	 * @return
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


	public static int sortedSum(List<Integer> a) {
		// Write your code here
		
		
		int sumT=0;
		
		int inc=1;
		for( int i=0;i< a.size();i++) {
			
			
			// now take the array which needs consideration 
			
			int arr[] = new int[inc];
			
			// fill that array
			for(int j =0;j< inc;j++) {
				arr[j]=a.get(j);
			}
			
			// now sort this new array 
			
			Arrays.sort(arr);
			// this is the array we have to consider 
			
			
			
			int sum=0;
			int val=1;
			for(int k =0;k<arr.length;k++) {
				sum+=arr[k]*val;
				val++;
			}
			
			
			
			
			sumT+=sum;
			inc++;
			
		}
		String str1="what";
		char[] ch = str1.toCharArray();
		List<Character> ls = new ArrayList<Character>();
		Set<Character> st = new HashSet<>(ls);
		return sumT%(10000007);
		
		
		
		
	}





	public static String gameWinner(String colors) {
		// Write your code here

		char ch[] = colors.toCharArray();
		boolean black=false;
		while(true) {
			// assume odd is webdy and even is bob
			boolean change1=false;
			boolean change2=false;

			if(!black){
				for(int i=1;i<ch.length-1;i++) {
					if(ch[i]=='w' && ch[i+1]=='w' && ch[i-1]=='w') {
						ch[i]='#';
						change1=true;
					}   
				}
				black=true;
			}
			else {
				for(int i=1;i<ch.length-1;i++) {
					if(ch[i]=='b' && ch[i+1]=='b' && ch[i-1]=='b') {
						ch[i]='#';
						change2=true;
					}   
				}
				black=false;  
			}


			if(!change1  || !change2) {
				if(change1) {
					return "wendy";
				}
				break;
			}


		}

		return "bob";

	}



	public static int countStrings(String s) {
		// Write your code here

		//char ch[] =s.toCharArray();
		//Arrays.sort();
		//creating new strings from the given text
		int count=0;

		String str =s;
		System.out.println(str);
		for(int j=0;j<s.length() ;j++) {

			String a= str.substring(str.length()-1, str.length());
			String b= str.substring(0 , str.length()-1);
			str =a+b;
			System.out.println(str);
			//		            str= str.substring(str.length()-2, str.length()-1)+str.substring(0,str.length()-1);
			//		           System.out.println(str);

			if(str.charAt(0)== str.charAt(s.length()-1)) {
				count++;
			}
			// s=str;

		}


		return count;
	}

}
