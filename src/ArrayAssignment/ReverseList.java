package ArrayAssignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list); // Create a new list to store the reversed elements
        Collections.reverse(reversedList); // Use the Collections.reverse method to reverse the list
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedNumbers = reverseList(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Reversed list: " + reversedNumbers);
    }
}



