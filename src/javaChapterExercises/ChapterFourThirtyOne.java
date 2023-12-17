package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a five digit integer: ");
        String fiveDigitInteger = scanner.nextLine();


        while (fiveDigitInteger.length() != 5){
            System.out.println("Enter a five digit integer: ");
            fiveDigitInteger = scanner.nextLine();
        }

        String reversedFiveDigitInteger = new StringBuilder(fiveDigitInteger).reverse().toString();

            if(reversedFiveDigitInteger.equals(fiveDigitInteger)){
                System.out.println("Is a palindrome");
            }
            else {
                System.out.println("Is not a palindrome");
            }
    }
}