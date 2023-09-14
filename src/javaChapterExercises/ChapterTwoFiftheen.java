package javaChapterExercises;

import java.util.Scanner;

public class ChapterTwoFiftheen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER FIRST INTEGER: ");
        int firstInteger = scanner.nextInt();

        System.out.println("ENTER SECOND INTEGER: ");
        int secondInteger = scanner.nextInt();

        int squareFirstInteger = firstInteger * firstInteger;
        System.out.println("Square of your first input is:  " + squareFirstInteger);

        int squareSecondInteger = secondInteger * secondInteger;
        System.out.println("Square of your second input is: " + squareSecondInteger);

        int sumSquare = squareFirstInteger + squareSecondInteger;
        System.out.println("Sum of the squares is: " + sumSquare);

        int difference = squareFirstInteger - squareSecondInteger;
        System.out.println("Difference of the squares is: " + difference);





    }
}
