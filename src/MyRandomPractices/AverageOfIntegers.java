package MyRandomPractices;

import java.util.Scanner;

public class AverageOfIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter firstInteger: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter secondInteger: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Enter thirdInteger: ");
        int thirdInteger = scanner.nextInt();



        double average = (firstInteger + secondInteger + thirdInteger) / 3.0;
        System.out.println("THE AVERAGE IS:   " + average);


    }
}
