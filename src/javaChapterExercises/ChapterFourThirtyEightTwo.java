package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtyEightTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int input = scanner. nextInt();


        int count = 1;
        int factorial = 1;

        for(count = 1; count <= input; count+=1){
            factorial *= count;
        }
        System.out.print(factorial);

    }
}
