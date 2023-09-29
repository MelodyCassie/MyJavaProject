package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourSeventeen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double stop = 0;
        double addition = 0;
        while(stop != -1) {
            System.out.println("Enter Miles Driven:  ");
            double milesDriven = scanner.nextInt();

            System.out.println("Enter Gallons Used:  ");
            double gallonsUsed = scanner.nextInt();

            double milesPerGallon = milesDriven / gallonsUsed;
            System.out.println("The miles per gallon is: " + milesPerGallon);

            addition += milesPerGallon;
            System.out.println("The sum is: " + addition);

            double average = addition / 2.0;
            System.out.println("The average is: " + average);
        }

    }
}
