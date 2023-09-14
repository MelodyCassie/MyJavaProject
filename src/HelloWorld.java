import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int firstNumber = scanner.nextInt();
        firstNumber = firstNumber * 2;

        System.out.println("Enter Second Number: ");
        int secondNumber = scanner.nextInt();


        secondNumber = secondNumber * 2;

        int result = firstNumber + secondNumber;

        System.out.println(result);


    }
}