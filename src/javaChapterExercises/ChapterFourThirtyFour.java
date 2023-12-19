package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtyFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        int checker = 0;
        for (int i = 0; i < number; i++){

            System.out.println("Enter an integer value: ");
            int integerValue = scanner.nextInt();

             checker += integerValue;

            if (number == checker || checker > number) {

                System.out.println("The sum of the integers entered is: " + checker + " and the initial number entered is " + number);
                break;
            }


        }
    }
}
