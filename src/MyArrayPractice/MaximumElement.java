package MyArrayPractice;

public class MaximumElement {
    public static void main(String[] args) {
        int[] numbers = {8, 23, 45, 2, 67, 5, 34, 19};
        int maximumNumber = maximumCheck(numbers);
        System.out.println("The maximum number in the array is : " + maximumNumber);

    }

    public static int maximumCheck(int[] numbers) {
        if (numbers.length == 0 || numbers.length < 0) {
            throw new IllegalArgumentException("Invalid!");
        }
        int maximum = 0;
        for(int number : numbers){
            if(number > maximum){
                maximum = number;
            }
        }
        return maximum;
    }
}
