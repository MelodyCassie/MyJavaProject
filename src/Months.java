import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("ENTER A NUMBER FROM 1 - 12: ");
        int number = scanner.nextInt();

       while (number > 12) {
           System.out.print("Enter a Valid Number!: ");
            number = scanner.nextInt();
        }

        if (number == 1){
            System.out.println("January");
        }
        if (number == 2) {
            System.out.println("February");
        }
        if (number == 3) {
            System.out.println("March");
        }
        if (number == 4) {
            System.out.print("April");
        }
        if (number == 5) {
            System.out.print("May");
        }
        if (number == 6) {
            System.out.print("June");
        }
        if (number == 7) {
            System.out.print("July");
        }
        if (number == 8) {
            System.out.print("August");
        }
        if (number == 9) {
            System.out.print("September");
        }
        if (number == 10) {
            System.out.print("October");
        }
        if (number == 11) {
            System.out.println("November");
        }
        if (number == 12) {
            System.out.println("December");
        }
    }
}
