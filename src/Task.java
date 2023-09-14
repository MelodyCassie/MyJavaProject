import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = scanner.nextInt();

        while (number > 6){
            System.out.println("Enter a number");
            number = scanner.nextInt();
        }

        if(number == 0) {
            System.out.println("Sunday");
        }
        if(number == 1) {
            System.out.println("Monday");
        }
        if(number == 2) {
            System.out.println("Tuesday");
        }
        if(number == 3) {
            System.out.println("Wednesday");
        }
        if(number == 4) {
            System.out.println("Thursday");
        }
        if(number == 5) {
            System.out.println("Friday");
        }
        if(number == 6) {
            System.out.println("Saturday");
        }








    }
}
