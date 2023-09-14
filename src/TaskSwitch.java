import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a number between 0 _ 6");
         int number = scanner.nextInt();

         while (number > 6) {
        System.out.println("Enter a Number");
             number = scanner.nextInt();
         }

         switch (number) {
             case 0:
                 number = 0;
                 System.out.println("Sunday");
                 break;
         }

        switch (number) {
            case 1:
                number = 1;
                System.out.println("Monday");
                break;
        }

        switch (number) {
            case 2:
                number = 2;
                System.out.println("Tuesday");
                break;
        }

        switch (number) {
            case 3:
                number = 3;
                System.out.println("Wednesday");
                break;
        }

        switch (number) {
            case 4:
                number = 4;
                System.out.println("Thursday");
                break;
        }

        switch (number) {
            case 5:
                number = 5;
                System.out.println("Friday");
                break;
        }

        switch (number) {
            case 6:
                System.out.println("Saturday");
             break;
        }
    }

}
