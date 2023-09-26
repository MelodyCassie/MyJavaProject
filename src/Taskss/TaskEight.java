package Taskss;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        int total = 0;
        for(int count = 1; count <= 10;){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a valid score: ");
            int score = input.nextInt();
            total = 0;
            if(score <= 100){
                total += score;
                count++;
            }
        }
        System.out.println(total);
    }
    }

