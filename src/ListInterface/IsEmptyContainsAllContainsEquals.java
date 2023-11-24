package ListInterface;

import java.util.*;

public class IsEmptyContainsAllContainsEquals {
    public static void main(String[] args) {
        List<String> myStrings = new ArrayList<>();

        myStrings.add("my");
        myStrings.add("name");
        myStrings.add("is");
        myStrings.add("Melody");

        boolean contains = myStrings.contains("Melody");
        System.out.println(contains);

        boolean isEmpty = myStrings.isEmpty();
        System.out.println(isEmpty);

        boolean containsAll = myStrings.containsAll(myStrings);
        System.out.println(containsAll);

        //USED TO COMPARE TWO LISTS
        boolean isEquals = myStrings.equals("");
        System.out.println(isEquals);


    }
}
