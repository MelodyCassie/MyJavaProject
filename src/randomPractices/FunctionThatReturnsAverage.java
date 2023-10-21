package randomPractices;

public class FunctionThatReturnsAverage {

    public static double checkForAverage(int[] arrayOfNumbers) {
        int add = 0;
        double average = 0.0;

            for (int eachNumber : arrayOfNumbers) {

                add += eachNumber;
            }
           int theLength = arrayOfNumbers.length;

            average = (double) add / theLength;


        return average;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = {5,6,7,8,9,5};

        double average = checkForAverage(arrayOfNumbers);

        System.out.println("The average of the array of numbers is:  " + average);
    }

}
