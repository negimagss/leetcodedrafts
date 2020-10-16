package com.cracking.coding.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class GoldmanRainWater {

	public int trap(int[] height)
	{
		int result = 0;
		int n = height.length;
		
		for (int i = 1; i < n - 1; i++)
		{
			int maxLeft = 0, maxRight = 0;
			
			for(int j = i; j >= 0; j--)					//Search the left part for max bar size
				maxLeft = Math.max(maxLeft, height[j]);

			for(int j = i; j < n; j++)					//Search the right part for max bar size
				maxRight = Math.max(maxRight, height[j]);

			result += Math.min(maxLeft, maxRight) - height[i];
		}
		return result;
	}
	
	
	public int trapStack(int[] height)
	{
		Deque<Integer> stack = new ArrayDeque<>();
		int result = 0;

		for(int current = 0; current < height.length; current++)
		{
			while(!stack.isEmpty() && height[current] > height[stack.peek()])
			{
				int top = stack.pop();
				
				if(!stack.isEmpty())
				{
					int distance = current - stack.peek() - 1;
					int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
					result += distance * bounded_height;
				}
			}	
			stack.push(current);
		}
		return result;
	}
	
	
}
