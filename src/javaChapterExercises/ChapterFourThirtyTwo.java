package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtyTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter binary digits of 0s and 1s:  ");
        int binaryDigits = input.nextInt();

        while(binaryDigits < 0 || binaryDigits > 1){
            System.out.println("Binary numbers consists of only 0s and 1s.\n Enter binary digits of 0s and 1s:  ");
            binaryDigits = input.nextInt();
        }


       // binaryDigits %
    }
}
