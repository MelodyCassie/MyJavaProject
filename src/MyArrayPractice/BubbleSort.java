package MyArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = bubbleSort(numbers);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] bubbleSort(int[] numbers) {
        int theLength = numbers.length;
        int[] sorted = Arrays.copyOf(numbers,theLength);

         for(int i = 0; i < theLength- 1; i++ ){
             for(int j = 0; j < theLength - i - 1; j++){
                 if(sorted[j] > sorted[j + 1]){
                     int temp = sorted[j];
                     sorted[j] = sorted[j + 1];
                     sorted[j + 1] = temp;
                 }
             }
         }
         return sorted;
    }
}
