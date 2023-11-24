package ListInterface;


import java.util.*;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(8);

        int firstOcc = list.indexOf(8);
        System.out.println(firstOcc);

        int lastOcc = list.lastIndexOf(8);
        System.out.println(lastOcc);


    }
}
