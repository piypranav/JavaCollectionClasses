package JavaStringPractice;

public class PanlidromeWithFunction {

    public boolean checkPalidromeWithJavaFunc(String str) {
        if(str != null) {
            String sReverseStr = ((new StringBuilder(str)).reverse()).toString();
            if(str.equals(sReverseStr)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Empty string passed. Exiting");
            return false;
        }
    }

    public boolean palidromeExample(String str) {
        int strLen = str.length();
        for(int i=0; i< strLen; i++) {
            if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {
                System.out.println("Char at " +i + " matches with character at " +
                        str.charAt((str.length()-1) -i));
            } else {
                System.out.println("String are not Palindrome");
                return false;
            }
        }
        return true;
    }

//    My Solved Problem
    public boolean palindromeWithoutFunction(String str) {
        if(str != null) {
            char[] charStr = str.toCharArray();
            for(int i=0; i< (charStr.length); i++) {
                if(charStr[i] == charStr[(charStr.length -1) - i]) {
                    System.out.println("Char at charStr[i]" + charStr[i] + " Reverse" +
                            " char is: " + charStr[(charStr.length -1) - i]);
                } else {
                    System.out.println("In else");
                    System.out.println("Char at charStr[i]" + charStr[i] + " Reverse" +
                            " char is: " + charStr[(charStr.length -1) - i]);
                    return false;
                }
            }
            return true;
        } else {
            System.out.println("String is empty. Exiting");
            return false;
        }
    }

    public static void main(String[] args) {
        PanlidromeWithFunction palindrome = new PanlidromeWithFunction();
        if(palindrome.checkPalidromeWithJavaFunc("radar")) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String not a Palindrome");
        }

        if(palindrome.palindromeWithoutFunction("radar")) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String not a Palindrome");
        }

        if(palindrome.palidromeExample("radar")) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String not a Palindrome");
        }

    }
}
