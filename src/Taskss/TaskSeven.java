package Taskss;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int infinite = 1;
        int totalScore = 10;
        int addition = 0;
        int invalid = 0;
        int stopper = 0;


        while(infinite == 1) {
            for (int count = 0; count < totalScore; count++) {
                System.out.println("Enter a score: " + (count + 1));
                int score = scanner.nextInt();


                if (score >= 1 && score <= 100) {
                    addition += score;
                }
            }
            System.out.println("The sum of valid numbers is : "+ addition);
            System.out.println("Sum of invalid numbers are " +invalid);

            System.out.println("Enter 0 to stop or any other number to continue: ");
            stopper = scanner.nextInt();
            if(stopper == 0){
                break;
            }
        }

    }

}
