package amazon;

public class GFGSpiral {

	
	/**
	 * Given a 2D Matrix of order n X m, print K’th element in the spiral form of the matrix. See the following examples.
Examples:

Input: mat[][] = 
          {{1, 2, 3, 4}
           {5, 6, 7, 8}
           {9, 10, 11, 12}
           {13, 14, 15, 16}}
       k = 6
Output: 12
Explanation: The elements in spiral order is 
1, 2, 3, 4, 8, 12, 16, 15...
so the 6th element is 12

Input: mat[][] =
       {{1, 2, 3, 4, 5, 6}
        {7, 8, 9, 10, 11, 12}
        {13, 14, 15, 16, 17, 18}}
       k = 17
Output: 10
	 */
	
	
	static int R = 3; 
    static int C = 6; 
  
    static void spiralPrint(int m, int n, int[][] a, int c)  
    {  
        int i, k = 0, l = 0;  
        int count = 0;  
      
        /* k - starting row index  
            m - ending row index  
            l - starting column index  
            n - ending column index  
            i - iterator  
        */
      
        while (k < m && l < n) {  
            /* check the first row from  
                the remaining rows */
            for (i = l; i < n; ++i) {  
                count++;  
      
                if (count == c)  
                    System.out.println(a[k][i]+" "); 
            }  
            k++;  
      
            /* check the last column  
            from the remaining columns */
            for (i = k; i < m; ++i) {  
                count++;  
      
                if (count == c)  
                    System.out.println(a[i][n - 1]+" "); 
            }  
            n--;  
      
            /* check the last row from  
                    the remaining rows */
            if (k < m) {  
                for (i = n - 1; i >= l; --i) {  
                    count++;  
      
                    if (count == c)  
                          
                    System.out.println(a[m - 1][i]+" "); 
                }  
                m--;  
            }  
      
            /* check the first column from  
                    the remaining columns */
            if (l < n) {  
                for (i = m - 1; i >= k; --i) {  
                    count++;  
      
                    if (count == c)  
                        System.out.println(a[i][l]+" ");  
                }  
                l++;  
            }  
        }  
    }  
      
    /* Driver program to test above functions */
    public static void main (String[] args)  
    {  
        int a[][] = { { 1, 2, 3, 4, 5, 6 },  
                        { 7, 8, 9, 10, 11, 12 },  
                        { 13, 14, 15, 16, 17, 18 } };  
        int k = 17;  
      
        spiralPrint(R, C, a, k);  
    }  
	
	
	
}
