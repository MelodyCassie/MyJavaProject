package MyRandomPractices;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();

        double average = (firstNumber + secondNumber) /2.0;
        System.out.printf("The average of %d and %d is %f",  firstNumber , secondNumber, average);
    }
}
