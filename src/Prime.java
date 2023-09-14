import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int number = scanner.nextInt();

        int input = 0;
        int index;

        for (index = 1; index <= number; index++) {
            if (number % index == 0) {
                input++;
            }
        }

        if (input == 2) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
