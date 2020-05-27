package JavaStringPractice;

import java.util.*;

public class FindDuplicates {

    public HashMap<String, List<String>> duplicateStrings(List<String> lString) {
        ListIterator<String> iterator = lString.listIterator();
        HashMap<String, List<String>> hValues = new HashMap<>();
        List<String> sStringVal = new ArrayList<String>();
        List<String> duplicateValue = new ArrayList<>();
        while(iterator.hasNext()) {
            String sVal = iterator.next();
            if(sStringVal.contains(sVal)) {
                duplicateValue.add(sVal);
                hValues.put("Duplicate", duplicateValue);
            } else {
                sStringVal.add(sVal);
                hValues.put("NotDuplicate", sStringVal);
            }
        }
        return hValues;
    }

    public static void main(String[] args) {
        FindDuplicates oDuplicates = new FindDuplicates();
        HashMap<String, List<String>> hHashMapVal = new HashMap<String, List<String>>();
        List<String> lStrings = new ArrayList<>();
        lStrings.add("Ram");
        lStrings.add("Shyam");
        lStrings.add("Ram");
        lStrings.add("Dam");
        lStrings.add("Propane");
        lStrings.add("Shyam");
        hHashMapVal = oDuplicates.duplicateStrings(lStrings);
        System.out.println("Duplicate values are: " +
                hHashMapVal.entrySet());
//        for(String mapKey: hHashMapVal.keySet()) {
//            while(hHashMapVal.get(mapKey).iterator().hasNext()) {
//                System.out.println("HashMap key is: " + mapKey
//                        + " Values are: " + hHashMapVal.get(mapKey).iterator().next());
//            }
//        }
    }
}
