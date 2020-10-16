package com.cracking.coding.Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Arrays {
public static void main(String[] args) {
	String str = "#1233sadas@#$@#";
	String regex = "[^0-9]+"; 
	
	//System.out.println(str.replaceAll(regex, ""));
	
	
    Map<Character,Integer> charcount=new HashMap<>();
    for(Character c: str.toCharArray()) {
    	if(charcount.containsKey(c)) {
    		System.out.println(false);
    		break;
    	}
    	charcount.put(c, 1);
    }
    System.out.println(true);
	
    
    
    //count and place 
    String a = "aaabbbcccdddd";
    
    Map<Character,Integer> charcount1=new HashMap<>();
    for(Character c: a.toCharArray()) {
    	if(charcount1.containsKey(c)) {
    		//System.out.println(false);
    		charcount1.put(c, (charcount1.get(c).intValue()+1));
    		//break;
    	}
    	charcount1.put(c, 1);
    }
    
    
    
    System.out.println(true);
	
	
    
    Queue<Integer> q = new LinkedList<>(); 
    
    // Adds elements {0, 1, 2, 3, 4} to queue 
    for (int i=0; i<5; i++) 
     q.add(i); 
  
    // Display contents of the queue. 
    System.out.println("Elements of queue-"+q); 
  
    // To remove the head of queue. 
    int removedele = q.remove();
    q.remove();
    System.out.println("removed element-" + removedele); 
  
    System.out.println(q); 
  
    // To view the head of queue 
    int head = q.peek(); 
    System.out.println("head of queue-" + head); 
  
    // Rest all methods of collection interface, 
    // Like size and contains can be used with this 
    // implementation. 
    int size = q.size(); 
    System.out.println("Size of queue-" + size);
	
    
    Stack1 s = new Stack1(); 
    s.push(1);
    System.out.println(s.peek());
    s.pop();
    System.out.println(s);
    
}
}
