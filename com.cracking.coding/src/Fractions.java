import java.util.PriorityQueue;

public class Fractions {

	
	
	
	void fractions() {
		int[] arr= {1, 2};
		int brr[] = {3, 4};
		
		// take the common for the seconds 
		int a= arr[1];
		int b=brr[1];
		int c=b*a;
		
		
		int d= c/arr[0];
		int e=c/brr[0];
		int sum=d+e;
		
		// simplify
		
		for(int i =2;i<=sum;i++) {
			
			if(sum%i==0 && c%i==0) {
				sum=sum/i;
				c=c/i;
			}
			
		}
		
		
		
		
			System.out.println(sum+"/" + c);
		
		
		
		
		
	}
	
	
	void mergeArray(int[] arr, int[] brr) {
		arr= new int[]{1,3};
		arr= new int[]{1};
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>((a,b)->b-a);
		int n=arr.length+brr.length;
		boolean flag=true;
		int count=0;
		if(n%2==0) {
			flag=true;
		}
		for(int i : arr) {
			pr.add(i);
			
			if(flag && count==n/2) {
					System.out.println(pr.poll());
			}
			count++;
		}
		
		for(int i : brr) {
			pr.add(i);
			if(flag && count==n/2) {
					System.out.println(pr.poll());
			}
			
			count++;
		}
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Fractions().fractions();
		
		int[] arr= new int[]{1,3, 4, 5, 6, 7};
		int brr[]= new int[]{2, 8 , 9 , 12, 14};
		new Fractions().mergeArray(arr, brr);
	}
	
}
