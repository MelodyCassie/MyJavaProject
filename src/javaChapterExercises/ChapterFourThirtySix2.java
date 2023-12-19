package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtySix2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();


        if(firstNumber == secondNumber){
            System.out.println(0);

        } else if (firstNumber > secondNumber) {
            System.out.println(1);

        }
        else {
            System.out.println(-1);
        }

    }
}
