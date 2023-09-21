package ClassWorks;

import java.util.Scanner;

public class RaisedPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Whole Number: ");
        int whole = scanner.nextInt();

        System.out.println("Enter an Exponential: ");
        int exponential = scanner.nextInt();

        int result = 0;
        int index = 1;

        for (index = 1; index <= exponential; index+=1) {
            result += whole;
        }
        System.out.println(result);
    }
}