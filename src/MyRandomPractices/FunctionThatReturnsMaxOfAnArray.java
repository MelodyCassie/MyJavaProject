package MyRandomPractices;

public class FunctionThatReturnsMaxOfAnArray {


    public static int checksForMaxArray(int[] arrayOfNumbers) {

        int maximum = 0;

        for(int count = 0; count < arrayOfNumbers.length; count++){
            if(arrayOfNumbers[count] > maximum ){
               maximum = arrayOfNumbers[count] ;

            }

        }
        return maximum;

    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = {5,4,6,7,9,4,6};

        int maximum = checksForMaxArray(arrayOfNumbers);

        System.out.println("The maximum number in the array provided is :  " + maximum);
    }
}
