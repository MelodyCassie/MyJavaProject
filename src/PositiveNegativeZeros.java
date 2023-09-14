import java.util.Scanner;

public class PositiveNegativeZeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int input = scanner.nextInt();

        while (input == input ){
            System.out.println("Enter number: ");
            System.out.println("Press 0 to Stop: ");
            input = scanner.nextInt();

        }

      int negativeSum =  input + input;
      int positiveSum = input + input;

        if (input <= -0 ){
            System.out.println("The sum of the negative number entered is: "  + negativeSum);
        }

        if (input >= 0) {
            System.out.println("The sum of the positive number entered is: " + positiveSum);
        }

    }
}
