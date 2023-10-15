package Assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedNumbers = reverseList(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Reversed list: " + reversedNumbers);
    }
}



