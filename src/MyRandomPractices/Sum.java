package MyRandomPractices;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number");
        int numberOne = scanner.nextInt();

        System.out.print("Enter second number");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;



        System.out.printf("Sum of %d and %d is %d", numberOne , numberTwo, sum);

    }
}
