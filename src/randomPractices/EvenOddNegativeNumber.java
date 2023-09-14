package randomPractices;

import java.util.Scanner;

public class EvenOddNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("ENTER ANY NUMBER: ");
        int input = scanner.nextInt();

        if (input % 2 == 0 ){
            System.out.println(+ input + "  Is an Even Number.");
        }
        else if(input <= 0)
        {
            System.out.println(+ input + "  Is a Negative number.");
        }
        else{
            System.out.println(+input + "Is an Odd Number");
        }


    }
}
