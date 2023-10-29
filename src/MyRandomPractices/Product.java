package MyRandomPractices;

import java.util.Scanner;
public class Product {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER FIRST INTEGER OR DECIMAL: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("ENTER SECOND INTEGER OR DECIMAL: ");
        double secondNumber = scanner.nextDouble();

        double product = firstNumber * secondNumber;

        System.out.println("THE PRODUCT OF YOUR INPUTTED NUMBERS ARE" + ":" +  ' ' + product);
    }
}
