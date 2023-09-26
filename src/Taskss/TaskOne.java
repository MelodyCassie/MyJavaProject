package Taskss;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = 1;
        int sum = 0;
        while( index <= 10){
            System.out.print("ENTER YOUR SCORE: ");
            int score = scanner.nextInt();

            sum = index + score;
            index++;
        }

        System.out.println(sum);
    }



}
