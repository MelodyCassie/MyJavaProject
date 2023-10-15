package Assignments;

import java.util.Scanner;

public class ArrayUberApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[10];
        for(int count = 0; count < scores.length; count++){
            System.out.println("Enter scores: " + (count+1));
            scores[count] = scanner.nextInt();
        }
        for(int score : scores){
            System.out.println(score);
        }
        int largestScore = scores[0];
        for(int count = 0; count < scores.length; count++){
            if (scores[count] > largestScore){
                largestScore = scores[count];
            }
        }
        System.out.println("The largest score entered is: " + largestScore);

    }
}
