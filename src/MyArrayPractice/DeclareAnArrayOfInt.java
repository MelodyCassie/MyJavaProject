package MyArrayPractice;

public class DeclareAnArrayOfInt {
    public static void main(String[] args) {

        // DECLARING AN INITIALIZED ARRAY
        int[] numbers = {4, 2, 5, 8, 9, 3};


        // CALLING AN ARRAY COMPONENT OR ELEMENT
        int componentThree = numbers[2];
        System.out.println(componentThree);

        // CHANGING VALUE IN A PARTICULAR INDEX OF AN ARRAY
        numbers[2] = 8;
        System.out.println(numbers[2]);


        // SUMMING UP A CERTAIN ARRAY COMPONENT
        int[] c = {43, 54, 43, 23, 45, 65, 78, 65};

        int sum = c[1] + c[4];
        System.out.println(sum);

        // DIVIDE AN ELEMENT BY 2
        double result = (double)c[5] / 2;
        System.out.println(result);

        // DECLARING AN ARRAY OF A PARTICULAR SIZE... ALSO CALLED INITIALIZER LIST
        int[] myArray = new int[5];
        System.out.println(myArray[0]);


        // DECLARING A FINAL ARRAY SIZE AND PRINTING THE VALUES AND THE COUNT.
        final int ARRAY_LENGTH = 10;
        int[] array = new int [ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }
    }


}