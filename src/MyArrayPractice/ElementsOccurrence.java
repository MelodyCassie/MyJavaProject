package MyArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementsOccurrence {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 8, 5, 3, 7, 2, 7, 5, 8, 8, 1};
        int[] numbersWithCount = checkOccurrence(numbers);
        System.out.println(Arrays.toString(numbersWithCount));

    }
    public static int[] checkOccurrence(int[] numbers) {
        ArrayList<Integer> numbersWithCount = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            int count = 1;

            numbersWithCount.add(currentElement);
            numbersWithCount.add(count);
        }
        int[] resultArray = new int[numbersWithCount.size()];
        for (int k = 0; k < numbersWithCount.size(); k++) {
            resultArray[k] = numbersWithCount.get(k);
        }
        return resultArray;
    }
}