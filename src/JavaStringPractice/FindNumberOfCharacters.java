package JavaStringPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindNumberOfCharacters {

    public void numberOfCharacters(String sString) {
        char[] cString = (sString.replaceAll(" ", "")).toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char c: cString) {
            if(hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c)+1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap.entrySet());
    }

    public void countNormally(String sString) {
//        Welcome to Java
        char[] cArray = sString.replaceAll(" ", "").toCharArray();
        Arrays.sort(cArray);
        for(int i=0; i<= cArray.length-1; i++) {
            int temp = 1;
            for(int j=i+1; j<=cArray.length-1; j++) {
                if(cArray[i] == cArray[j]) {
                    temp += 1;
                    i += 1;
                }
            }
            System.out.println("Character " + cArray[i] + " is present " + temp + " times");
        }
    }

    public void countWords(String sString) {
        String[] nString = sString.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String s: nString) {
            if(hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
        System.out.println(hashMap.entrySet());
    }

    public static void main(String[] args) {
        FindNumberOfCharacters fnc = new FindNumberOfCharacters();
//        fnc.numberOfCharacters("Welcome to Java");
//        fnc.countWords("Welcome to Java to welcome");
        fnc.countNormally("Welcome to Java to welcome");
    }
}
