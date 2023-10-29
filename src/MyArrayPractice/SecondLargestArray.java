package MyArrayPractice;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] numbers = {15, 22, 30, 12, 45, 7};
        int secondLargest = findSecondLargest(numbers);
        System.out.print("The second largest num  in the array of nums is: " + secondLargest);

    }

    public static int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest ) {
               secondLargest = largest;
               largest = numbers[i];
            }
           if(numbers[i] > secondLargest && numbers[i] < largest){
               secondLargest = numbers[i];
           }
        }
        return secondLargest;
    }
}
