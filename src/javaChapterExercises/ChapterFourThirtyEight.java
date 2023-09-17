package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtyEight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int count = 1;

        while(count <= number){
            factorial *= count;
            count+=1;
        }
        System.out.println(factorial);
    }
}
