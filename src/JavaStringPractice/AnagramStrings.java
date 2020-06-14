package JavaStringPractice;

import java.util.Arrays;

public class AnagramStrings {

    public void compareAndRemove(String sString1, String sString2) {
        String temp;
        for(int i=0; i<=(sString1.length()-1); i++) {
            if(sString1.charAt(i) != sString2.charAt(i)) {
                temp = sString1.substring(0, i-1) + sString1.substring(i+2);

                System.out.println("New Temp string is: " + temp);
                sString1 = temp;
                System.out.println("New String1 is: " + sString1);
            }
        }
        System.out.println("New String1 is: " + sString1 + " String2 is: " + sString2);
    }

    public void validateAnagram(String sString1, String sString2) {
        sString1 = sString1.replaceAll(" ", "");
        sString2 = sString2.replaceAll(" ", "");
        char[] cString1 = sString1.toCharArray();
        char[] cString2 = sString2.toCharArray();
        Arrays.sort(cString1);
        Arrays.sort(cString2);
        sString1 = Arrays.toString(cString1);
        sString2 = Arrays.toString(cString2);

        if(sString1.equals(sString2)) {
            System.out.println("Strings are Anagram strings");
        } else {
            System.out.println("Strings are not Anagram Strings");
            int iLength1 = sString1.length();
            int iLength2 = sString2.length();
            if(iLength1 > iLength2) {
                compareAndRemove(sString1, sString2);
            } else {
                compareAndRemove(sString2, sString1);
            }
        }

        System.out.println("String 1 is: " + sString1 + " String 2 is: " + sString2);
    }

    public static void main(String[] args) {
        AnagramStrings as = new AnagramStrings();
        as.validateAnagram("Welcome java", "Welcome javaa");
    }
}
