package amazon;

import java.util.Arrays;

public class GreedyGasStation {


	public static void main(String[] args) {


		int[] arr = {3, 3, 4};
		int brr[] = {3,4,4};
		System.out.println(canCompleteCircuit(arr, brr));
		int crr[][] = {{2,1,5} , {3,3,7} };

		//Arrays.sort(crr , (a,b)->a[1]-b[1]);

		System.out.println(carPooling(crr, 4));       



	}
	
	
	/**
	 * You are driving a vehicle that has capacity empty seats initially available for passengers.  The vehicle only drives east (ie. it cannot turn around and drive west.)

Given a list of trips, trip[i] = [num_passengers, start_location, end_location] contains information about the i-th trip: the number of passengers that must be picked up, and the locations to pick them up and drop them off.  The locations are given as the number of kilometers due east from your vehicle's initial location.

Return true if and only if it is possible to pick up and drop off all passengers for all the given trips. 

 

Example 1:

Input: trips = [[2,1,5],[3,3,7]], capacity = 4
Output: false
Example 2:

Input: trips = [[2,1,5],[3,3,7]], capacity = 5
Output: true
Example 3:

Input: trips = [[2,1,5],[3,5,7]], capacity = 3
Output: true
Example 4:

Input: trips = [[3,2,7],[3,7,9],[8,3,9]], capacity = 11
Output: true
	 * @param trips
	 * @param capacity
	 * @return
	 */
	 public static boolean carPooling(int[][] trips, int capacity) {
	        int[] timestamp = new int[1001];
	        for (int[] trip : trips) {
	            timestamp[trip[1]] += trip[0];
	            timestamp[trip[2]] -= trip[0];
	        }
	        int ued_capacity = 0;
	        for (int number : timestamp) {
	            ued_capacity += number;
	            if (ued_capacity > capacity) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static  int canCompleteCircuit(int[] gas, int[] cost) {

		//int totalT= 0;
		// int gas =0;


		for(int i =0;i< gas.length;i++) { // run it five times 


			int sum =0;

			for(int j =i+1;true;j++) {





				sum+=gas[j]-cost[j];
				if(j==i) {
					return i;
				}
				if(sum<0) {
					break;
				}

				if(j==cost.length-1) {
					j=0;
				}

			}



		}



		return -1;



	}
}
