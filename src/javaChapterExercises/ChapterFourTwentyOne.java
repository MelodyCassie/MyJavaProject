package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourTwentyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestInSales = 0;
        int lastInputtedNumber = 0;
        for(int count = 0; count < 10; count++){
            System.out.println("Input number of unit sold by sales person: " +(count + 1));
            int numberOfSales = input.nextInt();

            lastInputtedNumber = numberOfSales;

            if(numberOfSales > largestInSales) {
                largestInSales = numberOfSales;

            }
        }

        System.out.println("The largest sales inputted is: " + largestInSales);
        System.out.println("The last entered sales is: " + lastInputtedNumber);






    }

}
