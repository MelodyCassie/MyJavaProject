package ClassTaskss;

import java.util.ArrayList;
import java.util.List;
public class ArraySolving {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 5, 3, 7, 8, 2, 6};

        List<Integer> dominants = findDominant(arrayOfNumbers);
        System.out.println("The dominant elements in the array are: ");

        for (int dominant : dominants) {
            System.out.println(dominant);
        }
    }

    public static List<Integer> findDominant(int[] arrayOfNumbers) {
        List<Integer> theDominant = new ArrayList<>();
        int maxRight = -1;

        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            if (arrayOfNumbers[i] > maxRight) {
                theDominant.add(arrayOfNumbers[i]);
                maxRight = arrayOfNumbers[i];
            }
        }
        List<Integer> reversedDominant = new ArrayList<>();
        for (int i = theDominant.size() - 1; i >= 0; i--) {
            reversedDominant.add(theDominant.get(i));
        }

        return reversedDominant;
    }


    public static int[] dominateNumber(int[] array) {
        ArrayList<Integer> numbs = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    counter++;
                }
            }
            if (counter == (array.length - 1 - i)) {
                numbs.add(array[i]);
            }
        }
        int[] resultArray = new int[numbs.size()];
        for (int k = 0; k < numbs.size(); k++) {
            resultArray[k] = numbs.get(k);
        }
        return resultArray;

    }
}


