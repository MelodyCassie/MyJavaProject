package ArrayAssignment;

import java.util.Scanner;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[10];
        for (int index = 0; index < scores.length; index++) {
            System.out.println("Enter scores: " + (index + 1));
            scores[index] = scanner.nextInt();
        }
        for (int score : scores) {
            System.out.println(score);
        }
        int smallest = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (scores[index] < smallest) {
                smallest = scores[index];
            }
            int nine = scores[0];
            for (int count = 0; count < index; count++){
                if(scores[count] < nine){
                    nine = scores[count];
                }
            }
        }
        ;
        System.out.println("smallest is: " + smallest);

    }
}
