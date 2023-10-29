package MyArrayPractice;

public class IsEvenArraySum {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 5, 8, 11, 14, 6, 9};
        int add = sumEven(numbers);
        System.out.println("The sum of all the even numbers in the array is: " + add);
    }
    public static int sumEven(int[] numbers) {
        int add = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                add += numbers[i];
            }
        }
        return add;

    }
}
