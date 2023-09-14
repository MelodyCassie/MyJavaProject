package javaChapterExercises;

import java.util.Scanner;

public class ChapterTwoTwentyFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER AN INTEGER: ");
        int input = scanner.nextInt();
//
//        while (input % 3 != 0) {
//            System.out.println("ENTER AN INTEGER: ");
//            input = scanner.nextInt();
//        }

        if (input % 3 == 0) {
            System.out.println(+ input + "    Divisible by 3 is 0 !");
        }
        else {
            System.out.println(+ input + "    Divisible by 3 is not 0 !");
        }
    }
}
