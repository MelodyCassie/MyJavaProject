package MyRandomPractices;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a palindrome");
        int number = scanner.nextInt();

        int firstDigit = number/100;
        int lastDigit = number%10;



       // if (firtDigit /100) System.out.print(number is a palindrome)
    }
}
