package com.cracking.coding.Arrays;
import java.util.Stack;

public class Q735AsteroidCollision {


	public static void main(String[] args) {




	}

	
	
	/**
	 * asteroids = [5, 10, -5]
		a 5 10
		b -5

		5 10
		
		
		
		asteroids = [10, 2, -5]

		a 10 2
		b -5
		10 
		
		asteroids = [-2, -1, 1, 2]


		1 2
		-1 -2
		
		

	 * 
	 * 
	 * 
	 * @param asteroids
	 * @return
	 */
	public int[] asteroidCollision() {

     int asteroids[] = {10, 2, -5};
        
     
     /**
      * 
      */
     
     
     Stack<Integer> stack = new Stack<>();
      
      for(int i : asteroids) {
        
    	  // save the ones greater then 1 in one array
    	  if(i > 0) {
              stack.push(i);
          } else {
        	  
        	  
              while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                  stack.pop();
              }
              if(stack.isEmpty() || stack.peek() < 0)  {
                  stack.push(i);
              }
              if(stack.peek() == Math.abs(i)) {
                  stack.pop();
              }
          }
          i++;
      }
      int[] res = new int[stack.size()];
      int j=stack.size()-1;
      while(!stack.isEmpty()) {
          res[j--] = stack.pop();
      }
        
        return res;
        
        
        
        
        

	}
}
