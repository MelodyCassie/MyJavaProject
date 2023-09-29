package ArrayAssignment;

import java.util.Scanner;

public class ArrayUberApplicationSmallestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[10];

        for(int count = 0; count < scores.length; count++){
            System.out.println("Enter Scores  " + (count + 1));
            scores[count]= scanner.nextInt();

        }

       int smallestNumber = scores[0];

        for(int count = 0 ; count < scores.length; count++) {

            if (scores[count] < smallestNumber) {
                smallestNumber = scores[count];
            }
        }
        System.out.println("The smallest score is:   " + smallestNumber);

    }
}
