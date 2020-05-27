package JavaStringPractice;

import java.util.*;

public class SortValues {
    public void sortValues(List<String> lString) {
        System.out.println("Unsorted collection is:" + lString);
        Collections.sort(lString);
        System.out.println("Sorted collection is:" + lString);
    }

    public static void main(String[] args) {
        SortValues oSortVal = new SortValues();
        List<String> lStrings = new ArrayList<>();
        lStrings.add("Ram");
        lStrings.add("Propana");
        lStrings.add("Shyam");
        lStrings.add("Ram");
        lStrings.add("Dam");
        lStrings.add("Propane");
        lStrings.add("Shyam");
        oSortVal.sortValues(lStrings);
    }
}
