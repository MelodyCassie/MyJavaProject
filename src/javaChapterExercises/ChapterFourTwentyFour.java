package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourTwentyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = scanner.nextInt();

        while (input != 1 && input != 2){

            System.out.println("Enter a number: ");
            input = scanner.nextInt();


        }




        System.out.println("You entered " + input);

    }
}
