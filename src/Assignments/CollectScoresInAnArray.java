package Assignments;

import java.util.Scanner;

public class CollectScoresInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores =  new  int[4][3];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++) {
                System.out.println("Enter price for customer " + "  " + (i + 1) + "   " + "item" + "  " + (j + 1) + " :");
                scores[i][j] = input.nextInt();

            }
            System.out.println("    ");
        }

        for(int n = 0; n < 4; n++){
            for(int k = 0; k < 3; k++){
                System.out.print("customer " + " " + (n +1) + " 's" + "   " + "item" + (k + 1)  + " " + "price is: ");
                System.out.print(scores[n][k] + "   ");
            }
            System.out.println("   ");
        }

    }
}
