package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the base of a triangle");
        int baseLength = scanner.nextInt();



        while (baseLength < 1 || baseLength > 10){
            System.out.println("Length of triangle should be between 1 - 10.\n Try Again...");
            baseLength = scanner.nextInt();
        }

        for(int i = 0; i <= baseLength; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
                System.out.print(" ");

            }

            System.out.println();
        }
    }
}