package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourTwentyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nextLargest = 0;
        int lastLargest = 0;

        for(int count = 1; count <= 10; count++){
            System.out.println("Enter value: ");
            int values = scanner.nextInt();

            if(values > lastLargest){
                nextLargest = lastLargest;
                lastLargest = values;
            }


            if (values > nextLargest  && values<lastLargest) {
                nextLargest = values;

            }

        }
        System.out.println("The last largest value entered is: "+lastLargest);
        System.out.println("The Next largest value entered is: "+nextLargest);

    }
}
