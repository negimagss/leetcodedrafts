package amazon;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HeapSortCharactersByfreq {

	
	
	
	public String frequencySort(String str) {
        if (str == null || str.length() <= 2) return str;
        Map<Character, Integer> map = new HashMap<>();
        char[] list = str.toCharArray();
        for (char c : list) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        
        PriorityQueue<Character> heap = new PriorityQueue<>(str.length(), new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                return map.get(c2) - map.get(c1);
            }
        });
        
        for (char c : map.keySet()) {
            heap.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            char c = heap.poll();
            int count = map.get(c);
            for (int i = 0; i < count; ++i) sb.append(c);
        }
        return sb.toString();
}
}
