package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtySix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber == secondNumber) {
            System.out.println("0");
        }

        else if (firstNumber > secondNumber) {
            System.out.println("1");

        }
        else {
            System.out.println("-1");
        }
    }
}
