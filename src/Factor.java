import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factor = 0;
        for (int input = 1; input <= number; input++) {
            if (number % input == 0) {
                factor++;
            }
        }

        System.out.println("Number of factors of " + number + " is " + factor);
    }
}