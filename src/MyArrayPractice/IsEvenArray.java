package MyArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class IsEvenArray {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 5, 8, 11, 14, 6, 9};
        int[] evenNumbers = even(numbers);
        System.out.print("The even numbers from the array are : " + Arrays.toString(evenNumbers));

    }

    public static int[] even(int[] numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int count = 0; count < numbers.length ; count++){
            if(numbers[count] % 2 == 0){
                evenNumbers.add(numbers[count]);
            }
        }
        int[] resultArray = new int[evenNumbers.size()];
        for(int i = 0; i < evenNumbers.size(); i++){
            resultArray[i] = evenNumbers.get(i);
        }
        return resultArray;

    }

}
