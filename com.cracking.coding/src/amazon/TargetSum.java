package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetSum {

	public static void main(String[] args) {

		TargetSum a = new TargetSum();
		Integer arr[] = {9 , 3, 2, 1, 6};
		System.out.println(a.target(arr));

	}
	public boolean  target(Integer a[]) {


		// 9 3 2 1 6     answer 3 2 1 6   and 1 2 6 9 
		List<Integer> k = new ArrayList<>();
		k =Arrays.asList(a);
		//		System.out.println(k.forEach(null););

		System.out.println(k);

		for(int i=0;i<a.length-1;i++) {

			// 9 -3-2-1 * 
			// 9 -3 -2 list 6 

			int f=a[i];
			for(int j =i+1;j< a.length ;j++) {

				int m=a.length-1;;
				while(m>j) {
					int  b= f-a[j]- a[m];
					m--;
					if(k.contains(b));
					{
						return   true;
					}
					//m--;

				}

			}
		}

		return false;

	}








}
