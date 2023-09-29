package Taskss;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int addition = 0;
        int count = 0;

        while (count < 10){
            System.out.println("Enter score: " + (count + 1));
            int score = scanner.nextInt();

            count++;

            addition += score;

        }
        double average = addition / 10.0;
        System.out.println("The average of the scores are:  " + average);

    }
}