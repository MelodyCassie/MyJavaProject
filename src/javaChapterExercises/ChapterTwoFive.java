package javaChapterExercises;

import java.util.Scanner;

public class ChapterTwoFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER FIRST INTEGER");
        int x = scanner.nextInt();

        System.out.println("ENTER SECOND INTEGER");
        int y = scanner.nextInt();

        System.out.println("ENTER THIRD INTEGER");
        int z = scanner.nextInt();

       int result =  x * y * z;

       System.out.printf("PRODUCT IS" + result);
    }
}
