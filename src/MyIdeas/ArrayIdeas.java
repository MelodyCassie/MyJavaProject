package MyIdeas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayIdeas {
    public static void main(String[] args) {
        int[] frequency = new int[7];
        //This line declares an integer array named frequency with a length of 7.
        // This array will be used to count the frequency of each face when rolling a die.

        final int ARRAY_LENGTH = 10; //declares a constant named ARRAY_LENGTH with a value
        // of 10. The final keyword means that the value of this variable cannot be
        // changed; it's a constant.

        int[] array = new int[ARRAY_LENGTH]; //creates an integer array named
       // array with a length specified by the ARRAY_LENGTH constant. In this case, the
        // array will have 10 elements.
        //***********************************************************************************
        //Inside the loop, array[counter] = 2 + 2 * counter; calculates a value and assigns
        // it to the current element of the array. The value is calculated based on the index (counter),
        // and it's set to 2 + 2 * counter. As the loop progresses, this formula generates
        // values for each element of the array.

        //Effectively, this code initializes the array as follows:

        //array[0] will be 2 + 2 * 0, which is 2.
        //array[1] will be 2 + 2 * 1, which is 4.
       // array[2] will be 2 + 2 * 2, which is 6.
        //And so on, until array[9] is set to 2 + 2 * 9, which is 20.




    }
    public static int[] dominateNumber (int[] array){
        ArrayList<Integer> numbs = new ArrayList<>();
        //This line declares an ArrayList of integers named numbs
        //and initializes it as an empty ArrayList. An ArrayList is
        //a dynamic array-like data structure in Java that can grow
        // or shrink in size as needed.
        for (int i = 0; i < array.length; i++) {
            //This line starts a for loop that iterates through the elements
            // of an array named array. The loop begins with i set to 0 and continues
            //as long as i is less than the length of the array.
            int counter = 0;
            //This line declares an integer variable named counter and initializes it to 0.
            //counter will be used to count the number of elements greater than the current element being
            // considered in the outer loop.
            for (int j = i + 1; j < array.length; j++) {
                //This line starts a nested for loop. It iterates through the
                //elements in the array starting from the element immediately after the current element i and
                // continues until the end of the array.
                if (array[i] > array[j]) {
                    //Within the nested loop, this line checks if the element at the current index i is greater
                    // than the element at the index j. It's comparing the current element with elements that come
                    // after it
                    counter++;
                    //If the condition in the previous line is true, this line increments the counter. This means that
                    // if the current element is greater than an element that comes after it, it increments counter
                }
            }
            //This block of code (enclosed by the braces) ends the nested loop.
            if (counter == (array.length - 1 - i)) {
                //After the nested loop, this line checks if the counter is equal to the number of elements that are expected
                // to be greater than the current element. This is determined by subtracting the current index i from the total
                // number of elements minus one. If counter matches this count, it means the current element is dominant
                numbs.add(array[i]);
                //If the condition in the previous line is true, this line adds the current element at index i to the numbs ArrayList.
                // This element is considered "dominant" because it's greater than the expected number of elements that follow it and
                // are smaller.



            }
             //In summary, this code identifies "dominant" elements in an array, which are elements that are greater than the number of
            // elements that come after them. These dominant elements are added to the numbs ArrayList.
        }
        // this below part is a function for transitioning your result to an array form
        //This part of the code is responsible for converting an ArrayList (numbs) to
        // a regular array
        int[] resultArray = new int[numbs.size()];
        //This line declares a new integer array named resultArray and initializes it with a size equal to the number of elements in
        // the numbs ArrayList. It does so by calling the size() method on the numbs ArrayList. This ensures that resultArray will have the
        // same number of elements as numbs
        for (int k = 0; k < numbs.size(); k++) {
           // This line starts a for loop that iterates from 0 to one less than the size of the numbs ArrayList. In other words,
            //it iterates through each element in numbs
            resultArray[k] = numbs.get(k);
            //Within the loop, this line assigns the value at index k from the numbs ArrayList to the corresponding index k in the resultArray.
            // This effectively transfers the
            // elements from numbs to resultArray.
        }
        return resultArray;
        //Once the loop has finished iterating and all elements from numbs have been copied to resultArray, the method returns the resultArray.
        // This means the function returns
        // an integer array containing the same elements as the numbs ArrayList.

    }
    //In summary, this part of the code is performing a conversion from an ArrayList (numbs) to a regular integer array (resultArray)
    // by iterating through the elements in numbs
    // and copying them to the new array. The resulting array is then returned by the method. This is a common way to convert data between different
    // data structures in Java.
    //System.out.println("The even numbers from the array are : " + Arrays.toString(evenNumbers));
    //this is used in the psvm part to wrap the variable holding the result to an array.





    //While Integer.MIN_VALUE is a common choice for initializing secondLargest because it's a well-understood constant for
    // integers, you can use other values as well depending on the specific requirements of your code. Here are a few alternatives:
    //
    //Negative Infinity: You can use Double.NEGATIVE_INFINITY if you're working with floating-point numbers, like double.
    //
    //Minimum Value for the Data Type: You can use the minimum value for the specific data type you are working with.
    // For example, if you're using long, you can initialize secondLargest with Long.MIN_VALUE.
    //
    //Custom Value: Depending on the context of your problem, you might know that all the numbers in the array will be
    // positive, and you can initialize secondLargest with a value like -1 if it's impossible for the array to contain negative numbers.
    //
    //null: If you're working with objects (e.g., an array of objects), you can initialize secondLargest to null if that makes sense in
    // the context of your problem. This is often used when dealing with objects, not primitive data types.



///Used to shuffle an array of numbers
    public class FisherYatesShuffle {
        public static void fisherYatesShuffle(int[] arr) {
            Random random = new Random();
            for (int i = arr.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1); // Generate a random index between 0 and i (inclusive).
                // Swap the elements at positions i and j.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5};
            fisherYatesShuffle(myArray);
            for (int num : myArray) {
                System.out.print(num + " ");
            }
        }
    }

}
