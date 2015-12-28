package com.kolamomo.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex3 {
    public int lengthOfLongestSubstring(String s) {
    	int max = 0;
    	int i = 0;
    	int j = 0;
		Map<Character, Integer> chMap = new HashMap<Character, Integer> ();
    	while(j < s.length()) {
    		if(chMap.get(s.charAt(j)) != null && chMap.get(s.charAt(j)) >= i)  {
    			if(j - i > max) {
    				max = j - i;
    			}
    			i = chMap.get(s.charAt(j)) + 1;
    		}
    		chMap.put(s.charAt(j), j);
    		j++;
    	}
		if(j - i > max) {
			max = j - i ;
		}
		return max;
    }

    //暴力法 O(n^2)
	/*
    public int lengthOfLongestSubstring(String s) {
    	int max = 0;
        for(int i = 0; i < s.length(); i++) {
        	int j = i;
        	int length = 0;
        	Set<Character> chSet = new HashSet<Character> ();
        	while(j < s.length()) {
        		if(!chSet.contains(s.charAt(j))) {
        			chSet.add(s.charAt(j));
        			length++;
        			j++;
        		} else {
        			break;
        		}
        	}
        	if(length > max) {
        		max = length;
        	}
        }
        return max;
    }
    */
    
    public static void main(String[] args) {
    	Ex3 ex3 = new Ex3();
    	System.out.println(ex3.lengthOfLongestSubstring("aa"));
    }
}
