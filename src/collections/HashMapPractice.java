package collections;

import java.util.HashMap;

public class HashMapPractice {
	
	public void hash_map_string(String sString) {
		HashMap<String, Integer> hHashMap = new HashMap<String, Integer>();
		String[] aString = sString.split(" ");
		for(String s: aString) {
			if(hHashMap.containsKey(s)) {
				hHashMap.put(s,  hHashMap.get(s) + 1);
			} else {
				hHashMap.put(s,  1);
			}
		}
		System.out.println("String count is: " + hHashMap.entrySet());
	}
	
	public void hash_map_char(String sString) {
		char[] aCharArray = sString.toCharArray();
		HashMap<Character, Integer> hHashMap = new HashMap<Character, Integer>();
		for(char c: aCharArray) {
			if(hHashMap.containsKey(c)) {
				hHashMap.put(c, hHashMap.get(c) + 1);
			} else {
				hHashMap.put(c, 1);
			}
		}
		System.out.println("Characters count are: " + hHashMap.entrySet());
		
	}

	public static void main(String[] args) {
		String sData = "This is my string, is there a need to know the count of words";
		
		HashMapPractice hmp = new HashMapPractice();
		hmp.hash_map_string(sData);
		hmp.hash_map_char(sData);
		
	}

}
