package Taskss;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a valid score btw 1 - 10: ");
        int score = scanner.nextInt();

        while (score >= 10) {
            System.out.println("Enter a valid score btw 1 - 10: ");
            score = scanner.nextInt();
        }

            int sum = 0;
            sum += score;
            System.out.println(sum);
    }
}
