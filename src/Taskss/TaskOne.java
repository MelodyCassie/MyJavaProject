package Taskss;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int addition = 0;
        for(int count = 0; count < 10 ; count++){
            System.out.println("Enter score: " + (count +1));
            int scores = input.nextInt();

            addition += scores;
        }
        System.out.println("The sum of the scores entered are: " + addition);
    }
}
