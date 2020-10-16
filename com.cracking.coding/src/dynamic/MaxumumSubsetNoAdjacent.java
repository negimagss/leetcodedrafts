package dynamic;

import java.util.Arrays;

/**
 * Question from Algo expert 
 * @author Vikas
 *
 */
public class MaxumumSubsetNoAdjacent {

	public static void main(String[] args) {
		int arr[] = {7, 10, 12, 7, 9, 14};
		//Arrays.fill(a, val);
		maxmArray(arr);
		toys(arr);
	}
	static void maxmArray(int arr[]) {
		
		int first=arr[0];
		int second =arr[1];
		int curr=0;
		for(int i=2;i<arr.length;i++) {
			
			
			// two casea are there for this question 
			curr=Math.max(second, first+arr[i]);
			int temp=second;
			second=curr;
			first=temp;
			
			
			
			
		}

		int ans= second>first+arr[arr.length-1]?second:first+arr[arr.length-1];
		System.out.println(second);
		
		
}
	
	
	static int toys(int[] w) {

        int arr[] = new int[100];
        // find minimum 

        Arrays.sort(w);
        Arrays.fill(w,0);
        int min=5;

        for(int i=0;i<w.length;i++) {
            arr[w[i]/min]+=1;


        }
        int count=0;
     for(int i=0;i<w.length;i++) {
            //arr[arr[i]/min]++
            if(w[i]>0) count++;

        }


        System.out.println(count);
        return count;




    }
	
	
	
	
}
