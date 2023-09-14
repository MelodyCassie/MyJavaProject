package javaChapterExercises;

import java.util.Scanner;

public class ChapterTwoSeventeen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER FIRST INTEGER: ");
        int firstInteger = scanner.nextInt();

        System.out.println("ENTER SECOND INTEGER: ");
        int secondInteger = scanner.nextInt();

        System.out.println("ENTER THIRD INTEGER: ");
        int thirdInteger = scanner.nextInt();


        int product = firstInteger * secondInteger * thirdInteger;

        System.out.println("THE PRODUCTS OF THE INTEGERS ARE:  " + product);


        int average = firstInteger + secondInteger + thirdInteger / 3;
        System.out.println("THE AVERAGE OF THE INTEGERS ARE:  " + average);

        int sum = firstInteger + secondInteger + thirdInteger;
        System.out.println("THE SUM OF THE INTEGERS ARE:  " + sum);



        if (firstInteger >= secondInteger && firstInteger >= thirdInteger){
            System.out.println("First integer is larger");
        }

        else if (secondInteger >= firstInteger && secondInteger >= thirdInteger) {
            System.out.println("Second integer is larger");
        }

        else {
            System.out.println("Third integer is larger");
        }



        if (firstInteger <= secondInteger && firstInteger <= thirdInteger){
            System.out.println("First integer is smaller");
        }

       else  if (secondInteger <= firstInteger && secondInteger <= thirdInteger){
            System.out.println("Second integer is smaller ");
        }

        else {
            System.out.println("Third integer is smaller");
        }
    }
}
