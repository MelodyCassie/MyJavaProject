package MyArrayPractice;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {15, 22, 30, 12, 45, 7};
        double averageOfArray = getAverage(numbers);
        System.out.println("The average of the array is : " + averageOfArray);



    }

    public static double getAverage(int[] numbers) {
        double average = 0;
        int sum = 0;
        for(int count = 0 ; count < numbers.length; count++){
            sum +=numbers[count];
        }
        average = (double) sum / numbers.length;

        return average;
    }

}
