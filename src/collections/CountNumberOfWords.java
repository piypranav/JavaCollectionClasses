package collections;

import java.util.HashMap;

public class CountNumberOfWords {
    HashMap<String, Integer> hMap = new HashMap<>();

    public HashMap<String, Integer> countWordOccurence(String sWords) {
        String[] aString = sWords.split(" ");
        for(String sWord: aString) {
            if(hMap.containsKey(sWord)) {
                hMap.put(sWord, hMap.get(sWord)+1);
            } else {
                hMap.put(sWord, 1);
            }
        }
        return hMap;
    }

    public static void main(String[] args) {
        String sWords = "This is a place called Delhi , Delhi is capital of India";
        HashMap<String, Integer> hMap = new HashMap<>();
        CountNumberOfWords countWord = new CountNumberOfWords();
        hMap = countWord.countWordOccurence(sWords);
        System.out.println("Count is: " + hMap.entrySet());
    }
}
