package crackingTheCoding;

public class MergeSortedList {




	int[] sort(int[] arr , int[] brr) {

		
		
		int[] crr = new int[arr.length + brr.length];
		int i=0;
		int j=0;
		//Arrays.sort
		//int k=0;
		for(int k=0;k<crr.length;k++) {

			if(arr[i] > brr[j] ) {
				crr[k]=brr[j++];
			}
			else  if(arr[i] < brr[j]) {
				crr[k]=arr[i++];
			}
			else if(arr[i]==brr[j]) {
				crr[k]=arr[i++];
				crr[k+1]=brr[j++];
				k=k+1;
			}

		}

		return crr;
	}

	public static void main(String[] args) {
		MergeSortedList m = new MergeSortedList();
		int[] arr = {1, 3, 5, 6, 7, 10};
		int[] brr = {1, 2, 9, 12, 16};
	}	

}
