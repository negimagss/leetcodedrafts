package com.cracking.coding.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GSHighFive {

	
	public int[][] highFive_(int[][] items) {
        Map<Integer,List<Integer>> mp = new HashMap<Integer,List<Integer>>();
        
        for(int i=0;i<items.length;i++){
            if(mp.containsKey(items[i][0])){
                mp.get(items[i][0]).add(items[i][1]);
            }else{
                List<Integer> li = new ArrayList<Integer>();
                li.add(items[i][1]);
                mp.put(items[i][0],li);
            }
        }
        
        int[][] res = new int[mp.size()][2];
        int i=0;
        
        
        for (Map.Entry<Integer,List<Integer>> entry : mp.entrySet()) {
	        int k = entry.getKey();
            res[i][0]=k;
            List<Integer> li= entry.getValue();
            Collections.sort(li,Collections.reverseOrder());
            int sum=0;
            for(int j=0;j<5;j++){
                sum+=li.get(j);
            }
            sum/=5;
            res[i][1]=sum;
            i++;
        }
        return res;
    }
	
	//https://leetcode.com/problems/high-five/discuss/529149/Java-greater-Concise-HashMap-%2B-PriorityQueue
	
public int[][] highFive(int[][] items) {
        
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int[] item: items) {
            
            int student = item[0];
            int score = item[1];
            
            if(!map.containsKey(student))
                map.put(student, new PriorityQueue<>());
            
            PriorityQueue<Integer> pq = map.get(student);
            
            if(pq.size() < 5) {
                pq.add(score);
            } else if(score > pq.peek()) {
                pq.poll();
                pq.add(score);
            }
        }
        
        int[][] scores = new int[map.size()][2];
                        
        for(int key: map.keySet()) {
            
            int sum = 0;
            
            while(!map.get(key).isEmpty()) sum += map.get(key).poll();
            
            scores[key-1][0] = key;
            scores[key-1][1] = sum/5;
        }
        
        return scores;
    }
}
