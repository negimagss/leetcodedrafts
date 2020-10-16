package com.cracking.coding.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveParanthese1021 {


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * String[] loggedMoves= {"x/" ,"/y","../","z/","./"}; int count=0; for(int
		 * i=0;i< loggedMoves.length;i++) {
		 * 
		 * if(loggedMoves[i].equals("../")) { count--; } if(loggedMoves[i].equals("./"))
		 * { continue; } else { count++; }
		 * 
		 * } System.out.println(count);
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 */


		/*
		 * String sentence = "love errichto jonathan dumb", searchWord = "duubmb";
		 * 
		 * String str[]= sentence.split(" ");
		 * 
		 * for(int i=0;i<str.length;i++) {
		 * 
		 * if(str[i].trim().length()<=searchWord.length()) {continue;} String a=
		 * str[i].substring(0, searchWord.length()); if(a.equals(searchWord)) {
		 * System.out.println(i+1); } }
		 * 
		 * 
		 * 
		 */
		
		

	
		String s = "weallloveyou";
				
		int k = 7;
        int sum=0;
        for(int i=0;i<s.length();i++) {

            //run the loop
        	//if(i+k>s.length()) continue;
            String a= s.substring(i, i+k);
            int sum1=0;
            for(char ch : a.toCharArray()) {
                
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    sum1++;
                }
            }
            if(sum1>sum) {
                sum=sum1;
            }
            
        }
        
        System.out.println(sum);
       


        
        int sum2=0, k1=k;
        for(int i=0;i<s.length();i++) {
        	
        	
        	
        }









	}


}
