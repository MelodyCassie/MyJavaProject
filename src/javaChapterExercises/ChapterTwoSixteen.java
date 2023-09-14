package javaChapterExercises;

import java.util.Scanner;

public class ChapterTwoSixteen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER AN INTEGER: ");
        int integer = scanner.nextInt();

        int square = integer * integer;

        System.out.println("THE SQUARE OF YOUR INTEGER IS: " + ' ' +  square);

        if (integer > 100){
            System.out.println("INTEGER IS GREATER THAN 100" + ' ' + integer);
        }
        if (integer < 100) {
            System.out.println("INTEGER IS LESS THAN 100" + ' ' + integer);
        }
        if (integer != 100) {
            System.out.println("INTEGER IS NOT EQUALS TO 100" + ' ' +  integer);
        }
        if (integer == 100)
            System.out.println("INTEGER IS EQUALS TO 100" + ' ' + integer);


        if (square > 100) {
            System.out.println("THE SQUARE IS GREATER THAN 100" + ' ' + square);
        }
        if (square < 100) {
            System.out.println("THE SQUARE IS LESS THAN 100" + ' ' + square);
        }
        if (square != 100) {
            System.out.println("SQUARE IS NOT EQUALS TO 100" + ' ' + square);
        }
        if (square == 100) {
            System.out.println("SQUARE IS EQUALS TO 100" + ' ' + square);
        }
    }
}
