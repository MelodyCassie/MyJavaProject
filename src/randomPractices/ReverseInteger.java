package randomPractices;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER NUMBER TO REVERSE: ");
        int input = scanner.nextInt();

        int reverseNumber = 0;

        while(input != 0){
            int modulos = input % 10;
            reverseNumber = reverseNumber * 10 + modulos;
            input /= 10;
        }
        System.out.println ("THE REVERSED NUMBER IS: " + reverseNumber);

    }
}
