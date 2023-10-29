package MyArrayPractice;

public class MinimumArray {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 8, 14, 5, 21};
        int minimum = getMinimum(numbers);
        System.out.println("The minimum numbers in the array is: " + minimum);


    }

    public static int getMinimum(int[] numbers) {
        int minimum = numbers[0];

        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] < minimum){
                minimum = numbers[count];
            }
        }
        return minimum;

    }
}
