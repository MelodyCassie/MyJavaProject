package MyArrayPractice;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] rotated = rotate(numbers);
        System.out.println(Arrays.toString(rotated));
    }
    public static int[] rotate(int[] numbers) {
        int numberOfTimesToRotate = 2;
        int length = numbers.length;
        int[] newArray = new int[length];

        int effectiveRotation = numberOfTimesToRotate % length;

        for(int count = 0; count < length; count++){

            int newPosition = (count + effectiveRotation) % length;
                newArray[newPosition] = numbers[count];
        }
        return newArray;

    }


}
