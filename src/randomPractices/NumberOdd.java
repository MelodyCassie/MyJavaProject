package randomPractices;

import java.util.Scanner;

    public class NumberOdd{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("ENTER A NUMBER");
            int number = scanner.nextInt();

            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
        public static boolean isEven(int number) {

            return number % 2 == 0;
        }
    }



