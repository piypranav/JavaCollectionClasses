package collections;

import java.util.HashMap;

public class HashMapPractice {
	
	public void hash_map(String sString) {
		HashMap<String, Integer> hHashMap = new HashMap<String, Integer>();
		String[] aString = sString.split(" ");
		for(String s: aString) {
			if(hHashMap.containsKey(s)) {
				hHashMap.put(s,  hHashMap.get(s) + 1);
			} else {
				hHashMap.put(s,  1);
			}
		}
		System.out.println(hHashMap.entrySet());
	}

	public static void main(String[] args) {
		String sData = "This is my string, is there a need to know the count of words";
		
		HashMapPractice hmp = new HashMapPractice();
		hmp.hash_map(sData);
		
	}

}
