package MyRandomPractices;

import java.util.Scanner;
public class Root {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER");
        int firstNumber = scanner.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int secondNumber= scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.print("THE SUM IS" + ":" + ' ' + sum +' ');

        int square = (sum * sum);
        System.out.printf("THE SQUARE ROOT OF THE ANSWER IS " + ":" + square +' ');

        System.out.println("CODE BY" +' '+ ":" + "MELODYCASSIE" +"!!");
    }
}