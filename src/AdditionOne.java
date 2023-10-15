import java.util.Scanner;

public class AdditionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("enter second number: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println("the sum of these numbers entered are:  " + result);
    }
}
