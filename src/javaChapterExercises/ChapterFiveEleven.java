package javaChapterExercises;

import java.util.Scanner;

public class ChapterFiveEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many integers do you want to enter? ");
        int count = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum;

        for(int i = 0; i < count; i++){
            System.out.println("Enter an integer: ");
            int integers = scanner.nextInt();

            if(integers > max)
                max = integers;


            if (integers < min) {
                min = integers;

            }
        }
        sum = min + max;
        System.out.println("The max is "+ max);
        System.out.println("The min is "+ min);
        System.out.println("The addition of the two extremes is " + sum);
    }
}
