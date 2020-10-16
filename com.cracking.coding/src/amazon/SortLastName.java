package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLastName {

	
	List<String> sort(List<String> arr) {
		
	Collections.sort(arr, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String a[]=o1.split(" ");
			String b[] = o2.split(" ");
			// now compare by last name first name  middle name and then age
			if(a[1].compareToIgnoreCase(b[1])!= 0) {
			    return 	a[1].compareToIgnoreCase(b[1]);  
			}
			if(a[0].compareToIgnoreCase(b[0])!= 0) {
			    return 	a[0].compareToIgnoreCase(b[0]);  

			}
			if(a[2].compareToIgnoreCase(b[2])!= 0) {
			    return 	a[2].compareToIgnoreCase(b[2]);  

			}
			
			return 0;
		}
		
		
	});
		
	arr.forEach( System.out::println);

		return arr;
	}
	
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("Shardul Negi 24");
		
		
		arr.add("Shardul Negi 28");
		arr.add("Shardul Negi 26");
		arr.add("Shardul Negi 27");
		new SortLastName().sort(arr);

		//arr.forEach( System.out::println);

	
}
}
