package MyArrayPractice;

import java.util.Arrays;

public class SwappingElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int[] swappedArray = SwappingElements.swap(numbers);
        System.out.println(Arrays.toString(swappedArray));

    }
    public static int[] swap(int[] numbers) {
         int storeFirstIndex = numbers[0];
         int lastElement = numbers.length-1;

         numbers[0] = numbers[lastElement];
         numbers[lastElement] = storeFirstIndex;

        return numbers;
    }

}
