package ArrayAssignment;

import java.util.ArrayList;
import java.util.List;

public class LargestElement{
    public static int findLargestElement(int[] numbers) {

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            int currentElement = numbers[i];

            if (currentElement > largest) {
                largest = currentElement;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[]  numbers = {5,2, 9, 88, 7, 4};

        int largestElement = findLargestElement(numbers);

        System.out.println("The largest element is: " + largestElement);
    }
}
