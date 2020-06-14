package JavaStringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicographicalStrings {
    public int arrangeString(String s1, String s2) {
        if(s1.compareTo(s2) == 0) {
            return 0;
        } else if(s1.compareTo(s2) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
    // Driver code
    public static void main(String[] args) {
        LexicographicalStrings ls = new LexicographicalStrings();
        String s1 = "geeks";
        String s2 = "welcome";
        ls.arrangeString(s1, s2);
    }
}
