package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourEighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Enter balance at the beginning of the month:  ");
        int balAtBeginningOfMonth = scanner.nextInt();

        System.out.println("Enter total of all items charged by the customer this month:  ");
        int totalOfItemCharged = scanner.nextInt();

        System.out.println("Enter total of all credits applied to the customer’s account this month:  ");
        int totalOfCreditApplied = scanner.nextInt();

        System.out.println("Enter allowed credit limit: ");
        int allowedCredit = scanner.nextInt();

        int newBalance = 0;
        newBalance = balAtBeginningOfMonth + totalOfItemCharged -totalOfCreditApplied;

        System.out.println(newBalance);

    if (newBalance > allowedCredit){
        System.out.println("Credit Limit Exceeded!!! ");
    }
    else{
        System.out.println("Credit limit not exceeded! ");

    }

    }

}
