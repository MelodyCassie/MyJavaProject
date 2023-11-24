package ListInterface;

import java.util.*;

public class SizeListAndClear {
    public static void main(String[] args) {
        List<Integer> myNums = new ArrayList<>();

        myNums.add(1);
        myNums.add(2);
        myNums.add(3);
        myNums.add(4);
        myNums.add(5);

        int whatSize = myNums.size();
        System.out.println(whatSize);

        myNums.clear();
        System.out.println(myNums);
    }
}
