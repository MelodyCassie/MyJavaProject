import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("The Sum of the numbers is :" + ' ' + sum + ' ');

        double average = sum / 10.0;
        System.out.print("And the Average of the Sum is :" + ' ' + average);





    }
}
