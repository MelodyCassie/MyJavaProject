package Taskss;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int addition = 0;
        int totalScores = 10;
        System.out.println("Enter only 10 scores: ");

        for(int count = 1; count < totalScores ; count++){
            System.out.println("Enter score:  " + count  + (count + 1));
            int scores = scanner.nextInt();

            if(scores >= 1 && scores <= 10){
                addition += scores;
            }

        }
        System.out.println(addition);
    }
    }

