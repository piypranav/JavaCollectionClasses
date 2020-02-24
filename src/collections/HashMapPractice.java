package collections;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		String sData = "This is my string, is there a need to know the count of words";
		
		HashMap<String, Integer> hHashMap = new HashMap<String, Integer>();
		String[] aString = sData.split(" ");
		for(String s: aString) {
			if(hHashMap.containsKey(s)) {
				hHashMap.put(s, hHashMap.get(s) + 1);
			} else {
				hHashMap.put(s, 1);
			}
		}
		
		System.out.println("HashMap value is: " + hHashMap.entrySet());

	}

}
