package randomPractices;

import java.util.Scanner;

public class FindLastInputtedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastNumber = 0;
        int count = 0;

        while(count <= 6) {
            System.out.println("Enter a number: " );
            int number = scanner.nextInt();

            if (number == 0){
                break;
            }
            lastNumber = number;

            System.out.println("The last number entered is" + lastNumber);
        }
    }
}





