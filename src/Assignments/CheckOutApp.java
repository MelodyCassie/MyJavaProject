package Assignments;

import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the customers name? ");
        String customersName = input.nextLine();

        System.out.println("What did the customer buy? ");
        String productOne = input.nextLine();

        System.out.println("How many pieces? ");
        int piecesOne = input.nextInt();


        System.out.println("""
                ========================================================================================================
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                DATE : 18-DEC-22 8:48:11 PM
                CASHIER: PRETTY MELODY
                CUSTOMER NAME: CHUKWUMA ADEKUNLE CIROMA
                ========================================================================================================
                """);

    }
}
