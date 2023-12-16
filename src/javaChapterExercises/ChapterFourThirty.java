package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the base of a triangle");
        int base = scanner.nextInt();

        while (base < 1 || base > 10){
            System.out.println("Length of triangle should be between 1 - 10.\n Try Again...");
            base = scanner.nextInt();
        }

        for(int i = 0; i <= base; i++){
            System.out.println(base % 2  == 0 ?"*":"****");
        }

    }
}