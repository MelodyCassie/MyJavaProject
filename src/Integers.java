import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer btw 0 - 1000 only: ");
        int number = scanner.nextInt();

        while (number > 1000) {
            System.out.println("Enter a valid number!!: ");
            number = scanner.nextInt();
        }

        int divide = number / 100;
        int remain = number % 100;
        int remain1 = number / 10;
        int remain2 = number % 10;
        int remain5 = remain1 / 10;
        int remain3 = remain1 % 10;
        int remain4 = remain2 % 10;

        int sum = (remain5 + remain3 + remain4);

      System.out.println("The sum of all the digits in the integer is: " + sum);

      while (sum <= 1000) {
          System.out.println("Completed");
          number = scanner.nextInt();
      }

    }

}
