package MyArrayPractice;

public class IsOddArraySum {
    public static void main(String[] args) {
        int[] numbers = {17, 25, 8, 11, 36, 42, 7, 19};
        int oddSum = sumOddNumbers(numbers);
        System.out.println("The sum of all the odd numbers in this array is : " + oddSum);

    }

    public static int sumOddNumbers(int[] numbers) {
        int sumOdd = 0;
        for(int num : numbers){
            if(num % 2 != 0){
                sumOdd += num;

            }
        }
        return sumOdd;
    }
}
