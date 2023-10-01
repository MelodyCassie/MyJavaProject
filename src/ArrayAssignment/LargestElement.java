package ArrayAssignment;

import java.util.ArrayList;
import java.util.List;

public class LargestElement{
    public static int findLargestElement(List<Integer> list) {

        int largest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int currentElement = list.get(i);

            if (currentElement > largest) {
                largest = currentElement;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 9, 88, 7, 4);

        int largestElement = findLargestElement(numbers);

        System.out.println("The largest element is: " + largestElement);
    }
}
