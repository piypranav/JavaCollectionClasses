package JavaStringPractice;

import java.util.Scanner;

public class ReverseAString {

    public void reverseAString(String sString) {
        String sReverse =" ";
        for(int i=(sString.length() -1); i>=0; i--) {
            sReverse = sReverse + sString.charAt(i);
        }
        System.out.println("Reverse string is: " + sReverse);
    }

    public void reverseWithFunction(String sString) {
        StringBuffer sb = new StringBuffer(sString);
        System.out.println("Reversed String is: " + sb.reverse());
    }

    public void countWordsInString(String sString) {

        System.out.println("Number of Words are: " + sString.length());
        int temp=0;
        for(int i=0; i<=sString.length()-1;i++){
            if(sString.charAt(i) != ' ') {
                temp += 1;
            }
        }
        System.out.println("Words in the String are: " + temp);
    }

    public void makeFirstLetterCapital(String sString) {
//        Character sTemp = ' ';
        for(int i=0; i<=(sString.length()-1); i++) {
            if(i==0) {
                sString = Character.toUpperCase(sString.charAt(i)) + sString.substring(1);
            } else if(sString.charAt(i) == ' ') {
                sString = sString.substring(0, i) + " " + Character.toUpperCase(sString.charAt(i+1)) + sString.substring(i+2);

            }
        }
        System.out.println("String value is: " + sString);
        StringBuffer sb = new StringBuffer(sString);
        System.out.println("Reverse of the String is: " + sb.reverse());
    }

    public static void main(String[] args) {
        ReverseAString rs = new ReverseAString();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your String: ");
//        String sString = sc.nextLine();
        String sString = "welcome to java code";
//        rs.reverseAString(sString);
//        rs.reverseWithFunction(sString);
//        rs.makeFirstLetterCapital(sString);
        rs.countWordsInString(sString);
    }
}
